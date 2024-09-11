package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    @Test
    public void testAjouterTexte() {
        Document banane = new Document();
        banane.ajouter("Bonjour");
        assertEquals(banane.getTexte(),"Bonjour");
    }

    @Test
    public void testSupprimerTexte() {
        Document banane = new Document();
        banane.ajouter("Bonjour");
        banane.effacer(0,3);
        assertEquals(banane.getTexte(),"jour");
    }

    @Test
    public void testModifierTexte() {
        Document banane = new Document();
        banane.ajouter("Bonjour");
        banane.remplacer(0,3,"mauvais ");
        assertEquals(banane.getTexte(),"mauvais jour");
    }
}
