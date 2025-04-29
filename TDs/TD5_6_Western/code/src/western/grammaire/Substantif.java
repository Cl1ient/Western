package western.grammaire;

public class Substantif {
    public String nom;
    public Genre genre;
    public Substantif(String nom, Genre genre){
        this.nom = nom;
        this.genre = genre;
    }

    public String avecArticleDefini(){
        return genre.getArticleDefini() + " " + nom;
    }

    public String avecArticleIndefini(){
        return genre.getArticleIndefini() + " " + nom;
    }

    public String avecArticlePartitif(){
        return genre.getArticlePartitif() + " " + nom;
    }

    public String avecArticleDe(){
        return genre.getArticleDe() + " " + nom;
    }


}
