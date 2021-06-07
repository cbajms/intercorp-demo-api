FROM maven:3.8.1-jdk-11 AS builder
WORKDIR /workspace
COPY pom.xml /workspace/pom.xml
RUN mvn dependency:go-offline

COPY src /workspace/src
RUN mvn install
RUN mkdir  -p target/depency
WORKDIR /workspace/target/dependency
RUN jar -xf ../*.jar

FROM openjdk:11-jre-slim
EXPOSE 8085
VOLUME /tmp
ARG DEPENDENCY=/workspace/target/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","api:api/lib/*","com.intercorp.demo.Application"]