public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("I'm a real mallard duck");
	}
}
