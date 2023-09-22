CREATE DATABASE hospital;
USE hospital;



CREATE TABLE paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    cedula VARCHAR(15) UNIQUE NOT NULL,
    medico_cabecera INT,
    FOREIGN KEY (medico_cabecera) REFERENCES medico(id)
);

    
    
CREATE TABLE medico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    cedula VARCHAR(15) UNIQUE NOT NULL,
    especialidad VARCHAR(255) NOT NULL
);




CREATE TABLE cita (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    medico_id INT NOT NULL,
    paciente_id INT NOT NULL,
    FOREIGN KEY (medico_id) REFERENCES medico(id),
    FOREIGN KEY (paciente_id) REFERENCES paciente(id)
);


CREATE TABLE expediente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    padecimiento VARCHAR(255) NOT NULL,
    procedimiento VARCHAR(255),
    medicamentos VARCHAR(255),
    paciente_id INT NOT NULL,
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);



/*
CREATE TABLE especialidades (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);



SELECT * FROM citas WHERE paciente_id = 1;
*/

--Inserts


INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Juan', 'Pérez', '123456789', 1);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('María', 'González', '987654321', 2);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Carlos', 'López', '567890123', 3);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Laura', 'Martínez', '789012345', 1);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Pedro', 'Rodríguez', '234567890', 2);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Ana', 'Fernández', '678901234', 3);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Luis', 'Sánchez', '345678901', 1);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Sofía', 'Díaz', '890123456', 2);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Eduardo', 'Ramírez', '456789012', 3);

INSERT INTO paciente (nombre, apellido, cedula, medico_cabecera)
VALUES ('Carmen', 'Lara', '012345678', 1);




-- Tres médicos de Medicina General
INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dr. Juan', 'Gómez', 'MG12345', 'Medicina General');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dra. María', 'López', 'MG67890', 'Medicina General');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dr. Carlos', 'Martínez', 'MG54321', 'Medicina General');

-- Otros médicos con diferentes especialidades
INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dra. Laura', 'Fernández', 'DER12345', 'Dermatología');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dr. Pedro', 'Sánchez', 'OFT67890', 'Oftalmología');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dra. Ana', 'González', 'ORT54321', 'Ortopedia');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dr. Luis', 'Ramírez', 'PSI98765', 'Psiquiatría');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dra. Sofía', 'Díaz', 'CAR23456', 'Cardiología');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dr. Eduardo', 'Hernández', 'NEU78901', 'Neurología');

INSERT INTO medico (nombre, apellido, cedula, especialidad)
VALUES ('Dra. Carmen', 'Torres', 'GAS01234', 'Gastroenterología');




INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-05', '09:00:00', 1, 1);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-06', '10:30:00', 2, 2);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-07', '14:15:00', 3, 3);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-08', '11:45:00', 4, 4);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-09', '16:00:00', 5, 5);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-10', '09:30:00', 6, 6);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-11', '15:45:00', 7, 7);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-12', '10:00:00', 8, 8);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-13', '13:30:00', 9, 9);


INSERT INTO cita (fecha, hora, medico_id, paciente_id)
VALUES ('2023-10-14', '17:15:00', 10, 10);



-- Expediente para el paciente 1 (Medicina General)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-05', 'Dolor de cabeza', 'Examen de rutina', 'Aspirina', 1);

-- Expediente para el paciente 2 (Medicina General)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-06', 'Gripe', 'Revisión física', 'Paracetamol', 2);

-- Expediente para el paciente 3 (Medicina General)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-07', 'Presión alta', 'Control de presión', 'Enalapril', 3);

-- Expediente para el paciente 4 (Dermatología)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-08', 'Acné', 'Limpieza facial', 'Crema antibiótica', 4);

-- Expediente para el paciente 5 (Oftalmología)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-09', 'Problemas de visión', 'Examen de vista', 'Gotas para los ojos', 5);

-- Expediente para el paciente 6 (Ortopedia)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-10', 'Dolor de espalda', 'Radiografía', 'Antiinflamatorios', 6);

-- Expediente para el paciente 7 (Psiquiatría)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-11', 'Ansiedad', 'Terapia psicológica', 'Antidepresivos', 7);

-- Expediente para el paciente 8 (Cardiología)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-12', 'Palpitaciones', 'Electrocardiograma', 'Betabloqueantes', 8);

-- Expediente para el paciente 9 (Neurología)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-13', 'Migraña', 'Resonancia magnética', 'Analgésicos', 9);

-- Expediente para el paciente 10 (Gastroenterología)
INSERT INTO expediente (fecha, padecimiento, procedimiento, medicamentos, paciente_id)
VALUES ('2023-10-14', 'Dolor abdominal', 'Endoscopia', 'Antiácidos', 10);


