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
private static void gererApprenants(Scanner scanner) {
    System.out.println("\nGestion des Apprenants");
    System.out.println("1. Ajouter un apprenant");
    System.out.println("2. Afficher les apprenants");
    System.out.println("3. Retour");
    System.out.print("\nVotre choix : ");
    int choix = scanner.nextInt();
    scanner.nextLine();  // Consommer le retour à la ligne

    switch (choix) {
        case 1:
            System.out.print("Entrez le nom de l'apprenant: ");
            String nom = scanner.nextLine();
            System.out.print("Entrez le prénom de l'apprenant: ");
            String prenom = scanner.nextLine();
            apprenants.add(new Apprenant(nom, prenom));
            System.out.println("Apprenant ajouté avec succès.");
            break;
        case 2:
            System.out.println("Liste des apprenants:");
            for (Apprenant apprenant : apprenants) {
                System.out.println(apprenant);
            }
            break;
        case 3:
            return;
        default:
            System.out.println("Choix invalide.");
    }
}