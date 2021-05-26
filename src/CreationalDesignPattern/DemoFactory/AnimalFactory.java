package DemoFactory;

abstract class AnimalFactory {
	public abstract Animal GetAnimalType(String type)
			throws
			 Exception;
}
