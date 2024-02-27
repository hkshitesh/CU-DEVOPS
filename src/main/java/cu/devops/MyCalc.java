package cu.devops;

public class MyCalc {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		
		
		MyCalc calc = new MyCalc();
		System.out.println("Sum is "+calc.sum(10, 5));
		System.out.println("Diff is "+calc.diff(10, 5));
		System.out.println("Div is "+calc.div(10, 5));
		System.out.println("Mul is "+calc.mul(10, 5));


	}

}
