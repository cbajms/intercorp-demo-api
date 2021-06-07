# SpringBoot + Oracle Demo API
Demo API
    SpringBoot
    Spring Data JPA
    Swagger2
    Rest Controllers

## Comenzando 🚀

Mira **Deployment** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

1° Oracle Express 11g dockerizado! - https://github.com/wnameless/docker-oracle-xe-11g

2° Oracle driver - https://www.oracle.com/database/technologies/jdbc-ucp-122-downloads.html
```
Da un ejemplo
```

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
* **Fulanito Detal** - *Documentación* - [fulanitodetal](#fulanito-de-tal)

## Licencia 📄

-

## Expresiones de Gratitud 🎁
-

## Deployment
- Obtener la imagen de base de datos
```
docker pull wnameless/oracle-xe-11g-r2
```
- Ejecutando imagen docker de base de datos
```
docker run -d -p 49161:1521 wnameless/oracle-xe-11g-r2
```

Una vez la base de datos se encuentre funcionando, podemos ejecutar los scripts
```
schema.sql
data.sql
```
- Creando la imagen de la aplicación
```
docker build -t cbajms/intercorp-demo-api .
```
-Ejecutando la api dockerizada
```
docker run -p 8080:8080 cbajms/intercorp-demo-api
```


[linkedin-url]: https://www.linkedin.com/in/maxsampaoli/