package mainDechets;

import java.util.*;

/**
 * 
 */
public class CategorieProduit {

    /**
     * Default constructor
     */
    public CategorieProduit() {
    }

    /**
     * 
     */
    private void idCategorie;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int pointsNecessaires;

    /**
     * 
     */
    private float tauxReduction;

    /**
     * 
     */
    private List<Produit> produits;

    /**
     * @param points 
     * @return
     */
    public boolean verifierReduction(int points) {
        // TODO implement here
        return false;
    }

    /**
     * @param prix 
     * @param points 
     * @return
     */
    public float appliquerReduction(float prix, int points) {
        // TODO implement here
        return 0.0f;
    }

}