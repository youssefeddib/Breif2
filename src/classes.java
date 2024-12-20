import java.util.ArrayList;
import java.util.List;

class Classe {
    private String nom;
    private Formateur formateurPrincipal;
    private List<Apprenant> apprenants;

    public Classe(String nom, Formateur formateurPrincipal) {
        this.nom = nom;
        this.formateurPrincipal = formateurPrincipal;
        this.apprenants = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setFormateurPrincipal(Formateur formateurPrincipal) {
        this.formateurPrincipal = formateurPrincipal;
    }

    public void ajouterApprenant(Apprenant apprenant) {
        apprenants.add(apprenant);
    }

    public void supprimerApprenant(Apprenant apprenant) {
        apprenants.remove(apprenant);
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Classe: " + nom + "\nFormateur Principal: " + formateurPrincipal + "\nApprenants:\n");
        for (Apprenant apprenant : apprenants) {
            details.append(apprenant).append("\n");
        }
        return details.toString();
    }
}