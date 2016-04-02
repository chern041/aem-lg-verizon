<%@include file="/apps/brand-experience/global.jsp"%>
<%@page import="com.brandexperience.cq.service.SecondaryProductComponentService,
                com.brandexperience.cq.model.SecondaryProduct"
%>
<%
    SecondaryProductComponentService service = sling.getService(SecondaryProductComponentService.class);
    SecondaryProduct secondaryProduct = service.getSecondaryProduct(pageContext);
%>

<c:set var="secondaryProduct" value="<%= secondaryProduct %>"/>


<div class="secondary-product">
    <c:if test="${isEditMode}">
        <p style="color:white; background-color:orange; text-align:center; padding:50px">
            Secondary Product
        </p>
    </c:if>
    <c:if test="${not empty secondaryProduct.title}">
        <h4 class="top-left">${secondaryProduct.title}</h4>
    </c:if>
    <c:if test="${not empty secondaryProduct.imagePaths}">
        <img src="${secondaryProduct.imagePaths}"/>
    </c:if>
</div>