package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.SecondaryProduct;
import com.brandexperience.cq.service.SecondaryProductComponentService;
import com.brandexperience.cq.service.SecondaryProductJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component (metatype = false, name="brand-experience SecondaryProduct Component Service")
public class SecondaryProductComponentServiceImpl implements SecondaryProductComponentService{

    @Reference
    private SecondaryProductJcrService jcrService;

    @Override
    public SecondaryProduct getSecondaryProduct(final PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getSecondaryProduct(context.getCurrentNode(), context.getResourceResolver());
    }
}