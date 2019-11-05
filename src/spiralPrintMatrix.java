import java.util.ArrayList;

public class spiralPrintMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		
        int[][] arr2 = { {1,  2,  3,  4,  5,  6}, 
                {7,  8,  9,  10, 11, 12}, 
                {13, 14, 15, 16, 17, 18} 
              }; 
		
		spiralPrint(arr2);

	}
	
	
	
	
	static void spiralPrint(int[][] A) {
				
		int rStart = 0;
		int rEnd = A[0].length - 1;
		int cStart = 0;
		int cEnd = A.length - 1;
		
		
		while(rStart <= rEnd && cStart <= cEnd) {
			
			for(int rr = rStart; rr <= rEnd; rr++) {
				System.out.println("loop1: " + A[cStart][rr]);
			}

			cStart++;
			
			for(int cd = cStart; cd <= cEnd; cd++) {
				System.out.println("loop2: " + A[cd][rEnd]);
			}
			
			rEnd--;
			if (rStart < rEnd && cStart < cEnd) {
			
				for(int rl = rEnd; rl >= rStart; rl--) {
					System.out.println("loop3: " + A[cEnd][rl]);
				}
				
				cEnd--;
				
				for(int cu = cEnd; cu >= cStart; cu--) {
					System.out.println("loop4: " + A[cu][rStart]);
				}
				
				rStart++;
			}
			
//			System.out.println("rStart: " + rStart);
//			System.out.println("rEnd: " + rEnd);
//			System.out.println("cStart: " + cStart);
//			System.out.println("cEnd: " + cEnd);
			
		}		
		
	}
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList ans = new ArrayList();
        if (matrix.length == 0)
        	return ans;
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0;
        int c = 0;
        int di = 0;
        
        for (int i = 0; i < R * C; i++) {
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            
            int cr = r + dr[di];
            int cc = c + dc[di];
            
            if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]){
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }

}
