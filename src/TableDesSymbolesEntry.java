class TableDesSymbolesEntry {
    private String nom;
    private Object valeur;

    public TableDesSymbolesEntry(String nom, Object valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public Object getValeur() {
        return valeur;
    }
}