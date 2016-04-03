package com.brandexperience.cq.service;

import com.brandexperience.cq.model.SliderTabItem;
import javax.servlet.jsp.PageContext;
import javax.jcr.RepositoryException;

public interface SliderTabItemComponentService {
    SliderTabItem getSliderTabItem(PageContext pageContext) throws RepositoryException;
}