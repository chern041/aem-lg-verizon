package com.brandexperience.cq.service;

import com.brandexperience.cq.model.PrimaryProduct;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;


public interface PrimaryProductJcrService {
    public PrimaryProduct getPrimaryProduct (Node primaryProductNode, ResourceResolver resourceResolver) throws RepositoryException;
}
