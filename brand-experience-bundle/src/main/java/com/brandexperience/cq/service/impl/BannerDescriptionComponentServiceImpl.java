package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.BannerDescription;
import com.brandexperience.cq.service.BannerDescriptionComponentService;
import com.brandexperience.cq.service.BannerDescriptionJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component(metatype = false, name="brand-experience BannerDescription Component Service")
public class BannerDescriptionComponentServiceImpl implements BannerDescriptionComponentService {

    @Reference
    private BannerDescriptionJcrService jcrService;

    @Override
    public BannerDescription getBannerDescription(final PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getBannerDescription(context.getCurrentNode(), context.getResourceResolver());
    }
}