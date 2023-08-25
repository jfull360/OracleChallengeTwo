create table IF NOT EXISTS huespedes(

    idhuespedes bigint (100) not null auto_increment,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    fecha_nacimiento varchar(100) not null,
    nacionalidad varchar(100) not null,
    telefono varchar(100) not null,
    id_reserva bigint (100) not null,

    primary key (idhuespedes),
    foreign key (id_reserva) references reservas (id)

);
