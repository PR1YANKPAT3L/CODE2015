import java.util.ArrayList;
import java.util.Collections;
/*Searches input for cars that fix description
 * Sort cars by emission data
 * Return Index of top five cars
 */

public class mainSearch {
	
	public static void main(String args[]){
		//Dummy choices
		String choice1 = "ACURA";
		String choice2 = "COMPACT";
		String choice3 = "\"X\"";
		String choice4 = "transmission\": \"A";
		//Iterator used to search through the input array A
		int i = 0;
		//Index of Top five cars
		int topfive[] = new int[5];
		//if number is less than 5
		int numberOfMatches = 0;
		//Sentinel values for loops
		boolean e = false, z =false;
		//ArrayList of found car fuel economies
		ArrayList<String> f = new ArrayList<String>();
		//Dummy input arrays
		String[] a = new String[2490294];
		String[] b = new String[2490294];
		while(e==false){
			try{
				if(a[i].contains(choice1)&&a[i].contains(choice2)&&a[i].contains(choice3)&&a[i].contains(choice4)){
					f.add(b[i]);
					numberOfMatches++;
				}
				i++;
			}
			catch(Exception g){
				e=true;
			}
		}
		i=0;
		Collections.sort(f);
		for(int x = 0; x < 5 && x < numberOfMatches ; x++){
			try{
				while(z==false){
					if(f.get(x).equals(b[i])){
						topfive[x]=i;
					}
				}
			}
			catch(Exception error){
				
			}
		}
		
	}
}
