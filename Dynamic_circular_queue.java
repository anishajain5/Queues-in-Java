package queues;

public class Dynamic_circular_queue extends CircularQUsingArrays {
	public Dynamic_circular_queue(int capacity) {
		super(capacity);
	}
	public void enqueue(int item) throws Exception{
		if(this.data.length==this.size()) {
			int [] arr= new int[2*data.length];
			for(int i=0; i<this.size();i++) {
				int ai=(i+front)%this.data.length;
				arr[i]=this.data[ai];
			}
			this.data=arr;
			this.front=0;
		}
		super.enqueue(item);
	}
	

}
