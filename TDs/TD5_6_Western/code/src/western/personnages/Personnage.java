package western.personnages;

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
    }

    public String sePresenter(){
        return ;
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
}
