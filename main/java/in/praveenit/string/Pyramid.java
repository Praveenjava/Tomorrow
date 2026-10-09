package in.praveenit.string;

public class Pyramid {
	public static void main(String[] args) {
		// int n =5;
		for (int i = 1; i <= 5; i++) {
			
			for (int k = 5 - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

//class Pyramid {
//
//	public static void main(String... args) {
//
//			for( int i = 1; i<=5 ; i ++ ){
//			
//				for ( int k = 5-i ; k >= 1 ; k-- ){
//					System.out.print(" ");
//				}					
//				
//				for( int j = 1; j<=i ; j++ ){
//						System.out.print ("* ");
//				}
//
//				System.out.println();
//			}
//	}
//}
//
