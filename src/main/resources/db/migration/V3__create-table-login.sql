create table IF NOT EXISTS login(

    id bigint not null auto_increment,
    user_login varchar(100) not null,
    password varchar(100) not null,

    primary key(id)


);
