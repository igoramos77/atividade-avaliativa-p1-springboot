CREATE TABLE category(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR (155) NOT NULL,
    description VARCHAR (500)
);

CREATE TABLE product (
     id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     description VARCHAR(500),
     inventory_quantity INT,
     created_at TIMESTAMP NOT NULL,
     updated_at TIMESTAMP NOT NULL,
     unity_value FLOAT(5.2) NOT NULL
);

CREATE TABLE productCategory (
     id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
     product_id INT NOT NULL,
     category_id INT NOT NULL,

     FOREIGN KEY (category_id) REFERENCES category(id),
     FOREIGN KEY (product_id) REFERENCES product(id)
);

CREATE TABLE images (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    product_id INT NOT NULL,
    description VARCHAR(255),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,

    FOREIGN KEY (product_id) REFERENCES product(id)
)
