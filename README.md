# SpringBoot + Oracle Demo API
Demo API
    SpringBoot
    Spring Data JPA
    Swagger2
    Rest Controllers

## Comenzando 🚀

Mira **Deployment** para conocer como desplegar el proyecto.


### Pre-requisitos 📋
1° Docker https://www.docker.com/products/developer-tools

2° Oracle Express 11g dockerizado! - https://github.com/wnameless/docker-oracle-xe-11g

3° Oracle driver - https://www.oracle.com/database/technologies/jdbc-ucp-122-downloads.html

4° JDK 11 - https://www.oracle.com/ar/java/technologies/javase-jdk11-downloads.html

### Instalación 🔧

_Una serie de ejemplos paso a paso que te dice lo que debes ejecutar para tener un entorno de desarrollo ejecutandose_

_Dí cómo será ese paso_

```
Da un ejemplo
```

_Y repite_

```
hasta finalizar
```

_Finaliza con un ejemplo de cómo obtener datos del sistema o como usarlos para una pequeña demo_

## Ejecutando las pruebas ⚙️
_Con la aplicación corriendo de forma local, se puede acceder a su documentacion swagger de la siguiente forma: _
```
http://localhost:8085/swagger-ui.html
```
_POST /creacliente: en CustomerController_
```
/clientes
```
_GET /kpideclientes: en CustomerController_
```
/clientes/kpideclientes
```
_GET /listclientes: en CustomerController_
```
/clientes/
```
## Despliegue 📦

- Obtener la imagen de base de datos
```
docker pull wnameless/oracle-xe-11g-r2
```
_Los datos de conexion son los siguientes_
```
hostname: localhost
port: 49161
sid: xe
username: system
password: oracle
```
- Ejecutando imagen docker de base de datos
```
docker run -d -p 49161:1521 wnameless/oracle-xe-11g-r2
```

_Una vez la base de datos se encuentre funcionando, podemos ejecutar los scripts, ayudados con un cliente sql_
```
schema.sql
data.sql
https://www.oracle.com/tools/downloads/sqldev-downloads.html
```
- Iniciando la aplicación

_Ubicarse en el directorio intercorp-demo-api/api y ejecutar el siguiente comando (con la BD levantada!)_
```
mvn spring-boot:run
```

## Construido con 🛠️


* [Spring Initializr](https://start.spring.io/) - generar un proyecto springboot desde cero
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Docker](https://www.docker.com/get-started) - contenedor de aplicaciones
* [GIT](https://git-scm.com/downloads) - versionado

## Wiki 📖

-

## Versionado 📌

-

## Autores ✒️

* **Maxi Sampaoli** - *Trabajo Inicial* - [cbajms](https://github.com/cbajms) | [![LinkedIn][linkedin-shield]][linkedin-url]

## Licencia 📄

-

[linkedin-url]: https://www.linkedin.com/in/maxsampaoli/
