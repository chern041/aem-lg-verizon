package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.SmallProductSet;
import com.brandexperience.cq.service.SmallProductSetJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component(metatype = false, name = "brand-experience SmallProductSet JCR Service")
public class SmallProductSetJcrServiceImpl implements SmallProductSetJcrService{

    @Override
    public SmallProductSet getSmallProductSet(final Node smallProductSetNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final SmallProductSet smallProductSet = new SmallProductSet();
        final String numberOfProducts = "numberOfProducts";

        if(smallProductSetNode !=null){
            smallProductSet.setNumberOfProducts(BrandExperienceUtils.getProperty(smallProductSetNode, numberOfProducts));
        }
        return smallProductSet;
    }
}