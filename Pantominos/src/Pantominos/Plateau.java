package Pantominos;

public class Plateau {
	
	int [] [] plateau;
	private final int longueur;
	private final int largeur;
	
	
	void CreationPlat (int longueur, int largeur){
		for (int i=0;i<longueur;i++){
			for (int j=0; j < largeur; j++){
				
				if (i<5 || i>longueur-5 || j<5|| j>largeur-5 ){
					plateau[i][j]=-1;
				}
					
				else{
				plateau[i][j]=0;
			    }
		    }	
		}	
	}
	
	boolean Ajouter (int n,int x,int y, int piece[][]){
	 for (int i=0;i<5;i++){
		 for (int j=0;j<5;j++){
			 if (piece[i][j]==1 && plateau [x+i][y+j]!=0){
				 return false;
			 } else{
		         if (piece [i][j]==1 && plateau [x+i][y+j]==0){
		        	 plateau [x+i][y+j]=n;
		         }
			 }
		 }
	 }
	 
	 for (int i=0;i<5;i++){
		 for (int j=0;j<5;j++){
			 if (plateau [i][j]==0 && plateau [i+1][j]==1 && plateau [i][j+1]==1){
				 return false;
			 } 
		 }
	}		
	return true;
	
		
		
		
		
	}
	
	Plateau(int longueur, int largeur){
		this.longueur = longueur+5;
		this.largeur = largeur+5;
		this.plateau = new int [this.longueur] [this.largeur];
		CreationPlat(this.longueur, this.largeur);
	}
	

}
