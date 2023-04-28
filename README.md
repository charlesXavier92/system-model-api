# system-model-api
Entidades, Repositorios y Conexión a Base de Datos

# Pasos para la configuración del ambiente

1. Clonar cada repositorio (son 5 repositorios) dentro de una misma carpeta en su máquina local.
2. Abrir el proyecto "system-model-api" en su IDE de preferencia, cambiar el user y password en el archivo "persistence.properties" para la conexión con MySql. Puede cambiar el puerto y nombre de la base de datos si lo desea en la propiedad "spring.datasource.url". Si ya tiene una BD creada, cambiar al valor "update" la propiedad "spring.jpa.hibernate.ddl-auto".
3. Abrir o importar los demás proyectos.
4. Realizar primero "Maven Clean" y "Maven Install" en el proyecto "system-model-api". Luego, ejecutar los mismos comandos en los proyectos "system-customers-api", "system-products-api", "system-orders-api" y, finalmente, en "system-dev-web-api", que es el proyecto Spring boot principal. 
5. Ejecutar "Run SystemDevWebApiApplication" en el proyecto principal "system-dev-web-api"
6. Tanto la Base de datos como las tablas serán generadas por el Hibernate por la propiedad "spring.jpa.hibernate.ddl-auto = create" en el archivo "persistence.properties" del proyecto "system-model-api"
7. Para la prueba de los microservicios, dirigirse al navegador a la ruta http://localhost:8080/swagger-ui.html
