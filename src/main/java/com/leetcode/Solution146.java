package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : LRU 缓存机制
 * @date: 2021-06-28 13:55
 */

public class Solution146 {

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.map);
        lRUCache.get(1);    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.map);
        lRUCache.get(2);    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.map);
        lRUCache.get(1);    // 返回 -1 (未找到)
        lRUCache.get(3);    // 返回 3
        lRUCache.get(4);    // 返回 4


    }


    public static class LRUCache {

        //双向链表的定义
        public class Node {
            public Node pre;
            public Node next;
            public int key, value;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        //双向链表的一些操作方法
        public class DoubleList {
            Node head, tail;
            int size;

            //初始化双相链表
            public DoubleList() {
                head = new Node(0, 0);
                tail = new Node(0, 0);
                size = 0;
                head.next = tail;
                tail.pre = head;
                head.pre = null;
                tail.next = null;
            }

            public void addFirst(Node node) {
                Node next = head.next;
                head.next = node;
                node.next = next;
                node.pre = head;
                next.pre = node;
                size++;
            }

            public void removeNode(Node node) {
                //由于存在虚拟头节点，所以不需要管是否头节点
                node.pre.next = node.next;
                node.next.pre = node.pre;
                size--;
            }

            public Node removeLast() {
                //因为存在虚拟节点，所以这里要找tail的前一个
                Node tmp = tail.pre;
                removeNode(tmp);
                return tmp;
            }

            public int size() {
                return size;
            }

        }

        private DoubleList doubleList;
        private Map<Integer, Node> map;
        private int capacity;

        public LRUCache(int capacity) {
            doubleList = new DoubleList();
            map = new HashMap<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            if (!map.containsKey(key)) {
                return -1;
            } else {
                Node node = map.get(key);
                int k = node.value;
                put(key, k);
                return k;
            }
        }

        public void put(int key, int value) {
            //如果存在则替换元素
            Node node = new Node(key, value);
            if (map.containsKey(key)) {
                //替换完了也要把这个元素提前
                doubleList.removeNode(map.get(key));
                doubleList.addFirst(node);
                map.put(key, node);
            } else {
                //不存在时插入前先判断容量
                if (doubleList.size() == capacity) {
                    //先删除队尾元素,map里面也要删掉
                    Node last = doubleList.removeLast();
                    map.remove(last.key);
                }
                doubleList.addFirst(node);
                map.put(key, node);
            }
        }
    }

}
