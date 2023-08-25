create table IF NOT EXISTS reservas(

    id bigint not null auto_increment,
    fecha_entrada varchar(100) not null,
    fecha_salida varchar(100) not null,
    valor varchar(100) not null,
    forma_pago varchar(100) not null,

    primary key(id)


);
