//import ExampleClass.TreeNode;
//
//import java.util.ArrayList;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public int deepestLeavesSum(TreeNode root) {
//        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
//
//        TreeNode it = root;
//
//        find(resultList, new ArrayList<Integer>(), it);
//
//        System.out.println(resultList);
//
//        int maxSize = 0;
//        int sum = 0;
//
//        for (int i = 0; i < resultList.size(); i++) {
//            if(resultList.get(i).size() > maxSize){
//                maxSize = resultList.get(i).size();
//                sum = 0;
//                System.out.println(i + " *** " + maxSize);
//                sum = sum + resultList.get(i).get(maxSize - 1);
//
//            }else if(resultList.get(i).size() == maxSize){
//                sum = sum + resultList.get(i).get(maxSize - 1);
//
//            }else{
//                continue;
//            }
//        }
//
//        return sum;
//    }
//
//    public static void find(ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> tempList, TreeNode node){
//        ArrayList<Integer> copyList = new ArrayList<Integer>(tempList);
//        copyList.add(node.val);
//        if(node.left != null){
//            find(resultList, copyList, node.left);
//        }
//        if(node.right != null){
//            find(resultList, copyList, node.right);
//        }
//        if(node.right == null && node.left == null){
//            resultList.add(copyList);
//        }
//    }
//}