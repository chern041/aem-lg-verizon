package com.verizonwireless.brandexperience.service.impl;

import com.verizonwireless.brandexperience.model.SliderTab;
import com.verizonwireless.brandexperience.service.SliderTabJcrService;
import com.verizonwireless.brandexperience.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ReseourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;


@Service
@Component(metatype = false, name = "brand-experience SliderTab JCR Service")
public class SliderTabJcrServiceImpl implements ServiceTab {

    @Override
    public SliderTab getSliderTab(final Node sliderTabNode, final ResourceResolver resourceResolver) throws RepositoryException {

        final SliderTab sliderTab = new SliderTab();
        final String numberOfSliders = "numberOfSliders";

        if (sliderTab!=null){
            sliderTab.setNumberOfSliders(BrandExperienceUtils.getProperty(sliderTabNode,numberOfSliders));
        }
        return sliderTab;
    }
}

