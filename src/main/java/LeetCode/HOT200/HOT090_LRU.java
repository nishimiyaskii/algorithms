package LeetCode.HOT200;

import java.util.HashMap;

/**
 * LRU缓存机制
 */
public class HOT090_LRU {

    class LRUCache {

        class Node {
            int key, val;
            Node left, right;

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
                left = null;
                right = null;
            }
        }

        int capacity;
        Node L, R;
        HashMap<Integer, Node> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            L = new Node(-1, -1);
            R = new Node(-1, -1);
            L.right = R;
            R.left = L;
            map = new HashMap<>();
        }

        public int get(int key) {
            if (map.isEmpty() || !map.containsKey(key)) return -1;
            Node p = map.get(key);
            remove(p);
            insert(p);
            return p.val;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node p = map.get(key);
                p.val = value;
                remove(p);
                insert(p);
            } else {
                Node p;
                if (map.size() == capacity) {
                    // 爆缓存了
                    p = R.left;
                    remove(p);
                    map.remove(p.key, p);
                    p = new Node(key, value);
                    map.put(key, p);
                    insert(p);
                } else {
                    p = new Node(key, value);
                    map.put(key, p);
                    insert(p);
                }
            }
        }

        void remove(Node p) {
            p.left.right = p.right;
            p.right.left = p.left;
        }

        void insert(Node p) {
            p.left = L;
            p.right = L.right;
            L.right.left = p;
            L.right = p;
        }

    }

}
