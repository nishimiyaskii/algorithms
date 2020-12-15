package 剑指Offer.tree;

/**
 * 校验BST的后序遍历
 */
public class verify_BST_post_order {

    public boolean verifyPostorder(int[] arr) {
        if (arr.length < 1) return true;
        return dfs(arr, 0, arr.length - 1);
    }

    boolean dfs(int[] arr, int l, int r) {
        if (l >= r) return true;
        int k = l;
        while (k < r && arr[k] < arr[r]) k ++;
        int p = k;
        while (k < r && arr[k] > arr[r]) k ++;
        if (k != r) return false;
        return dfs(arr, l, p - 1) && dfs(arr, p, r - 1);
    }

}
