package Pantominos;

import java.lang.* ;
import java.io.*;



// Classe 'Terminal' --> pour faciliter les opérations de saisies à 
// partir de l'entrée  standard. 
class Terminal {
    
    private static BufferedReader dis;
    
    
    /* Entrées -------------------------------------------- */
    public static int lireEntier() {
        int Retour;
        try { 
            Retour = (new Integer(dis.readLine())).intValue();
        }
        catch (Exception e) {
            System.out.println("Entrée d'entier incorrecte !");
            Retour = 0;
        }
        return Retour;
    }
    
    public static float lireReel() {
        float Retour;
        try { 
            Retour = (new Float(dis.readLine())).floatValue();
        }
        catch (Exception e) {
            System.out.println("Entrée de réel incorrecte !");
            Retour = 0;
        }
        return Retour;
    }
    
    
    public static char lireCar() {
        char Retour;
        try { // caractère <=> 1er caractère de la chaîne lue... 
            Retour = (dis.readLine()).charAt(0);
        }
        catch (Exception e) {
            System.out.println("Entrée de caractère incorrecte !");
            Retour = 0;
        }
        return Retour;
    }
    
    public static String lireChaine() {
        String Retour;
        try { 
            Retour = dis.readLine();
        }
        catch (Exception e) {
            System.out.println("Entrée de chaîne incorrecte !");
            Retour = null;
        }
        return Retour;
    }
    
    /* Sorties -------------------------------------------- */
    public static void efface () {
        System.out.println("\u001b[2J"); 
    }
    
    // sortie formatée d'un entier 'i' avec 'n' caractères 
    public static void ecrireEntierF(int i, int n) {
        String S = String.valueOf(i);
        int nbsp = n - S.length(); // nombre d'espaces à ajouter
        if (nbsp>0) for (int k=0; k<nbsp; k++) System.out.print(' '); 
        System.out.print(i);
    }


    static {
        try {
            dis = new BufferedReader(new InputStreamReader(System.in));
        } 
        catch (Exception e) {
            System.out.println("Erreur d'ouverture du terminal");
        }
    }


}







