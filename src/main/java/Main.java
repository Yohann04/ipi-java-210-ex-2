import java.util.Scanner;

public class Main {
    public static final short MAX_PTS_VIE = 100;
    public static final short PTS_BOUCLIER = 25;
    public static final short MAX_ATTAQUE_ENNEMI =5;
    public static final short MAX_VIE_ENNEMI = 30;
    public static final short MAX_ATTAQUE_JOUEUR = 5;
    public static final short REGENARATION_BOUCLIER_PAR_TOUR = 10;

    public static String nomPersonnage;
    public static short ptsDeVie;
    public static short ptsBouclier;
    public static short nbEnnemisTues;
    public static boolean bouclierActif = true;

    public static void main(String[] args) {
        initPersonnage();
    }

    public static void initPersonnage(){
        //Afficher le message de saisi
        System.out.println("Saisir le nom de votre personnage");
        //Lire la saisie utilisateur dans ma variable nomPersonnage
         Scanner scanner = new Scanner(System.in);
         nomPersonnage = scanner.nextLine();
         //Afficher le message cest partit !
        System.out.println("OK " + Util.color(nomPersonnage, Color.GREEN) + " !" + " C'est parti !");
        //Affecter la variable ptsDeVie
        ptsDeVie = MAX_PTS_VIE;
        //Affecter la variable ptsBouclier
        ptsBouclier = PTS_BOUCLIER;
        scanner.close();
    }


}