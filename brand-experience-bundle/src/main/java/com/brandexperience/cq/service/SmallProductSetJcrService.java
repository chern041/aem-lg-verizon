package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SmallProductSet;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public interface SmallProductSetJcrService {
    public SmallProductSet getSmallProductSet (Node smallProductSetNode, ResourceResolver resourceResolver) throws RepositoryException;
}
