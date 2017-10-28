package assignment7_4;//package name
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment7_4 {//class name
	
	//Anagram Key Method
	public static final String anagramKey(String word) {
        word = word.toLowerCase();//convert to lower case
        char[] chars = word.toCharArray();//convert word to array of chars
        Arrays.sort(chars);//sort the array
        return new String(chars);//return the string
    }
	//Logic to group the Anagram words
	public static void groupAnagrams(ArrayList<String> inpWordsList){
		
				//create the hashmap with Key as String and value as List of Strings
				HashMap<String,List<String>> matchMap = new HashMap<>();
				
				//Iterate through inputwords list
				for(String word1:inpWordsList){
					String key = anagramKey(word1);//Get the key for each word by calling anagramKey method
				    if (!matchMap.containsKey(key)) {//check if key already exists in map
				        matchMap.put(key, new ArrayList<String>());//if key is not there put the new key
				    }
				    matchMap.get(key).add(word1);//place the word to corresponding key
					
				}

				System.out.println(matchMap.values());//print the set of anagrams
		
		
	}
	
			
	public static void main(String args[]){//main method
		
		//create Scanner object
		Scanner inpScan = new Scanner(System.in);
		ArrayList<String> inpWordsList=new ArrayList<String>();//create arrayList object
		
		System.out.println("Enter the list of words : Press - to exit ");
		while(true){//taking input from the user and appending to arraylist
			String inpString =inpScan.nextLine();
			if(!(inpString.equals("-1"))){
				inpWordsList.add(inpString);
				
			}
			else{
				break;//break of input is equal to -1
			}
		}
		
	    groupAnagrams(inpWordsList);   //call groupAnagrams method  
		
		inpScan.close();//close the scanner object
        
	}//end of main
 

}//end of class
