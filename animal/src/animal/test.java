package animal;

public class test extends Dog{
	
	public void move(){
		super.move();
		System.out.println("This is the new animal");
	}

	public static void main(String[] args) {
		
		animal a=new test();
		Dog b=new test();
		a.move();
		
		
		

	}

}
