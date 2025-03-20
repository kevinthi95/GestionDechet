
import java.util.*;

/**
 * 
 */
public class CentreDeTri {

    /**
     * Default constructor
     */
    public CentreDeTri() {
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String adresse;

    /**
     * 
     */
    private List<Contrat> partenariats;

    /**
     * 
     */
    private Statistique statistique;

    /**
     * @param p 
     * @param emplacement 
     * @return
     */
    public boolean placerPoubelle(Poubelle p, String emplacement) {
        // TODO implement here
        return false;
    }

    /**
     * @param idPoubelle 
     * @return
     */
    public boolean retirerPoubelle(String idPoubelle) {
        // TODO implement here
        return false;
    }

    /**
     * @param idPoubelle 
     * @return
     */
    public boolean collecterDechets(String idPoubelle) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public Statistique genererStatistiques() {
        // TODO implement here
        return null;
    }

    /**
     * @param poubelle 
     * @return
     */
    public void notifierPoubellePleine(Poubelle poubelle) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Contrat> listerContrat() {
        // TODO implement here
        return null;
    }

}