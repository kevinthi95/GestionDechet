package mainDechets;

import java.util.*;

/**
 * 
 */
public class Poubelle {

    /**
     * Default constructor
     */
    public Poubelle() {
    }

    /**
     * 
     */
    private String idPoubelle;

    /**
     * 
     */
    private float capaciteMax;

    /**
     * 
     */
    private float capaciteActuelle;

    /**
     * 
     */
    private String emplacement;

    /**
     * 
     */
    private Couleur couleur;

    /**
     * 
     */
    private boolean estPleine;

    /**
     * @param utilisateur  
     * @return
     */
    public boolean identifierUtilisateur(Compte utilisateur ) {
        // TODO implement here
        return false;
    }

    /**
     * @param typeDechet  
     * @return
     */
    public float calculerQuantiteDechets(TypeDechet typeDechet ) {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param dechet  
     * @return
     */
    public boolean verifierConformiteDechet(Dechet dechet ) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public void envoyerNotification() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean estPleine() {
        // TODO implement here
        return false;
    }

}