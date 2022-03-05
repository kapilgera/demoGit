package prac_que;

import java.util.*;

public class stack {
	private int[] arr;
	private int tos=-1;
	
	public stack() {
		this.arr = new int[5];
	}
	
	public stack(int cap) {
		this.arr = new int[cap];
	}
	
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("bhai kya full hai");
		}
		arr[tos+1]=ali;
		tos++;
	}
	
	public int peek() {
		return arr[tos];
	}
	
	public int size() {
		return tos+1;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public boolean isFull() {
		return size()==arr.length;
	}
	
	public int pop() {
		int ans = arr[tos];
		tos--;
		return ans;
	}
	
	public void disp() {
		int ts =tos;
		while(ts>=0) {
			System.out.print(arr[ts]+" ");
			ts--;
		}
	}
}
