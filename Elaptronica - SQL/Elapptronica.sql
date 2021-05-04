Create database elapptronica
Use elapptronica
go

Create table DJs (
Id_dj int primary key,
Nombre varchar(50),
Edad int,
Descripcion varchar(100),
votos int,
Id_lugar int foreign key references Lugares(Id_lugar),
Nombre_lugar varchar(30)
);

Create table Lugares(
Id_lugar int primary key,
Nombre varchar(30),
Direccion varchar(50),
Telefono int,
Genero varchar(30),
Tipo_escenario varchar(30)
);

Create table Conciertos(
Id_concierto int primary key,
Nombre varchar(50),
Descripcion varchar(100),
Fecha varchar(30), 
Id_lugar int foreign key references Lugares(Id_lugar),
Nombre_lugar varchar(30)
);

Create table DJxConcierto(
Id int identity primary key,
Id_dj int foreign key references DJs(Id_dj),
Id_concierto int foreign key references Conciertos(Id_concierto)
);

--Select de las tablas
Select * from DJs
Select * from Conciertos
Select * from Lugares
Select * from DJxConcierto

--Datos ingresados para la tabla Lugares
insert into Lugares values('1011', 'Electronic Discotek', 'Calle 45 # 46-52', 4026752, 'Electro-house','Discoteca');
insert into Lugares values('1012', 'El Chagualito', 'CRA 74A # 24-27', 2340364, 'DEEPHOUSE','Cancha');
insert into Lugares values('1013', 'Icono Club', 'Calle 67 # 49-52', 3647214, 'Tribal House','Bar');

--Datos ingresados para la tabla DJs
insert into DJs values(105478, 'Dj JuanKa', 25, 'Dj con buena experiencia y manejo de controlador', 10, 1013, 'Icono Club');
insert into DJs values(100452, 'Dj Andru', 22, 'Dj con poca experiencia y buscando mejorar las tecnicas', 4, 1012, 'El Chagualito');
insert into DJs values(108726, 'Dj Esteban', 30, 'Dj especializado en musica y buen manejo de controlador', 15, 1011, 'Electronic Discotek');
insert into DJs values(100935, 'Dj Milo', 19, 'Dj con poca experiencia y buscando caminos nuevos', 3, 1012, 'El Chagualito');

--Datos ingresados para la tabla Conciertos;
insert into Conciertos values(1, 'Zapateo', 'Concierto para gozar y disfrutar al mejor estilo de electronica','13-05-2021', 1012, 'El Chagualito')
insert into Conciertos values(2, 'Tribal House', 'Concierto para gozar y disfrutar al mejor estilo del tribal house','23-07-2021', 1013, 'Icono Club')
insert into Conciertos values(3, 'Check ON Party', 'Concierto para estar relajado y pasando bueno','15-06-2021', 1011, 'Electronic Discotek')
insert into Conciertos values(4, 'After Party', 'Concierto para que disfrutes de la musica en vivo','25-07-2021', 1013, 'Icono Club')

-- Update para cada tabla
--Tabla de DJs
Update DJs set votos = 12
where Nombre = 'Dj JuanKa';

--Tabla de Lugares
Update Lugares set Telefono = 2480243
where Telefono = 4026752;

--Tabla de Conciertos
Update Conciertos set Fecha = '12-09-2021'
where Nombre = 'Tribal House';

-- Delete para cada tabla 
-- Tabla de DJs
Delete from DJs
where Nombre = 'Dj Andru';

-- Tabla de Lugares
Delete from Lugares
where Nombre = 'Icono Club';

-- Tabla de Conciertos
Delete from Conciertos
where Nombre = 'After Party';

--Select para cada tabla
--Tabla de DJs
Select * from DJs
where Nombre = 'Dj Juanka';

--Tabla de Lugares
Select * from Lugares
where Nombre = 'El Chagualito';

--Tabla de Conciertos
Select * from Conciertos
where Nombre = 'Check ON Party';