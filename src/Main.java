import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Класс Продукты
        System.out.println("Класс Продукты");

        Product apple = new Product("Яблоки", 200.0, 1.5);
        Product orange = new Product("Апельсины", 400.0, 2.0);
        Product tomato = new Product("Помидоры", 350.5, 1.5);
        Product cucumber = new Product("Огурцы", 310.0, 2.2);
        Product potato = new Product("Картофель", 205.7, 2.3);
        Product carrot = new Product("Морковь", 90.5, 1.0);
        Product onion = new Product("Лук", 120.0, 2.1);
        Product beetroot = new Product("Свёкла", 60.0, 0.3);
        Product rice = new Product("Рис", 100.0, 1.0);
        Product meat = new Product("Мясо", 650.3, 2.0);


        // Список продуктов
        System.out.println("Список продуктов");

        ProductList productList = new ProductList();
        productList.addProductToList(apple);
        productList.addProductToList(orange);
        productList.addProductToList(tomato);
        productList.addProductToList(potato);


        System.out.println(productList);

        productList.checkProduct("кабачки");


        // Класс Рецепты
        System.out.println("");
        System.out.println("Класс Рецепты");
        HashMap<Product, Double> products = new HashMap<>();
        products.put(potato, 1.0);
        products.put(carrot, 0.3);
        products.put(onion, 0.1);
        products.put(beetroot, 0.1);
        products.put(meat, 0.9);
        Recipe borsch = new Recipe("Борщ", products);
        System.out.println(borsch);
        borsch.countCostOfRecipe();

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(borsch);

        // Задание с множеством целых чисел
        System.out.println("");
        System.out.println("Задание с множеством целых чисел");
        numbersSetRemove();

        // Задание с таблицей умножения
        System.out.println("");
        System.out.println("Задание с таблицей умножения");
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(4, 6);
        Task task2 = new Task(6, 4);
        Set<Task> tasks = new HashSet<>();
        tasks.add(task);
        tasks.add(task2);
        System.out.println(tasks);

        // Задание с паспортами
        System.out.println("");
        System.out.println("Задание с паспортами");
        Passport passport1 = new Passport(1115236958, "Иван", "Иванович", "Иванов",
                LocalDate.of(1995, 6, 15));
        Passport passport2 = new Passport(1112369547, "Петр", "Петрович", "Сидоров",
                LocalDate.of(1985, 3, 19));
        Passport passport3 = new Passport(1113852947, "Евгений", "Евгеньевич", "Горин",
                LocalDate.of(1994, 8, 28));

        Set<Passport> passports = new HashSet<>();
        passports.add(passport1);
        passports.add(passport2);
        System.out.println(passports);

        PassportList passportList = new PassportList();
        passportList.addOrUpdatePassport(passport1);
        passportList.addOrUpdatePassport(passport2);
        passportList.addOrUpdatePassport(passport3);
        System.out.println(passportList);

        passportList.findByNumber(1115236958);


        // Задание 4. Теоретическая задача.
        // Меньше времени на выполнение метода process понадобится коллекции HashSet, т.к. в ArrayList и LinkedList сложность (и время) поиска
        // элементов второго списка в первом зависят от количества элементов первой коллекции. И только в случае с HashSet можно находить
        // элементы за константное время.

        // Задание с телефонным справочником
        System.out.println("");
        System.out.println("Задание с телефонным справочником");
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иванов Иван", "89217896358");
        phoneBook.put("Сидоров Степан", "89290564123");
        phoneBook.put("Антонова Ксения", "89263254369");
        phoneBook.put("Смирнова Екатерина", "89285632874");
        phoneBook.put("Ветрова Елена", "89268529944");
        phoneBook.put("Григорьев Павел", "89253327854");
        phoneBook.put("Замяткин Дмитрий", "89219873057");
        phoneBook.put("Жердев Андрей", "89290028753");
        phoneBook.put("Петров Николай", "89215021998");
        phoneBook.put("Нестеров Анатолий", "89264559820");
        phoneBook.put("Хомяков Егор", "89210038558");
        phoneBook.put("Кочкина Надежда", "89257746321");
        phoneBook.put("Павлова Светлана", "89268304827");
        phoneBook.put("Ручьев Игорь", "89213369080");
        phoneBook.put("Шаповалова Татьяна", "89258872056");
        phoneBook.put("Коткин Евгений", "89296355821");
        phoneBook.put("Пирогова Анастасия", "89296630048");
        phoneBook.put("Журавлёва Дарья", "89218524311");
        phoneBook.put("Хрусталёв Илья", "89213258527");
        phoneBook.put("Баландина Арина", "89293255265");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue() + ".");
        }


        // Задание №3 из ДЗ 1 по Map
        System.out.println("");
        System.out.println("Задание №3 из ДЗ 1 по Map");
        Map<String, Integer> map = new HashMap<>();
        map.put("Самолёт", 1);
        map.put("Автомобиль", 2);
        map.put("Трамвай", 3);
        System.out.println(map);
        changeMap(map, "Метрополитен", 4);
        System.out.println(map);


        // Задание №1 из ДЗ 2 по Map
        System.out.println("");
        System.out.println("Задание №1 из ДЗ 2 по Map");
        ListMap listMap = new ListMap();
        System.out.println(listMap.getInitialMapEntries());
        System.out.println(listMap.getChangedMap());


        // Задание №2 из ДЗ 2 по Map
        System.out.println("");
        System.out.println("Задание №2 из ДЗ 2 по Map");
        Map<Integer, String> integerStringMap = new LinkedHashMap<>();
        integerStringMap.put(1, "Солнце");
        integerStringMap.put(2, "Меркурий");
        integerStringMap.put(3, "Венера");
        integerStringMap.put(4, "Земля");
        integerStringMap.put(5, "Марс");
        integerStringMap.put(6, "Юпитер");
        integerStringMap.put(7, "Сатурн");
        integerStringMap.put(8, "Уран");
        integerStringMap.put(9, "Нептун");
        integerStringMap.put(10, "Плутон");
        integerStringMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void numbersSetRemove() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }

    public static void changeMap(Map<String, Integer> map, String key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            if (map.containsValue(value)) {
                throw new ExistingElementException("Такой ключ уже есть, и значения совпадают!");
            } else {
                map.put(key, value);
            }
        }
    }
}