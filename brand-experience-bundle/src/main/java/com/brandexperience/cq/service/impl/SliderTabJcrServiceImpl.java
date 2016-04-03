package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.SliderTab;
import com.brandexperience.cq.service.SliderTabJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component (metatype = false, name = "brand-experience SliderTab JCR Service")

public class SliderTabJcrServiceImpl implements SliderTabJcrService{
    @Override
    public SliderTab getSliderTab (final Node sliderTabNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final SliderTab sliderTab = new SliderTab();
        final String numberOfSlides = "numberOfSlides";

        if(sliderTabNode != null){
            sliderTab.setNumberOfSlides(BrandExperienceUtils.getProperty(sliderTabNode, numberOfSlides));
        }
        return sliderTab;
    }
}