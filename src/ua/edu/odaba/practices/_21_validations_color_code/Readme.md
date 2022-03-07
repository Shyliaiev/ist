# Validations. Color Code

Мета завдання - навчити вас працювати з рядками.

Орієнтовний час виконання завдання: 45 хвилин.

### Опис
Реалізуйте метод `validateColorCode` в [`ColorCodeValidation`](ColorCodeValidation.java):

Він перевіряє вхідний рядок на відповідність правилам написання [HTML Color Codes](https://htmlcolorcodes.com/).

При реалізації методів вам може знадобитись використання *регулярних виразів*.
Ви можете використовувати [regex101.com](https://regex101.com/), щоб полегшити їх створення.

Зверніть увагу, що вхідний рядок може дорівнювати `null`.

Ви можете та повинні використовувати наступні методи та класи:
- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

### Приклади
- Приклад дійсних шістнадцяткових кодів:

      #0B79E1 
      #6a8daf 
      #002950
      #FFF

- Приклад недійсних шістнадцяткових кодів:

      123456
      #afafah 
      #-123 
