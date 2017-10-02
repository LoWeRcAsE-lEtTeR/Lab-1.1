//Dave Wang Lab 1.1 Period 2
public class ControlStructures {

	public static void main(String[] args) {
		System.out.println("1.1.1 Prime Printer");
		System.out.println();
		for(int i=2; i < 230; i++){
             boolean isPrime = true;
             for(int j=2; j < i ; j++){
                     if(i % j == 0){
                             isPrime = false;
                             break;
                     }
             }
             if(isPrime)
                     System.out.print(i + " ");
             if (i==29)
     			System.out.println();
             if (i==71)
     			System.out.println();
             if (i==113)
     			System.out.println();
             if (i==173)
     			System.out.println();
             if (i==229)
            	 System.out.println();	            
     }
		 System.out.println();
		 System.out.println("1.2.1 fooBarBaz");
		 System.out.println();
		 fooBarBaz(); 	
		}
	public static void fooBarBaz() {
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

