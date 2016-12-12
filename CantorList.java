import java.util.ArrayList;
import java.util.Scanner;

public class CantorList {
	private final int UP = 1;
	private final int DOWN = -1;
	
	private final int GO=1;
	private final int STOP=-1;
	
	private int status = GO;
	private int max;
	
	private ArrayList<Integer> list_A = new ArrayList<Integer>();
	private ArrayList<Integer> list_B = new ArrayList<Integer>();

	public CantorList(int num) {
		max = num;
		fillList(list_A, DOWN);
		fillList(list_B, UP);
		
	}

	public void printLastPair() {

		System.out.println(list_A.get(max - 1) + "/" + list_B.get(max - 1));

	}

	public void fillList(ArrayList<Integer> list, int direction) {

		for (int i = 1; status>0; i++) {
			if (direction == DOWN) {
				status=downRoll(list, i);
				direction = UP;
			} else if (direction == UP) {
				status=upRoll(list, i);
				direction = DOWN;
			}
		}
		status=GO;
	}

	private int upRoll(ArrayList<Integer> list, int number) {
		for (int i = 1; i <= number; i++) {
			list.add(i);
			if (list.size() >= max) {
				return STOP;
			}
		}
		return GO;
	}

	private int downRoll(ArrayList<Integer> list, int number) {
		for (int i = number; i >= 1; i--) {
			list.add(i);
			if (list.size() >= max) {
				return STOP;
			}
		}
		return GO;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		CantorList c = new CantorList(in.nextInt());
		in.close();
		c.printLastPair();

	}

}
