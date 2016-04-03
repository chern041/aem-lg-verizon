package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SecondaryProduct;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface SecondaryProductComponentService {
    SecondaryProduct getSecondaryProduct(PageContext pageContext) throws RepositoryException;
}
