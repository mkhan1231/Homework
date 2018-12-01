package homework2;

public class Computer {
	
	String brand;
	double cPu;
	int price;
	int monitorSize;
	//static String processorName;
	static int hardDiskSize;
	static String operatingSystem;
	
		Computer(){															//This is the default constructor	 
	}
		
	public Computer(int price, String brand) { 								//This is Parameterized Constructor
		this.price=price;
		this.brand=brand;
	}
	
	public void getCpu() { 													//This is a void method without Parameter
		double cPu=1.99;
		System.out.println(cPu);	
	}
	
	public int getMonitorSize(int monitorSize) {							//This is a return type method
		this.monitorSize=monitorSize;
		System.out.println("Monitor Size in inch :"+monitorSize);
		return monitorSize;		
	}
	
	public static void getStaticMethod1() {									//This is a static method without parameter
		System.out.println("This is a static method");		
	}
	
	public static void getStaticMethod2(String processorName) {
		
		System.out.println(processorName);
	}
	
	public void getPriceAndBrand() {										//This is a void method without Parameter
		System.out.println("Price is $"+price+", Brand is: "+brand);		
	}
	

}
