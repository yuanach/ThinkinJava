
public class Varargs {

	void f(int require,String...strings){
		System.out.println("require:"+require);
		for(String s : strings)
			System.out.println(s);			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs var= new Varargs();
		var.f(1,"one");
		var.f(2, "two");
		var.f(0);
	}

}
