//Dave Wang Lab 1.1
public class ControlStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=1; x<=500; x++)
			if (x%3!=0 && x%7!=0 && x%10!=0)
				System.out.println(x);
			else if (x%3==0 && x%7==0 && x%10==0)
				System.out.println("fooBarBaz");
			else if (x%3==0 && x%7==0)
				System.out.println("fooBar");
			else if (x%7==0 && x%10==0)
				System.out.println("BarBaz");
			else if (x%3==0 && x%10==0)
				System.out.println("fooBaz");
			else if (x%3==0 )
				System.out.println("foo");
			else if (x%7==0 )
				System.out.println("Bar");
			else if (x%10==0)
				System.out.println("Baz");
	}

}
