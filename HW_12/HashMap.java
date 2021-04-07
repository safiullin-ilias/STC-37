package HW_12;

public class HashMap<K, V> implements Map<K, V> {
    private static class MapItem<K, V> {
        K key;
        V value;
        MapItem<K, V> next;

        public MapItem(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashMap() {
        this.entries = new MapItem[CAPACITY];
    }

    
    private static final int CAPACITY = 16;
    private MapItem<K, V> entries[];

    @Override
    public void put(K key, V value) {
        int index = key.hashCode() & (entries.length - 1);
        if (entries[index] != null) {
            MapItem<K, V> current = entries[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            MapItem<K, V> newMapEntry = new MapItem<>(key, value);
            newMapEntry.next = entries[index];
            entries[index] = newMapEntry;
        } else {
            entries[index] = new MapItem<>(key, value);
        }
    }

    @Override
    public V get(K key) {
        
        int index = key.hashCode() & (entries.length - 1);

        if (entries[index] != null) {
            MapItem<K, V> current = entries[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }
        }
        return null;
    }


}
