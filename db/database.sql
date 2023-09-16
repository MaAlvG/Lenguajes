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
