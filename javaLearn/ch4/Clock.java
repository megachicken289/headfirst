package ch4;

/**
 * Created by Frank Borges XPTHQ on 1/17/2019.
 */
public class Clock {
	private String time;
	
	void setTime(String t) {
		time = t;
	}
	
	public String getTime() {   // changed void to String for return type
		return time;
	}
}
