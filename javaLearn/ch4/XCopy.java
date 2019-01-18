package ch4;

/**
 * Created by Frank Borges XPTHQ on 1/17/2019.
 */
public class XCopy {
	public static void main(String[] args) {
		int orgi = 42;
		
		XCopy x = new XCopy();
		
		int y = x.go(orgi);
		System.out.println(orgi + " " + y);
	}
	
	int go(int arg) {
		arg *= 2;
		
		return arg;
	}
}
