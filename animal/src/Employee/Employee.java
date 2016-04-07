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
	
	public double Computepay(){
		System.out.println("inside employee pay");
		return 0.0;
	}
	
	public void mailCheck(){
		System.out.println("mailing a check to"+this.name+" "+this.address);
	}
}
