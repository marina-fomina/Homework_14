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
        Set<Product> products = new HashSet<>();
        products.add(potato);
        products.add(carrot);
        products.add(onion);
        products.add(beetroot);
        products.add(meat);
        Recipe borsch = new Recipe("Борщ", products);
        System.out.println(borsch);

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
}