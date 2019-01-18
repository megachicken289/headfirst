package ch4;

/**
 * Created by Frank Borges XPTHQ on 1/17/2019.
 */
public class Dog {
	int size;
	String name;
	
	void bark() {
		if (size > 60) {
			System.out.println("WOOF! WOOF!");
		} else if (size > 14) {
			System.out.println("RUFF! RUFF!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}
