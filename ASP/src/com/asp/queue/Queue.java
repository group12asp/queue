package com.asp.queue;

import java.util.Iterator;
import java.util.LinkedList;


class Queue {
	
	private int top_priority = -1;
	private LinkedList<Node> element;
	Queue()
	{
		element = new LinkedList<Node>();
	}
	public void enqueue(String add,int priority1)
	{
		Node latest = new Node(add, priority1);
		element.add(latest);
	}
	public String dequeue()
	{
		System.out.println("before dequeue"+element);
		if(element.isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		Iterator<Node> itr = element.iterator();
		int max = itr.next().getPriority();
		
		int j = 0;
		int index = 0;
		while(itr.hasNext())
		{
			Node tnode = itr.next();
			 j = tnode.getPriority();
			 index=element.indexOf(tnode);
			 //System.out.println("index = "+index);
			if (j > max)
			{
				max = j;
				index = element.indexOf(tnode);
				//element.get(max);
			}
			//System.out.println("index = "+index);
			
			System.out.println(tnode.getPriority()+tnode.getName());
			
			//element.remove(tnode);
		}
		System.out.println("index = "+index);
		System.out.println("j="+max);
		element.remove(index);
		
		System.out.println("queue"+element);
		int max_priority = 0;
		//int j =0 ;
		for(int i = 0 ; i < top_priority;i++)
		{
			
			/*if(priority[i] > max_priority)
			{
				max_priority = priority[i];
				j = i;
			}*/
		}
		System.out.println(max_priority);
		return "abc";
		//return name[j];
	}
	public void empty()
	{
		if(element.isEmpty())
		{
			System.out.println("Queue is already empty");
		}
		Iterator<Node> itr = element.iterator();
		element.removeAll(element);
		System.out.println("queue is"+element);
	}
	public void equals()
	{
		
	}
	public Object clone()
	{
		return null;
		//return name;
		}
	public String toString()
	{
		
		return null;
		}
	/*public int hashCode()
	{
		return 0;
	}*/
}
//is there anything missing?