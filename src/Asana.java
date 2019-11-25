import java.util.Arrays;

public class Asana {

	//array of moves down, right, up, left
	private static int[][] moves = {{1,0}, {0,1}, {-1,0}, {0,-1}};
	
	public static void main(String[] args) {

		int [][] g ={{5, 7, 8, 6, 3},
					 {0, 0, 7, 0, 4},
					 {4, 6, 3, 4, 9},
					 {3, 1, 0, 5, 8}};
		
		int[] p = bestMove(g, new int[] {0,0});
		System.out.println(Arrays.toString(getStartIdx(g)));
		
		
		int [] start = getStartIdx(g);
		int curRow = start[0];
		int curCol = start[1];
		int output = 0;
		
		boolean awake = true;
		
		while(awake) {
			output += g[curRow][curCol];
			g[curRow][curCol] = 0;
			int [] move = bestMove(g, new int[] {curRow, curCol});
			curRow = move[0];
			curCol = move[1];
			if (curRow == -1) {
				awake = false;
				continue;
			}
		}
		
		System.out.println(output);
		
	}

	// Helper function to get starting point
	// 
	private static int[] getStartIdx(int[][] garden) {
		
		int width = garden[0].length;
		int height = garden.length;		
		int row = height/2;
		int col = width/2;
		int startRow = height/2;
		int startCol = width/2;

		if(width % 2 != 0 && height % 2 != 0) {
			return new int[] {row, col}; 
		}
		if(width % 2 == 0 && height % 2 == 0) {

			int[][] checks = {{0,-1}, {-1,0}, {-1,-1}};
			
			for (int[] c : checks) {
				if(garden[row][col] < garden[startRow + c[0]][startCol + c[1]]) {
					row = startRow + c[0];
					col = startCol + c[1];
				}
			}
			
		}
		if(height % 2 == 0) {
			if(garden[row][col] < garden[row - 1][col]) {
				row--;
			}
		}
		if(width % 2 == 0) {
			if(garden[row][col] < garden[row][col - 1]) {
				col--;
			}
		}
		
		return new int[] {row, col};

	}
	
	// gives us best moves
	// if return int array is empty, go to sleep.
	
	private static int[] bestMove(int[][] garden, int[] idx) {
		int[] bestMove = new int[2];
		Arrays.fill(bestMove, -1);
		
		int width = garden[0].length;
		int height = garden.length;		
				
		int row = idx[0];
		int col = idx[1];
		
		for(int[] move : moves) {
			
			int newRow = row + move[0];
			int newCol = col + move[1];
						
			// If best moves is empty, set it.
			// Else compare with current and set if more carrots.
			if(newRow >= height || newCol >= width || newRow < 0 || newCol < 0 || garden[newRow][newCol] == 0) {
				continue;
			} else if(bestMove[0] == -1 && bestMove[1] == -1 || garden[newRow][newCol] > garden[bestMove[0]][bestMove[1] ]){
				bestMove[0] = newRow;
				bestMove[1] = newCol;
			}
		}
		return bestMove;
	}
}
