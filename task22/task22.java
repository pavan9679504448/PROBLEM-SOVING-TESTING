package task22;

public class task22 {
    static class Listnode{
        int val;
        Listnode next;
        Listnode(int val){
            this.val=val;
            this.next=next;

        }
    }
    public static Listnode middle(Listnode head){
        Listnode fast=head;
        Listnode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        Listnode head=new Listnode(1);
        head.next=new Listnode(2);
        head.next.next=new Listnode(3);
        head.next.next.next=new Listnode(4);
        head.next.next.next.next=new Listnode(5);
        Listnode result=middle(head);
        System.out.println(result.val);
    }
}
