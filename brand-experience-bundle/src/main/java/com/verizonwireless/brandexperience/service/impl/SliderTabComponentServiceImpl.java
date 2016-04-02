package com.verizonwireless.brandexperience.service.impl;

import com.verizonwireless.brandexperience.model.AEMComponentContext;
import com.verizonwireless.brandexperience.model.SliderTab;
import com.verizonwireless.brandexperience.service.SliderTabComponentService;
import com.verizonwireless.brandexperience.service.SliderTabJcrService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;


@Service
@Component(metatype = false, name = "brand-experience SliderTab Component Service")
public class SliderTabComponentServiceImpl implements SliderTabComponentService{

    @Reference
    private SliderTabJcrService jcrService;

    @Override
    public SliderTab getSliderTab(final PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getSliderTab(context.getCurrentNode(), context.getResourceResolver());
    }
}
