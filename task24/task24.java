package task24;
public class task24 {
    static class Listnode {
        int val;
        Listnode next;
        Listnode(int val) {
            this.val = val;
            this.next = null; 
        }
    }
    public static Listnode merge(Listnode head1, Listnode head2) {
        Listnode dummy = new Listnode(0);
        Listnode current = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Listnode head1 = new Listnode(1);
        head1.next = new Listnode(3);
        head1.next.next = new Listnode(5);
        head1.next.next.next = new Listnode(7);
        head1.next.next.next.next = new Listnode(9);
        Listnode head2 = new Listnode(2);
        head2.next = new Listnode(4);
        head2.next.next = new Listnode(6);
        head2.next.next.next = new Listnode(8);
        head2.next.next.next.next = new Listnode(10);
        Listnode result = merge(head1, head2);
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}