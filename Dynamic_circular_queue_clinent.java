package queues;

public class Dynamic_circular_queue_clinent {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CircularQUsingArrays q=new Dynamic_circular_queue(5);
		for (int i = 1; i <= 5; i++) {
			q.enqueue(i * 10);
			q.display();
		}
		
		q.dequeue();
		q.dequeue();
		q.enqueue(60);
		q.enqueue(70);
		
		q.display();
		
		q.enqueue(80);
		q.display();
		

	}

}
