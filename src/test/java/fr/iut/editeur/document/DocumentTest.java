package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    public void testAjouterTexte() {
        Document banane = new Document();
        banane.ajouter("Bonjour");
        assertEquals(banane.getTexte(),"Bonjour");
    }


    public void testSupprimerTexte() {
        Document banane = new Document();
        banane.ajouter("Bonjour");
        banane.effacer(0,3);
        assertEquals(banane.getTexte(),"jour");
    }

    public void testModifierTexte() {
        Document banane = new Document();
        banane.ajouter("Bonjour");
        banane.remplacer(0,3,"mauvais ");
        assertEquals(banane.getTexte(),"mauvais jour");
    }
}
