package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.SmallProductSet;
import com.brandexperience.cq.service.SmallProductSetComponentService;
import com.brandexperience.cq.service.SmallProductSetJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component(metatype = false, name="brand-experience SmallProductSet Component Service")

public class SmallProductSetComponentServiceImpl implements SmallProductSetComponentService{

    @Reference
    private SmallProductSetJcrService jcrService;

    @Override
    public SmallProductSet getSmallProductSet(final PageContext pageContext) throws RepositoryException {
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getSmallProductSet(context.getCurrentNode(), context.getResourceResolver());
    }
}
