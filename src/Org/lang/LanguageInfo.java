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

//	<<<<<<<HEAD
//	=======>>>>>>>77e7 cba89b3dc52daa0f0cf2d8a53b23800c50bc

	private void Malayalam() {
		System.out.println("Malayalam Language: Kerala");

	}

	private void kannadam() {
		System.out.println("Kannadam Language : Karnataka ");

	}

	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamil();
		l.hindi();
		l.english();
<<<<<<< HEAD
		l.Malayalam();
		l.kannadam();

=======

		l.Malayalam();
>>>>>>> 77e7cba89b3dc52daa0f0cf2d8a53b23800c50bc
		StateDetails s = new StateDetails();
		s.south();
		s.north();
	}

}
