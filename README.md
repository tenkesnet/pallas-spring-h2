# Java Spring H2 demo

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