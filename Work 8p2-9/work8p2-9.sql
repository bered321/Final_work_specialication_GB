USE animal;

CREATE TABLE dogs 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 1,
    Foreign KEY (animal_kind_id) REFERENCES pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO dogs (name, commands, birthday)
VALUES ('Шарик', 'ко мне, апрот, рядом, сидеть', '2023-01-12'),
('Тузик', 'дай лапу, голос, сидеть', '2020-10-11'),
('Кнопка', 'сидеть, стереги, след, ко мне, дай', '2018-11-07');

CREATE TABLE cats 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 2,
    Foreign KEY (animal_kind_id) REFERENCES pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO cats (name, commands, birthday)
VALUES ('Мурзик', 'голос', '2020-05-05'),
('Барсик', 'прыжок', '2021-06-06'),
('Степа', 'спать', '2023-01-05');

CREATE TABLE hamsters 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 3,
    Foreign KEY (animal_kind_id) REFERENCES pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO hamsters (name, commands, birthday)
VALUES ('Шарик', 'бежать', '2023-04-16'),
('Вонючка', 'кушать, ко мне', '2023-03-20'),
('Жорик', 'ко мне, ням-ням', '2022-12-21');

CREATE TABLE horses 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 1,
    Foreign KEY (animal_kind_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO horses (name, commands, birthday)
VALUES ('Сивка', 'стой, лечь, пошли, вперед, встать, сесть, тихо', '2015-07-10'),
('Бурка', 'стой, рысь, лечь, пошли, шагом', '2019-12-10'),
('Ворон', 'стой, встать, сесть, тихо, хоп', '2021-05-15');

CREATE TABLE camels 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 2,
    Foreign KEY (animal_kind_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO camels (name, commands, birthday)
VALUES ('Джерри', 'лежать, перед, стоп', '2017-10-10'),
('Чак', 'лежать, перед, стоп', '2016-11-11'),
('Гарри', 'лежать, перед, стоп', '2015-12-12');

CREATE TABLE donkeys 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 3,
    Foreign KEY (animal_kind_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO donkeys (name, commands, birthday)
VALUES ('Лулу', 'вперед, стоять, сидеть', '2019-11-17'),
('Тоша', 'вперед, стоять, сидеть', '2021-02-10'),
('Люся', 'вперед, стоять, сидеть', '2020-07-29');