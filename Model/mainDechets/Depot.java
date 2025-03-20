package mainDechets;

import java.util.*;

/**
 * 
 */
public class Depot {

    /**
     * Default constructor
     */
    public Depot() {
    }

    /**
     * 
     */
    private TypeDechet type;

    /**
     * 
     */
    private float quantite;

    /**
     * 
     */
    private Date dateDepot;

    /**
     * 
     */
    private int PointsAttribues;

    /**
     * 
     */
    public void GetDateDepot() {
        // TODO implement here
    }
    /**
     * 
     */
    public void EnregistrerDepot() {
        // TODO implement here
    }

	/**
	 * @return the type
	 */
	public TypeDechet getTypeDechet() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setTypeDechet(TypeDechet type) {
		this.type = type;
	}

	/**
	 * @return the quantiteDechet
	 */
	public float getQuantiteDechet() {
		return quantite;
	}

	/**
	 * @param quantite the quantiteDechet to set
	 */
	public void setQuantiteDechet(float quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the dateDepot
	 */
	public Date getDateDepot() {
		return dateDepot;
	}

	/**
	 * @param dateDepot the dateDepot to set
	 */
	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	/**
	 * @return the pointsAttribues
	 */
	public int getPointsAttribues() {
		return PointsAttribues;
	}

	/**
	 * @param pointsAttribues the pointsAttribues to set
	 */
	public void setPointsAttribues(int pointsAttribues) {
		PointsAttribues = pointsAttribues;
	}

}