import java.util.*;

class Apprenant {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    public Apprenant(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public Apprenant() {

    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + ", Téléphone: " + telephone;

    }

    private void menuApprenants() {
        Scanner scanner = new Scanner(System.in);

        int choix;
        do {
            System.out.println("\n--- Gestion des Apprenants ---");
            System.out.println("1. Ajouter un apprenant");
            System.out.println("2. Associer un apprenant à une classe");
            System.out.println("3. Modifier un apprenant");
            System.out.println("4. Supprimer un apprenant");
            System.out.println("5. Afficher les apprenants");
            System.out.println("0. Retour");
            System.out.print("Votre choix: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterApprenant();
                    break;
                case 2:
                    associerApprenantClasse();
                    break;
                case 3:
                    modifierApprenant();
                    break;
                case 4:
                    supprimerApprenant();
                    break;
                case 5:
                    afficherApprenants();
                    break;
                case 0:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 0);
    }

    private void ajouterApprenant() {

    }
    
}
