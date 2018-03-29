package ex_2;

public class Car
{
	enum EBodyType
	{
		compact,
		sedan,
		combi,
		coupe		
	}
	
	enum EBodyColor
	{
		red,
		black,
		white,
		graphite,
		pink
	}
	
	/*
	 * The following lines are declarations
	 * of members of class Car
	 */
	String				brand;
	String				model;
	EBodyType			bodyType;
	EBodyColor			color;
	int					numberOfDoors;
	int					numberOfGears;
	int					maxSpeed;
	int					currentSpeed;
	int					currentGear;
	int					lightsOn;
	
	/*
	 * The following lines are declarations
	 * of methods of class Car
	 */
	void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	String getBrand()
	{
		return this.brand;
	}
	
	void setModel(String model)
	{
		this.model = model;
	}
	
	String getModel()
	{
		return model;
	}
	
	void setBodyType(EBodyType type)
	{
		this.bodyType = type;
	}
	
	EBodyType getBodyType()
	{
		return this.bodyType;
	}
}
