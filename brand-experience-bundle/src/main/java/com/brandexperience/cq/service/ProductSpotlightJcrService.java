package com.brandexperience.cq.service;

import com.brandexperience.cq.model.ProductSpotlight;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;


public interface ProductSpotlightJcrService {
    public ProductSpotlight getProductSpotlight (Node productSpotlightNode, ResourceResolver resourceResolver) throws RepositoryException;
}
