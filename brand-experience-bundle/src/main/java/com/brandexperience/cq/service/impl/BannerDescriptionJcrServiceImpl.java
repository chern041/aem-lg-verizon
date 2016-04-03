package com.brandexperience.cq.service.impl;

import com.brandexperience.cq.model.BannerDescription;
import com.brandexperience.cq.service.BannerDescriptionJcrService;
import com.brandexperience.cq.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component (metatype = false, name = "brand-experience BannerDescription JCR Service")
public class BannerDescriptionJcrServiceImpl implements BannerDescriptionJcrService{

    @Override
    public BannerDescription getBannerDescription (final Node bannerDescriptionNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final BannerDescription bannerDescription = new BannerDescription();
        final String productHighlight = "productHighlight";
        final String productFeatures = "productFeatures";

        if(bannerDescription !=null){
            bannerDescription.setProductHighlight(BrandExperienceUtils.getProperty(bannerDescriptionNode,productHighlight));
            bannerDescription.setProductFeatures(BrandExperienceUtils.getProperty(bannerDescriptionNode,productFeatures));
        }
        return bannerDescription;
    }
}