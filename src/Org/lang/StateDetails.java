package Org.lang;

public class StateDetails {
public void south() {
	System.out.println("South India : Tamilnadu, Andrapradesh, Karnataka, Kerala, Pondicherry");
}
public void north() {
	System.out.println("North India : New Delhi, Kolkata, Mumbai, Punjab, Jammu Kashmir");

}
public static void main(String[] args) {
	StateDetails s=new StateDetails();
	s.south();
	s.north();
	
}
}
