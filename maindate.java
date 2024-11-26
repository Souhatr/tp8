package tp8;
import java.util.Scanner;
public class maindate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println ("donner jour") ;
			int j = sc.nextInt() ;
			System.out.println ("donner mois") ;
			int m= sc.nextInt() ;
			Date d= new Date(j,m);
		}
		catch(JourException e)  
		{
			System.out.println(e.getMessage());
		}
		catch(MoisException e1)
		{
			System.out.println(e1.getMessage());
		}
		System.out.println ("donner annee") ;
		int a= sc.nextInt() ;
		
		
	}

}
