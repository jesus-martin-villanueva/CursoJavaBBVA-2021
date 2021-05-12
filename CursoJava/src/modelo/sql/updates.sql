update figuras
set fig_nombre = "cuadrado1"
where fig_id = 3;

update figuras
set fig_nombre = "circulo1"
where fig_id = 4;

update figuras
set fig_nombre = "rectangulo1", fig_altura = 8.4, fig_base = 12.3
where fig_id = 5;

update figuras
set fig_nombre = "triangulo1", fig_altura = 8.4, fig_base = 10
where fig_id = 6;

update figuras
set fig_nombre = "poligono1", fig_lado = 10, fig_apotema = 6.2, fig_numlados = 6
where fig_id = 7;