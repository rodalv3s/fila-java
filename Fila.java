public class Fila<T> {
	private T[] array;
	private int start;
	private int end;
	private int total; 
	
	public Fila(int size){
		array = (T[]) new Object[size];
		start = 0;
		end = 0;
        total = 0;
        	
	}
	
	public void insert(T element) {

		if(!this.isFull()) {
			array[end] = element;
			end = (end+1) % array.length;
			total++;
		}
		
	}
	
	public T remove() {
		
		if(!this.isEmpty()) {
			T element = array[start];
			start = (start+1) % array.length;
			total--;
			return element;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return (total == 0);
		
	}
	
	public boolean isFull() {
		return (total == array.length);
		
	}
	
}
