package ch3;

/**
 * Created by Frank Borges XPTHQ on 1/16/2019.
 */
public class Dog {
	String name;
	
	public static void main(String[] args) {
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		// now make a dog array
		Dog[] myDogs = new Dog[3];
		// and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		// now access the Dogs using the array
		// references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		// Hmmm... what is myDogs[2] name?
		System.out.println("Last dog's name is " + myDogs[2].name);
		
		// now loop through the array
		// and tell all dogs to bark
		int x = 0;
		while (x< myDogs.length) {
			myDogs[x].bark();
			x +=1;
		}
	}
	
	public void bark() {
		System.out.println(name + " says 'Ruff!'");
	}
	
	public void eat() {
	
	}
	
	public void chaseCat() {
	
	}
}
