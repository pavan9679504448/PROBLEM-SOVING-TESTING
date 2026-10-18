package task28;
import java.util.*;
public class task28 {
    static class Treenode{
        int value;
        Treenode left;
        Treenode right;
        Treenode(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
        public static List<Integer> inordertraversal(Treenode root){
            List<Integer>ans=new ArrayList<>();
            inorder(root,ans);
            return ans;
        }
        public static void inorder(Treenode root,List<Integer>ans){
            if(root==null){
                return;
            }
            inorder(root.left,ans);
            ans.add(root.value);
            inorder(root.right,ans);
        }
        public static void main(String[] args){
            Treenode root=new Treenode(1);
            root.right=new Treenode(2);
            root.right.left=new Treenode (3);
            List<Integer> result=inordertraversal(root);
            System.out.println(result);
        }
    }
}
