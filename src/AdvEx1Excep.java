import java.util.Date; // 1.1

public class AdvEx1Excep {

	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		
		try {
			// la méthode getClass() de la variable date
			System.out.println(date.getClass().getName());
		}
		catch(NullPointerException e) {
			
			System.out.println("La variable date est nul");
		}
		// Initialisé today
		System.out.println(today.getClass().getName());
	}

}
