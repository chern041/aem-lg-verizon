package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SmallProductSet;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface SmallProductSetComponentService {
    SmallProductSet getSmallProductSet(PageContext pageContext) throws RepositoryException;
}