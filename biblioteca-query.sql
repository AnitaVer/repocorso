#1

select l.titolo, p.inizio, p.fine
from prestito as p
join utente as u on p.utente = u.idU
join libro as l on p.libro = l.idL
where u.cognome = "Vallieri"
order by p.inizio;

#2
select p.idP, u.cognome, l.titolo
from prestito as p
join utente as u on p.utente = u.idU
join libro as l on p.libro = l.idL
where p.fine is null;

#3
select p.idP, u.cognome, l.titolo
from prestito as p
join utente as u on p.utente = u.idU
join libro as l on p.libro = l.idL
where datediff(p.fine, p.inizio) >15;

#4
select u.cognome, u.nome, count(u.idU)
from prestito as p
join utente as u on p.utente = u.idU
join libro as l on p.libro = l.idL
group by u.idU
order by count(u.idU) desc;