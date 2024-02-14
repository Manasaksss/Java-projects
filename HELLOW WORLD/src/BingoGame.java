
public class BingoGame {

	public static void main(String[] args) {
		int[] numberArray = {10,20,30,40,50};
		if(args.length !=1) {
			System.out.println("Usage: java BingoGame <number>");
			return;
		}
		int targetNumber = Integer.parseInt(args[0]);
		boolean found = false;
		for(int number: numberArray) {
			if(number == targetNumber) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("BINGO");
		}else {
			System.out.println("number not found array.");
		}
	}

}
