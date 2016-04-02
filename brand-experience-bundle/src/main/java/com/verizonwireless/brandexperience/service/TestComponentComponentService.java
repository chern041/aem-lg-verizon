package com.verizonwireless.brandexperience.service;

import com.verizonwireless.brandexperience.model.TestComponent;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;


public interface TestComponentComponentService {

    TestComponent getTestComponent(PageContext pageContext) throws RepositoryException;
}
