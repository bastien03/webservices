--INSERT INTO book VALUES (1, 'Histoires de Berlin', 2010);
--INSERT INTO book VALUES (2, 'Le pari de la décroissance', 2006);
--INSERT INTO book VALUES (3, 'Génération supporter', 1990);
--INSERT INTO book VALUES (4, 'Le chemin de l espérance', 2011);
--INSERT INTO book VALUES (6, 'Willy Brandt, eine Biographie', 2003);
--INSERT INTO book VALUES (7, 'Condorcet, un intellectuel en politique', 1989);
--INSERT INTO book VALUES (8, 'Der Spieler', 2012);
--INSERT INTO book VALUES (9, 'La charte d Athènes', 1933);
--INSERT INTO book VALUES (10, 'Watchmen', 1986);
--INSERT INTO book VALUES (12, 'Mr Hitchcock, wie haben Sie das gemacht?', 1966);
--INSERT INTO book VALUES (14, 'Petite Poucette', 2012);
--INSERT INTO book VALUES (18, 'Moi, Zlatan Ibrahimovic', 2013);
--INSERT INTO book VALUES (19, 'Histoire des Etats-Unis', 2012);
--INSERT INTO book VALUES (21, 'Les Corrections', 2001);
--INSERT INTO book VALUES (22, 'L espion qui venait du froid', 1963);
--INSERT INTO book VALUES (24, 'Les défricheurs. Voyage dans la France qui innove vraiment', 2014);
--INSERT INTO book VALUES (25, 'Ghana must go', 2013);
--INSERT INTO book VALUES (27, 'L Orange mécanique', 1962);

INSERT INTO book (id, title, year, AUTHOR_ID) VALUES
    (5, 'Voyage au bout de la nuit', 1932, 2),
    (11, 'La mort entre autres', 2006, 5),
    (13, 'Carmen', 1845, 1),
    (15, 'Das letzte Experiment', 2009, 5),
    (16, 'Mort à crédit', 1936, 2),
    (17, 'Photo de groupe au bord du fleuve', 2010, 7),
    (20, 'Die Adlon Verschwörung', 2009, 5),
    (23, 'Ladivine', 2013, 6),
    (26, 'L étranger', 1942, 3),
    (28, '1984', 1949, 4),
    (29, 'Mateo Falcone', 1829, 1),
;

INSERT INTO author VALUES
    (1, 'Prosper Mérimée'),
    (2, 'Louis Ferdinand Céline'),
    (3, 'Albert Camus'),
    (4, 'George Orwell'),
    (5, 'Philipp Kerr'),
    (6, 'Marie NDiaye'),
    (7, 'Emmanuel Dongala')
;