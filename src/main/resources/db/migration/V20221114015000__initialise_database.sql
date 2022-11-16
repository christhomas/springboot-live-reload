create table customer
(
    id         uuid default gen_random_uuid(),
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    primary key (id)
);