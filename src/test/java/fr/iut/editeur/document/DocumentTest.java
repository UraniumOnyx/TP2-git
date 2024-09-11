package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DocumentTest {

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
