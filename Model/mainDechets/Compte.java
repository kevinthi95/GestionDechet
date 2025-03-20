package mainDechets;

import java.util.*;

/**
 * 
 */
public class Compte {

    /**
     * Default constructor
     */
    public Compte() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String motDePasse;

    /**
     * 
     */
    private HistoriqueDepot historiqueDepot;

    /**
     * 
     */
    private int pointsFidelite;

    /**
     * @param email 
     * @param mdp 
     * @return
     */
    public boolean seConnecter(String email, String mdp) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public HistoriqueDepot consulterHistoriqueDepots() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int consulterPoints() {
        // TODO implement here
        return 0;
    }

    /**
     * @param bon 
     * @return
     */
    public boolean echangerPoints(bonReduction bon) {
        // TODO implement here
        return false;
    }

    /**
     * @param poubelle 
     * @param dechet 
     * @return
     */
    public boolean deposerDechets(Poubelle poubelle, Dechet dechet) {
        // TODO implement here
        return false;
    }

}