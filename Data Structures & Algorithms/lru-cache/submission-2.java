class LRUCache {
    private final int size;
    private List<Integer> list = new LinkedList<>();
    private HashMap<Integer, Integer> map = new HashMap<>();
    private HashMap<Integer, Integer> mapCounter = new HashMap<>();

    public LRUCache(int capacity) {
        size = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
 
        update(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        map.put(key, value);
        update(key);

        while (map.size() > size) {
            int l1 = list.removeLast();
            if (mapCounter.get(l1) == 1) {
                mapCounter.remove(l1);
                map.remove(l1);
            } else {
                mapCounter.put(l1, mapCounter.get(l1) - 1);
            }
        }
    }

    public void update(int key) {
        list.addFirst(key);
        mapCounter.put(key, mapCounter.getOrDefault(key, 0) + 1);
    }
}
