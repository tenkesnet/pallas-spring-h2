# Java Spring H2 demo

Ezt a sort javítani kell src/main/resources/application.properties filet
spring.datasource.url=jdbc:h2:file:c:/dev/testdb

H2 adatbázis consolja:
http://localhost:8080/h2-console/

```
--drop table "pallas"."address";
--drop schema "pallas";

--create schema "pallas";
CREATE TABLE IF NOT EXISTS "address"
(
"addressId" integer NOT NULL auto_increment,
"city" text  NOT NULL,
"postalCode" text  NOT NULL,
"street" text NOT NULL,
CONSTRAINT address_pkey PRIMARY KEY ("addressId")
)
```