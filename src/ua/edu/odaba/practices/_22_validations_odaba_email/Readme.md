# Validations. ODABA Email

Мета завдання - навчити вас працювати з рядками.

Орієнтовний час виконання завдання: 45 хвилин.

### Опис

Реалізуйте метод `validateOdabaEmail`
в [`OdabaEmailValidation`](OdabaEmailValidation.java):

Цей метод перевіряє вхідний рядок на відповідність правилам для звичайної електронної адреси ОДАБА. Визначимо їх:

- Стандартна електронна адреса в ОДАБА включає ім'я і прізвище (англійською мовою), розділені знаком підкреслення ("_").
- Електронні адреси ОДАБА завжди закінчуються на "@odaba.edu.ua".
- Якщо людина отримує нову електронну адресу в ОДАБА, а адреса з таким іменем та прізвищем вже зареєстрована, необхідно додати "1" до нової електронної адреси. Якщо така адреса електронної пошти також вже існує, використовуйте "2" і так далі.

При реалізації методів вам може знадобитись використання *регулярних виразів*. Ви можете використати [regex101.com](https://regex101.com/) щоб спростити їх створення.

Зверніть увагу, що вхідний рядок може дорівнювати `null`.

Ви можете та повинні використовувати наступні методи та класи:

- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

### Приклади

- Коректні приклади:

      william_shakespeare@odaba.edu.ua
      lu_e@odaba.edu.ua
      william_shakespeare1@odaba.edu.ua 
      william_shakespeare2@odaba.edu.ua

- Некоректні приклади:

       william@odaba.edu.ua
       william.shakespeare@odaba.edu.ua
       william...shakespeare@odaba.edu.ua
       william-shakespeare@odaba.edu.ua
       shakespeare123@odaba.edu.ua
       william_$hakespeare@odaba.edu.ua
