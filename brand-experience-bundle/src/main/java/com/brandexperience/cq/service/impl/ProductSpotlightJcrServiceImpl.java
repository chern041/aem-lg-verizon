package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.ProductSpotlight;
import com.brandexperience.cq.service.ProductSpotlightJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
@Service
@Component(metatype = false, name = "brand-experience ProductSpotlight JCR Service")
public class ProductSpotlightJcrServiceImpl implements ProductSpotlightJcrService{

    @Override
    public ProductSpotlight getProductSpotlight(final Node productSpotlightNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final ProductSpotlight productSpotlight = new ProductSpotlight();
        final String productName = "productName";
        final String productDescription = "bannerDescription";
        final String blackButton = "blackButton";
        final String pathButton = "pathButton";
        final String backgroundImagePath = "backgroundImagePath";

        if (productSpotlightNode != null){
            productSpotlight.setProductName(BrandExperienceUtils.getProperty(productSpotlightNode, productName));
            productSpotlight.setProductDescription(BrandExperienceUtils.getProperty(productSpotlightNode, productDescription));
            productSpotlight.setBlackButton(BrandExperienceUtils.getProperty(productSpotlightNode, blackButton));
            productSpotlight.setPathButton(BrandExperienceUtils.getProperty(productSpotlightNode, pathButton));
            productSpotlight.setBackgroundImagePath(BrandExperienceUtils.getProperty(productSpotlightNode, backgroundImagePath));
        }
        return productSpotlight;
    }
}