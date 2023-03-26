create table if not exists employee_company
(
    id           int primary key generated by default as identity,
    name         varchar(255)        not null,
    email        varchar(255) unique not null,
    phone_number varchar(255)        not null,
    description  varchar(15000),
    post         varchar(255)        not null,
    department   varchar(255)        not null

);