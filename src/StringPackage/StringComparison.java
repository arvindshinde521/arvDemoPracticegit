package StringPackage;

public class StringComparison {

	public static void main(String[] args) {
		
		String CurrentPOTUS = new String ("Donald Trump");
		String TarrifKing = new String("Donald Trump");
		String SleepyPresident = new String("Biden");
		
		System.err.println(CurrentPOTUS.equals(SleepyPresident));
		System.out.println(CurrentPOTUS.equals(TarrifKing));
		System.out.println(CurrentPOTUS.length());
		System.out.println(CurrentPOTUS.charAt(0));
		System.out.println(CurrentPOTUS.matches(SleepyPresident));

		
		

	}

}
