package com.BookMicroservice.Entity;

import java.io.Serializable;

import jakarta.persistence.*;


@Entity
@Table(name = "Books")
public class Books implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;	

    private String title;

    private String category;

    private int price;

    private String quality;

    private long sellerId;

    private String language;
    
    
    

	public Books() {
		super();
	}

	public Books(String title, String category, Integer price, String quality, Long sellerId, String language) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
		this.quality = quality;
		this.sellerId = sellerId;
		this.language = language;
	}

	public Books(Long id, String title, String category, Integer price, String quality, Long sellerId,
			String language) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.price = price;
		this.quality = quality;
		this.sellerId = sellerId;
		this.language = language;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCondition() {
		return quality;
	}

	public void setCondition(String quality) {
		this.quality = quality;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
    
    
    
    
    
    
//    @Lob
//    private byte[] coverImage;
    
   
//    public byte[] getCoverImage() {
//        return coverImage;
//    }
//
//    public void setCoverImage(byte[] coverImage) {
//        this.coverImage = coverImage;
//    }
}

