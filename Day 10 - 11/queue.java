//Learning Queue in Collection with this Example

package Collections;

import java.util.PriorityQueue;

public class queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for(int i = 10; i>0; i--) {
			queue.add(i);
		}
		
		//Queue (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
		
		//Priority Queue will sort for us
		//(Front) 1 2 3 4 5 6 7 8 9 10 (Rear)
		
		//Peeking -> Obtaining head of a queue
		//Polling -> Remove head of a queue
		
		System.out.println("Queue size is : " +queue.size());
		System.out.println("Head of a Queue is : " +queue.peek()); // Head - 1 because queue is sorted now
		
		
		queue.poll(); // Removing the head 1
		System.out.println("After Polling Queue size is : " +queue.size());
		
		System.out.println("Head of a Queue is : " +queue.peek()); // Head - 2
		
	}
}
