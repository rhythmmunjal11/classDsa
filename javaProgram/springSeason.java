import java.util.*;

public class springSeason{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		if(month >=2 && month <= 4){
				System.out.println("valid date");	
				
				int day = sc.nextInt();

				if( (month == 2 && day >=12 ) || (month == 3) || (month == 4 && day >=11 ) ){
					System.out.print("true");
		
		}
		
		
				else{
						System.out.print("false");
		}
		
}

		else{
				System.out.println("not a valid date");
}
	



}




}
