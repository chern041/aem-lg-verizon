package com.brandexperience.cq.service;

import com.brandexperience.cq.model.ProductSpotlight;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface ProductSpotlightComponentService {
    ProductSpotlight getProductSpotlight(PageContext pageContext) throws RepositoryException;
}
