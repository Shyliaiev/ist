# Triangle

Мета завдання - навчити вас працювати з класами та методами.

Орієнтовний час виконання завдання: 45 хвилин.

### Опис

Реалізуйте методи класу [`Triangle`](Triangle.java):

* Конструктор, що приймає в якості параметрів координати трьох вершин.\
  Перевірте, що створений трикутник існує і не є виродженим.\
  Якщо це так, використайте `throw new IllegalArgumentException()`, щоб викликати помилку.
* `double area()`\
  Повертає площу трикутника.
* `Point centroid()`\
  Повертає центроїд трикутника.

Клас [`Point`](Point.java) вже існує.

Корисні посилання:
* [Triangle existence reference](https://en.wikipedia.org/wiki/Triangle#Existence_of_a_triangle)
* [Triangle area reference](https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle)
* [Centroid reference](https://en.wikipedia.org/wiki/Centroid)

Зверніть увагу, що можна ввести в розв'язок і додаткові класи.

## Приклади
Ви  можете використовувати клас  [Main](Main.java), щоб спробувати ваш код. Внизу наведено декілька прикладів.
---
Sample code:
```java
...
new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));
```

Результат: виключення, оскільки такий трикутник буде виродженим.

---
Sample code:
```java
...
double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
System.out.println(area);
```

Output:

```
6
```

---
Sample code:
```java
...
Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

System.out.println(centroid.getX());
System.out.println(centroid.getY());
```

Output:

```
1
1
```

