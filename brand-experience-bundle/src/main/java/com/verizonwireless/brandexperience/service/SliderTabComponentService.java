package com.verizonwireless.brandexperience.service;

import com.verizonwireless.brandexperience.model.SliderTab;

import javax.jcr.RepositoryException;
import javax.servlet.jsp.PageContext;


public interface SliderTabComponentService {

    SliderTab getSliderTab(PageContext pageContext) throws RepositoryException;

}
