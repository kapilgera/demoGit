package OE_ll;

public class linked_list {
	class Node {

		int data;
		Node next;
		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
	}
	
	}
	private Node head;
	private Node tail;
	private int size;

	public Node getnodeof(int ali) throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");
		
		Node temp = head;
		while(temp.next!=null) {
			if(temp.data==ali) {
				break;
			}else {
				temp=temp.next;
			}
		}
//		System.out.println(temp.data);
//		System.out.println(temp+" "+temp.next);
		return temp;
	}
	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public void partition() throws Exception {
		Node temp1=head;
		Node pre=null;
		if (this.size == 0){
			throw new Exception("linked list is empty");
		}
//		int count=0;
//		int last=getLast();
		for(int i=1;i<=size;i++) {
			if(temp1.data%2!=0) {
				pre=temp1;
				temp1=temp1.next;
				
			}else {
				pre.next=temp1.next;
				tail.next = temp1;
				tail.next.next=null;
				tail=temp1;
				temp1=pre.next;
				
			}
		}
			
		}


	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}
	public Node nextOdd(Node n) throws Exception{
//		if (this.size == 0){
//			throw new Exception("linked list is empty");
//		}else if(this.size==1){
//			throw new Exception("linked list does not have other element");
//		}else{
//			Node n1 = null;
			while(n.next!=null){
				if(n.next.data % 2!=0){
					break;
				}
				else{
					n=n.next;
				}
			}
//			System.out.println(n.next.data);
			return n.next;

//			}
		}

	public void addLast() {
		// TODO Auto-generated method stub
		
	}
}
