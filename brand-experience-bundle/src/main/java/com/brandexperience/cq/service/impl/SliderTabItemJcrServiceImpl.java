package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.SliderTabItem;
import com.brandexperience.cq.service.SliderTabItemJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component (metatype = false, name = "brand-experience SliderTabItem JCR Service")
public class SliderTabItemJcrServiceImpl implements SliderTabItemJcrService {

    @Override
    public SliderTabItem getSliderTabItem(final Node sliderTabItemNode, final ResourceResolver resourceResolver) throws RepositoryException {

        final SliderTabItem sliderTabItem = new SliderTabItem();
        final String imagePath = "imagePath";
        final String header = "header";
        final String paragraph = "paragraph";

        if (sliderTabItemNode != null) {
            sliderTabItem.setImagePath(BrandExperienceUtils.getProperty(sliderTabItemNode, imagePath));
            sliderTabItem.setHeader(BrandExperienceUtils.getProperty(sliderTabItemNode, header));
            sliderTabItem.setParagraph(BrandExperienceUtils.getProperty(sliderTabItemNode, paragraph));
        }
        return sliderTabItem;
    }
}