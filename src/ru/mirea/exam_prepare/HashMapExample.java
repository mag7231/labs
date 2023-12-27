package ru.mirea.exam_prepare;

import java.util.LinkedList;

// Простая реализация хэш-таблицы
class HashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;

    // Внутренний класс для представления пар ключ-значение
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        table = new LinkedList[DEFAULT_CAPACITY];
    }

    // Метод для вычисления хэш-кода ключа
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Метод для добавления пары ключ-значение в хэш-таблицу
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Проверяем, есть ли уже такой ключ в списке
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                // Если ключ уже существует, обновляем значение
                entry.value = value;
                return;
            }
        }

        // Если ключ не найден, добавляем новую запись в список
        table[index].add(new Entry<>(key, value));
    }

    // Метод для получения значения по ключу
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    // Если ключ найден, возвращаем соответствующее значение
                    return entry.value;
                }
            }
        }
        // Если ключ не найден, возвращаем null
        return null;
    }

    // Метод для удаления записи по ключу
    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(entry -> entry.key.equals(key));
        }
    }
}

// Пример использования
public class HashMapExample {
    public static void main(String[] args) {
        HashTable<String, Integer> hashMap = new HashTable<>();

        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println("Value for key 'two': " + hashMap.get("two")); // Output: 2

        hashMap.put("two", 22); // Обновление значения для ключа 'two'
        System.out.println("Updated value for key 'two': " + hashMap.get("two")); // Output: 22

        hashMap.remove("three");
        System.out.println("Value for key 'three' after removal: " + hashMap.get("three")); // Output: null
    }
}
