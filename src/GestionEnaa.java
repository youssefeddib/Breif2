import java.util.ArrayList;
import java.util.Scanner;


public class GestionEnaa {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;


        do {
            System.out.println("\n MENU PRINCIPAL - Gestion du Centre ENAA ");
            System.out.println("1. Gérer les apprenants");
            System.out.println("2. Gérer les formateurs");
            System.out.println("3. Gérer les classes");
            System.out.println("4. Associer apprenants et formateurs aux classes");
            System.out.println("5. Quitter l'application");
            System.out.print("\nEntrez votre choix : ");


            choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    gererApprenants();
                    break;
                case 2:
                    gererFormateurs();
                    break;
                case 3:
                    gererClasses();
                    break;
                case 4:
                    associerApprenantsFormateurs();
                    break;
                case 5:
                    System.out.println("\nMerci d'avoir utilisé l'application. Au revoir !");
                    break;
                default:
                    System.out.println("\nChoix invalide. Veuillez réessayer.");
            }
        } while (choix != 5);

        scanner.close();
    }


    private static void gererApprenants() {
        System.out.println("\n Gestion des Apprenants ");


    }

    private static void gererFormateurs() {
        System.out.println("\n Gestion des Formateurs ");

    }

    private static void gererClasses() {
        System.out.println("\n Gestion des Classes ");

    }

    private static void associerApprenantsFormateurs() {
        System.out.println("\n Association");


    }
}