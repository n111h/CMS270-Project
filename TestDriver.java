import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class TestDriver {
	
	public static ArrayList<Shoe> orders = new ArrayList<>();
	public static ArrayList<Component> parts;
	public static ArrayList<Lace> laces = new ArrayList<>();
	public static ArrayList<Sole> soles = new ArrayList<>();;
	public static ArrayList<Body> bodies = new ArrayList<>();;

	public static void main(String[] args) {
		
		/*try {
			
			Scanner sc = new Scanner(new File("input.txt"));
			orders = makeShoes(sc);
			orders.get(0).toString();
			
			
		}  catch(FileNotFoundException e) {
			System.out.println("Specified file could not be located.");
		}  catch(IndexOutOfBoundsException e) {
			System.out.println("Orders size is out of bounds");
		}*/
		
		Scanner input = new Scanner(System.in);
		
		newStorage();
		printStorage();
		
		introPrompt(input);
		
	}
	
	/*public static ArrayList<Shoe> makeShoes(Scanner s) {
		
		Shoe shoe = new Shoe();
		Order newOrder = new Order();
		
		while(s.hasNextLine()) {
			
			String line = s.nextLine();
			String[] token = line.split(" ");
			
			int i = 0;
			
			if (token[0].equals("O")) {
				while(i <= token.length) {
					i++;
					if(token[i].equals("L")) {
						shoe.setLaces(new Lace(token[i + 1], Double.parseDouble(token[i + 2])));
					}  else if (token[i].equals("S")) {
						shoe.setSole(new Sole(token[i + 1], Double.parseDouble(token[i + 2]), token[i + 3]));
					}  else if (token[i].equals("B")) {
						shoe.setBody(new Body(token[i + 1], Double.parseDouble(token[i + 2]), token[i + 3], token[i + 4]));
					}
					
				}
			}
			
			temp.add(shoe);
			
		}
		return temp;
		
	}*/
	
	public static ArrayList<Integer> hashMapTrackingNumber(ArrayList<Shoe> shoes) {
		
		ArrayList<Integer> hashMap = new ArrayList<>();
		int value = 0;
		int key = 0;
		
		for(int i = 0; i < shoes.size(); i++ ) {
			
			
			
		}
		
		
	}
	
	public static void newStorage() {
		
		try {
			
			Scanner sc = new Scanner(new File("storage.txt"));
			
			while(sc.hasNextLine()) {
				
				String line = sc.nextLine();
				String[] token = line.split(" ");
					
					if (token[0].equals("L") ) {
						
						for(int j = 0; j < Integer.parseInt(token[1]); j++) {
							if (token[2].equals("R")) {
								laces.add(new Lace("red", Double.parseDouble(token[3])));
							}  else if (token[2].equals("G")) {
								laces.add(new Lace("green", Double.parseDouble(token[3])));
							}  else if (token[2].equals("B")) {
								laces.add(new Lace("blue", Double.parseDouble(token[3])));
							}  else {
								System.out.println("Color type is not valid to store.");
							}
						} 
						
					}  else if (token[0].equals("S")) {
						
						for(int j = 0; j < Integer.parseInt(token[1]); j++) {
							if (token[2].equals("R")) {
								soles.add(new Sole("red", Double.parseDouble(token[3]), token[4]));
							}  else if (token[2].equals("G")) {
								soles.add(new Sole("green", Double.parseDouble(token[3]), token[4]));
							}  else if (token[2].equals("B")) {
								soles.add(new Sole("blue", Double.parseDouble(token[3]), token[4]));
							}  else {
								System.out.println("Color type is not valid to store.");
							}
						} 
						
					}  else if (token[0].equals("B")) {
						
						for(int j = 0; j < Integer.parseInt(token[1]); j++) {
							if (token[2].equals("R")) {
								bodies.add(new Body("red", Double.parseDouble(token[3]), token[4], token[5]));
							}  else if (token[2].equals("G")) {
								bodies.add(new Body("green", Double.parseDouble(token[3]), token[4], token[5]));
							}  else if (token[2].equals("B")) {
								bodies.add(new Body("blue", Double.parseDouble(token[3]), token[4], token[5]));
							}  else {
								System.out.println("Color type is not valid to store.");
							}
						}
						
					}  else {
						System.out.println("Invalid component type.");						
					}	
				
			}
			
		}  catch(FileNotFoundException e) {
			System.out.println("File could not be located in system.");
		}
		
	}
	
	public static ArrayList<Component> storage() {
		
		ArrayList<Component> components = new ArrayList<>();
		
		try {
			
			Scanner sc = new Scanner(new File("storage.txt"));
			
			while(sc.hasNextLine()) {
				
				String line = sc.nextLine();
				String[] token = line.split(" ");
					
					if (token[0].equals("L") ) {
						
						for(int j = 0; j < Integer.parseInt(token[1]); j++) {
							if (token[2].equals("R")) {
								components.add(new Lace("red", Double.parseDouble(token[3])));
							}  else if (token[2].equals("G")) {
								components.add(new Lace("green", Double.parseDouble(token[3])));
							}  else if (token[2].equals("B")) {
								components.add(new Lace("blue", Double.parseDouble(token[3])));
							}  else {
								System.out.println("Color type is not valid to store.");
							}
						} 
						
					}  else if (token[0].equals("S")) {
						
						for(int j = 0; j < Integer.parseInt(token[1]); j++) {
							if (token[2].equals("R")) {
								components.add(new Sole("red", Double.parseDouble(token[3]), token[4]));
							}  else if (token[2].equals("G")) {
								components.add(new Sole("green", Double.parseDouble(token[3]), token[4]));
							}  else if (token[2].equals("B")) {
								components.add(new Sole("blue", Double.parseDouble(token[3]), token[4]));
							}  else {
								System.out.println("Color type is not valid to store.");
							}
						} 
						
					}  else if (token[0].equals("B")) {
						
						for(int j = 0; j < Integer.parseInt(token[1]); j++) {
							if (token[2].equals("R")) {
								components.add(new Body("red", Double.parseDouble(token[3]), token[4], token[5]));
							}  else if (token[2].equals("G")) {
								components.add(new Body("green", Double.parseDouble(token[3]), token[4], token[5]));
							}  else if (token[2].equals("B")) {
								components.add(new Body("blue", Double.parseDouble(token[3]), token[4], token[5]));
							}  else {
								System.out.println("Color type is not valid to store.");
							}
						}
						
					}  else {
						System.out.println("Invalid component type.");						
					}	
				
			}
			
		}  catch(FileNotFoundException e) {
			System.out.println("File could not be located in system.");
		}
		
		return components;
		
	}
	
	
	public static void printStorage() {
		
		int i = 0;
		while(i < laces.size()) {
			System.out.println(laces.get(i).toString());
			i++;
		}
		
		i = 0;
		while(i < soles.size()) {
			System.out.println(soles.get(i).toString());
			i++;
		}
		
		i = 0;
		while(i < bodies.size()) {
			System.out.println(bodies.get(i).toString());
			i++;
		}
		
	}
	
	
	//Customer or supplier methods
	
	public static void introPrompt(Scanner sc) {
		
		boolean correctType = false;
		System.out.println("Welcome to our Shoe Creation Store!\n" +
						   "Are you a Customer or a Supplier?");
		
		while(correctType == false) {
			
			String input = sc.nextLine();
			
			if (input.equalsIgnoreCase("customer")) {
				correctType = true;
				customer();
			}  else if (input.equalsIgnoreCase("supplier")) {
				correctType = true;
				supplier();
			}  else {
				System.out.println("Invalid user type. Please enter the correct user type.");
			}
		}
		
	}
	
	
	public static void customer() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Greetings Customer!\n\n" +
						   "Would you like to place an order or track existing order?\n\n" +
						   "1.Place an order\n2.Track existing order");
		String input = sc.nextLine();
		
		if (input.equals("1")) {
			orderShoe();
		}  else if (input.equals("2") ) {
			checkOrder();
		}
		
	}
	
	public static void supplier() {
		
		
	}
	
	public static void orderShoe() {
		
		Scanner sc = new Scanner(System.in);
		Shoe newShoe = new Shoe();
		boolean update = true;
		
		while(update != false) {

			System.out.println("Welcome customer! Start building your shoe.\n"
					+ "1. Choose laces\n"
					+ "2. Choose sole\n"
					+ "3. Choose body\n"
					+ "4. Finish order");
			
			String input = sc.nextLine();
			update = buildShoe(sc, input, newShoe, update);
			
		}
		
		System.out.println(newShoe.toString());
		 
	}
	
	public static boolean buildShoe(Scanner sc, String input, Shoe newShoe, boolean update) {
		
		ArrayList<String> colorOptions = new ArrayList<>(Arrays.asList("red", "green", "blue"));
		ArrayList<Double> lengthOptions = new ArrayList<>(Arrays.asList(12.00));
		ArrayList<Double> sizeOptions = new ArrayList<>(Arrays.asList(12.00));
		ArrayList<String> patternOptions = new ArrayList<>(Arrays.asList("Hermes", "Gucchi"));
		ArrayList<String> materialOptions = new ArrayList<>(Arrays.asList("Leather", "Polyester"));
		
		if (input.equals("1")) {
			Lace temp = new Lace();
			System.out.println("Please choose color type and length.");
			String col = sc.nextLine();
			boolean exists = true;
			int j = 0;
			
			while (j < colorOptions.size()) {
				if (!colorOptions.get(j).equals(col)) {
					exists = false;
				}  else if (colorOptions.get(j).equals(col)) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Color option does not exist. Please select a valid color option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			String len = sc.nextLine();
			j = 0;
			
			while(j < lengthOptions.size()) {
				if (!lengthOptions.get(j).equals(Double.parseDouble(len))) {
					exists = false;
				}  else if (lengthOptions.get(j).equals(Double.parseDouble(len))) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Length option does not exist. Please select a valid length option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			int i = 0;
			while(i < laces.size()) {
				if (laces.get(i).getColor().equals(col) && laces.get(i).getLength() == Double.parseDouble(len)) {
					temp = new Lace(col, Double.parseDouble(len));
					newShoe.setLaces(temp);
					laces.remove(i);
					break;
				} else if(laces == null) {
					//notify supplier to resupply item
				} else {
					//notify supplier to refill certain color and length lace
					break;
				}
				i++;
			}
			
		}  else if(input.equals("2")) {
			Sole temp = new Sole();
			System.out.println("Please choose color type, size and pattern.");
			boolean exists = true;
			int j = 0;
			
			String col = sc.nextLine();
			
			while (j < colorOptions.size()) {
				if (!colorOptions.get(j).equals(col)) {
					exists = false;
				}  else if (colorOptions.get(j).equals(col)) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Color option does not exist. Please select a valid color option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			String siz = sc.nextLine();
			j = 0;
			
			while(j < sizeOptions.size()) {
				if (!sizeOptions.get(j).equals(Double.parseDouble(siz))) {
					exists = false;
				}  else if (sizeOptions.get(j).equals(Double.parseDouble(siz))) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Size option does not exist. Please select a valid size option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			String pat = sc.nextLine();
			j = 0;
			
			while(j < patternOptions.size()) {
				if (!patternOptions.get(j).equals(pat)) {
					exists = false;
				}  else if (patternOptions.get(j).equals(pat)) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Pattern option does not exist. Please select a valid pattern option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			int i = 0;
			while(i < soles.size()) {
				if (soles.get(i).getColor().equals(col) && soles.get(i).getSize() == Double.parseDouble(siz) && soles.get(i).getPattern().equals(pat)) {
					temp = new Sole(col, Double.parseDouble(siz), pat);
					newShoe.setSole(temp);
					soles.remove(i);
					break;
				} else if(soles == null) {
					//notify supplier to resupply item
				} else {
					//notify supplier to refill certain color and length lace
					break;
				}
				i++;
			}
			
			
		}  else if(input.equals("3")) {
			Body temp = new Body();
			System.out.println("Please choose color type, size, pattern and material.");
			boolean exists = true;
			int j = 0;
			
			String col = sc.nextLine();
			
			while (j < colorOptions.size()) {
				if (!colorOptions.get(j).equals(col)) {
					exists = false;
				}  else if (colorOptions.get(j).equals(col)) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Color option does not exist. Please select a valid color option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			String siz = sc.nextLine();
			j = 0;
			
			while(j < sizeOptions.size()) {
				if (!sizeOptions.get(j).equals(Double.parseDouble(siz))) {
					exists = false;
				}  else if (sizeOptions.get(j).equals(Double.parseDouble(siz))) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Size option does not exist. Please select a valid size option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			String pat = sc.nextLine();
			j = 0;
			
			while(j < patternOptions.size()) {
				if (!patternOptions.get(j).equals(pat)) {
					exists = false;
				}  else if (patternOptions.get(j).equals(pat)) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Pattern option does not exist. Please select a valid pattern option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			String mat = sc.nextLine();
			j = 0;
			
			while(j < materialOptions.size()) {
				if (!materialOptions.get(j).equals(mat)) {
					exists = false;
				}  else if (materialOptions.get(j).equals(mat)) {
					exists = true;
					break;
				}
				j++;
			}
			
			if (exists == false) {
				System.out.println("Material option does not exist. Please select a valid material option.");
				buildShoe(sc, input, newShoe, update);
			}
			
			int i = 0;
			while(i < bodies.size()) {
				if (bodies.get(i).getColor().equals(col) && bodies.get(i).getSize() == Double.parseDouble(siz) && bodies.get(i).getPattern().equals(pat) && bodies.get(i).getMaterial().equals(mat)) {
					temp = new Body(col, Double.parseDouble(siz), pat, mat);
					newShoe.setBody(temp);
					bodies.remove(i);
					break;
				} else if(bodies == null) {
					//notify supplier to resupply item
				} else {
					//notify supplier to refill certain color and length lace
					break;
				}
				i++;
			}
	
		}  else if (input.equals("4")) {
			update = false;
		}
		
		else {
			System.out.println("Option does not exist");
		}
		
		return update;
		
	}
	
	public static void checkOrder() {
		
	}
	
	
	
	
}
