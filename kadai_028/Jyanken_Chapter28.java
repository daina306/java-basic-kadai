package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		String choice;
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
		    System.out.println("パーはpaperのpを入力しましょう");
			
			choice = scanner.nextLine().toLowerCase();
			
			if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				break;
			} else {
				System.out.println("無効な入力です。");
			}
		}
		return choice;
	}
	
	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int index = (int) Math.floor(Math.random() * 3);
		return hands[index];
	}
	
	public void playGame(String myChoice, String opponentChoice) {
		HashMap<String, String> handMap = new HashMap<String,String>();
		handMap.put("r","グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));
		
		if (myChoice.equals(opponentChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
				(myChoice.equals("s") && opponentChoice.equals("p")) ||
				(myChoice.equals("p") && opponentChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
