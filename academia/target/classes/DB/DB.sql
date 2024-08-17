create database academia;

use academia;

create table tareas(
	id int primary key auto_increment not null,
    titulo varchar(50),
    descripcion varchar(150),
    fecha_creacion date,
    hora_creacion time,
    estado varchar(50)
);

insert into tareas(id,titulo,descripcion,fecha_creacion,hora_creacion,estado)values (1,"holaa","hola","2006-12-12", "12:12:12","activo");

select * from tareas;

drop table tareas;