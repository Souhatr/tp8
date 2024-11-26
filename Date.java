package tp8;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	public Date(int jour,int mois)throws JourException,MoisException
	{
		if(this.jour<1|| this.jour>12)
			throw new JourException(" erreur le jour saisi doit etre un entier entre 1 et 31.");
		if(this.mois<1|| this.mois>31)
			throw new MoisException("le mois saisi doit etre un entier entre 1 et 12");
	}
}
