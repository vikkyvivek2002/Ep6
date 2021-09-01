public class Ep6 {
	
	static void show (int age)throws ArithmeticException
	{
		if(age < 18 )
			throw new ArithmeticException("age is less than 18 years");
	
	else
		System.out.println("Eligible");
	}
	
	public static void main(String[] args) {
       
		show(15);

	}

}
