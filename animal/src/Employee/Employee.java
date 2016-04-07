package Employee;

public class Employee {
	private String name;
	private String address;
	private int number;
	public Employee(String name, String address, int number){
		System.out.println("Craeting a constructor");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public void modificationMethod(){
		System.out.println("This method has been added from github");
	}
	
	public void modificationMethodNumbertwo(){
		System.out.println("This method has been added from eclipse. Lets see if it shows up in Github");
	}
	
	public void modificationMethodNumberThree(){
		System.out.println("Blah blah blah");
		int a;
		int b = 0;
		int c = 0;
		if(c!=0){
			a=b/c;
		}else{
			a=b*c;
		}
	}
	
	public double Computepay(){
		System.out.println("inside employee pay");
		return 0.0;
	}
	
	public void mailCheck(){
		System.out.println("mailing a check to"+this.name+" "+this.address);
	}
}
