package western.grammaire;

public class Masculin implements Genre{


    public String getArticleDefini(){
        return "le" ;
    }

    public String getArticleIndefini(){
        return "un" ;
    }

    public String getArticlePartitif(){
        return "du" ;
    }

    public String getArticleDe(){
        return "de" ;
    }
}
