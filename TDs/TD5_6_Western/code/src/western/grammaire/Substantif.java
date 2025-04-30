package western.grammaire;

import java.util.List;
import java.util.Objects;

public class Substantif {
    public String _nom;
    public Genre _genre;
    private boolean _ellision;


    public Substantif(String nom, Genre genre){
        this._nom = nom;
        this._genre = genre;
        this._ellision = List.of('a','e','i','o','u','y').contains(nom.charAt(0));
    }

    public String avecArticleDefini(){
        return (_ellision ? "l'" : _genre.getArticleDefini() + " ") + _nom;
    }

    public String avecArticleIndefini(){
        return _genre.getArticleIndefini() + " " + _nom;
    }

    public String avecArticlePartitif(){
        return (_ellision ? "de l'" : _genre.getArticlePartitif() + " ") + _nom;
    }

    public String avecArticleDe(){
        return (_ellision ? "l'" : _genre.getArticleDe() + " ") + _nom;

    }

    @Override
    public boolean equals(Object other){
        return(other instanceof  Substantif) && _nom.equals(((Substantif)other)._nom);
    }





}
