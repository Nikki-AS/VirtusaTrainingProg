package DemoFactory;

public class FactoryMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AnimalFactory af=new FactoryDemo();
		Animal duck=af.GetAnimalType("Duck");
		duck.speak();
		
		Animal tiger=af.GetAnimalType("Tiger");
		tiger.speak();
	}

}
