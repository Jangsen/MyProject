package startup.exam02;

public class Test {
	public static void main(String[] args) {
		int x = 0;
		int y = 30;
		for(int outer = 0; outer < 3; outer++) {
			for(int inner = 4; inner > 1; inner--) {
				
				x += 6;
				y -= 2;
				if(x == 6) {
					break;
				}
				x += 3;
			}
			y -= 2;
		}
		System.out.println(x + " " + y);
	}
	
}
