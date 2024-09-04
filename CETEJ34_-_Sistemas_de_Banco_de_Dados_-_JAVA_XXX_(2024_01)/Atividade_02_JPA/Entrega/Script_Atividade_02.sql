CREATE DATABASE atividade_02;
USE atividade_02;


CREATE TABLE Departamento (
    codigo INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nome VARCHAR(100)
);


CREATE TABLE Funcionario (
    codigo INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nome VARCHAR(100),
    qtd_dependentes INT,
    salario DECIMAL(10, 2),
    cargo VARCHAR(50),
    codigo_departamento INT,
    FOREIGN KEY (codigo_departamento) REFERENCES Departamento(codigo)
);


INSERT INTO Departamento (nome) VALUES 
('Recursos Humanos'), 
('Desenvolvimento'), 
('Marketing'),
('Diretoria de Recursos Humanos'),
('Diretoria de TI'),
('Diretoria de Desenvolvimento'),
('Diretoria de Operações'),
('Diretoria de Marketing');


INSERT INTO Funcionario (nome, qtd_dependentes, salario, cargo, codigo_departamento) VALUES
('Ana Silva', 2, 6000.00, 'Gerente de RH', 1),
('Paulo Souza', 1, 10000.00, 'Diretor de TI', 5), 
('Carlos André', 0, 9500.00, 'Diretor de Desenvolvimento', 6),
('Bruna Santos', 1, 3000.00, 'Analista de Marketing', 3),
('Wady Jorge', 0, 6000.00, 'Desenvolvedor Pleno', 2),
('Rafael Fernandes', 1, 3000.00, 'Desenvolvedor Júnior', 2), 
('Helena Costa', 3, 2500.00, 'Assistente de RH', 1),
('Pedro Oliveira', 0, 8000.00, 'Diretor de Operações', 7),
('Beatriz Costa', 0, 7000.00, 'Diretora de Marketing', 8) ,
('Patrícia Santos', 1, 3000.00, 'Assistente Administrativo', 1); 


CREATE VIEW a_DepartamentoMaisFuncionarios AS
SELECT d.nome AS departamento, COUNT(f.codigo) AS num_funcionarios
FROM Departamento d
JOIN Funcionario f ON d.codigo = f.codigo_departamento
GROUP BY d.nome
HAVING COUNT(f.codigo) = (
    SELECT MAX(num_funcionarios)
    FROM (
        SELECT COUNT(f2.codigo) AS num_funcionarios
        FROM Departamento d2
        JOIN Funcionario f2 ON d2.codigo = f2.codigo_departamento
        GROUP BY d2.nome
    ) AS max_funcionarios
)
ORDER BY num_funcionarios DESC;


CREATE VIEW b_DepartamentoMenosFuncionariosSemDependentes AS
SELECT d.nome AS departamento, COUNT(f.codigo) AS num_funcionarios_sem_dependentes
FROM Departamento d
JOIN Funcionario f ON d.codigo = f.codigo_departamento
WHERE f.qtd_dependentes = 0
GROUP BY d.nome
HAVING COUNT(f.codigo) = (
    SELECT MIN(num_funcionarios_sem_dependentes)
    FROM (
        SELECT COUNT(f.codigo) AS num_funcionarios_sem_dependentes
        FROM Departamento d
        JOIN Funcionario f ON d.codigo = f.codigo_departamento
        WHERE f.qtd_dependentes = 0
        GROUP BY d.nome
    ) AS funcionarios_sem_dependentes
);


CREATE VIEW c_DepartamentoComFuncionariosDiretoria AS
SELECT d.nome AS departamento, f.nome AS funcionario
FROM Departamento d
JOIN Funcionario f ON d.codigo = f.codigo_departamento
WHERE LOWER(f.cargo) LIKE 'dir%'
ORDER BY d.nome, f.nome;


CREATE VIEW d_FuncionarioMaiorSalario AS
SELECT f.nome AS nome, d.nome AS departamento
FROM Funcionario f
JOIN Departamento d ON f.codigo_departamento = d.codigo
WHERE f.salario = (
    SELECT MAX(salario)
    FROM Funcionario
)
ORDER BY f.salario DESC;


CREATE VIEW e_FuncionarioCargoGerente AS
SELECT d.nome AS nome_departamento, f.nome AS nome_funcionario, f.cargo
FROM Funcionario f
JOIN Departamento d ON f.codigo_departamento = d.codigo
WHERE f.cargo LIKE '%Gerente%'
ORDER BY d.nome, f.nome;


CREATE USER 'funcionario'@'localhost' IDENTIFIED BY 'senhaFuncionario';
CREATE USER 'gerente'@'localhost' IDENTIFIED BY 'senhaGerente';


GRANT SELECT ON atividade_02.* TO 'funcionario'@'localhost';
GRANT ALL PRIVILEGES ON atividade_02.* TO 'gerente'@'localhost';
FLUSH PRIVILEGES;
