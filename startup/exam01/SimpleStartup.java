package startup.exam01;

public class SimpleStartup {
	int[] locatiomCells;	//셀의 위치를 저장
	int numberOfHits = 0;
	
	public void setLocationCells(int[] locationCells){
		this.locatiomCells = locationCells;
	}
	String checkYourself(int guess) {
		
		String result = "miss";
		
		for(int cell : locatiomCells) {
			if(guess == cell) {
				result = "hits";
				numberOfHits++;
				break;
			}
		}
		if(numberOfHits == locatiomCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}
