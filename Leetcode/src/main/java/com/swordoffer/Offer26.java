package com.swordoffer;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 树的子结构
 * @date: 2021-11-08 16:47
 */

public class Offer26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return isContain(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean isContain(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        if (A.val != B.val) return false;
        return isContain(A.left, B.left) && isContain(A.right, B.right);
    }


}
