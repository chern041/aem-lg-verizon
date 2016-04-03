package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.SliderTab;
import com.brandexperience.cq.service.SliderTabComponentService;
import com.brandexperience.cq.service.SliderTabJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component(metatype = false, name="brand-experience SliderTab Component Service")
public class SliderTabComponentServiceImpl implements SliderTabComponentService{

    @Reference
    private SliderTabJcrService jcrService;

    @Override
    public SliderTab getSliderTab(final PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getSliderTab(context.getCurrentNode(), context.getResourceResolver());
    }
}