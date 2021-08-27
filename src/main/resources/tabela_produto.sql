CREATE TABLE produto (
			id BIGINT(50) PRIMARY KEY AUTO_INCREMENT,
			nome_produto VARCHAR(100) NOT NULL,
			descricao_simples VARCHAR(500) NOT NULL,
			mercado_alvo VARCHAR(50) NOT NULL
		) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO produto (id, nome_produto, descricao_simples, mercado_alvo) VALUES (1, 'Sistema Web 1', 'Sistema para o setor de alimentação', 'Alimentação');
INSERT INTO produto (id, nome_produto, descricao_simples, mercado_alvo) VALUES (2, 'Sistema Web 2', 'Sistema para o setor de varejo de vestuário', 'Vestuário');
INSERT INTO produto (id, nome_produto, descricao_simples, mercado_alvo) VALUES (3, 'Sistema Web 3', 'Sistema para o setor de abastecimento de combustíveis', 'Petróleo e gás');
