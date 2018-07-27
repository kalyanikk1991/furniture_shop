CREATE TABLE category (
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	CONSTRAINT pk_category_id PRIMARY KEY (id) 

);



INSERT INTO category(name,description,image_url,is_active) VALUES('Indoor Furniture','Indoor furniture','cat_1.png','true');
INSERT INTO category(name,description,image_url,is_active) VALUES('OutDoor Furniture','Outdoor furniture','cat_2.png','true');
INSERT INTO category(name,description,image_url,is_active) VALUES('Kitchen Furniture','Kitchen furniture','cat_3.png','true');
INSERT INTO category(name,description,image_url,is_active) VALUES('Office Furniture','Office furniture','cat_4.png','true');


CREATE TABLE user_detail (
	id IDENTITY,
	user_name VARCHAR(50),
	password VARCHAR(60),
	role VARCHAR(50),
	enabled BOOLEAN,
	email VARCHAR(100),
	gender VARCHAR(50),
	contact_number VARCHAR(15),	
	date_of_birth VARCHAR(15),	
	pay_pal_id VARCHAR(15),
	city VARCHAR(50),
	address VARCHAR(500),

	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail
(user_name,password,role,enabled,email,gender,contact_number,date_of_birth,pay_pal_id,city,address)
VALUES('Virat','admin','ÁDMIN','true','vk99@gmail.com','male','9850032880','19-09-1989','1234','Pune','s.b.road ,pune');

INSERT INTO user_detail
(user_name,password,role,enabled,email,gender,contact_number,date_of_birth,pay_pal_id,city,address)
VALUES('Aswin','1234','SUPPLIER','true','a99@gmail.com','male','9850032880','20-09-1989','1234','Pune','s.b.road ,pune');

INSERT INTO user_detail
(user_name,password,role,enabled,email,gender,contact_number,date_of_birth,pay_pal_id,city,address)
VALUES('Sachin','1234','SUPpLIER','true','st99@gmail.com','male','9850032880','21-09-1989','1234','Pune','s.b.road ,pune');

CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
 	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),	
);

INSERT INTO product
(code,name,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
VALUES('PQRST123PQRST','Bed','Smart Bed Available','32000','1','TRUE','2','1','0','0');

INSERT INTO product
(code,name,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
VALUES('ABC123ABC','Sofa','Smart sofa Available','32000','1','TRUE','4','1','0','0');

INSERT INTO product
(code,name,description,unit_price,quantity,is_active,category_id,supplier_id,purchases,views)
VALUES('XYZ123XYZ','Table','Smart table Available','32000','1','TRUE','3','1','0','0');

