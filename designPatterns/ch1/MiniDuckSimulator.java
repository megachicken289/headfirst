public class MiniDuckSimulator {
	public static void main (String[] args) {
		System.out.println("Mallard Duck");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("\nModel Duck");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		System.out.println("\nRubber Duck");
		Duck rubberD = new RubberDuck();
		rubberD.performQuack();
		rubberD.performFly();
	}
}
