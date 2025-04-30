package western.personnages;

import western.grammaire.Feminin;
import western.grammaire.Masculin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import western.grammaire.Substantif;

public class PersonnagesTest
{
    @Test
    void presentationBrigand()
    {
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 100$ ! Je suis libre.", dalton.sePresenter());
    }

    @Test
    void presentationDame()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis libre." , scarlett.sePresenter());
    }

    @Test
    void presentationBrigandKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ ! Je suis libre et en bonne compagnie avec Miss Scarlett.",
                dalton.sePresenter());
    }

    @Test
    void presentationDameKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis captive de cette brute de Dalton le méchant.",
                scarlett.sePresenter());
    }

    @Test
    void presentationDameLiberation()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis libre grace à Luke.",
                scarlett.sePresenter());
    }

    @Test
    void presentationBrigandCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ ! Je suis le prisonnier de Luke.",
                dalton.sePresenter());
    }

    @Test
    void presentationCowboyCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Luke - Bonjour, je suis Luke et j'aime la bière. J’ai déjà empoché 150$ en capturant Dalton le méchant.",
                luke.sePresenter());
    }
}
