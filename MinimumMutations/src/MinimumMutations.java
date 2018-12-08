

import java.util.ArrayList;

public class MinimumMutations {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>(); 
		
		text = new String(Files.readAllBytes(Paths.get("week1-code-challenge.txt")));
		
		System.out.println(text);
		
		String string = "start: \"AACCGGTT\"\r\n" + 
				"end:   \"AAACGGTA\"\r\n" + 
				"bank: [\"AACCGGTA\" \"AACCGCTA\" \"AAACGGTA\"]";
		
		String[] geneString = string.split("[: \"\n\r]+");
	
		String start=""; 
		String end = ""; 
		int count; 
		
		
		for(int i=0; i<geneString.length; i++) {
			
			if (geneString[i].equals("start")) {
				start = new String(geneString[i+1]); 
			}
			
			else if (geneString[i].equals("end")) {
				end = new String(geneString[i+1]); 
			}
			
			else if (geneString[i].equals("bank")) {
				if(geneString[i+1].equals("[")) {
					count = 1; 
					do {
					  arr.add(geneString[i+1+count]); 
					  count++; 
					} while (!geneString[i+1+count].equals("]")); 
				}
			}
		}
		
		
		
		String[] bank = arr.toArray(new String[0]);
		
		Mutate mutationSteps = new Mutate(); 
		
		int step = mutationSteps.steps(start,end,bank);
		
		System.out.println("Return: "+step);
		// TODO Auto-generated method stub

	}

}
