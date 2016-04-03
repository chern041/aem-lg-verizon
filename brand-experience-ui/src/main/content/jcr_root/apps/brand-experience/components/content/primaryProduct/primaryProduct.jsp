<%@include file="/apps/brand-experience/global.jsp"%>
<%@page import="com.brandexperience.cq.service.PrimaryProductComponentService,
                com.brandexperience.cq.model.PrimaryProduct"
%>
<%
    PrimaryProductComponentService service = sling.getService(PrimaryProductComponentService.class);
    PrimaryProduct primaryProduct = service.getPrimaryProduct(pageContext);
%>

<c:set var="primaryProduct" value="<%= primaryProduct %>"/>

<div class="primary-product">
    <c:if test="${isEditMode}">
        <p style="color:white; background-color:orange; text-align:center; padding:50px">
            Primary Product Component
        </p>
    </c:if>
    <c:if test="${not empty primaryProduct.imagePath}">
        <img src="${primaryProduct.imagePath}"/>
    </c:if>
    <section class="primary-product-desc overview">
        <c:if test="${not empty primaryProduct.logoProduct}">
            <img src="${primaryProduct.logoProduct}"/>
        </c:if>
        <c:if test="${not empty primaryProduct.offerDescription}">
            <p>
                ${primaryProduct.offerDescription}
            </p>
        </c:if>
        <c:if test="${not empty primaryProduct.accessoriesDescription}">
            <p class="small-font">
                ${primaryProduct.accessoriesDescription}
            </p>
        </c:if>
    </section>
</div>

