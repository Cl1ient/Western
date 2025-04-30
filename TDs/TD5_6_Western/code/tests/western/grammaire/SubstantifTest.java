package western.grammaire;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class SubstantifTest
{
    @Test
    void masculinDefini()
    {
        Substantif whisky= new Substantif("whisky", new Masculin());
        Assertions.assertEquals("le whisky", whisky.avecArticleDefini());
    }

    @Test
    void masculinIndefini()
    {
        Substantif whisky= new Substantif("whisky", new Masculin());
        Assertions.assertEquals("un whisky", whisky.avecArticleIndefini());
    }

    @Test
    void masculinPartitif()
    {
        Substantif whisky= new Substantif("whisky", new Masculin());
        Assertions.assertEquals("du whisky", whisky.avecArticlePartitif());
    }

    @Test
    void femininDefini()
    {
        Substantif vodka= new Substantif("vodka", new Feminin());
        Assertions.assertEquals("la vodka", vodka.avecArticleDefini());
    }

    @Test
    void femininIndefini()
    {
        Substantif vodka= new Substantif("vodka", new Feminin());
        Assertions.assertEquals("une vodka", vodka.avecArticleIndefini());
    }

    @Test
    void femininPartitif()
    {
        Substantif vodka= new Substantif("vodka", new Feminin());
        Assertions.assertEquals("de la vodka", vodka.avecArticlePartitif());
    }

    @Test
    void elisionDefini()
    {
        Substantif eau= new Substantif("eau", new Feminin());
        Assertions.assertEquals("l'eau", eau.avecArticleDefini());
    }

    @Test
    void elisionIndefini()
    {
        Substantif eau= new Substantif("eau", new Feminin());
        Assertions.assertEquals("une eau", eau.avecArticleIndefini());
    }

    @Test
    void elisionPartitif()
    {
        Substantif eau= new Substantif("eau", new Feminin());
        Assertions.assertEquals("de l'eau", eau.avecArticlePartitif());
    }

}
