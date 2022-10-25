package java018_collection;

public class box<T> {
	private T data;
	
	public box() {
	
	}
	
	public box(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
