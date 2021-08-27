CREATE TABLE tecnologia (
			id BIGINT(50) PRIMARY KEY AUTO_INCREMENT,
			nome VARCHAR(100) NOT NULL,
			versao VARCHAR(50) NOT NULL
		) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO produto (id, nome, versao) VALUES (1, 'Java', '8');
INSERT INTO produto (id, nome, versao) VALUES (2, 'Oracle', '8');
INSERT INTO produto (id, nome, versao) VALUES (3, 'JSF', '2');
INSERT INTO produto (id, nome, versao) VALUES (4, 'PrimeFaces', '10');
INSERT INTO produto (id, nome, versao) VALUES (5, 'Angular', '10');
INSERT INTO produto (id, nome, versao) VALUES (6, 'HTML', '5');
INSERT INTO produto (id, nome, versao) VALUES (7, 'CSS', '3');
INSERT INTO produto (id, nome, versao) VALUES (8, 'Java', '11');
INSERT INTO produto (id, nome, versao) VALUES (9, 'Kotlin', '1');