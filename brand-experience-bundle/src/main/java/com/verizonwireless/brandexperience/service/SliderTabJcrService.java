package com.verizonwireless.brandexperience.service;

import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolver;
import com.verizonwireless.brandexperience.model.SliderTab;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;

import javax.jcr.RepositoryException;


public interface SliderTabJcrService {

    public SliderTab getSliderTab(Node sliderTabNode, ResourceResolver resourceResolver) throws RepositoryException;

}
