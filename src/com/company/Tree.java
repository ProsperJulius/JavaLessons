package com.company;
public class Tree {
public TreeNode root;
public Tree(){
  root=null;
}
public Tree(int value){
 root = new TreeNode(value);
}
public void add(int value){
 this.root= addRecursion(this.root,value);
}
private TreeNode addRecursion(TreeNode current, int value){

    if(current == null){
        return new TreeNode(value);
    }else if(current.value > value){
            current.left = addRecursion(current.left,value);
        }else if(current.value < value){

             current.right = addRecursion(current.right,value);
        }else{
            return current;
        }
    return current;
    }



    public static void main(String[] args) {
        Tree tree= new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(10);

    }

}
