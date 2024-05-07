// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Given preorder and inorder traversal of a tree, construct the binary tree.

package binarytree;

public class BinaryTreeFromInAndPreOrder {

  public static void main(String[] args) {

    Node output = buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
    System.out.println(output.val);
  }

  public static Node buildTree(int[] preorder, int[] inorder) {
    if (preorder.length == 0) return null;

    int rootValue = preorder[0];
    Node root = new Node(rootValue);

    int rootIndex = 0;
    for (int i = 0; i < inorder.length; i++) {
      if (inorder[i] == rootValue) {
      rootIndex = i;
      break;
      }
    }

    int[] leftInorder = new int[rootIndex];
    int[] rightInorder = new int[inorder.length - rootIndex - 1];

    int[] leftPreorder = new int[rootIndex];
    int[] rightPreorder = new int[inorder.length - rootIndex - 1];

    System.arraycopy(inorder, 0, leftInorder, 0, rootIndex);

    if (rightInorder.length > 0) {
      System.arraycopy(inorder, rootIndex + 1, rightInorder, 0, rightInorder.length);
    }

    System.arraycopy(preorder, 1, leftPreorder, 0, rootIndex);
    if (rightPreorder.length > 0) {
      System.arraycopy(preorder, rootIndex + 1, rightPreorder, 0, rightPreorder.length);
    }
      
    root.left = buildTree(leftPreorder, leftInorder);
    root.right = buildTree(rightPreorder, rightInorder);
    return root;
    
  }
}
