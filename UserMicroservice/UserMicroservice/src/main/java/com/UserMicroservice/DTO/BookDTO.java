package com.UserMicroservice.DTO;

public class BookDTO {

	private Long id;
    private String title;
    private String category;
    private Integer price;
    private String quality;
    private Long sellerId;
    private String language;
    
//    @Lob
//    private byte[] coverImage;

    // Default Constructor
    public BookDTO() {
    }

    // Parameterized Constructor
    public BookDTO(Long id, String title, String category, Integer price, String quality, Long sellerId, String language) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
        this.quality = quality;
        this.sellerId = sellerId;
        this.language = language;
    }

    // Parameterized Constructor (Without ID)
    public BookDTO(String title, String category, Integer price, String quality, Long sellerId, String language) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.quality = quality;
        this.sellerId = sellerId;
        this.language = language;
    }

    // Getters and Setters
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

//    public byte[] getCoverImage() {
//        return coverImage;
//    }
//
//    public void setCoverImage(byte[] coverImage) {
//        this.coverImage = coverImage;
//    }
	
}
