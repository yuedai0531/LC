import java.util.Arrays;

public class Nakisa {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "423692";
		String keypad = "923857614";
		char[] arr = keypad.toCharArray();

		
        char[] row1 = Arrays.copyOfRange(arr, 0, 3);
        char[] row2 = Arrays.copyOfRange(arr, 3, 6);
        char[] row3 = Arrays.copyOfRange(arr, 6, 9);
        char[][] numkey = {row1,row2,row3};

        
        int sum = 0;
        for(int i = 0; i < s.length()-1;i++){
            char key = s.charAt(i);
            char nextKey = s.charAt(i+1);
            int[] firstIndex = findIndex(numkey, key);
            int[] secondIndex = findIndex(numkey, nextKey);
            if(Math.abs(firstIndex[0] - secondIndex[0]) == 2 || Math.abs(firstIndex[1] - secondIndex[1]) == 2) {
            	sum += 2;
            }else if(Math.abs(firstIndex[0] - secondIndex[0]) == 1 || Math.abs(firstIndex[1] - secondIndex[1]) == 1) {
            	sum += 1;
            }else {
            	sum += 0;
            }
        }
       // System.out.println(sum);      
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(row1));
//		System.out.println(Arrays.toString(row2));
//		System.out.println(Arrays.toString(row3));
//		System.out.println(Arrays.deepToString(numkey));
		
	}
    public static int[] findIndex(char[][] arr, char key){
    	int index[] = {-1,-1};
    	for (int i = 0 ; i < arr.length; i++) {
    	    for(int j = 0 ; j < arr[i].length ; j++){
    	         if (arr[i][j] == key){
    	              index[0] = i;
    	              index[1] = j;
    	              break;
    	         }
    	    }
    	}
		return index;
    }
}
