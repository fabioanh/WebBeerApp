-- Insert Breweries
INSERT INTO brewery(id, name, address) VALUES (1, 'Brewery Riva', 'rue 1 123');
INSERT INTO brewery(id, name, address) VALUES (2, 'Brasserie Brootcoorens', 'rue 2 123');
INSERT INTO brewery(id, name, address) VALUES (3, 'Brewery De Leite', 'rue 3 123');
INSERT INTO brewery(id, name, address) VALUES (4, 'Brewery Angerik', 'rue 4 123');
INSERT INTO brewery(id, name, address) VALUES (5, 'Brewery Duvel Moortgat', 'rue 5 123');
INSERT INTO brewery(id, name, address) VALUES (6, 'Huisbrouwerij Sint-Canarus', 'rue 6 123');
INSERT INTO brewery(id, name, address) VALUES (7, 'Brewery Bios', 'rue 7 123');
INSERT INTO brewery(id, name, address) VALUES (8, 'Brasserie de l''Abbaye des Rocs', 'rue 8 123');
INSERT INTO brewery(id, name, address) VALUES (9, '''t Hofbrouwerijke', 'rue 9 123');

--Insert Beers
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (1,'Abdis Blond', 1, 'blond', 6.0);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (2,'Angélus Blonde', 2, 'blond', 7.5);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (3,'Cuvée Jeun''homme', 3, 'blond', 7.0);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (4,'Boerke Bruin', 4, 'bruin', 8.0);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (5,'Maredsous bruin', 5, 'bruin', 5.6);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (6,'Potteloereke', 6, 'bruin', 6.8);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (7,'Stropken', 7, 'amber', 8.2);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (8,'Montagnarde', 8, 'amber', 9.5);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (9,'Hoftrol', 9, 'amber', 4.8);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (10,'Maredsous blond', 5, 'blond', 6.0);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (11,'Steendonk', 5, 'witbier', 4.5);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (12,'Vedett Extra White', 5, 'witbier', 4.7);
INSERT INTO beer(id,name,brewery_id, type, alcohol_content) VALUES (13,'Blanche des Honnelles', 5, 'witbier', 6.0);