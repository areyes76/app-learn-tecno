/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.app.beneficio.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author areyesgaray
 */
@Document
public class Benefit {
    
    private String id;   
    private int idComerce;
    private String commerce;
    private int idCategory;
    private String category;
    private String description;
    private int discount;
    private String start_date;
    private String end_date;
    private String review;
    private String title;
    private String logo;
    private String twitter;
    private String facebook;
    private String url;
    private String[] address;
    @Field("lobby")
    private Lobby lobby;

    
    public Benefit() {
    }
    
    
    public Benefit(String id) {
        this.id = id;
    }  
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
	 * @return the idComerce
	 */
	public int getIdComerce() {
		return idComerce;
	}

	/**
	 * @param idComerce the idComerce to set
	 */
	public void setIdComerce(int idComerce) {
		this.idComerce = idComerce;
	}

	/**
	 * @return the commerce
	 */
	public String getCommerce() {
		return commerce;
	}

	/**
	 * @param commerce the commerce to set
	 */
	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}

	/**
	 * @return the idCategory
	 */
	public int getIdCategory() {
		return idCategory;
	}

	/**
	 * @param idCategory the idCategory to set
	 */
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }   

    /**
	 * @return the address
	 */
	public String[] getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String[] address) {
		this.address = address;
	}

	public Lobby getLobby() {
        return lobby;
    }

    public void setLobby(Lobby lobby) {
        this.lobby = lobby;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beneficio [id=" + id + ", idComerce=" + idComerce + ", commerce=" + commerce + ", idCategory="
				+ idCategory + ", category=" + category + ", description=" + description + ", discount=" + discount
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", review=" + review + ", title=" + title
				+ ", logo=" + logo + ", twitter=" + twitter + ", facebook=" + facebook + ", url=" + url + ", address="
				+ Arrays.toString(address) + ", lobby=" + lobby + "]";
	}

   
    
}
