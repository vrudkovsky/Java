# Мини-проект "Счастливая семья" (продолжение)

Суть проекта: описание структуры семьи с учетом того, что у каждого человека есть кровные родственники, а состав семьи может со временем меняться.

# Работа с коллекциями
## Задание

Усовершенствуйте проект: замените все массивы на коллекции.

#### Технические требования:
DONE - Классы `Pet`, `Human`, `Family` содержат реализацию через массивы. Замените все массивы на коллекции.
DONE - `habits` (привычки) `Pet` храните в интерфейсе `Set`.
DONE - `schedule` (расписание) `Human` храните в интерфейсе `Map`.
DONE  - `children` (список детей) `Family` храните в интерфейсе`List`.
DONE  - В семье теперь может быть несколько домашних питомцев - храните их в интерфейсе `Set`.
???- Исправьте юнит-тесты.

(?? Family класс методы addChild and deleteChaild, уже не нужны так как у SET MAP LIST свои нативные методы add & remove??
 ?? юнит-тесты  что тестим FamilyDemo переписать - зачем если у нас уже CollectionDemo?- написать
 тогда что тестить Интерфейс SET MAP LIST и их методы ??
)

#### Литература:
- [Типы коллекций. Интерфейс Collection](https://metanit.com/java/tutorial/5.1.php)
- [Class ArrayLis](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html)
- [Class HashSet](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html)
- [Class HashMap](https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html)