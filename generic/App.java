package generic.com;

class Data{
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
	
}

class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}


	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		Data d=new Data("some data");
		//String element=(String)d.getObj();
		//System.out.println(element);
		
		GenericClass<Integer> genedata=new GenericClass<Integer>(10);
		int data=genedata.getData();
		System.out.println(data);
		

	}

}
