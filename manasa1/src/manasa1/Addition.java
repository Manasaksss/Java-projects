package manasa1;

public class Addition {//{} curly brakets are called body of the program
	int add(int x,int y) {
		return x+y;
		
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		int sum = addition.add(2, 3);
		System.out.println("sum :" +sum);
	}

}
