CREATE DATABASE IF NOT EXISTS bars_register;

USE bars_register;

DROP TABLE IF EXISTS itemVenda;
DROP TABLE IF EXISTS vendas;
DROP TABLE IF EXISTS produtos;
DROP TABLE IF EXISTS fornecedores;
DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    tipo_usuario ENUM ('ADMINISTRADOR', 'FUNCIONARIO') NOT NULL,
    email VARCHAR(255) NOT NULL,
    status BOOLEAN NOT NULL DEFAULT true,
    login VARCHAR(100) NOT NULL UNIQUE,
    senha TEXT NOT NULL
);

CREATE TABLE fornecedores (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60) NOT NULL,
    contato VARCHAR(45) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    cnpj VARCHAR(18) NOT NULL UNIQUE
);

CREATE TABLE produtos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT NOT NULL DEFAULT 0,
    acoes VARCHAR(100)
);

CREATE TABLE vendas (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dataVenda DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2) NOT NULL,
    tipoPagamento ENUM ('DINHEIRO','CREDITO','DEBITO','PIX') NOT NULL
);

CREATE TABLE itemVenda (
    venda_id INT NOT NULL,
    produto_id INT NOT NULL,
    quantidade INT NOT NULL,

    PRIMARY KEY (venda_id, produto_id),
    FOREIGN KEY (venda_id) REFERENCES vendas(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
);

CREATE INDEX idx_produto_nome ON produtos(nome);
CREATE INDEX idx_fornecedor_cnpj ON fornecedores(cnpj);
CREATE INDEX idx_usuario_login ON usuarios(login);
CREATE INDEX idx_venda_data ON vendas(dataVenda);