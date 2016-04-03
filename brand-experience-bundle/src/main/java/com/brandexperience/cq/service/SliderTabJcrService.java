package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SliderTab;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;


public interface SliderTabJcrService {
    public SliderTab getSliderTab (Node sliderTabNode, ResourceResolver resourceResolver) throws RepositoryException;
}