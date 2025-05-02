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
        this.substantif = new Substantif("eau", new Feminin()); // test commit class
    }

    public String sePresenter(){
         return dire("Bonjour, je suis " +getPseudo(this)+ " et j'aime " +substantif.avecArticleDefini()+".") ;
    }
    public String sePresenter(Substantif substantif){
        return dire("Bonjour, je suis " +getPseudo(this)+ " et j'aime " +substantif.avecArticleDefini()+".") ;
    }

    public String getNom(Substantif substantif){
        return substantif._nom;
    }

    public String boire(Substantif substantif){
        if(substantif.equals(this.substantif)){
            boire();
        }
        return "a";
    }

    public String boire(){
        return dire("Ah ! boire " +substantif.avecArticlePartitif() + " ! GLOUPS !");
    }

    public String dire(String texte){
        return personne + " - " + texte + "";
    }

    public String getPseudo(Personnage personnage){
        return personne;
    }
}
