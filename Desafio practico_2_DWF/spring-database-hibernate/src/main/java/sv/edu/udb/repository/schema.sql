-- schema.sql

-- Tabla para alumnos
CREATE TABLE alumno (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE,
    email VARCHAR(100) UNIQUE
);

-- Tabla para materias
CREATE TABLE materia (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    creditos INT NOT NULL
);

-- Tabla de relación muchos a muchos entre alumno y materia
CREATE TABLE alumno_materia (
    alumno_id INT,
    materia_id INT,
    PRIMARY KEY (alumno_id, materia_id),
    FOREIGN KEY (alumno_id) REFERENCES alumno(id),
    FOREIGN KEY (materia_id) REFERENCES materia(id)
);