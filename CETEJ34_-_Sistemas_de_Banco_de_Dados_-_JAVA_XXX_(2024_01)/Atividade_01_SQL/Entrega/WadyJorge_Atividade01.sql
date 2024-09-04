-- Respostas

-- Questão 01
SELECT c.nome_cantor, COUNT(g.cod_gravacao) AS num_gravacoes
FROM cantor c
LEFT JOIN gravacao g ON c.cod_cantor = g.cod_cantor
GROUP BY c.cod_cantor, c.nome_cantor
HAVING COUNT(g.cod_gravacao) = (
    SELECT MIN(num_gravacoes)
    FROM (
        SELECT COUNT(g2.cod_gravacao) AS num_gravacoes
        FROM gravacao g2
        GROUP BY g2.cod_cantor
    ) AS min_gravacoes
);

-- Questão 02
SELECT c.nome_cantor, COUNT(DISTINCT g.cod_gravadora) AS num_gravadoras
FROM cantor c
JOIN gravacao g ON c.cod_cantor = g.cod_cantor
GROUP BY c.cod_cantor, c.nome_cantor
HAVING COUNT(DISTINCT g.cod_gravadora) = (
    SELECT MAX(num_gravadoras)
    FROM (
        SELECT COUNT(DISTINCT g2.cod_gravadora) AS num_gravadoras
        FROM gravacao g2
        GROUP BY g2.cod_cantor
    ) AS max_gravadoras
)
ORDER BY c.nome_cantor;

-- Questão 03
SELECT c.nome_cantor, FORMAT(AVG(m.duracao), 4) AS media
FROM cantor c
JOIN gravacao g ON c.cod_cantor = g.cod_cantor
JOIN musica m ON g.cod_musica = m.cod_musica
GROUP BY c.cod_cantor, c.nome_cantor
HAVING AVG(m.duracao) = (
    SELECT MAX(media_duracao)
    FROM (
        SELECT AVG(m2.duracao) AS media_duracao
        FROM gravacao g2
        JOIN musica m2 ON g2.cod_musica = m2.cod_musica
        GROUP BY g2.cod_cantor
    ) AS max_media_duracao
);

-- Questão 04
SELECT c.nome_cantor
FROM cantor c
WHERE NOT EXISTS (
    SELECT 1
    FROM gravacao g
    JOIN gravadora gr ON g.cod_gravadora = gr.cod_gravadora AND gr.nome_gravadora = 'Sony'
    WHERE g.cod_cantor = c.cod_cantor
);

-- Questão 05
SELECT c.nome_cantor AS cantor, m.titulo AS musica, g.data_gravacao
FROM gravacao g
JOIN musica m ON g.cod_musica = m.cod_musica
JOIN cantor c ON g.cod_cantor = c.cod_cantor
WHERE YEAR(g.data_gravacao) = 2004;

-- Questão 06
SELECT c.nome_cantor, MAX(g.data_gravacao) AS data_ultima_gravacao
FROM cantor c
LEFT JOIN gravacao g ON c.cod_cantor = g.cod_cantor
GROUP BY c.nome_cantor
ORDER BY data_ultima_gravacao DESC;

-- Questão 07
SELECT p.nome_pessoa AS nome,
       MAX(CASE WHEN f.tipo = 'R' THEN f.numero END) AS fone_residencial,
       MAX(CASE WHEN f.tipo = 'C' THEN f.numero END) AS fone_comercial,
       MAX(CASE WHEN f.tipo = 'L' THEN f.numero END) AS celular
FROM pessoa p
LEFT JOIN fone f ON p.cod_pessoa = f.cod_pessoa
GROUP BY p.nome_pessoa
HAVING COUNT(f.cod_fone) > 0;
