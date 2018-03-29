package ex_2;

public class ex_2
{

	public static void main(String[] args)
	{
		System.out.println("This is program Car");
		
		Car			car = new Car();
		
		car.setBrand("Mercedes");
		car.setModel("S600");
		car.setBodyType(Car.EBodyType.sedan);

		
		String		stringVar;
		
		stringVar = car.getBrand();
		System.out.println("Car brand is " + stringVar);

		stringVar = car.getModel();
		System.out.println("Car model is " + stringVar);

		Car.EBodyType		bodyTypeVar;
		
		bodyTypeVar = car.getBodyType();
		System.out.println("Car type is " + bodyTypeVar);

		
	}

}
