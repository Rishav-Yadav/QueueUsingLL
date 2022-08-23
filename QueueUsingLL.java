class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		next=null;
	}
}
public class QueueUsingLL<T> {
	Node<T> front;
	Node<T> rear;
	int size;
	QueueUsingLL(){
		front=null;
		rear=null;
		size=0;
	}
	
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return (size==0);
	}
	
	T front() throws QueueEmtyException {
		if(size==0)
			throw new QueueEmtyException();
		return front.data;
	}
	void enqueue(T element) {
		
		Node<T> newNode=new Node<T>(element);
		
		if(size==0) {
			front=newNode;
			rear=newNode;
			rear.data=element;
			rear.next=null;
		}
		rear.next=newNode;
		rear=rear.next;
		rear.data=element;
		rear.next=null;
		size++;
			}
	
	T dequeue() throws QueueEmtyException{
		if(size==0)
			throw new QueueEmtyException();
		size--;
		T temp=front.data;
		front=front.next;
		return temp;
		
	}

	

}
