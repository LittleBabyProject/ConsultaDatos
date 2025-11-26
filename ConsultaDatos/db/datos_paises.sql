CREATE DATABASE datos_paises;
USE datos_paises;

CREATE TABLE paises (
	id_pais INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	continente VARCHAR(100) NOT NULL,
	region VARCHAR(100) NOT NULL,
    superficie DECIMAL(15,2) NOT NULL,
	anioIndependencia INT NOT NULL,
	poblacion INT NOT NULL,
	expectLife DECIMAL(5,2) NOT NULL,
    pib DECIMAL(15,2) NOT NULL,
	gobierno VARCHAR(100) NOT NULL, 
	jefeGobierno VARCHAR(100) NOT NULL,
	codPais VARCHAR(3) NOT NULL
);

CREATE TABLE ciudades (
	id_ciudad INT AUTO_INCREMENT PRIMARY KEY,
    id_pais INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    distrito VARCHAR(100) NOT NULL,
    poblacion INT NOT NULL,
    es_capital BOOLEAN,
    FOREIGN KEY (id_pais) REFERENCES paises(id_pais)
);

CREATE TABLE idiomas (
	id_idioma INT AUTO_INCREMENT PRIMARY KEY,
    id_pais INT NOT NULL,
    idioma VARCHAR(100) NOT NULL,
    esOficial BOOLEAN NOT NULL,
    porcentajeHablante DECIMAL(5,2) NOT NULL,
    FOREIGN KEY (id_pais) REFERENCES paises(id_pais)
);

CREATE TABLE usuarios (
	id_usuario INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(150) NOT NULL,
    contrasena VARCHAR(20) NOT NULL,
    rol VARCHAR(20) NOT NULL
);

INSERT INTO paises (nombre, continente, region, superficie, anioIndependencia, poblacion, expectLife, pib, gobierno, jefeGobierno, codPais)
VALUES
	('España', 'Europa', 'Europa del Sur', 505990.00, 1492, 47450795, 83.10, 1398000000000.00, 'Monarquía Parlamentaria', 'Pedro Sánchez', 'ESP'),
	('México', 'América', 'América del Norte', 1964375.00, 1810, 126014024, 75.05, 1293000000000.00, 'República Federal', 'Andrés Manuel López Obrador', 'MEX'),
	('Argentina', 'América', 'América del Sur', 2780400.00, 1816, 45376763, 76.67, 445500000000.00, 'República Federal', 'Alberto Fernández', 'ARG'),
	('Japón', 'Asia', 'Asia Oriental', 377975.00, 660, 125836021, 84.63, 4939000000000.00, 'Monarquía Constitucional', 'Fumio Kishida', 'JPN'),
	('Nigeria', 'África', 'África Occidental', 923768.00, 1960, 206139587, 54.33, 448100000000.00, 'República Federal', 'Muhammadu Buhari', 'NGA'),
	('Estados Unidos', 'América', 'América del Norte', 9833517.00, 1776, 331002651, 78.79, 2143000000000.00, 'República Federal', 'Joe Biden', 'USA'),
	('Brasil', 'América', 'América del Sur', 8514877.00, 1822, 212559417, 75.88, 1833000000000.00, 'República Federal', 'Luiz Inácio Lula da Silva', 'BRA'),
	('Alemania', 'Europa', 'Europa Occidental', 357022.00, 1871, 83783942, 81.33, 3863000000000.00, 'República Federal', 'Olaf Scholz', 'DEU'),
	('Australia', 'Oceanía', 'Australia y Nueva Zelanda', 7692024.00, 1901, 25499884, 83.94, 1397000000000.00, 'Monarquía Constitucional', 'Anthony Albanese', 'AUS'),
	('Egipto', 'África', 'Norte de África', 1002450.00, 1922, 102334404, 72.00, 363100000000.00, 'República', 'Abdel Fattah el-Sisi', 'EGY');

INSERT INTO ciudades (id_pais, nombre, distrito, poblacion, es_capital)
VALUES
	(1, 'Madrid', 'Madrid', 3223334, TRUE),
	(1, 'Barcelona', 'Cataluña', 1620343, FALSE),
	(1, 'Valencia', 'Valencia', 791413, FALSE),
	(2, 'Ciudad de México', 'Distrito Federal', 9209944, TRUE),
	(2, 'Guadalajara', 'Jalisco', 1495182, FALSE),
	(3, 'Buenos Aires', 'Buenos Aires', 2890151, TRUE),
	(3, 'Córdoba', 'Córdoba', 1329604, FALSE),
	(4, 'Tokio', 'Kanto', 13929286, TRUE),
	(4, 'Osaka', 'Kansai', 2691185, FALSE),
	(5, 'Abuja', 'Territorio de la Capital Federal', 1235880, TRUE),
	(5, 'Lagos', 'Lagos', 14862000, FALSE),
	(6, 'Washington D.C.', 'Distrito de Columbia', 689545, TRUE),
	(6, 'Nueva York', 'Nueva York', 8336817, FALSE),
	(7, 'Brasilia', 'Distrito Federal', 3055149, TRUE),
	(7, 'São Paulo', 'São Paulo', 12325232, FALSE),
	(8, 'Berlín', 'Berlín', 3669491, TRUE),
	(8, 'Hamburgo', 'Hamburgo', 1841179, FALSE),
	(9, 'Canberra', 'Territorio de la Capital Australiana', 426704, TRUE),
	(9, 'Sídney', 'Nueva Gales del Sur', 5312163, FALSE),
	(10, 'El Cairo', 'El Cairo', 9500000, TRUE),
	(10, 'Alejandría', 'Alejandría', 5210000, FALSE);

INSERT INTO idiomas (id_pais, idioma, esOficial, porcentajeHablante)
VALUES
	(1, 'Español', TRUE, 99.00),
	(1, 'Catalán', FALSE, 17.00),
	(1, 'Gallego', FALSE, 7.00),
	(2, 'Español', TRUE, 98.00),
	(2, 'Náhuatl', FALSE, 1.50),
	(3, 'Español', TRUE, 99.00),
	(3, 'Italiano', FALSE, 1.50),
	(4, 'Japonés', TRUE, 99.00),
	(4, 'Coreano', FALSE, 0.50),
	(5, 'Inglés', TRUE, 60.00),
	(5, 'Hausa', FALSE, 25.00),
	(5, 'Yoruba', FALSE, 21.00),
	(6, 'Inglés', TRUE, 79.00),
	(6, 'Español', FALSE, 13.00),
	(7, 'Portugués', TRUE, 98.00),
	(7, 'Alemán', FALSE, 1.50),
	(8, 'Alemán', TRUE, 95.00),
	(8, 'Turco', FALSE, 1.80),
	(9, 'Inglés', TRUE, 72.70),
	(10, 'Árabe', TRUE, 99.00),
	(10, 'Inglés', FALSE, 35.00);

INSERT INTO usuarios (nombre, contrasena, rol)
VALUES
	('admin', 'admin123', 'Administrador'),
	('Alexander Acevedo', 'Alex123', 'Administrador'),
	('Nicolas Guerra', 'Nico123', 'Usuario'),
	('Felipe Martinez', 'Felipe123', 'Usuario'),
	('Kevin Moraga', 'Kevin123', 'Usuario');

select * from ciudades;
select * from idiomas;
select * from paises;
select * from usuarios;