問題１

INSERT INTO  items(id,category_id,name,price)
VALUES (13,1,'鰯',150),
(14,2,'羊',650);

問題２
UPDATE items set price = price * 0.9

問題３
DELETE FROM employees WHERE end_date <= '2013-3-31';

問題４
SELECT name ,start_date, end_date FROM employees WHERE end_date > start_date  ORDER BY start_date LIMIT 1;

問題５
SELECT r.name , p.name FROM prefectures AS p INNER JOIN regions AS r ON r.code = p.region_code

問題6
SELECT sum(population) FROM populations AS po INNER JOIN prefectures AS pr ON po.prefecture_code = pr.code;

問題7 わからん
SELECT pr.name, ge.name, SUM(po.population) FROM populations AS po CROSS JOIN prefectures AS pr  INNER JOIN  genders AS ge ON pr.region_code = po.prefecture_code GROUP BY pr.name, ge.name ORDER BY pr.name

問題8 わからん
