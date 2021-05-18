package AAA;

public class Test5 implements Test4{

	@Override
	public void hai1() {
		

		System.out.println("hai1");
		
	}

	@Override
	public void Hello1() {

		System.out.println("hai1");
		
	}
	
public static void main(String[] args) {
		
	Test4 t4= new Test5();
		t4.hai1();
		t4.Hello1();

	}

}
