
drop database if exists fiscal;
create database fiscal;
use fiscal;
-- Criação da tabela Departamentos
CREATE TABLE Departamentos (
    DepartamentoID INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100),
    Localizacao VARCHAR(100)
);

-- Criação da tabela Cargos
CREATE TABLE Cargos (
    CargoID INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(100),
    SalarioBase DECIMAL(10,2)
);

-- Criação da tabela Funcionários
CREATE TABLE Funcionarios (
    FuncionarioID INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100),
    Sobrenome VARCHAR(100),
    DataNascimento DATE,
    DepartamentoID INT,
    CargoID INT,
    DataContratacao DATE,
    DataDemissao DATE,
    FOREIGN KEY (DepartamentoID) REFERENCES Departamentos(DepartamentoID),
    FOREIGN KEY (CargoID) REFERENCES Cargos(CargoID)
);

-- Criação da tabela Projetos
CREATE TABLE Projetos (
    ProjetoID INT PRIMARY KEY AUTO_INCREMENT,
    NomeProjeto VARCHAR(100),
    DataInicio DATE,
    DataFim DATE,
    Orçamento DECIMAL(15,2)
);

-- Criação da tabela Alocações
CREATE TABLE Alocacoes (
    FuncionarioID INT,
    ProjetoID INT,
    HorasAlocadas INT,
    PRIMARY KEY (FuncionarioID, ProjetoID),
    FOREIGN KEY (FuncionarioID) REFERENCES Funcionarios(FuncionarioID),
    FOREIGN KEY (ProjetoID) REFERENCES Projetos(ProjetoID)
);

-- Criação da tabela Folha de Pagamento
CREATE TABLE FolhaPagamento (
    PagamentoID INT PRIMARY KEY AUTO_INCREMENT,
    FuncionarioID INT,
    DataPagamento DATE,
    ValorPago DECIMAL(10,2),
    FOREIGN KEY (FuncionarioID) REFERENCES Funcionarios(FuncionarioID)
);

-- Criação da tabela Benefícios
CREATE TABLE Beneficios (
    BeneficioID INT PRIMARY KEY AUTO_INCREMENT,
    Descrição VARCHAR(255),
    Valor DECIMAL(10,2)
);

-- Criação da tabela Histórico de Promoções
CREATE TABLE HistoricoPromocoes (
    FuncionarioID INT AUTO_INCREMENT,
    CargoID INT,
    DataPromocao DATE,
    PRIMARY KEY (FuncionarioID, DataPromocao),
    FOREIGN KEY (FuncionarioID) REFERENCES Funcionarios(FuncionarioID),
    FOREIGN KEY (CargoID) REFERENCES Cargos(CargoID)
);




