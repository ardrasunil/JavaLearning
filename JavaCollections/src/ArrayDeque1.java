import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 
{
	public static void main(String[] args) 
	{
		Deque<Integer> q = new ArrayDeque<>();
		q.add(111);
		q.add(56);
		q.add(76);
		System.out.println(q);
		q.offer(90);
		System.out.println(q);
		q.offerFirst(22);
		q.offer(2);
		System.out.println(q);
		q.offerLast(66);
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.pollLast();
		System.out.println(q);
		q.pollFirst();
		System.out.println(q);
		
		
		
	}
}
