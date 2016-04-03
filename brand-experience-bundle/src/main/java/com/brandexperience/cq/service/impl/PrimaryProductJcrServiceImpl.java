package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.PrimaryProduct;
import com.brandexperience.cq.service.PrimaryProductJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component (metatype = false, name = "brand-experience PrimaryProduct JCR Service")
public class PrimaryProductJcrServiceImpl implements PrimaryProductJcrService {

    @Override
    public PrimaryProduct getPrimaryProduct (final Node primaryProductNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final PrimaryProduct primaryProduct = new PrimaryProduct();
        final String offerDescription = "offerDescription";
        final String accessoriesDescription = "accessoriesDescription";
        final String logoProduct = "logoProduct";
        final String imagePath = "imagePath";
        final String positionDescription = "positionDescription";

        if(primaryProductNode != null){
            primaryProduct.setOfferDescription(BrandExperienceUtils.getProperty(primaryProductNode, offerDescription));
            primaryProduct.setAccessoriesDescription(BrandExperienceUtils.getProperty(primaryProductNode, accessoriesDescription));
            primaryProduct.setLogoProduct(BrandExperienceUtils.getProperty(primaryProductNode,logoProduct));
            primaryProduct.setImagePath(BrandExperienceUtils.getProperty(primaryProductNode, imagePath));
            primaryProduct.setPositionDescription(BrandExperienceUtils.getProperty(primaryProductNode, positionDescription));
        }
        return primaryProduct;
    }
}