package ch3;

/**
 * Created by Frank Borges XPTHQ on 1/16/2019.
 */
public class HobbitsTest {
	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];
		int z = 0;
		
		while (z < 3) {             // changed from 4 to 3
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			if (z == 1) {
				h[z].name = "frodo";
			}
			if (z == 2) {
				h[z].name = "sam";
			}
			System.out.println(h[z].name + " is a good Hobbit Name");
			z += 1;                 // moved this down here from just below the while clause/condition
		}
	}
}
