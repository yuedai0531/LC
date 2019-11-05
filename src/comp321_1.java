import java.util.Scanner;
public class comp321_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = new char[8][8];
		
		String[] s = {	"*.......",
						"..*.....",
						"....*...",
						"......*.",
						".*......",
						".......*",
						".....*..",
						"...*...."
						};
		
		String[] s2 ={"*.......",
		"......*.",
		"....*...",
		".......*",
		".*......",
		"...*....",
		".....*..",
		"..*....."};
		
		Scanner scan = new Scanner(System.in);

		for(int r = 0; r < 8; r++)
		{
			String str = scan.nextLine();
					//s2[r];
					//
			for(int c = 0; c < 8; c++)
			{
				board[r][c] = str.charAt(c);
			}
		}
		
		//////////

		//////////////
		
		int queens = 0;
		for(int r = 0; r < 8; r++)
		{
			for(int c = 0; c < 8; c++)
			{
				if(board[r][c] == '*') {
					queens++;
				}
			}
		}
		
		if (queens == 8) {
			if(Hor(board) && Ver(board) && D1(board)
				&& D2(board) && D3(board) && D4(board)) {
				System.out.println("valid");
			}
			else
				System.out.println("invalid");
		}
		else {
			System.out.println("invalid");
		}
			
				
	}
	
    static boolean Ver(char[][] board){
        for(int i = 0; i < 8; i++){
            int q = 0;
            for(int j = 0; j < 8; j++) {
            	if(board[j][i] == '*')
            	q++;
            }	
            if(q > 1)return false;
        }
        return true;
    }
    
    public static boolean Hor(char[][] board){
        for(int i = 0; i < 8; i++){
            int q = 0;
            for(int j = 0; j < 8; j++) {
            	if(board[i][j] == '*')
            	q++;
            }	
            if(q > 1)return false;
        }
        return true;
    }
    
    public static boolean D1(char[][] board){
        for(int i = 0; i < 8; i++){
            int q = 0;
            int x = i;
            for(int j = 0;j <= i; j++){
            	if(board[x][i - x] == '*')
            		q++;
                x--;
            }
            if(q > 1)return false;
        }
        return true;
    }
    public static boolean D2(char[][] board){
        for(int i = 7; i >- 1; i--){
            int q = 0;
            int x = 0;
            for(int j=i;j<8;j++){
            	if(board[j][x++] == '*')
            		q++;
            }
            if(q > 1)
            	return false;
        }
        return true;
    }
    public static boolean D3(char[][] board){
        for(int i = 0; i < 7; i++){
            int q = 0;
            int x = i;

            for(int j = 7; x >- 1; j--){
            	if(board[x--][j] == '*')
            		q++;
            }
            if(q > 1)return false;
        }
        return true;
    }
    public static boolean D4(char[][] board){
        for(int i = 7; i >- 1; i--){
            int q = 0;
            int x = i;
            for(int j = 7; j >= i; j--){
            	if(board[x++][j] == '*')
            		q++;
            }
            if(q > 1)return false;
        }
        return true;
    }
}	
