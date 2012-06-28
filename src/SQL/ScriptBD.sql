DROP TABLE IF EXISTS horario;
DROP TABLE IF EXISTS disciplina;
DROP TABLE IF EXISTS director;
DROP TABLE IF EXISTS entrenador;
DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario(
    idusuario VARCHAR(50) PRIMARY KEY,
    clave VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    ci VARCHAR(25) NOT NULL,
    sexo VARCHAR(15) NOT NULL,
    fechaNac DATE NOT NULL,
    edad INTEGER,
    tlf VARCHAR(30) NOT NULL, 
    direccion VARCHAR(150) NOT NULL,
    correo VARCHAR(50) NOT NULL,
    tipousuario VARCHAR(50) NOT NULL,
    UNIQUE(ci)
);

CREATE TABLE director(
    iddirector VARCHAR(50) PRIMARY KEY,
    fechIngreso DATE NOT NULL,
    FOREIGN KEY (iddirector) REFERENCES usuario(idusuario)
);

CREATE TABLE entrenador(
    identrenador VARCHAR(50) PRIMARY KEY,
    fechIngreso DATE NOT NULL,
    FOREIGN KEY (identrenador) REFERENCES usuario(idusuario)
);

CREATE TABLE disciplina(
    nombre VARCHAR(60) PRIMARY KEY,
    identrenador VARCHAR(50),
    practicasmin INTEGER NOT NULL,
    esinterna BOOLEAN NOT NULL,
    FOREIGN KEY (identrenador) REFERENCES entrenador(identrenador)
);

CREATE TABLE horario(
    horaini TIME,
    horafin TIME, 
    PRIMARY KEY (horaini, horafin)
);





 