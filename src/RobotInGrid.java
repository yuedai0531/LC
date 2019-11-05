
public class RobotInGrid {

	public static void main(String[] args) {
		
		

	}
	
	//SOLUTION IS NOT OPTIMAL
	
	public static int f(int row, int col, boolean[][] grid) {
		
		//once robot gets to point
		if(col == 0 && row == 0 && grid[row][col] == false) {
			return 0;
		}
		
		//what if not can't move?
		if(grid[row + 1][col] == false || grid[row][col + 1] == true){
			return 1;
		}
		
		if(grid[row][col + 1] == false || grid[row + 1][col] == true){
			return 1;
		}
		
		if(grid[row + 1][col + 1] == false) {
			return 0;
		}
		
		
		return f(row -   1, col, grid) + f(row, col - 1, grid);
		
	}

}
