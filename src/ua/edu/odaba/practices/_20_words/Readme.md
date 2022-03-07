# Words

Мета завдання — навчити вас працювати з рядками.

Орієнтовний час виконання завдання: 60 хвилин.

### Опис

Реалізуйте методи класу [`StringUtil`](StringUtil.java):

#### 1. countEqualIgnoreCaseAndSpaces
Сигнатура методу:
```java
public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample)
```
Повертає кількість слів з масиву `words`, які дорівнюють `sample` без врахування регістру символів, а також початкових та кінцевих пробілів.\
Якщо `sample` дорівнює `null`, або `words` має значення `null` чи пусте значення, необхідно повернути `0`. `words` гарантовано не містить значень `null`.

#### 2. splitWords
Сигнатура методу:
```java
public static String[] splitWords(String text)
```
Розділяє рядок `text` на масив слів, використовуючи наступні роздільні символи: `",", ".", ";", ":", " ", "?", "!"`.\
Для пустого рядка, рядка `null`, та рядка, що складається лише із роздільних символів, повертається значення `null`.

#### 3. convertPath
Сигнатура методу:
```java
public static String convertPath(String path, boolean toWin)
```
Перетворює шлях `path` в шлях в нотації Unix\Windows залежно від логічного параметру.

Шлях в Unix може починатися `~` або `/`. Кожен підкаталог повинен закінчуватись символом `/` крім останнього.
Елементи шляху `.` та `..` відносяться до поточного каталогу и батьківського каталогy.
Ім'я файлу не обов'язково має розширення.\
Приклади шляху Unix:
- `/folder/../folder/file.txt`
- `/dev/null`
- `file.txt`
- `folder/logs/`
- `~/user/some_logs`

Шлях в Windows може починатися з `C:`. Кожен підкаталог повинен закінчуватись символом `\ ` крім останнього.
Елементи шляху `.` та `..` відносяться до поточного каталогу и батьківського каталогy.
Ім'я файлу не обов'язково має розширення.\
Приклади шляху Windows:
- `file.txt`
- `\Program Files\some_file.exe`
- `.\to_do_list.txt`
- `C:\Users\..\Cygwin`
- `.\file`

Нехай шлях Unix  `~` відповідає шляху Windows `C:\User` та навпаки.\
Розглянемо кореневу папку Unix `/` (тобто коли шлях починається з `/`), яка відповідає Windows `C:\ ` та навпаки
(але `C:\User` як і раніше відповідає  `~`).

Якщо `path` вде відповідає потрібному формату (наприклад, це шлях Windows, коли необхідні шляхи Windows та логічний  параметр `toWin` має значення `true`) повертається `path`.\
Якщо `path` дорівнює `null`, пустий, або  не відповідає жодному формату шляху (Unix, Windows), необхідно повернути `null`.\
Гарантується, що `path` або є правильним, або містить деякі з наступних помилок:
- більше одного `~`
- `~` знаходиться не на початку
- `~` змішаний з `\ ` (`~` в шляху Windows)
- більше одного`C:`
- `C:` знаходиться не на початку
- `C:` змішаний з `/` (`C:` в пути Unix)
- `\ ` змішаний з `/`

Приклади неправильних шляхів:
- `/folder1/folder2\folder3`
- `C:\User/root`
- `/dev/~/`
- `C:/a/b/c/d`
- `~\folder`
- `~/~`
- `~~`
- `C:\Folder\Subfolder\C:\ `

#### 4.joinWords
Сигнатура методу:
```java
public static String joinWords(String[] words)
```
З'єднує слова з масиву `words` та повертає у вигляді рядка в наступному форматі: `"[str_1, str_2, ..., str_n]"`.

Якщо значення `words` дорівнює `null` або є пустим, необхідно повернути `null`. `words` гарантовано не містить значень `null`. `words` може містити пусті рядки, ігноруйте їх, тобто не вміщуйте їх в результуючий рядок. Якщо `words` містить лише пусті рядки, поверніть `null`.

#### Підказки
- При реалізації методів вам може знадобитись використання `регулярних виразів`. Можна використовувати [regex101.com](https://regex101.com/) для спрощення розробки регулярних виразів.
- Ви  можете та повинні використовувати наступні методи та класи (клікніть по назві):
    - [`String.strip`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#strip())
    - [`String.split`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#split(java.lang.String))
    - [`String.replaceAll`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#replaceAll(java.lang.String,java.lang.String))
    - [`String.replaceFirst`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#replaceFirst(java.lang.String,java.lang.String))
    - [`String.toLowerCase`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#toLowerCase())
    - [`String.equalsIgnoreCase`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#equalsIgnoreCase(java.lang.String))
    - [`String.startsWith`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#startsWith(java.lang.String))
    - [`String.matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
    - [`String.join`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...))
    - [`StringBuilder`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html)
    - [`StringJoiner`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/StringJoiner.html)
    - [`StringTokenizer`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/StringTokenizer.html)

### Приклади
Ви можете використовувати метод `main` класу [`StringUtil`](StringUtil.java)
для перевірки реалізації.

```java
String[] words = new String[] {"   nice ", "nICE", "nic3"};
String sample = "NICE";
int result = StringUtil.countEqualIgnoreCaseAndSpaces(words, sample); // 2
words = new String[]{" zoOm ", " z oom", " Z O O M "};
sample = "ZOOM";
result = StringUtil.countEqualIgnoreCaseAndSpaces(words, sample); // 1
```

```java
String text = " go with ...the:;        FLOW ";
String[] result = StringUtil.splitWords(text); // ["go", "with", "the", "FLOW"]
text = ":..,,,::: ;;;      ";
result = StringUtil.splitWords(text); // null
```

```java
String winPath = "C:\\Program Files\\my_prog_file.py";
String unixPath = StringUtil.convertPath(winPath, false); // "/Program Files/my_prog_file.py"
unixPath = "../script.sh";
winPath = StringUtil.convertPath(unixPath, true); // "..\\script.sh"
unixPath = StringUtil.convertPath(unixPath, false); // "../script.sh"
unixPath = "//home/user/somefile";
winPath = StringUtil.convertPath(unixPath, true); // "C:\\home\\user\\somefile"
```

```java
String[] words = new String[]{"go", "with", "the", "", "FLOW"};
String result = StringUtil.joinWords(words); // "[go, with, the, FLOW]"
```

