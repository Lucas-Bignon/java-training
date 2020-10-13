package fr.manulep.entrainement;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.sun.tools.javac.util.List;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	// fais moi meme
	public static String helloWorld(String name) {
		// 1
		if (name == "Manu") {
			return ("Hello Manu");
		} else {
			return ("Hello World");
		}
	}
	// fais moi meme mais code manu mieux  +doc
	public static String[] removeNullElements(String[] array) {
		// 2
		String[] sortie;
		int cpt = 0;
		for (String valeur : array) {
			if (valeur != null) {
				cpt++;
			}
		}
		sortie = new String[cpt];
		int x = 0;
		for (String valeur : array) {
			if (valeur != null) {
				sortie[x] = valeur;
				x++;
			}
		}
		return sortie;

	}
	// romain lucas trystan
	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		int[] Sarray;
		if (array.length > 0) {
			Sarray = new int[array.length + 1];
		} else {
			Sarray = new int[1];
		}

		for (int i = 0; i < Sarray.length; i++) {
			if (i == 0) {
				Sarray[i] = element;
			} else {
				Sarray[i] = array[i - 1];
			}
		}
		return Sarray;
	}
	// lucas
	public static int[] allElementsExceptFirstThree(int[] amin) {
		// 4
		int[] aminriche = {};
		if (amin.length > 3) {
			aminriche = new int[amin.length - 3];
			for (int i = 3; i < amin.length; i++) {
				aminriche[i - 3] = amin[i];
			}
			return aminriche;
		} else {
			return aminriche;
		}
	}
	//lucas
	public static String getFirstHalf(String word) {
		// 5
		String a;
		int b = word.length() % 2;
		if (b == 0) {
			a = word.substring(0, word.length() / 2);
		} else {
			a = word.substring(0, word.length() / 2 + 1);
		}
		return a;
	}
	//
	public static String[] selectElementsStartingWithA(String[] array) {
		// 6
		List<String> capa = new ArrayList<>();
		// yannick me rend intelligent ma logique fonctionne je suis debloqué enfin du cervo
		String[] list = new String[capa.size()];
		// ---------------------------------------------------
		for (int i = 0 ; i < array.length; i++){
			char first = array[i].charAt(0);
			if (first == 'a'){
				capa.add(array[i]);
			}

		}
			list = capa.toArray(list);

			
		return list ;
	}
	//
	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		List<String> list = new ArrayList<>();
		// cette ligne est incroyable merci yannick a réviser absolument
		String[] lista= new String[list.size()];
		// ------------------------------
		//cour
		for (int i = 0 ; i < array.length; i++){
			
			if (array[i] != null){
				// ma ligne perso :D
				char first = array[i].charAt(0);
				//-------------------
				if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
					// je bourre le tableau et grace a la yanline tt marche
					list.add(array[i]);
				}
			}

		}
		// tout simplement
			lista = list.toArray(lista);
			return lista;
		// j ai l impression d'avoir fait 2 fois le meme exos	
	}
	//
	public static String[] reverseOrderInArray(String[] array) {
		// 8
		// je cré mon array de sortie en fonction de la longueur de mon tableu
		String [] sortie= new String [array.length];
		// je crée une variable qui a la longueur de mon tableu 
		int a = array.length - 1;
		// je fait une boucle for 
		for ( int i = 0 ; i < array.length ; i++ ) {
		sortie[i]=array[a];
		a--;
		}
		return sortie;
	}

	// code a yannick, compris, réecris et review
	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9
		List<Integer> listClone = new ArrayList<>();
		for (int num : array) {
			listClone.add(num);
		}
		int middleArray = Math.round(array.length / 2);
		listClone.add(middleArray, element);
		int[] newArray = new int[listClone.size()];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = listClone.get(i);
		}

		return newArray;
	}

	public static String shortestWord(String text) {
		// 10
		int length = 100;
		//ligne 1 je lui donne ma string de retour
		String[] retour= text.split(" ");
		//ligne 2
		String shortest = "";
		//ligne 3
		for(String word : retour){
			if(word.length() < length){
				length= word.length();
				shortest =  word;

			}
		}
		return shortest;
	}


		//ligne 4
		//
		//ligne 5
		//
		//ligne 6
		//
		//ligne 7

	// code lucas sauf !charactère jsp qui dans le grp1 ma aider
	public static String removeCapitals(String text) {
		// 11
		String textWithoutCapitals = "";
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (!Character.isUpperCase(letter)) {
				textWithoutCapitals += letter;
			}
		}

		return textWithoutCapitals;
	}
	// exercice bcp trop dur 
	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		return number1 + number2;
	}

	// encore plus dur 20 heure j ai mis
	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		return number1 + number2 + number3;
	}
	//code a lucas
	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		long a = 0;
		for (int i = 0; i < numbers.length; i++) {
			a += numbers[i];
		}
		return a;
	}
	//code a lucas
	public static float makeNegative(float number) {
		// 15
		if (number < 0) {
			return number;
		} else {
			return 0 - number;
		}
	}
	// explication hamza REGEX A REVOIR
	public static boolean checkForSpecialCharacters(String string) {
		// 16
		Pattern p = Pattern.compile("[^a-z0-9! ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(string);
		boolean resultatFinal = m.find();
		return resultatFinal;
	}
	// explication hamza REGEX A REVOIR
	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		String up = word.toUpperCase();
		Character fcharword = up.charAt(0);
		String fwordtostring = fcharword.toString();
		Pattern p = Pattern.compile("[BCDFGHJKLMNPQRSTVWXYZ]");
		Matcher m = p.matcher(fwordtostring);
		boolean b = m.matches();
		return b;
	}
	// code a lucas j'ai deja vus ce problème :D
	public static String getDomainName(String email) {
		// 18
		return email.replaceAll("(^.*@|.com$)", "");
	}

	// c'est moi qui l'ai fait hehe non avec l'aide du grp1 j'avoue
	public static int[] letterPosition(String name) {
		// 19
		ArrayList<String> letterlist = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i",
				"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
		String[] list = name.split("");
		int[] positions = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			String letter = list[i].toLowerCase();
			positions[i] = letterlist.indexOf(letter) + 1;
		}
		return positions;

	}
	// code lucas et en vrai je me suis pris la tete pour rien
	public static boolean isPeer(int number) {
		// 20
		return (number % 2 == 0);
	}

}
