package ch4;

/**
 * Created by Frank Borges XPTHQ on 1/17/2019.
 */
public class ElectricGuitarTest {
	public static void main(String[] args) {
		ElectricGuitar g = new ElectricGuitar();
		g.setBrand("Shinehowzer");
		System.out.println("brand: " + g.getBrand());
		g.setNumOfPickups(6);
		System.out.println("pickups: " + g.getNumOfPickups());
		g.setRockStarUsesIt(true);
		String convertRockStar = "";
		if (g.getRockStarUsesIt()) {
			convertRockStar = "yes";
		} else {
			convertRockStar = "no";
		}
		System.out.println("rock star uses: " + convertRockStar);
	}
}
