package com.verizonwireless.brandexperience.service.impl;

import com.verizonwireless.brandexperience.model.TestComponent;
import com.verizonwireless.brandexperience.service.TestComponentJcrService;
import com.verizonwireless.brandexperience.util.BrandExperienceUtils;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.ResourceResolver;


import javax.jcr.Node;
import javax.jcr.RepositoryException;

@Service
@Component (metatype = false, name = "brand-experience TestComponent JCR Service")
public class TestComponentJcrServiceImpl implements TestComponentJcrService {

    @Override
    public TestComponent getTestComponent(final Node testComponentNode, final ResourceResolver resourceResolver) throws RepositoryException{

        final TestComponent testComponent = new TestComponent();
        final String logoProduct = "logoProduct";
        final String colorProduct = "colorProduct";
        final String descriptionProduct = "descriptionProduct";

        if(testComponentNode!=null){
            testComponent.setLogoProduct(BrandExperienceUtils.getProperty(testComponentNode, logoProduct));
            testComponent.setColorProduct(BrandExperienceUtils.getProperty(testComponentNode,colorProduct));
            testComponent.setDescriptionProduct(BrandExperienceUtils.getProperty(testComponentNode,descriptionProduct));
        }
        return TestComponent;
    }

}
