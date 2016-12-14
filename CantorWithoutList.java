
import java.util.Scanner;

public class CantorWithoutList {
	private int direction;
	private final int UP = 1;
	private final int DOWN = -1;

	private int status;
	private final int GO = 1;
	private final int STOP = -1;

	private int num=0;
	public CantorWithoutList(int max) {
		status=GO;
		direction = DOWN;
		for (int i = 1; status == GO; i++) {
			if (direction == DOWN) {
				for (int j = i; j >= 1; j--) {
					num++;
					if(num==max){
						System.out.print(j);
						status =STOP;
						break;
					}
				}
				direction = UP;
				
			} else if (direction == UP) {
				for (int j = 1; j <= i; j++) {
					num++;
					if(num==max){
						System.out.print(j);
						status =STOP;
						break;
					}
				}
				direction = DOWN;
			}
		}
		System.out.print("/");
		direction = UP;
		status=GO;
		num=0;
		for (int i = 1; status == GO; i++) {
			if (direction == DOWN) {
				for (int j = i; j >= 1; j--) {
					num++;
					if(num==max){
						System.out.print(j);
						status =STOP;
						break;
					}
				}
				direction = UP;
				
			} else if (direction == UP) {
				for (int j = 1; j <= i; j++) {
					num++;
					if(num==max){
						System.out.print(j);
						status =STOP;
						break;
					}
				}
				direction = DOWN;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CantorWithoutList c= new CantorWithoutList(in.nextInt());
		in.close();
	}

}
