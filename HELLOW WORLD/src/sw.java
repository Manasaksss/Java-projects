import java.util.Scanner;

public class sw {

	public static void main(String[] args) {
		String dayName="";
		Scanner sc= new Scanner(System.in) ;
			System.out.println("Enter Day Number>>>");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName="tuseday";
				break;
			case 3:
				dayName="wednesday";
				break;
			case 4:
				dayName="thursday";
				break;
			case 5:
				dayName="friday";
				break;
				default:
					dayName="Invalid Input";
					break;
					
			}
		}
	}


