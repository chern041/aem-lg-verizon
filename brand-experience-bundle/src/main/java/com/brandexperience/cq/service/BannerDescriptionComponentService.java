package com.brandexperience.cq.service;

import com.brandexperience.cq.model.BannerDescription;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface BannerDescriptionComponentService {
    BannerDescription getBannerDescription(PageContext pageContext) throws RepositoryException;
}