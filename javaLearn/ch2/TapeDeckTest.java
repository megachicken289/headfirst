package ch2;

/**
 * Created by Frank Borges XPTHQ on 1/16/2019.
 */
public class TapeDeckTest {
	public static void main(String[] args) {
		TapeDeck t = new TapeDeck();    // added this
		
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}
