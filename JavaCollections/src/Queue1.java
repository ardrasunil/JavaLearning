import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> q =  new PriorityQueue<>();
		q.add(14);
		q.add(1);
		q.add(21);
		q.add(87);
		q.add(3);
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
		Iterator itr = q.iterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println(q.offer(46));
		q.offer(6);
		q.offer(900);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
