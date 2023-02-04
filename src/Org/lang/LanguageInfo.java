package Org.lang;

public class LanguageInfo {

	private void tamil() {
		System.out.println("Tamil Language : Tamilnadu");

	}

	private void hindi() {
		System.out.println("Hindi Language : New Delhi");
	}

	private void english() {
		System.out.println("English Language : USA");

	}

	private void Malayalam() {
		System.out.println("Malayalam Language: Kerala");

	}

	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamil();
		l.hindi();
		l.english();

		l.Malayalam();
		StateDetails s = new StateDetails();
		s.south();
		s.north();
	}

}
