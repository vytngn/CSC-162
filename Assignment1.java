import java.util.Scanner;
import java.util.ArrayList;

public class Assignment1 {
	
	/***Main method***/
	public static void main(String[] args) {
		// Create ArrayList name list 
		ArrayList<Integer> list = new ArrayList<Integer>();
				
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten integers: ");
				
		// Count each input interger i and add i to the list
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
				
		// Invoke removeDuplicates() method 
		removeDuplicate(list); 
				
		// Display each integers separated by exactly one space
		System.out.print("The distinct integers are");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
		
	}	
	
	/***Method to remove duplicate elements***/
	public static void removeDuplicate(ArrayList<Integer> list) {
			
		//Nested for loop to traverse array 
		for (int i = 0; i < list.size()-1; i++){
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i) == list.get(j))
					list.remove(j); 
			}
		}
	}
	
	

}
