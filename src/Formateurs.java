class Formateur {
    private int id;
    private String nom;
    private String prenom;
    private String specialite;
    private String email;
    private double salaire;

    public Formateur(int id, String nom, String prenom, String specialite, String email, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.email = email;
        this.salaire = salaire;
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

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Spécialité: " + specialite + ", Email: " + email + ", Salaire: " + salaire;
    }
}