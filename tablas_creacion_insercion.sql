
create table user(
userName varchar (40),
pass varchar (9), 
email varchar (15), 
firstName varchar (40), 
lastName varchar (40), 
secondLastName varchar (40), 
birthDate date, 
genre boolean, 
halal boolean, 
vegan boolean, 
lowCarb boolean, 
highProtein boolean, 
height int, 
weight int);

insert into user 
values ( 'admin', 'admin', 'admin@admin.es', 'admin', 'admin', 'admin', '1970-01-01', true, false, false, false, false, 180, 80); 


create table vegetable(
 productName varchar (40), 
 typeOfVegetable varchar (40), 
 caloricDensity int, 
 carbs int, 
 proteins int, 
 fats int, 
 weight int, 
 typeOfStorage varchar (40), 
 vegan boolean, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean);

 insert into vegetable 
 values ('ajo morado', 'GARLIC', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('ajo negro', 'GARLIC', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('berenjena', 'EGGPLANT', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('calabacin comun', 'ZUCHINI', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('calabaza cacahuete', 'PUMPKIN', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('carne vegana', 'VEGAN_MEAT', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('cebolla blanca', 'ONION', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
 insert into vegetable 
 values ('cebolla morada', 'ONION', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('espárrago blanco', 'ASPARAGUS', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
   insert into vegetable 
 values ('espárrago triguero', 'ASPARAGUS', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
   insert into vegetable 
 values ('espinaca hoja ancha', 'SPINACH', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
    insert into vegetable 
 values ('pepino', 'CUCUMBER', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
  insert into vegetable 
 values ('pimiento rojo', 'PEPPER', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
   insert into vegetable 
 values ('pimiento verde', 'PEPPER', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
   insert into vegetable 
 values ('tomate rama', 'TOMATO', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
    insert into vegetable 
 values ('zanahoria comun', 'CARROT', 33, 8, 1, 1, 0, 'DRY', true, true, false, true);
 

create table recipe(
 recipeName varchar (60), 
 instructions varchar (150), 
 imagePath varchar (50), 
 difficulty  varchar (30), 
 style varchar (40), 
 caloricDensity int, 
 carbs int, 
 fats int, 
 protein int, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean,
 needsHeat boolean, 
 ingredient1 int, 
 ingredient2 int, 
 ingredient3 int,
 ingredient4 int,
 ingredient5 int,
 ingredient6 int,
 ingredient7 int,
 ingredient8 int);
 
 select * from recipe; 
 
insert into recipe
 values ('porra antequerana','https://www.directoalpaladar.com/recetas-de-sopas-y-cremas/como-hacer-porra-antequerana-receta-tradicional-malaguena',
 './images/porra.jpeg', 'LOW', 'SPANISH', 90, 12, 4, 2, true, true, false, true, false, 'tomate en rama', 'pimiento verde', 'aceite de oliva', 'huevo cocido', null, null, null, null); 
 
 insert into recipe
 values ('pollo con almendras','https://www.directoalpaladar.com/recetas-de-carnes-y-aves/pollo-almendras-estilo-chino-receta-facil-deliciosa-que-querras-hacer-otra-vez',
 './images/pollo_almendras.jpeg', 'MEDIUM', 'CHINESE', 190, 11, 6, 21, false, true, false, true, true, 'pechuga de pollo', 'almendras', 'cebolla', 'salsa de soja', null, null, null, null); 
 
  insert into recipe
 values ('tortilla de patatas','https://www.directoalpaladar.com/recetas-de-huevos-y-tortillas/empezando-en-la-cocina-receta-de-tortilla-de-patatas-con-cebolla',
 './images/recetas/tortilla-patatas.jpeg', 'MEDIUM', 'SPANISH', 210, 11, 6, 21, false, true, false, true, true, 'patata', 'cebolla', 'aceite', 'sal', null, null, null, null); 
 
  insert into recipe
 values ('potaje de garbanzos con espinacas','https://www.directoalpaladar.com/recetas-de-legumbres-y-verduras/potaje-garbanzos-receta-mi-abuela-que-no-sabe-modas-falta-que-le-hace',
 './images/potaje_espinacas.jpeg', 'MEDIUM', 'SPANISH', 210, 11, 6, 21, true, true, false, true, true, 'garbanzos', 'espinaca hoja ancha', 'cebolla', 'aceite de oliva', 'sal'  , null, null, null); 

insert into recipe
 values ('Desayuno highProtein','https://www.directoalpaladar.com/recetas-de-huevos-y-tortillas/tortilla-claras-a-finas-hierbas-receta-ligerisima-esponjosa-crujiente-rica-proteinas',
 '.images/desayuno_proteico.jpeg', 'MEDIUM', 'BREAKFAST', 190, 11, 6, 21, true, true, false, true, true, null,null, null, null, null, null, null, null); 
 
 insert into recipe
 values ('Desayuno vegano','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.directoalpaladar.com%2Ftag%2Frecetas-veganas&psig=AOvVaw3Qb62HKljunmIZ4Z1QxVHm&ust=1622627944006000&source=images&cd=vfe&ved=2ahUKEwiOyfSilvbwAhUL9BoKHedpCGoQr4kDegUIARCyAQ',
 './images/desayuno_vegano.jpeg', 'MEDIUM', 'BREAKFAST', 190, 11, 6, 21, true, true, false, true, true, null, null, null, null, null, null, null, null); 
 
 insert into recipe
 values ('Desayuno halal','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.directoalpaladar.com%2Ftag%2Frecetas-veganas&psig=AOvVaw3Qb62HKljunmIZ4Z1QxVHm&ust=1622627944006000&source=images&cd=vfe&ved=2ahUKEwiOyfSilvbwAhUL9BoKHedpCGoQr4kDegUIARCyAQ',
 './images/desayuno_halal.jpeg', 'MEDIUM', 'BREAKFAST', 190, 11, 6, 21, true, true, false, true, true, null, null, null, null, null, null, null, null); 
 
 insert into recipe
 values ('Cena highProtein','https://www.directoalpaladar.com/recetas-de-huevos-y-tortillas/tortilla-claras-a-finas-hierbas-receta-ligerisima-esponjosa-crujiente-rica-proteinas',
 './images/cena-highProtein.jpeg', 'MEDIUM', 'DINNER', 190, 11, 6, 21, true, true, false, true, true, null,null, null, null, null, null, null, null); 
 
 insert into recipe
 values ('Cena vegana','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.directoalpaladar.com%2Ftag%2Frecetas-veganas&psig=AOvVaw3Qb62HKljunmIZ4Z1QxVHm&ust=1622627944006000&source=images&cd=vfe&ved=2ahUKEwiOyfSilvbwAhUL9BoKHedpCGoQr4kDegUIARCyAQ',
 './images/cena-vegana.jpeg', 'MEDIUM', 'DINNER', 190, 11, 6, 21, true, true, false, true, true, null, null, null, null, null, null, null, null); 
 
 insert into recipe
 values ('Cena halal','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.directoalpaladar.com%2Ftag%2Frecetas-veganas&psig=AOvVaw3Qb62HKljunmIZ4Z1QxVHm&ust=1622627944006000&source=images&cd=vfe&ved=2ahUKEwiOyfSilvbwAhUL9BoKHedpCGoQr4kDegUIARCyAQ',
 '.images/cena-halal.jpeg', 'MEDIUM', 'DINNER', 190, 11, 6, 21, true, true, false, true, true, null, null, null, null, null, null, null, null); 
 

 create table meat(
 productName varchar (40), 
 typeOfMeat varchar (40), 
 caloricDensity int, 
 carbs int, 
 proteins int, 
 fats int, 
 weight int, 
 typeOfStorage varchar (40), 
 vegan boolean, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean);
 
insert into meat
values ('cinta de lomo', 'PORK', 165, 0, 23, 4, 0, 'COLD', false, false, true, true);
insert into meat
values ('costilla de cerdo', 'PORK', 195, 0, 23, 11, 0, 'COLD', false, false, true, true);
insert into meat
values ('falda de cordero', 'LAMB', 252, 0, 23, 11, 0, 'COLD', false, false, true, true);
insert into meat
values ('filete de jamón', 'PORK', 165, 0, 23, 6, 0, 'COLD', false, false, true, true);
insert into meat
values ('filete de ternera', 'BEEF', 135, 0, 24, 4, 0, 'COLD', false, true, true, true);
insert into meat
values ('huevo cocido', 'CHICKEN', 152, 0, 23, 11, 0, 'COLD', false, false, true, true);
insert into meat
values ('jamon curado', 'PORK', 252, 0, 23, 11, 0, 'COLD', false, false, true, true);
insert into meat
values ('muslo de pavo', 'TURKEY', 145, 0, 26, 7, 0, 'COLD', false, true, true, true);
insert into meat
values ('muslo de pollo', 'CHICKEN', 113, 0, 20, 3, 0, 'COLD', false, true, true, true);
insert into meat
values ('pechuga de pavo', 'TURKEY', 125, 0, 26, 3, 0, 'COLD', false, true, true, true);
insert into meat
values ('ragú de ternera', 'BEEF', 145, 0, 24, 6, 0, 'COLD', false, true, true, true);



 create table legumes(
 productName varchar (40), 
 typeOfLegume varchar (40), 
 caloricDensity int, 
 carbs int, 
 proteins int, 
 fats int, 
 weight int, 
 typeOfStorage varchar (40), 
 vegan boolean, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean);

 insert into legumes
values ('cacahuete', 'PEANUTS', 563, 8, 23, 46, 0, 'DRY', true, true, true, true);
 insert into legumes
values ('garbanzos', 'CHICKPEAS', 253, 60, 25, 1, 0, 'DRY', true, true, true, true);
 insert into legumes
values ('garbanzos cocidos', 'CHICKPEAS', 93, 10, 6, 1, 0, 'DRY', true, true, true, true);
 insert into legumes
values ('guisante', 'PEAS', 117, 21, 8, 1, 0, 'COLD', true, true, true, true);
insert into legumes
values ('judias blancas', 'BEANS', 81, 12, 6, 1, 0, 'DRY', true, true, true, true);
 insert into legumes
values ('judias verdes', 'BEANS', 32, 8, 2, 1, 0, 'COLD', true, true, true, true);
 insert into legumes
values ('lentejas', 'LENTILLS', 353, 60, 25, 1, 0, 'DRY', true, true, true, true);



  create table fruit(
 productName varchar (40), 
 typeOfFruit varchar (40), 
 caloricDensity int, 
 carbs int, 
 proteins int, 
 fats int, 
 weight int, 
 typeOfStorage varchar (40), 
 vegan boolean, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean);
 

  create table fish(
 productName varchar (40), 
 typeOfFish varchar (40), 
 caloricDensity int, 
 carbs int, 
 proteins int, 
 fats int, 
 weight int, 
 typeOfStorage varchar (40), 
 vegan boolean, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean);
 
 insert into fish
values ('caballa', 'BLUE_FISH', 182, 0, 19, 12, 0, 'COLD', false, false, true, true);
 insert into fish
values ('dorada', 'WHITE_FISH', 152, 0, 19, 7, 0, 'COLD', false, false, true, true);
 insert into fish
values ('gamba', 'SEAFOOD', 159, 0, 19, 3, 0, 'COLD', false, false, true, true); 
 insert into fish
values ('langostino', 'SEAFOOD', 159, 0, 19, 3, 0, 'COLD', false, false, true, true);
 insert into fish
values ('lenguado', 'WHITE_FISH', 152, 0, 19, 6, 0, 'COLD', false, false, true, true);
 insert into fish
values ('lubina', 'WHITE_FISH', 152, 0, 19, 6, 0, 'COLD', false, false, true, true);
 insert into fish
values ('pulpo', 'SEAFOOD', 82, 3, 16, 6, 0, 'COLD', false, true, true, true);
  insert into fish
values ('sardina', 'BLUE_FISH', 182, 0, 19, 6, 0, 'COLD', false, true, true, true);
 
 
 create table condiment(
 productName varchar (40), 
 typeOfCondiment varchar (40), 
 caloricDensity int, 
 carbs int, 
 proteins int, 
 fats int, 
 weight int, 
 typeOfStorage varchar (40), 
 vegan boolean, 
 halal boolean, 
 highProtein boolean, 
 lowCarb boolean);
 
 
 insert into condiment
values ('aceite de girasol', 'OIL', 899, 0, 0, 99, 0, 'DRY', true, true, true, true);
  insert into condiment
values ('aceite de oliva', 'OIL', 884, 0, 0, 99, 0, 'DRY', true, true, true, true);
  insert into condiment
values ('azucar blanco', 'SWEETENER', 399, 99, 0, 0, 0, 'DRY', true, true, true, true);
  insert into condiment
values ('azucar moreno', 'SWEETENER', 377, 98, 0, 0, 0, 'DRY', true, true, false, false);
  insert into condiment
values ('pimienta blanca', 'SPICES', 0, 0, 0, 0, 0, 'DRY', true, true, true, true);
   insert into condiment
values ('pimienta negra', 'SPICES', 0, 0, 0, 0, 0, 'DRY', true, true, true, true);
   insert into condiment
values ('sal', 'SPICES', 0, 0, 0, 0, 0, 'DRY', true, true, true, true);