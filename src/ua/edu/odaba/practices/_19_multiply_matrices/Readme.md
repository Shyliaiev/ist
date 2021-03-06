# Matrices multiplication

Мета завдання – навчити вас працювати з масивами.

Орієнтовний час виконання завдання: 60 хвилин.

### Опис

Перейдіть в клас [`MultiplyMatrix`](MultiplyMatrix.java)
та реалізуйте метод `multiply`.

Метод бере два прямокутних цілочисельних масиви (матриці) та повертає результат їх множення.

Розглянемо дві цілочисельнимх матриці, представлені у вигляді **прямокутних масивів**. Задача – перемножити дані матриці. При такому множенні елементи в **i-му** рядку матриці *A* множаться на відповідні елементи в **j-му** стовпчику матриці *B*, а сума отриманих значень зберігається в **ij-й** елемент результуючої матриці.

Зверніть увагу, що кількість стовпчиків в першій матриці дорівнює кількості рядків в другій матриці.

### Приклад

Input:

        {{1, 2, 3}, 
        {4, 5, 6}}, 
        
        {{7 , 8 }, 
        {9 , 10},
        {11, 12}}

Output:

        {{58 , 64 },
        {139, 154}}
