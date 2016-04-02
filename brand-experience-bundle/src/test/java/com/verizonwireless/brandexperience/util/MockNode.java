package com.verizonwireless.brandexperience.util;

import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.eq;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.Property;
import java.util.Calendar;

public class MockNode {

    public static MockNode create() throws Exception{
        return new MockNode();
    }

    public MockNode create(final String name) throws Exception{
        return new MockNode().name(name);
    }

    public MockNode name(final String name) throws Exception{
        when(mockNode.getName()).thenReturn(name);
        return this;
    }

    public MockNode path(final String path) throws Exception{
        when(mockNode.getPath()).thenReturn(path);
        return this;
    }

    public MockNode prop(final String key, final String value) throws Exception{
        final Property mockProperty = mock(Property.class);
        when(mockNode.hasProperty(key)).thenReturn(true);
        when(mockNode.getProperty(key)).thenReturn(mockProperty);
        when(mockProperty.getString()).thenReturn(value);
        return this;
    }

    public MockNode prop(final String key, final Boolean value) throws Exception{
        final Property mockProperty = mock(Property.class);
        when(mockNode.hasProperty(key)).thenReturn(true);
        when(mockNode.getProperty(key)).thenReturn(mockProperty);
        when(mockProperty.getBoolean()).thenReturn(value);
        return this;
    }

    public MockNode prop(final String key, final Property value) throws Exception{
        final Property mockProperty = mock(Property.class);
        when(mockNode.hasProperty(key)).thenReturn(true);
        return this;
    }

    public MockNode propDate(final String key, final Calendar cal)throws Exception{
        final Property mockProperty = mock(Property.class);
        when(mockNode.hasProperty(key)).thenReturn(true);
        when(mockNode.getProperty(key)).thenReturn(mockProperty);
        when(mockProperty.getDate()).thenReturn(cal);
        return this;
    }

    public MockNode child(final String name, final Node node)throws Exception{
        when(mockNode.hasNodes()).thenReturn(true);
        when(mockNode.hasNode(name)).thenReturn(true);
        when(node.getParent()).thenReturn(mockNode);
        return this;
    }

    public MockNode add(final String name, final Node node) throws Exception{
        when(mockNode.addNode(name)).thenReturn(node);
        when(mockNode.addNode(eq(name), toString())).thenReturn(node);
        return this;
    }

    public MockNode children(final Node... nodes) throws Exception{
        final NodeIterator mockNodeIterator = mock(NodeIterator.class);
        if(nodes != null && nodes.length > 0){
            final int nodeCount = nodes.length;
            OngoingStubbing<Boolean> hasNextStub = when(mockNodeIterator.hasNext());
            for(int i = 0; i <  nodeCount; i++){
                hasNextStub = hasNextStub.thenReturn(true);
            }
            hasNextStub.thenReturn(false);
            OngoingStubbing<Node> nextNodeStub = when(mockNodeIterator.nextNode());
            for(final Node node : nodes){
                nextNodeStub = nextNodeStub.thenReturn(node);
            }
        }else{
         when(mockNodeIterator.hasNext()).thenReturn(false);
        }
        when(mockNode.hasNodes()).thenReturn(true);
        when(mockNode.getNodes()).thenReturn(mockNodeIterator);
        return this;
    }

    public Node get(){
        return mockNode;
    }

    public MockNode hasNodes(final boolean hasNodes) throws Exception{
        when(mockNode.hasNodes()).thenReturn(hasNodes);
        return this;
    }

    private final Node mockNode = mock(Node.class);
}
