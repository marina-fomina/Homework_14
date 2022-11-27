import java.util.*;

public class ListMap {
private final Map<String, List<Integer>> listMap = new HashMap<>();
private static final Random RANDOM = new Random();

    public ListMap() {
        for (int i = 0; i < 5; i++) {
            listMap.put(String.valueOf(i), generateList());
        }
    }

    public Set<Map.Entry<String, List<Integer>>> getInitialMapEntries() {
        return listMap.entrySet();
    }

    public Map<String, Integer> getChangedMap() {
        Map<String, Integer> changedMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum = sum + number;
            }
            changedMap.put(entry.getKey(), sum);
        }
        return changedMap;
    }

    private List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1001));
        }
        return list;
    }
}
