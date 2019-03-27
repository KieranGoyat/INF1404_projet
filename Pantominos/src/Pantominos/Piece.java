package Pantominos;

public class Piece {
	
	private final static int[][] forme1 = new int[][]{
		{1,1,1,1,1},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme2 = new int[][]{
		{0,1,0,0,0},
		{1,1,1,0,0},
		{1,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme3 = new int[][]{
		{1,1,1,1,0},
		{1,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme4 = new int[][]{
		{1,1,1,0,0},
		{1,1,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme5 = new int[][]{
		{1,0,0,0,0},
		{1,1,0,0,0},
		{0,1,0,0,0},
		{0,1,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme6 = new int[][]{
		{1,1,1,0,0},
		{0,1,0,0,0},
		{0,1,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme7 = new int[][]{
		{1,1,1,0,0},
		{1,0,1,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme8 = new int[][]{
		{1,1,1,0,0},
		{1,0,0,0,0},
		{1,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme9 = new int[][]{
		{1,1,0,0,0},
		{0,1,1,0,0},
		{0,0,1,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme10 = new int[][]{
		{0,1,0,0,0},
		{1,1,1,0,0},
		{0,1,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme11 = new int[][]{
		{1,1,1,1,0},
		{0,1,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
	
	private final static int[][] forme12 = new int[][]{
		{1,0,0,0,0},
		{1,1,1,0,0},
		{0,0,1,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
	};
  
	private int forme[][];
	private boolean isInversible;
	public int numPiece;
	
	public Piece(int forme, int num){
		
		this.numPiece = num;
		
		switch(forme){
		
			case 1: this.forme = forme1;
				this.isInversible = false;
				break;
				
			case 2: this.forme = forme2;
				this.isInversible = true;
				break;
			
			case 3: this.forme = forme3;
				this.isInversible = true;
				break;
			
			case 4: this.forme = forme4;
				this.isInversible = true;
				break;
			
			case 5: this.forme = forme5;
				this.isInversible = true;
				break;
			
			case 6: this.forme = forme6;
				this.isInversible = false;
				break;
			
			case 7: this.forme = forme7;
				this.isInversible = false;
				break;
			
			case 8: this.forme = forme8;
				this.isInversible = false;
				break;
			
			case 9: this.forme = forme9;
				this.isInversible = false;
				break;
			
			case 10: this.forme = forme10;
				this.isInversible = false;
				break;
			
			case 11: this.forme = forme11;
				this.isInversible = true;
				break;
			
			case 12: this.forme = forme12;
				this.isInversible = true;
				break;
		
			default : this.forme = forme1;
				this.isInversible = false;
				break;		
		
		}
		
	}
	
	public int[][] getForme(){
		return this.forme;
	}
	
	public void inverser(){
		if(this.isInversible){
			
			int [][] newForme = new int[5][5];
		
			for(int i = 0; i < 5; i++){
				newForme[i] = this.forme[4-i];
			}
			
			boolean isZero = true;
			do{
				
				for(int j = 0; j < 5; j++){
					if(newForme[0][j] != 0){isZero = false;}
				}
				
				if(isZero){
					int oldForme[][] = newForme;
					for(int i = 0; i < 4; i++){
						newForme[i] = oldForme[i+1];
					}
					
					newForme[4] = new int[]{0,0,0,0,0};
					
				} 
			} while(isZero);
			
			this.forme = newForme;
		}

	}
	
	public void tourner(){
		int[][] newForme = new int[5][5];
		int[][] newForme2 = new int[5][5];
		
		for(int i = 0; i < 5; i++){
			newForme[i] = this.forme[4-i];
		}
	
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				newForme2[i][j] = newForme[j][i];
			}
		}
		
		boolean isZero = true;
		do{
			
			for(int j = 0; j < 5; j++){
				if(newForme2[j][0] != 0){isZero = false;}
			}
			
			if(isZero){
				
				int oldForme[][] = newForme2;
				for(int i = 0; i < 5; i++){
					for(int j = 0; j < 4; j++){
						newForme2[i][j] = oldForme[i][j+1];
					}
					newForme2[i][4] = 0;
				}

			} 

		} while(isZero);
		
		
		
		this.forme = newForme2;

	}

	public boolean isInversible(){
		return this.isInversible;
	}
	
	
	public void afficher(){
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(" " + this.forme[i][j]);
			}
			System.out.println("");
			
		}
		System.out.println("");
	}
				

}
