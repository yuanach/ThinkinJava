
class A{
	A(String str){
		System.out.println(str);
	}
}

public class Initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A[] as=new A[10];
		for(int i=0;i<as.length;i++){
			as[i]=new A("a"+i);
		}
		System.out.println("Exit.");
	}

}
