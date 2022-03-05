package Btree;
import java.util.*;
public class BT {
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int i){
			data =i;
		}
	}
		Node root;
		Scanner scn = new Scanner(System.in);
		public BT() {
			root=create(null, false);
		}
		
		public Node create(Node parent, boolean isleft) {
			if(parent==null) {
				System.out.println("root deta de");
			}
			
			else if(isleft) {
				System.out.println(parent.data + "ka left child ka data de");
			}else {
				System.out.println(parent.data + "ka right child ka data de");
			}
			Node nn =new Node(scn.nextInt());
			
			System.out.println(nn.data + "ka left child hai? ");
			if(scn.nextBoolean()) {
				nn.left= create(nn,true);
			}
			System.out.println(nn.data + "ka right child hai? ");
			if(scn.nextBoolean()) {
				nn.right= create(nn,false);
			}
			return nn;
			
			
		}
	}

