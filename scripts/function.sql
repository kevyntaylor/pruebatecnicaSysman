CREATE OR REPLACE FUNCTION promedio_libros_por_autor RETURN NUMBER AS
    total_autores NUMBER;
    total_libros NUMBER;
    promedio NUMBER;
BEGIN
    -- Obtener el total de autores
    SELECT COUNT(*) INTO total_autores FROM Autor;

    -- Obtener el total de libros
    SELECT COUNT(*) INTO total_libros FROM Libro;

    -- Calcular el promedio
    IF total_autores > 0 THEN
        promedio := total_libros / total_autores;
    ELSE
        promedio := 0;
    END IF;

    RETURN promedio;
END promedio_libros_por_autor;
