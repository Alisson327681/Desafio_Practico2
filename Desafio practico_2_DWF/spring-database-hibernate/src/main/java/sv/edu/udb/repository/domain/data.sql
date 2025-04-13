-- data.sql

-- Insertar 5 registros de alumnos
INSERT INTO alumno (nombre, apellido, fecha_nacimiento, email) VALUES
('Ana', 'Pérez', '2003-05-10', 'ana.perez@email.com'),
('Carlos', 'López', '2002-11-25', 'carlos.lopez@email.com'),
('Sofía', 'Gómez', '2004-02-15', 'sofia.gomez@email.com'),
('Javier', 'Rodríguez', '2003-08-01', 'javier.rodriguez@email.com'),
('Valentina', 'Martínez', '2002-07-20', 'valentina.martinez@email.com');

-- Insertar 5 registros de materias
INSERT INTO materia (nombre, creditos) VALUES
('Matemáticas I', 4),
('Programación Básica', 5),
('Historia Universal', 3),
('Física General', 4),
('Inglés Técnico', 3);

-- Asignar materias a alumnos (ejemplos)
INSERT INTO alumno_materia (alumno_id, materia_id) VALUES
(1, 1), -- Ana cursa Matemáticas I
(1, 2), -- Ana cursa Programación Básica
(2, 2), -- Carlos cursa Programación Básica
(2, 4), -- Carlos cursa Física General
(3, 3), -- Sofía cursa Historia Universal
(4, 1), -- Javier cursa Matemáticas I
(4, 5), -- Javier cursa Inglés Técnico
(5, 3), -- Valentina cursa Historia Universal
(5, 2); -- Valentina cursa Programación Básica