package Pantominos;

public class PantominosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbP1=0,nbP2=0,nbP3=0,nbP4=0,nbP5=0,nbP6=0,nbP7=0,nbP8=0,nbP9=0,nbP10=0,nbP11=0,nbP12=0;
        int longueur=0;
		int largeur=0;
		String A= "rien", b = "rien";
		System.out.println("bonjour, que voulez vous faire?");
	    
		while (A!="Exit")
		
		A=Terminal.lireChaine();
		
		switch (A){
		
		case "Qui est tu?":
			System.out.println (" je suis un programme remplissant des plateaux avec des pentaminos, je serais votre chose durant le deroulement de ces operations.");
			break;
		case "je veux pentaminer":
			System.out.println("Quelle sera la longueur du plateau?");
			longueur = Terminal.lireEntier();
			System.out.println("Quelle sera la largeur du plateau?");
			largeur = Terminal.lireEntier();
			Plateau Pla= new Plateau (longueur,largeur);
			System.out.println("bah faut choisir les pièces f et dire fin quand t'a fini");
			while (b!="fin"){
				switch (b){
				case "fin": 
				  break;
				
				case "piece1":
					  nbP1=nbP1+1;
					  break;
				case "piece2":
					  nbP2=nbP2+1;
					  break;
				case "piece3":
					  nbP3=nbP3+1;
					  break;
				case "piece4":
					  nbP4=nbP4+1;
					  break;
				case "piece5":
					  nbP5=nbP5+1;
					  break;
				case "piece6":
					  nbP6=nbP6+1;
					  break;
				case "piece7":
					  nbP7=nbP7+1;
					  break;
				case "piece8":
					  nbP8=nbP8+1;
					  break;
				case "piece9":
					  nbP9=nbP9+1;
					  break;
				case "piece10":
					  nbP10=nbP10+1;
					  break;
				case "piece11":
					  nbP11=nbP11+1;
					  break;
				case "piece12":
					  nbP12=nbP12+1;
					  break;
					  
				default: System.out.println("ENTREZ UN VRAI PENTAMINAL");
					
				}
				
				
			}
			
			break;
		}
	}

}
