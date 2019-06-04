SELECT * FROM Smartphone;
SELECT name, ram, size, cpu FROM Smartphone;
SELECT name FROM Smartphone WHERE displayResolution = "1080x1920";
SELECT name FROM Smartphone WHERE displayResolution = "1080x1920" AND ram="3Gb";
SELECT * FROM Smartphone WHERE name LIKE "%Galaxy%";
SELECT * FROM Smartphone WHERE name LIKE "%Galaxy%" AND cpu LIKE "%dual-core%";
SELECT * FROM Smartphone WHERE weight >= 150;
SELECT * FROM Smartphone WHERE weight < 150;
SELECT * FROM Smartphone order by displayPpi ASC;
SELECT * FROM Smartphone order by displayPpi DESC;


SELECT S.name, B.id FROM Smartphone AS S INNER JOIN Brand AS B ON S.brand = b.id;

SELECT S.name, O.description 
FROM Smartphone AS S 
INNER JOIN OpSys AS O 
ON S.opSys = O.id
ORDER BY O.description, S.name;

SELECT S.name, O.description 
FROM Smartphone AS S 
INNER JOIN OpSys AS O 
ON S.opSys = O.id
WHERE O.description LIKE "%Android%"
ORDER BY S.weight DESC;

SELECT S.name, B.name, C.name
FROM smartphone AS S
INNER JOIN brand AS B
ON S.brand = B.id
INNER JOIN country as C ON B.country = C.code
ORDER BY C.name;

SELECT count(S.id) FROM Smartphone AS S
WHERE S.ram="3Gb";

SELECT count(S.id) AS count FROM Smartphone AS S
WHERE S.ram="3Gb";

SELECT count(S.id) AS count, O.description
FROM Smartphone AS S INNER JOIN OpSys AS O ON S.opSys = O.id
GROUP BY O.description;

SELECT count(S.id) AS count, C.name
FROM Smartphone AS S
INNER JOIN Brand AS B ON S.brand = B.id
INNER JOIN Country AS C ON B.country = c.code
GROUP BY C.code;

SELECT C.name, b.name
FROM Country AS C
LEFT JOIN Brand AS B ON b.country = c.code;
