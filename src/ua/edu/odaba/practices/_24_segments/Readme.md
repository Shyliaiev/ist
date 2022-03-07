# Segments

Мета завдання — навчити вас працювати з класами та методами.

Орієнтовний час виконання завдання: 45 хвилин.

### Опис
Реалізуйте наступні методи класу [`Segment`](Segment.java):

* Конструктор, в який в якості параметрів передаються координати точок початку та кінця відрізку.\
  Переконайтесь, що створений відрізок існує і не є виродженим — початок та кінець відрізку не є однією і тією ж точкою.\
  Якщо це так, використовуйте `throw new IllegalArgumentException()`, щоб викликати помилку.
* `double length()`\
  Повертає довжину відрізку.
* `Point middle()`\
  Повертає середню точку відрізку.
* `Point intersection(Segment another)`\
  Повертає точку перетину поточного відрізку з іншим.\
  Повертає `null`, якщо такої точки немає.\
  Повертає `null`, Якщо відрізки колінеарні.\
  Зверніть увагу, що точка перетину повинна лежатиʼ на обох відрізках.

Клас [`Point`](Point.java) вже існує.

Корисні посилання:
* [Length reference](https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line)
* [Midpoint reference](https://www.wikihow.com/Find-the-Midpoint-of-a-Line-Segment#Use-the-Midpoint-Formula)
* [Intersection reference](https://en.wikipedia.org/wiki/Line–line_intersection)

### Приклади
Ви можете використовувати клас [Main](Main.java), щоб спробувати ваш код. Внизу наведено кілька прикладів.

---
Sample code:
```java
...
double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
System.out.println(length);

```

Output: `5`

---
Sample code:
```java
...
Segment first = new Segment(new Point(0, 0), new Point(4, 4));
Segment second = new Segment(new Point(2, 0), new Point(0, 2));
Point intersection = first.intersection(second);

System.out.println(intersection.getX());
System.out.println(intersection.getY());

```

Output:

```
1
1
```
---
Sample code:
```java
...
Segment seqment = new Segment(new Point(2, 0), new Point(0, 2));
Point midpoint = segment.middle();

System.out.println(midpoint.getX());
System.out.println(midpoint.getY());

```

Output:

```
1
1
```

---
Sample code:
```java
...
Segment first = new Segment(new Point(0, 0), new Point(4, 0));
Segment second = new Segment(new Point(2, 1), new Point(1, 2));
Point intersection = first.intersection(second);

System.out.println(intersection == null);

```

Output:

```
true
```

---