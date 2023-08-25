create table IF NOT EXISTS huespedes(

    idhuespedes bigint not null auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    fecha_nacimiento varchar(100) not null,
    nacionalidad varchar(100) not null,
    telefono varchar(100) not null,
    idReserva bigint (100) not null,

    primary key (idhuespedes),
    foreign key (idReserva) references reservas (id)

);
