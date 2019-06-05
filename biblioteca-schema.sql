DROP DATABASE IF EXISTS Biblioteca;

CREATE DATABASE Biblioteca
	DEFAULT CHARACTER SET latin1
	DEFAULT COLLATE latin1_GENERAL_ci;
    
USE Biblioteca;

DROP TABLE IF EXISTS Utente;
DROP TABLE IF EXISTS Libro;
DROP TABLE IF EXISTS Prestito;

create table Utente (
   idU      varchar(20) primary key,
   cognome varchar(20) not null,
   nome varchar(20) not null
   );
   
create table Libro (
   idL       char(16)  primary key,
   titolo       varchar(20) not null,
   autore      varchar(20) not null
   );

create table Prestito (
   idP       char(20)  primary key,
   libro   char(16),
   utente   varchar(20),
   inizio date,
   fine date 
   );

ALTER TABLE Prestito 
	ADD CONSTRAINT fk_utente FOREIGN KEY (Utente) REFERENCES Utente(idU);
	   
ALTER TABLE Prestito 
	ADD CONSTRAINT fk_libro FOREIGN KEY (Libro) REFERENCES Libro(idL);
	