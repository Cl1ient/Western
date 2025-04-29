//  @ Project : Western
//  @ File Name : Histoire1.java
//  @ Date : 02/02/2010
//  @ Author : P. Divoux
//  @ Date : 31/12/2021
//  @ Author : R. Schneider
//
//


import western.Narrateur;
import western.grammaire.Feminin;
import western.grammaire.Masculin;
import western.grammaire.Substantif;
import western.personnages.Personnage;

public class Histoire1
{
    public static void main(String[] args)
    {
        Personnage max = new Personnage("Max");
        Personnage kid = new Personnage("The Kid", new Substantif("thé à la menthe", new Masculin()));
        Personnage bill = new Personnage("Bill", new Substantif("whisky", new Masculin()));
        Narrateur homere = new Narrateur();

        homere.ajouterLignes(max.sePresenter());
        homere.ajouterLignes(max.boire());
        homere.ajouterLignes(max.dire("Bon, au boulot, maintenant !"));

        homere.ajouterLignes(kid.sePresenter());
        homere.ajouterLignes(kid.boire());

        homere.ajouterLignes(bill.sePresenter());
        homere.ajouterLignes(bill.boire(new Substantif("eau", new Feminin())));

        homere.raconterHistoire();
    }
}
