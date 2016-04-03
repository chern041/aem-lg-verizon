package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.PrimaryProduct;
import com.brandexperience.cq.service.PrimaryProductComponentService;
import com.brandexperience.cq.service.PrimaryProductJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component(metatype = false, name="brand-experience PrimaryProduct Component Service")
public class PrimaryProductComponentServiceImpl implements  PrimaryProductComponentService {

    @Reference
    private  PrimaryProductJcrService jcrService;

    @Override
    public  PrimaryProduct getPrimaryProduct(final  PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getPrimaryProduct(context.getCurrentNode(), context.getResourceResolver());
    }
}