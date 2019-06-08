drop database if exists viaggi;

create database viaggi
	default character set latin1
    default collate latin1_GENERAL_ci;
    
use viaggi;

drop table if exists aeroporto;
drop table if exists aereo;
drop table if exists volo;

create table if not exists aeroporto (
id int not null primary key,
citta varchar(20) not null,
nazione varchar(20) not null,
npiste int 
);

create table if not exists aereo (
tipoAereo varchar(20) not null primary key,
npass int not null,
quantitaMerci int not null
);

create table if not exists volo (
idVolo int not null,
giornoSett varchar(10) not null,
aeroportoPartenza int not null,
aeroportoArrivo int not null,
tipoAereo varchar(20) not null,
oraPartenza int(2) not null, 
oraArrivo int(2) not null, 
constraint pk_id primary key(idVolo, giornoSett),
constraint fk_aereoportoPartenza foreign key(aeroportoPartenza) references aeroporto(id),
constraint fk_aereoportoArrivo foreign key(aeroportoArrivo) references aeroporto(id),
constraint fk_tipoAereo foreign key(tipoAereo) references aereo(tipoAereo)
);