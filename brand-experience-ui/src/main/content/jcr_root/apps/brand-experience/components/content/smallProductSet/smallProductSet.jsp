<%@include file="/apps/brand-experience/global.jsp"%>

<%!
    private final String NUMBER_OF_PRODUCTS = "numberOfProducts";
%>

<c:set var="numberOfProducts" value="<%= properties.get(NUMBER_OF_PRODUCTS) %>"/>

<div class="small-product-set right">
    <c:if test="${isEditMode}">
        <p style="color:white; background-color:orange; text-align:center; padding:50px">
                Small Product Set
        </p>
    </c:if>
    <ul>
        <c:forEach begin="1" end="${numberOfProducts}" varStatus="i">
            <li class="seconday-product">
                <cq:include path="secondaryProduct-${i.index}" resourceType="brand-experience/components/content/secondaryProduct"/>
             </li>
        </c:forEach>
    </ul>
</div>