package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.givenName = "太郎";
		ichiro.givenName = "一郎";
		hanako.givenName = "花子";
		
		taro.commonIntroduce();
		taro.eachIntroduce();
		taro.execlntroduce();
		
		ichiro.commonIntroduce();
		ichiro.eachIntroduce();
		ichiro.execlntroduce();
		
		hanako.commonIntroduce();
		hanako.eachIntroduce();
		hanako.execlntroduce();
		

	}

}
