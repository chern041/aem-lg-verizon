package com.brandexperience.cq.service;

import com.brandexperience.cq.model.PrimaryProduct;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface PrimaryProductComponentService{
    PrimaryProduct getPrimaryProduct(PageContext pageContext) throws RepositoryException;
}
