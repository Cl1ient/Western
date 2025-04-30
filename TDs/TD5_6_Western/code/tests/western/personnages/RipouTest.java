package western.personnages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import western.grammaire.Feminin;
import western.grammaire.Masculin;
import western.grammaire.Substantif;

import static org.junit.jupiter.api.Assertions.*;

class RipouTest {
    @Test
    void presentationLibre()
    {
        Dame scarlett = new Dame("Scarlett");
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Ripou luke = new Ripou("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Luke - Bonjour, je suis Luke et j'aime la bière. J’ai déjà empoché 150$ en capturant Dalton le méchant.",
                luke.sePresenter());
    }

    @Test
    void presentationDameKinapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Ripou dalton = new Ripou("Dalton", new Substantif("whisky", new Masculin()));
        dalton.kidnapper(scarlett);
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis captive de cette brute de Dalton le méchant.",
                scarlett.sePresenter());
    }

    @Test
    void presentationDameLiberation()
    {
        Dame scarlett = new Dame("Scarlett");
        Ripou dalton = new Ripou("Dalton", new Substantif("whisky", new Masculin()));
        Ripou luke = new Ripou("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Scarlett - Bonjour, je suis Miss Scarlett et j'aime l'eau. Je suis captive de cette brute de Luke le méchant.",
                scarlett.sePresenter());
    }

    @Test
    void presentationBrigandCapture()
    {
        Dame scarlett = new Dame("Scarlett");
        Ripou dalton = new Ripou("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        luke.capturer(dalton);
        Assertions.assertEquals("Dalton - Bonjour, je suis Dalton le méchant et j'aime le whisky. Ma tête est mise à prix 150$ ! Je suis le prisonnier de Luke.",
                dalton.sePresenter());
    }

    @Test
    void test_kidnapping()
    {
        Dame scarlett = new Dame("Scarlett");
        Ripou dalton = new Ripou("Dalton", new Substantif("whisky", new Masculin()));
        Assertions.assertEquals("Scarlett - Hiiii ! Au secours ! Dalton le méchant m'enlève !\nDalton - Ah ah ! Miss Scarlett tu es mienne désormais.",
                dalton.kidnapper(scarlett));
    }

    @Test
    void test_tir()
    {
        Brigand dalton = new Brigand("Dalton", new Substantif("whisky", new Masculin()));
        Ripou luke = new Ripou("Luke", new Substantif("bière", new Feminin()));
        Assertions.assertEquals("Luke - PAN ! PAN ! Prend ça, chacal de Dalton le méchant !\nDalton - Tu n'es qu'un coyote, Luke !",
                luke.tirerSur(dalton));
    }

    @Test
    void test_capture()
    {
        Dame scarlett = new Dame("Scarlett");
        Ripou dalton = new Ripou("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        dalton.kidnapper(scarlett);
        Assertions.assertEquals("Dalton - Damned, je suis fait ! Luke, tu m'as eu ! Tu n'emporteras pas les 150$ au paradis.\nLuke - Voilà Miss Scarlett, tu es libre maintenant !\nScarlett - Merci Luke de m'avoir libérée.",
                luke.capturer(dalton));
    }

    @Test
    void test_captureSansDame()
    {
        Dame scarlett = new Dame("Scarlett");
        Ripou dalton = new Ripou("Dalton", new Substantif("whisky", new Masculin()));
        Cowboy luke = new Cowboy("Luke", new Substantif("bière", new Feminin()));
        Assertions.assertEquals("Dalton - Damned, je suis fait ! Luke, tu m'as eu ! Tu n'emporteras pas les 100$ au paradis.",
                luke.capturer(dalton));
    }
}