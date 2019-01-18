package ch4;

/**
 * Created by Frank Borges XPTHQ on 1/17/2019.
 */
public class ClockTest {
	public static void main(String[] args) {
		Clock c = new Clock();
		
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("Time: " + tod);
	}
}
