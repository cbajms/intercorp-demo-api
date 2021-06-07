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

_Explica como ejecutar las pruebas automatizadas para este sistema_

### Analice las pruebas end-to-end 🔩

_Explica que verifican estas pruebas y por qué_

```
Da un ejemplo
```

### Y las pruebas de estilo de codificación ⌨️

_Explica que verifican estas pruebas y por qué_

```
Da un ejemplo
```

## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Spring Initializr](https://start.spring.io/) - generar un proyecto springboot desde cero
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Docker](https://www.docker.com/get-started) - contenedor de aplicaciones
* [GIT](https://git-scm.com/downloads) - versionado

## Wiki 📖

Puedes encontrar mucho más de cómo utilizar este proyecto en nuestra [Wiki](https://github.com/tu/proyecto/wiki)

## Versionado 📌

-

## Autores ✒️

* **Maxi Sampaoli** - *Trabajo Inicial* - [cbajms](https://github.com/cbajms) | [![LinkedIn][linkedin-shield]][linkedin-url]

## Licencia 📄

-

## Deployment
- Obtener la imagen de base de datos
```
docker pull wnameless/oracle-xe-11g-r2
```
Los datos de conexion son los siguientes
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

Una vez la base de datos se encuentre funcionando, podemos ejecutar los scripts, ayudados con un cliente sql:
```
schema.sql
data.sql
https://www.oracle.com/tools/downloads/sqldev-downloads.html
```
- Iniciando la aplicación
Ubicarse en el directorio intercorp-demo-api/api y ejecutar el siguiente comando (con la BD levantada!)
```
mvn spring-boot:run
```
r run -p 8080:8080 cbajms/intercorp-demo-api
```

[linkedin-url]: https://www.linkedin.com/in/maxsampaoli/
