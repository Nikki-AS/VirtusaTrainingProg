package InterfaceDemo;

public class Main {
		public static void main(String[] args)
		{
			Car c=new Car();
			c.drive();
			c.turnLeft();
			c.brake();
			IPublicTransport it=new Car();
			it.getNumberOfPeople();

			Train tc=new Train();
			tc.drive();
			tc.turnLeft();
			tc.brake();
			IPublicTransport itc=new Train();
			itc.getNumberOfPeople();

		}
}
