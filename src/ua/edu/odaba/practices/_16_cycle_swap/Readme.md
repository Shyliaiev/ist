# Cycle Swap

Мета завдання – навчити вас працювати з масивами.

Орієнтовний час виконання завдання: 30 хвилин.

### Опис
Перейдіть в клас [`CycleSwap`](CycleSwap.java) та реалізуйте його статичні методи:

* `void cycleSwap(int[] array)`\
  Зсуває всі елементи в даному масиві вправо на 1 позицію. \
  В цьому випадку останній елемент масиву стає першим.\
  Наприклад, `1 3 2 7 4` стає `4 1 3 2 7`.

* `void cycleSwap(int[] array, int shift)`\
  Зсуває всі елементи в заданому масиві вправо на `shift` позицій.\
  Гарантується, що значення зсуву невід'ємне та не більше довжини масиву.\
  Наприклад, `1 3 2 7 4` із зсувом `3` стає `2 7 4 1 3`.

Для більшого інтересу при виконанні завдання спробуйте не використовувати цикли в своєму коді (це не обов'язково).

Зверніть увагу, що вхідний масив не може бути пустим.

### Приклади

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array);
System.out.println(Arrays.toString(array));
```

Output:
```
[4, 1, 3, 2, 7]
```

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 2);
System.out.println(Arrays.toString(array));
```

Output:
```
[7, 4, 1, 3, 2]
```

---
Code Sample:
```java
...
int[] array = new int[]{1, 3, 2, 7, 4};
CycleSwap.cycleSwap(array, 5);
System.out.println(Arrays.toString(array));
```

Output:
```
[1, 3, 2, 7, 4]
```

