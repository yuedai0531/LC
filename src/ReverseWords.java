

public class ReverseWords {

	public static void main(String[] args) {
		char sg = 97;
		
		String s = "This is it.";
				
		String[] brr = s.split(" ");
		
		String sentence = "";
		for(int i=0; i < brr.length; i++) {			
			sentence += brr[brr.length-1-i] + " ";
		}
		System.out.println(sentence.trim());
		
//		System.out.println(sg);
//		
//		
//		
//		//char last = "banana".charAt("banana".length());
//		double x = Double.parseDouble("2.5");
//		System.out.println(x);
//			
	}
	
}
