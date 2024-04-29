SELECT l.titulo AS Titulo_Libro, CONCAT(a.nombre) AS Nombre_Autor
FROM Libro l
JOIN Autor a ON l.autor_id = a.autor_id
ORDER BY l.fechaPublicacion DESC;
