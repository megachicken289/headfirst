package ch2;

/**
 * Created by Frank Borges XPTHQ on 1/16/2019.
 */
public class MovieTest {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone WIth the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		
		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
	}
}
