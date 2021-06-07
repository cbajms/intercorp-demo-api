package com.intercorp.demo.exception;

import com.intercorp.demo.model.ErrorDetails;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {
        /**
         * Handle not found exceptions
         *
         * @param ex      the {@link NotFoundException} exception
         * @param request the {@link WebRequest}
         * @return the {@link ErrorDetails} with the error information
         */
        @ExceptionHandler(NotFoundException.class)
        public final ResponseEntity<ErrorDetails> handleNotFoundException(final NotFoundException ex, final WebRequest request) {
            final ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setCode(HttpStatus.NOT_FOUND.value());
            errorDetails.setMessage(ex.getMessage());

            return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
        }


        /**
         * Handle generic {@link ServiceException}
         *
         * @param ex      the {@link ServiceException} exception
         * @param request the {@link WebRequest}
         * @return the {@link ErrorDetails} with the error information
         */
        @ExceptionHandler(ServiceException.class)
        public final ResponseEntity<ErrorDetails> handleServiceException(final ServiceException ex, final WebRequest request) {
            final ErrorDetails errorDetails = new ErrorDetails();

            errorDetails.setCode(ex.getCode().value());
            errorDetails.setMessage(ex.getMessage());

            return new ResponseEntity<>(errorDetails, ex.getCode());
        }


        @Override
        protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
            List<String> errorList = ex
                    .getBindingResult()
                    .getFieldErrors()
                    .stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.toList());
            final ErrorDetails errorDetails = new ErrorDetails();

            errorDetails.setCode(HttpStatus.BAD_REQUEST.value());
            errorDetails.setMessage(String.join(" - ", errorList));
            return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
        }

    }
