USE bars_register;

-- Populando a tabela usuarios
INSERT INTO usuarios (nome, tipo_usuario, email, status, login, senha) VALUES
('Admin System', 'ADMINISTRADOR', 'admin@barsregister.com', true, 'admin', 'admin123'),
('João Silva', 'FUNCIONARIO', 'joao.silva@barsregister.com', true, 'joao.silva', 'joao123'),
('Maria Santos', 'FUNCIONARIO', 'maria.santos@barsregister.com', true, 'maria.santos', 'maria123'),
('Carlos Oliveira', 'ADMINISTRADOR', 'carlos.oliveira@barsregister.com', true, 'carlos.oliveira', 'carlos123');

-- Populando a tabela fornecedores
INSERT INTO fornecedores (nome, contato, endereco, cnpj) VALUES
('Distribuidora ABC', '(11) 98765-4321', 'Rua das Bebidas, 123 - São Paulo/SP', '12.345.678/0001-90'),
('Fornecedora XYZ', '(11) 91234-5678', 'Avenida dos Produtos, 456 - São Paulo/SP', '98.765.432/0001-10'),
('Atacadão do Bar', '(11) 94567-8901', 'Rua do Comércio, 789 - São Paulo/SP', '45.678.901/0001-23'),
('Bebidas & Cia', '(11) 92345-6789', 'Avenida Principal, 321 - São Paulo/SP', '78.901.234/0001-56');

-- Populando a tabela produtos
INSERT INTO produtos (nome, preco, estoque, acoes) VALUES
('Cerveja Pilsen 600ml', 8.90, 100, ''),
('Refrigerante Cola 2L', 7.50, 80, 'Mais 20 unidades a chegar'),
('Água Mineral 500ml', 2.50, 150, ''),
('Suco Natural 500ml', 6.90, 50, ''),
('Energético 250ml', 9.90, 60, ''),
('Vodka 750ml', 45.90, 30, '5 garrafas sumiram do estoque'),
('Whisky 750ml', 89.90, 20, ''),
('Gin 750ml', 65.90, 25, '');

-- Populando a tabela vendas
INSERT INTO vendas (dataVenda, total, tipoPagamento) VALUES
('2024-01-15 14:30:00', 45.80, 'PIX'),
('2024-01-15 15:45:00', 98.70, 'CREDITO'),
('2024-01-15 16:20:00', 25.90, 'DINHEIRO'),
('2024-01-15 17:10:00', 156.80, 'DEBITO'),
('2024-01-16 13:25:00', 78.90, 'PIX'),
('2024-01-16 14:50:00', 34.50, 'DINHEIRO');

-- Populando a tabela itemVenda
INSERT INTO itemVenda (venda_id, produto_id, quantidade) VALUES
(1, 1, 3),  -- 3 Cervejas
(1, 2, 2),  -- 2 Refrigerantes
(2, 6, 2),  -- 2 Vodkas
(2, 3, 1),  -- 1 Água
(3, 4, 2),  -- 2 Sucos
(3, 3, 4),  -- 4 Águas
(4, 7, 1),  -- 1 Whisky
(4, 8, 1),  -- 1 Gin
(5, 1, 5),  -- 5 Cervejas
(5, 5, 3),  -- 3 Energéticos
(6, 2, 2),  -- 2 Refrigerantes
(6, 4, 3);  -- 3 Sucos