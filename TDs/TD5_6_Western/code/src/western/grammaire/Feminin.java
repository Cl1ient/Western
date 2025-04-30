package western.grammaire;

public class Feminin implements Genre{

    private String nom;

    public String getArticleDefini(){return "la" ;}

    public String getArticleIndefini(){
        return "une";
    }

    public String getArticlePartitif(){
        return "de la";
    }

    public String getArticleDe(){
        return "de";
    }





}
