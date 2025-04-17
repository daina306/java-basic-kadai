package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionary = new HashMap<String,String>(){
		{
			put("apple","りんご");
			put("peach","桃");
			put("banana","バナナ");
			put("lemon","レモン");
			put("pear","梨");
			put("kiwi","キウイ");
			put("strawberry","いちご");
			put("grape","ぶどう");
			put("muscat","マスカット");
			put("cherry","さくらんぼ");
		}
	
	};
	
public String lookUpWord(String word) {
	
	if (dictionary.containsKey(word)) {
		System.out.println(word + "の意味は" + dictionary.get(word));
	} else {
		System.out.println(word + "は辞書に存在しません");
	}
	return "";
}
	}

	

	


	



	

	




