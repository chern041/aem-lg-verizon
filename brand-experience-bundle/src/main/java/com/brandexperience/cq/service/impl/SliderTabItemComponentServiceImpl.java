package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.AEMComponentContext;
import com.brandexperience.cq.model.SliderTabItem;
import com.brandexperience.cq.service.SliderTabItemComponentService;
import com.brandexperience.cq.service.SliderTabItemJcrService;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;

@Service
@Component (metatype = false, name="brand-experience SliderTabItem Component Service")

public class SliderTabItemComponentServiceImpl implements SliderTabItemComponentService{

    @Reference
    private SliderTabItemJcrService jcrService;

    @Override
    public SliderTabItem getSliderTabItem(final PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getSliderTabItem(context.getCurrentNode(), context.getResourceResolver());
    }
}
