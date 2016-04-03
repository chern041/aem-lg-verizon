package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SliderTab;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface SliderTabComponentService {
    SliderTab getSliderTab(PageContext pageContext) throws RepositoryException;
}