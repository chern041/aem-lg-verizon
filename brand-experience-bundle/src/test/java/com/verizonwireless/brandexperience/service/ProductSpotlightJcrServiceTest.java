package com.verizonwireless.brandexperience.service;

import com.verizonwireless.brandexperience.model.ProductSpotlight;
import com.verizonwireless.brandexperience.service.impl.ProductSpotlightJcrServiceImpl;
import com.verizonwireless.brandexperience.util.MockNode;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;

public class ProductSpotlightJcrServiceTest {

    private final ProductSpotlightJcrService service = new ProductSpotlightJcrServiceImpl();

    @Test
    public void testProductSpotlight() throws Exception{


        final Node module = MockNode.create().prop("test", "test").get();

        final ResourceResolver resourceResolverMock = mock(ResourceResolver.class);
        final Resource resourceMock = mock(Resource.class);
        when(resourceResolverMock.getResource(anyString())).thenReturn(resourceMock);

        final ProductSpotlight productSpotlight = service.getProductSpotlight(module, resourceResolverMock);

        assertNotNull("ProductSpotlight not null", productSpotlight);

    }

}
