create table customer
(
    id         uuid not null,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    primary key (id)
);