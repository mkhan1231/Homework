package homework2;

public class TestComputer {

	public static void main(String[] args) {
		
	Computer.getStaticMethod1();  			//Accessing Static methods from computer class without creating object or instance
	Computer.getStaticMethod2("Intel");
	
	Computer.operatingSystem="Windows";		//Accessing Static Variables from computer class without creating object or instance
	Computer.hardDiskSize=1024;
	System.out.println("Operating System is: "+Computer.operatingSystem);
	System.out.println("Hard Drive in gb: "+Computer.hardDiskSize);
		
	Computer com1=new Computer();			// Creating object with the default Constructor
	com1.getCpu();
	
	Computer com2=new Computer();
	com2.getMonitorSize(21);
		
	Computer com3=new Computer(700,"Dell"); //Creating object from Parameterized Constructor
	com3.getPriceAndBrand();
		
		
		
		
		
		
		
		
		

	}

}
