package startup.exam01;

public class SimpleStartupGame {
	public static void main(String[] args) {
		int numOfGuesse = 0;
		GameHelper helper = new GameHelper();
		
		SimpleStartup theStartup= new SimpleStartup();
		int randomNum = (int)(Math.random() * 5);
		
		int[] location = {randomNum, randomNum + 1, randomNum + 2};
		
		theStartup.setLocationCells(location);
		boolean isAlive = false;
		
		while(!isAlive) {
			
			int guess = helper.getUserInput("enter a number");
			
			String result = theStartup.checkYourself(guess);
			numOfGuesse++;
			
			if(result.equals("kill")) {
				isAlive = true;
				System.out.println("You took " + numOfGuesse + " guesses");
			}
		}
	}
}
