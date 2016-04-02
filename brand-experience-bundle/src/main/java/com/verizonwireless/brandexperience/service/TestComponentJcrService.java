package com.verizonwireless.brandexperience.service;

import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolver;
import com.verizonwireless.brandexperience.model.TestComponent;
import org.apache.sling.api.resource.ResourceResolver;

import javax.jcr.Node;

import javax.jcr.RepositoryException;


public interface TestComponentJcrService {

    public TestComponent getTestComponent(Node testComponent, ResourceResolver resourceResolver) throws RepositoryException;

}
