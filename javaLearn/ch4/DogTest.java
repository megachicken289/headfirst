package ch4;

/**
 * Created by Frank Borges XPTHQ on 1/17/2019.
 */
public class DogTest {
	public static void main(String[] args) {
		Dog one = new Dog();
		one.size =  70;
		Dog two = new Dog();
		two.size = 8;
		Dog three = new Dog();
		three.size = 35;
		
		one.bark();
		two .bark();
		three.bark();
	}
}
