package com.utils;

/**
 * @author : zhangwei
 * @description : 随机指针的节点
 * @date: 2021-06-25 15:32
 */

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
