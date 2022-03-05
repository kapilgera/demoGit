package OE_ll;

public class client_ll {
	public static void main(String[] args) throws Exception {
		linked_list l1 =new linked_list();
		
		l1.addLast(1);
		l1.addLast(2);
		l1.addLast(3);
		l1.addLast(4);
		l1.addLast(5);
		
		l1.display();
		System.out.println();
//		l1.getnodeof(5);
//		l1.nextOdd(l1.getnodeof(1));
		l1.partition();
		l1.display();
	}
}
