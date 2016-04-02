package com.verizonwireless.brandexperience.service.impl;

import com.verizonwireless.brandexperience.model.AEMComponentContext;
import com.verizonwireless.brandexperience.model.TestComponent;
import com.verizonwireless.brandexperience.service.TestComponentComponentService;
import com.verizonwireless.brandexperience.service.TestComponentJcrService;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;


@Service
@Component(metatype = false, name = "brand-experience TestComponent Component Service")
public class TestComponentComponentServiceImpl implements TestComponentComponentService{

    @Reference
    private TestComponentJcrService jcrService;

    @Override
    public TestComponent getTestComponent(final PageContext pageContext) throws RepositoryException{
        final AEMComponentContext context = AEMComponentContext.create(pageContext);
        return jcrService.getTestComponent(context.getCurrentNode(), context.getResourceResolver());
    }
}
