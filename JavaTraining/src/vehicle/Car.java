package vehicle;

public class Car implements Vehicle{

	public String type;
	public static int wheels=4;
	
	private int topSpeed;
	protected String make;
	private String color;
	private String photo;
	private String drive;
	private double price;

	public Car()
	{
		this.type="car";
		System.out.println("This vehicle Type is "+ this.type +" with wheels = " + this.wheels);
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Car(String type)
	{
		this.type=type;
		System.out.println("This vehicle Type is "+ this.type +" with wheels = " + this.wheels);
	}

	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDrive() {
		return drive;
	}
	public void setDrive(String drive) {
		this.drive = drive;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
