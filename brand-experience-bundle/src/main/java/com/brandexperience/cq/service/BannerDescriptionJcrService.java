package com.brandexperience.cq.service;

import com.brandexperience.cq.model.BannerDescription;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

public interface BannerDescriptionJcrService {
    public BannerDescription getBannerDescription (Node bannerDescriptionNode, ResourceResolver resourceResolver) throws RepositoryException;

}