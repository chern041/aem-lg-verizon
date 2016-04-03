package com.brandexperience.cq.model;

public class PrimaryProduct {

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getAccessoriesDescription() {
        return accessoriesDescription;
    }

    public void setAccessoriesDescription(String accessoriesDescription) {
        this.accessoriesDescription = accessoriesDescription;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getLogoProduct() {
        return logoProduct;
    }

    public void setLogoProduct(String logoProduct) {
        this.logoProduct = logoProduct;
    }

    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    private String positionDescription;
    private String offerDescription;
    private String accessoriesDescription;
    private String imagePath;
    private String logoProduct;
}
