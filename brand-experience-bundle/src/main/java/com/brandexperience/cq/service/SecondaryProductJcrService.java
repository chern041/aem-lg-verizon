package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SecondaryProduct;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public interface SecondaryProductJcrService {
    public SecondaryProduct getSecondaryProduct (Node secondaryProductNode, ResourceResolver resourceResolver) throws RepositoryException;
}
