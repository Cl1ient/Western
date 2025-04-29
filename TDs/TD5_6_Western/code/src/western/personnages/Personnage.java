package western.personnages;

import western.grammaire.Feminin;
import western.grammaire.Genre;
import western.grammaire.Substantif;

public class Personnage {
    private String personne;
    private Substantif substantif;

    public Personnage(String personne, Substantif substantif){
        this.personne = personne;
        this.substantif = substantif;

    }

    public Personnage(String personne){

        this.personne = personne;
        this.substantif = new Substantif("l'eau", new Genre("Feminin"));
    }

    public String sePresenter(Personnage personnage){

        return getPseudo(this) + "- Bonjour, je suis" +getPseudo(this)+ " et j'aime l'eau." ;
    }

    public String getNom(Substantif substantif){
        return substantif.nom;
    }

    public String boire(Substantif substantif){
        return "Je bois un " + substantif.nom + ".";
    }

    public String boire(){
        return "je bois rien .";
    }

    public String dire(String texte){
       return String.format(texte);
    }

    public String getPseudo(Personnage personnage){
        return personne;
    }
}
