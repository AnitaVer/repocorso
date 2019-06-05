#1
select distinct strumento 
from abilita 
where strumento not in (
select strumento 
from abilita as a
inner join musicista as m on a.musicista = m.codiceFiscale
where m.sesso = 'F'
);
 
##oppure 
 
select distinct s.nome  
from abilita as a
inner join strumento as s on a.strumento = s.nome
where s.nome not in (
select s.nome 
from abilita as a
inner join strumento as s on a.strumento = s.nome
inner join musicista as m on a.musicista = m.codiceFiscale
where m.sesso = 'F'
);

#2
select m.nome, m.cognome, m.datanascita, a.strumento
from musicista m, abilita a, strumento s 
where m.codiceFiscale = a.musicista and 
      a.strumento = s.nome and 
      s.categoria = 'Ottoni';
      
##oppure

select m.nome, m.cognome, m.datanascita, s.nome
from abilita as a
inner join musicista as m on a.musicista = m.codiceFiscale
inner join strumento as s on a.strumento = s.nome
where s.categoria LIKE "%Ottoni%";

#3

select nome, cognome, datanascita 
from musicista, abilita 
where musicista = codiceFiscale 
group by nome, cognome, datanascita 
having count(*) >= 5;

##oppure

select m.nome, m.cognome, m.datanascita
from abilita as a
inner join musicista as m on a.musicista = m.codiceFiscale
inner join strumento as s on a.strumento = s.nome
group by m.nome, m.cognome, m.datanascita
having count(*) >= 5;

#4
Select strumento
from abilita
group by strumento
having count(*) = 2;

##oppure

select s.nome
from abilita as a
inner join strumento as s on a.strumento = s.nome
inner join musicista as m on a.musicista = m.codiceFiscale
group by s.nome
having count(*)=2;

#5
select m.nome, m.cognome
from musicista as m
where datanascita = (select min(datanascita) from musicista);

#6
select m.nome, m.cognome, s.nome
from abilita as a
join musicista as m on a.musicista = m.codiceFiscale
join strumento as s on a.strumento = s.nome
where m.datanascita = (select max(datanascita) from musicista);

#7
select count(S.nome), M.codiceFiscale
from Musicista as M left join Abilita as A on A.musicista=M.codiceFiscale left join Strumento as S on A.strumento=S.nome
group by M.codiceFiscale;

##oppure

select count(strumento), musicista
from abilita
group by musicista;


