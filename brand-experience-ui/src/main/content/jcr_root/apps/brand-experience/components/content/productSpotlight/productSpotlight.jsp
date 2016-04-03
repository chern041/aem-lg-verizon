<%@include file="/apps/brand-experience/global.jsp"%>
<%@page import="com.brandexperience.cq.service.ProductSpotlightComponentService,
                com.brandexperience.cq.model.ProductSpotlight"
%>
<%
    ProductSpotlightComponentService service = sling.getService(ProductSpotlightComponentService.class);
    ProductSpotlight productSpotlight = service.getProductSpotlight(pageContext);
%>

<c:set var="productSpotlight" value="<%= productSpotlight %>"/>

<div class="product-spotlight">
    <div class="section-bar bar-overview">
        <section class="secondary-wrapper">
            <c:if test="${not empty productSpotlight.productName}">
                <h3>${productSpotlight.productName}</h3>
            </c:if>
            <c:if test="${not empty productSpotlight.productDescription}">
                <p>${productSpotlight.productDescription}</p>
            </c:if>
            <c:if test="${not empty productSpotlight.blackButton}">
                <a class="black-button" href="<c:if test='${not empty productSpotlight.pathButton}'>${productSpotlight.pathButton}</c:if>">
                    ${productSpotlight.blackButton}
                </a>
            </c:if>
        </section>
    </div>
    <c:if test="${not empty productSpotlight.backgroundImagePath}">
        <img class="section-content-bg" src="${productSpotlight.backgroundImagePath}"/>
    </c:if>
    <section class="section-content secondary-wrapper">
        <c:if test="${isEditMode}">
            <div style="width:400px">
                <p>Parsys ProductSpotlight</p>
        </c:if>
                <cq:include path="section-content" resourceType="foundation/components/parsys"/>
        <c:if test="${isEditMode}">
            </div>
        </c:if>
    </section>
</div>