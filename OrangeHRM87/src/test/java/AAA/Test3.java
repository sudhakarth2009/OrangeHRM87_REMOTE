package AAA;

public class Test3 extends Test2 {

	@Override
	public void hai() {
		
		System.out.println("hai");
		
	}

	@Override
	public void Hello() {
		
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		
		Test2 t2= new Test3();
		t2.hai();
		t2.Hello();

	}

}
