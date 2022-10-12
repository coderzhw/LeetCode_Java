package com.leetcode;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 单词接龙
 * @date: 2021-09-04 14:28
 */

public class Solution127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }
        wordSet.remove(beginWord);
        Set<String> visted = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        visted.add(beginWord);
        queue.add(beginWord);
        int step = 1;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                String current = queue.poll();
                System.out.println(current);
                if (currentWordChangeSingleLetter(current, endWord, visted, queue, wordSet)) {
                    return step + 1;
                }
            }
            step++;
        }
        return 0;
    }

    public boolean currentWordChangeSingleLetter(String currentWord, String endWord, Set<String> visted, Queue<String> queue, Set<String> wordSet) {
        //变换当前单词的每一个字母看是否在wordSet中
        char[] chArr = currentWord.toCharArray();
        for (int i = 0; i < endWord.length(); i++) {
            char orignCh = chArr[i];
            for (char j = 'a'; j <= 'z'; j++) {
                if (j == orignCh) {
                    continue;
                }
                chArr[i] = j;
                String afterChange = String.valueOf(chArr);
                if (wordSet.contains(afterChange)) {
                    if (endWord.equals(afterChange)) {
                        return true;
                    }
                    if (!visted.contains(afterChange)) {
                        queue.add(afterChange);
                        visted.add(afterChange);
                    }
                }
            }
            chArr[i] = orignCh;
        }
        return false;
    }

    public static void main(String[] args) {
        String begin="hit";
        String end="cog";
        String[] arr={"hot","dot","dog","lot","log","cog"};
        System.out.println(new Solution127().ladderLength(begin,end,Arrays.asList(arr)));
    }

}
