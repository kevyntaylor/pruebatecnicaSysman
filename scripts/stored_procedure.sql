CREATE OR REPLACE PROCEDURE cantidad_libros_por_autor (
    p_autor_id IN NUMBER,
    p_cantidad_libros OUT NUMBER
) AS
BEGIN
    SELECT COUNT(*) INTO p_cantidad_libros
    FROM Libro
    WHERE autor_id = p_autor_id;
END cantidad_libros_por_autor;
