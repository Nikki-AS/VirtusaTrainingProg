package DemoFactory;

public class FactoryDemo extends AnimalFactory{

	@Override
	public Animal GetAnimalType(String type) throws Exception {
		// TODO Auto-generated method stub
		switch(type)
		{
		case "Duck":
			return new Duck();
		case "Tiger":
			return new Tiger();
		default:
			throw new Exception ("Animal type : "+type + " can't be instantiated");
		}
	}
	
}
