package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.SecondaryProduct;
import com.brandexperience.cq.service.SecondaryProductJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component (metatype = false, name = "brand-experience SecondaryProduct JCR Service")
public class SecondaryProductJcrServiceImpl implements SecondaryProductJcrService{

    @Override
    public SecondaryProduct getSecondaryProduct (final Node secondaryProductNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final SecondaryProduct secondaryProduct = new SecondaryProduct();
        final String title = "title";
        final String imagePaths = "imagePaths";

        if(secondaryProductNode != null){
            secondaryProduct.setTitle(BrandExperienceUtils.getProperty(secondaryProductNode,title));
            secondaryProduct.setImagePaths(BrandExperienceUtils.getProperty(secondaryProductNode,imagePaths));
        }
        return secondaryProduct;
    }
}