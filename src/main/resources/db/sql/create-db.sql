CREATE TABLE beer (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(200),
  type  VARCHAR(100),
  alcohol_content DOUBLE,
  brewery_id INTEGER
);

CREATE TABLE brewery(
  id INTEGER PRIMARY KEY,
  name VARCHAR (200),
  address VARCHAR (300)
);



ALTER TABLE beer
ADD FOREIGN KEY (brewery_id) 
REFERENCES brewery(id);