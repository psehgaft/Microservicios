# Microservicios

Repositorio con ejemplos y laboratorios relacionados con arquitecturas de **microservicios** e integración de servicios, combinando SOAP y REST con Java y Apache Camel.

## Contenido

| Directorio | Descripción |
|---|---|
| [`FlightMonitor_WSDL_SOAP/`](./FlightMonitor_WSDL_SOAP/) | Laboratorio universitario (*Distributed Programming II*, curso 2014/15 — tarea 4b): desarrollo de un servicio web SOAP de monitoreo de vuelos. Incluye archivos WSDL y XSD, esquemas JAXB, cliente, servidor y programas de prueba. Se construye con Apache Ant (`build.xml`) y el enunciado de la tarea está en `Assignment4a.pdf` / `Assignment4b.pdf`. |
| [`rest-soap-transformation/`](./rest-soap-transformation/) | Demo de proxy SOAP a REST con **Fuse Integration Services 2.0**: expone un servicio SOAP existente mediante un nuevo front-end REST construido con Spring Boot y Apache Camel, con la API documentada en Swagger. Se puede ejecutar como contenedor Spring Boot standalone o desplegar en OpenShift/Minishift. |

## Requisitos

- **FlightMonitor_WSDL_SOAP**: JDK 7+ y Apache Ant (`ant`).
- **rest-soap-transformation**: JDK 8+ y Maven 3.

## Uso

Cada subdirectorio cuenta con su propio README con las instrucciones detalladas:

- [`FlightMonitor_WSDL_SOAP/README`](./FlightMonitor_WSDL_SOAP/README)
- [`rest-soap-transformation/README.md`](./rest-soap-transformation/README.md)

Ejemplo rápido — ejecutar la demo SOAP→REST en modo standalone desde su carpeta:

```bash
cd rest-soap-transformation
mvn spring-boot:run -Dspring.profiles.active=dev
curl http://localhost:8080/api/citiesByCountry/Germany
```

## Licencia

Este repositorio no declara una licencia explícita en los archivos incluidos.
