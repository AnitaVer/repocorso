#1
select citta from aeroporto where npiste is null;

#2
select a1.nazione, a2.nazione
from volo as v
join aeroporto as a1 on (v.aeroportoPartenza) = (a1.id)
join aeroporto as a2 on (v.aeroportoArrivo) = (a2.id)
where v.idVolo = 1;

#3
select v.tipoAereo
from volo as v 
join Aeroporto as ap on (v.aeroportoPartenza) = (ap.id)
where ap.citta = "Roma";

#4
select v.tipoAereo, a.npass
from volo as v
join Aeroporto as ap on (v.aeroportoPartenza) = (ap.id)
join aereo as a on (v.tipoAereo) = (a.tipoAereo)
where ap.citta = "Roma";

#5
select distinct a2.citta
from volo as v
join aeroporto as a1 on v.aeroportoArrivo = a1.id
join aeroporto as a2 on v.aeroportoPartenza = a2.id
where a1.citta = "Amsterdam"
order by (a2.citta) asc;

#6
select count(v.idVolo)
from volo as v
join aeroporto as a on (v.aeroportoPartenza) = (a.id)
where a.citta = "Napoli"
and v.giornoSett = "venerdì";

#7
select cp.citta
from volo as v
join aeroporto as cp on v.aeroportoPartenza = cp.id
join aeroporto as ca on v.aeroportoArrivo = ca.id
where cp.nazione = "Italia"
and ca.nazione = "Olanda"
group by (cp.citta)
having count(*) >= 2;

#8
select ap.citta, v.idVolo, v.giornoSett
from volo as v
join aeroporto as ap on v.aeroportoPartenza = ap.id
join aereo as a on v.tipoAereo = a.tipoAereo
where a.npass in (
select max(npass)
from aereo);

#9
select aa.citta, v.idVolo, v.giornoSett
from volo as v
join aeroporto as aa on v.aeroportoArrivo = aa.id
join aereo as a on v.tipoAereo = a.tipoAereo
where a.npass in (
select max(npass)
from aereo);

select ap.citta, v.idVolo, v.giornoSett
from volo as v
join aeroporto as ap on v.aeroportoPartenza = ap.id
join aereo as a on v.tipoAereo = a.tipoAereo
where a.npass in (
select max(npass)
from aereo)
union
select aa.citta, v.idVolo, v.giornoSett
from volo as v
join aeroporto as aa on v.aeroportoArrivo = aa.id
join aereo as a on v.tipoAereo = a.tipoAereo
where a.npass in (
select max(npass)
from aereo);
