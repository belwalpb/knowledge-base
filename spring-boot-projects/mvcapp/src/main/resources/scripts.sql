CREATE USER 'bookstore-adm-user'@'%' IDENTIFIED BY 'bookstore@123';

GRANT ALL PRIVILEGES ON bookstore.* TO 'bookstore-adm-user'@'%';

FLUSH PRIVILEGES;


CREATE TABLE authors (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  address VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE books (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  title VARCHAR(255) NOT NULL,
  isbn VARCHAR(255) NOT NULL,
  author_id INT NOT NULL,
  active_sts BOOLEAN DEFAULT TRUE,
  PRIMARY KEY (id),
  FOREIGN KEY (author_id) REFERENCES authors(id)
);