package task23;

public class task23 {
     static class Listnode{
        int val;
        Listnode next;
        Listnode(int val){
            this.val=val;
            this.next=next;

        }
    }
    public static boolean middle(Listnode head){
        Listnode fast=head;
        Listnode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Listnode prev=null;
        Listnode current=slow;
        while(current!=null){
            Listnode nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;

        }
        Listnode firsthalf=head;
        Listnode secoundhalf=prev;
        while(secoundhalf!=null ){
            if(firsthalf.val!=secoundhalf.val){
                return false;
            }
           firsthalf=firsthalf.next;
           secoundhalf=secoundhalf.next;
        }
        return true;
    }
    public static void main(String[] args){
        Listnode head=new Listnode(1);
        head.next=new Listnode(2);
        head.next.next=new Listnode(3);
        head.next.next.next=new Listnode(4);
        head.next.next.next.next=new Listnode(5);
        boolean result=middle(head);
        System.out.println(result);
    }
}
