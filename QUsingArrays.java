package queues;

public class QUsingArrays {
	private int [] data;
	private int size;
	private int front;
	
	public QUsingArrays(int capacity) {
		this.data= new int [capacity];
		size=0;
		front=0;
	}
	
	public void enqueue(int item) throws Exception{
		if(this.size()== this.data.length) {
			throw new Exception("Queue is full");
		}
		
		this.data[size]= item;
		this.size++;
	}
	public int dequeue() throws Exception{
		if(this.size()==0) {
			throw new Exception("Queue is Empty");
		}
		int rv= this.data[this.front];
		this.data[this.front]=0;
		front--;
		this.size--;
		return rv;
		
	}
	
	public int size() {
		return this.size;
	}
	
	public void display() {
		for(int i=0; i<this.size();i++) {
	       System.out.print(this.data[i]+" -> ");
		}
		System.out.println("END");
	}
		
		int front() throws Exception{
			if(this.size()==0) {
				throw new Exception("Queue Empty");
			}
			int rv= this.data[this.front];
			return rv;
		}

}
