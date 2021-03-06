package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.ProductSpotlight;
import com.brandexperience.cq.service.ProductSpotlightComponentService;
import com.brandexperience.cq.service.ProductSpotlightJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component(metatype = false, name="brand-experience ProductSpotlight Component Service")
public class ProductSpotlightComponentServiceImpl implements  ProductSpotlightComponentService {

    @Reference
    private  ProductSpotlightJcrService jcrService;

    @Override
    public  ProductSpotlight getProductSpotlight(final  PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getProductSpotlight(context.getCurrentNode(), context.getResourceResolver());
    }
}