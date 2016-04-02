package com.verizonwireless.brandexperience.util;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import com.day.cq.wcm.api.Page;

import java.util.ArrayList;
import java.util.List;

public class MockPage {

    private final Page mockPage = mock(Page.class);

    public static MockPage create(final Node pageNode) throws Exception{
        //return new MockPage().node(pageNode);
        return null;
    }

    public MockNode node(final Node pageNode) throws RepositoryException{
        final String name = pageNode.getName();
        final String path = name;
        when(mockPage.getName()).thenReturn(name);
        when(mockPage.getPath()).thenReturn(path);
        //return this;
        return null;
    }

    public MockPage children(final Page... pages) {
        final List<Page> pageList = new ArrayList<Page>();
        if(pages != null && pages.length > 0){
            final int pageCount = pages.length;

            for(int i = 0; i < pageCount; i++){
                final Page page = pages[i];
                pageList.add(i, page);
                when(mockPage.hasChild(page.getName())).thenReturn(true);
                when(page.getParent()).thenReturn(mockPage);
                final String childPath = mockPage.getPath() + "/" + mockPage.getName();
                when(page.getPath()).thenReturn(childPath);

            }
        }

        when(mockPage.listChildren()).thenReturn(pageList.iterator());

        return this;

    }

    public Page get(){
        return mockPage;
    }
}
