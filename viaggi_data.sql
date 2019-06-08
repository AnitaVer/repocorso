INSERT INTO aeroporto(id, citta, nazione, npiste)
values (1, "Napoli", "Italia", 5),
	   (2, "Roma", "Italia", 10),
	   (3, "Amsterdam", "Olanda", null),
	   (4, "Barcellona", "Spagna", 8),
	   (5, "New york", "stati Uniti", 20);
       
INSERT INTO aereo (tipoAereo, npass, quantitaMerci)
values ("F35",250,1000),
	   ("shut",300,7564),
	   ("B747",678,73643);
       
INSERT INTO volo(idVolo, giornoSett, aeroportoPartenza, aeroportoArrivo, tipoAereo, oraPartenza, oraArrivo)
values	(1,"lunedì", 2, 3, "F35", 12, 15),
	    (1,"martedì", 1, 2, "shut", 9, 10),
        (2,"mercoledì", 5, 3, "B747", 14, 15),
        (1,"giovedì", 2, 3, "F35", 12,15),
        (1,"venerdì", 1, 2, "shut", 9,10),
        (2,"sabato", 5, 3, "B747", 14,15);
        