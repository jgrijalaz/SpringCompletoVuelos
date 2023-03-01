# APLICACION VUELOS

- [x] Crear proyecto
- [x] Redactar Readme
- [x] Agregar dependencias extra (bootstrap y webjars) y recargar Maven
- [ ] Configurar conexion MySql en applicationProperties

```java
spring.datasource.url=jdbc:mysql://localhost:3306/flights?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=admin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.main.banner-mode=off
#spring.sql.init.mode=always 
spring.jpa.defer-datasource-initialization=true
```
- [ ] Mejorar .gitIgnore

- [ ] Entidad Flight
- [ ] Repositorio FlightRepository
- [ ] Crear interfaz servicio flightService: CRUD y logica de negocio
- [ ] Implementar interfaz servicio: flightServiceImpl
- [ ] Controlador FlightController
	- [ ] FindAll
	- [ ] FindById
	- [ ] ShowCreateForm
	- [ ] ShowEditForm
	- [ ] SaveForm
	- [ ] DeleteById 

- [ ] Entidad Ticket
- [ ] Repositorio TicketRepository
- [ ] Crear interfaz servicio TicketService: CRUD y logica de negocio
- [ ] Implementar interfaz servicio: TicketServiceImpl
- [ ] Controlador TicketController
	- [ ] FindAll
	- [ ] FindById
	- [ ] ShowCreateForm
	- [ ] ShowEditForm
	- [ ] SaveForm
	- [ ] DeleteById 

- [ ] Entidad Passanger
- [ ] Repositorio PassangerRepository
- [ ] Crear interfaz servicio PassangerService: CRUD y logica de negocio
- [ ] Implementar interfaz servicio: PassangerServiceImpl
- [ ] Controlador PassangerController
	- [ ] FindAll
	- [ ] FindById
	- [ ] ShowCreateForm
	- [ ] ShowEditForm
	- [ ] SaveForm
	- [ ] DeleteById 

- [ ] flight-list.html
- [ ] flight-detail.html
- [ ] flight-form.html
- [ ] ticket-list.html
- [ ] ticket-detail.html
- [ ] ticket-form.html
- [ ] passanger-list.html