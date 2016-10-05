package com.asp.queue;

public class QueueOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		//q.enqueue("abc", 9);
		//q.enqueue("def", 3);
		q.enqueue("pqr",6);
		q.enqueue("xyz",7 );
		q.enqueue("zhi", 5);
		q.enqueue("donald", 3);
		System.out.println(q.dequeue());
		//q.empty();
		Queue q1 = new Queue();
		System.out.println("hash="+q.hashCode());
	}

}
