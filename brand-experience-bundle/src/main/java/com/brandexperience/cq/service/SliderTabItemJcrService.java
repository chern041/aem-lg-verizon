package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SliderTabItem;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public interface SliderTabItemJcrService {
    public SliderTabItem getSliderTabItem (Node sliderTabItem, ResourceResolver resourceResolver) throws RepositoryException;
}
