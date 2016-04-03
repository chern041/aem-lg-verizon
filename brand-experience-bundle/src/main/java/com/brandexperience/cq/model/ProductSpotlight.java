package com.brandexperience.cq.model;

public class ProductSpotlight {

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getBlackButton() {
        return blackButton;
    }

    public void setBlackButton(String blackButton) {
        this.blackButton = blackButton;
    }

    public String getPathButton() {
        return pathButton;
    }

    public void setPathButton(String pathButton) {
        this.pathButton = pathButton;
    }

    public String getBackgroundImagePath() {
        return backgroundImagePath;
    }

    public void setBackgroundImagePath(String backgroundImagePath) {
        this.backgroundImagePath = backgroundImagePath;
    }

    private String productName;
    private String productDescription;
    private String blackButton;
    private String pathButton;
    private String backgroundImagePath;
}
