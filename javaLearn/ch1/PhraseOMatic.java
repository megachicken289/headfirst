package ch1;

import java.util.Scanner;

/**
 * Created by Frank Borges XPTHQ on 1/15/2019.
 */
public class PhraseOMatic {
	public static void main(String[] args) {
		// scanner
		Scanner input = new Scanner(System.in);
		
		// make three sets of words to choose from. Add your own!
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B2B", "win-win", "front-end", "web-based",
				"pervasive", "smart", "six-sigma", "critical path", "dynamic", "pooping"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
				"branded", "outised-the-box", "positioned", "networed", "focused", "leveraged", "alighed", "targeted",
				"shared", "cooperative", "accelerated", "monkey-butted", "rocket-butt", "butt-butt", "butt-butted"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "stretegy",
				"mindshare", "portal", "space", "vision", "paradiam", "mission", "end-all-be-all", "pistol pete",
				"trainspotting"};
		
		// find out how many words are in each list
		// TODO: MOVE TO ITS OWN METHOD
//		int oneLen = wordListOne.length;
//		int twoLen = wordListTwo.length;
//		int threeLen = wordListThree.length;
		
		// generate three rand numbers
		// TODO: MOVE TO ITS OWN METHOD
//		int rand1 = (int) (Math.random() * oneLen);
//		int rand2 = (int) (Math.random() * twoLen);
//		int rand3 = (int) (Math.random() * threeLen);

//		int rand1 = genRand(wordListOne);
//		int rand2 = genRand(wordListTwo);
//		int rand3 = genRand(wordListThree);
		
		// now build a phrase
		// TODO: MOVE TO ITS OWN METHOD
//		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		// print out the phrase
		// TODO: MOVE TO ITS OWN METHOD
//		System.out.println("What we need is a " + phrase);
		
		genPhrase(wordListOne,wordListTwo,wordListThree);
		boolean another = true;
		while (another) {
			System.out.print("Would you like another[Y/N]: ");
			String anotherString = input.nextLine();
			if ("Y".equals(anotherString.substring(0, 1).toUpperCase())) {
				another = true;
				// TODO: CALL THE METHOD THAT CONTAINS THE SHIT ABOVE
				genPhrase(wordListOne, wordListTwo, wordListThree);
				
			} else {
				another = false;
				System.out.println("GOODBYE!");
			}
		}
	}
	
	public static int genRand(String[] wordList) {
		return (int) (Math.random() * wordList.length);
	}
	
	public static void genPhrase(String[] wordListOne, String[] wordListTwo, String[] wordListThree) {
		int rand1 = genRand(wordListOne);
		int rand2 = genRand(wordListTwo);
		int rand3 = genRand(wordListThree);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
}
