package tp8;

public class Factorielle {
	public static void main (String[] args)
	{
	int i, nbEntiers=0, factorielle=1; int ancien;
	try {
	nbEntiers= Integer.parseInt(args[0]);
	}
	catch(ArrayIndexOutOfBoundsException err)
	{
		System.out.println("Donnez en paramètre la base de la factorielle");
	}
	try {
	nbEntiers= Integer.parseInt(args[0]);
	}
	catch(NumberFormatException er)
	{
		System.out.println("La base de la factorielle doit être ENTIERE");
	}
	try{
	nbEntiers= Integer.parseInt(args[0]);
	if(nbEntiers<0) 
		throw new negatifException("la factorielle d'un nombre négatif n'est pas définie");
	}
	catch(negatifException e)
	{
		System.out.println(e.getmessage());
	}
	for (i=2;i<= nbEntiers;i++)
	{
		ancien=factorielle; factorielle *= i;
	}
	System.out.println(" Voila la factorielle des "+ nbEntiers +" premiers entiers : "+ factorielle );
	}
	
}
