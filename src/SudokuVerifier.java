
public class SudokuVerifier {
	
	public int verify(String str) {
		if(!isDigitsOnly(str))
			return -1;
		else if(!noRepeatInSubGrid(str))
			return -2;
		else if(!noRepeatInRows(str))
			return -3;
		else if(!noRepeatInColumns(str))
			return -4;
		else		// returns 0 if the candidate solution is correct.
			return 0;
	}
	public boolean isDigitsOnly(String str) {
		if(str.length() != 81){ // Check length
			return false;
		}
		for (int i=0; i<81; i++){ // Check every digit as char.
			int digit = str.charAt(i);
			if(!(49<=digit && digit<=57)) // If not between 0 and 9 return false.
				return false;
		}
		return true;
	}

	public boolean noRepeatInSubGrid(String str) {
		for(int gridNum=0; gridNum<9; gridNum++){ // Check each grid.
			String grid = generateGrid(gridNum, str);
			
		}
		return false;
	}
	
	public boolean noRepeatInRows(String str) {
		return false;
	}

	public boolean noRepeatInColumns(String str) {
		return false;
	}
	
	public String generateGrid(int i, String str){
			int firstMemberIndex = (27*(i/3)) + (3*(i%3));
			String gridRow1 = str.substring(firstMemberIndex,firstMemberIndex+3);
			String gridRow2 = str.substring(firstMemberIndex+9,firstMemberIndex+9+3);
			String gridRow3 = str.substring(firstMemberIndex+18,firstMemberIndex+18+3);
			
			String grid = gridRow1 + gridRow2 + gridRow3;
			
			return grid;
	}

}
