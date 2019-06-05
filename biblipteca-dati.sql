INSERT INTO LIBRO (idL,titolo,autore) VALUES ('AQ123','Algoritms','Sedgewitch');
INSERT INTO LIBRO (idL,titolo,autore) VALUES ('BP482','Pascal','Wirth');
INSERT INTO LIBRO (idL,titolo,autore) VALUES ('DW834','Transistors','Coppelli');
INSERT INTO LIBRO (idL,titolo,autore) VALUES ('HT937','Microprocessori','Carroll');
INSERT INTO LIBRO (idL,titolo,autore) VALUES ('HY237','Diodi','Stortoni');
INSERT INTO LIBRO (idL,titolo,autore) VALUES ('TR827','Compilatori','Ranieri');

INSERT INTO UTENTE (idU,cognome,nome) VALUES ('1','Rossi','Mario');
INSERT INTO UTENTE (idU,cognome,nome) VALUES ('2','Verdi','Andrea');
INSERT INTO UTENTE (idU,cognome,nome) VALUES ('3','Bianchi','Massimo');
INSERT INTO UTENTE (idU,cognome,nome) VALUES ('4','Corrada','Fabio');
INSERT INTO UTENTE (idU,cognome,nome) VALUES ('5','Vallieri','Sara');
INSERT INTO UTENTE (idU,cognome,nome) VALUES ('6','Garavaglia','Marco');
INSERT INTO UTENTE (idU,cognome,nome) VALUES ('7','Esposito','Marzia');


-- Si noti che il formato date prevede che le date siano inserite nella forma yyyy--mm-dd, cioe' anno-mese-giorno.

INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('1','DW834','6','2003-12-12','2003-12-15');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('2','AQ123','6','2004-01-10','2004-01-12');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('3','BP482','7','2004-01-19','2004-01-21');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('4','HY237','5','2004-01-15','2004-01-22');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('5','TR827','4','2004-02-01','2004-02-03');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('6','TR827','3','2004-02-02','2004-02-03');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('7','HY237','6','2004-03-03','2004-03-18');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('8','AQ123','1','2004-04-01','2004-05-05');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('9','BP482','2','2004-04-02','2004-04-23');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('10','DW834','3','2004-04-10','2004-04-15');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('11','HT937','4','2004-04-18','2004-04-10');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('12','TR827','6','2004-05-05','2004-06-05');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('13','AQ123','5','2004-05-07','2004-06-09');
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('14','HY237','5','2004-05-15',null);
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('15','BP482','3','2004-05-16',null);	 
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('16','DW834','6','2004-06-12',null);	 
INSERT INTO PRESTITO (idP,libro, utente, inizio, fine) VALUES ('17','TR827','5','2004-06-18',null);