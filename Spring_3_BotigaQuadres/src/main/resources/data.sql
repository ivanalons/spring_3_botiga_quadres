DROP TABLE IF EXISTS PICTURES;
DROP TABLE IF EXISTS SHOPS;

CREATE TABLE SHOPS ( 
   id INT AUTO_INCREMENT, 
   name VARCHAR(50) NOT NULL, 
   pictures_capacity INT NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE PICTURES ( 
   id INT AUTO_INCREMENT, 
   name VARCHAR(100) NOT NULL,
   author VARCHAR(50) DEFAULT 'anonymous', 
   price DECIMAL(20,2) NOT NULL,
   date DATE,
   shop_id INT,
   PRIMARY KEY(id),
   FOREIGN KEY (shop_id) REFERENCES SHOPS(id)
);

INSERT INTO SHOPS(name,pictures_capacity) VALUES ('Shop1',5);
INSERT INTO SHOPS(name,pictures_capacity) VALUES ('Shop2',10);

INSERT INTO PICTURES(author,name,price,date,shop_id) VALUES ('Picasso','Ciudad','10.3',NOW(),1);
INSERT INTO PICTURES(author,name,price,date,shop_id) VALUES ('Dali','Cementerio','20.3',NOW(),1);






