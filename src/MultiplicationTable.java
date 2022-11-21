import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private final Set<Task> tasks = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(10)+1, random.nextInt(10)+1));
        }
    }

    public String toString() {
        return "Таблица умножения: задания " + tasks;
    }
}
