<%@include file="/apps/brand-experience/global.jsp"%>
<%@page import="com.brandexperience.cq.service.BannerDescriptionComponentService,
                com.brandexperience.cq.model.BannerDescription"
%>

<%
    BannerDescriptionComponentService service = sling.getService(BannerDescriptionComponentService.class);
    BannerDescription bannerDescription = service.getBannerDescription(pageContext);
%>

<c:set var="bannerDescription" value="<%= bannerDescription %>"/>


<section class="banner-product-desc">
    <section class="banner-content">
        <c:if test="${not empty bannerDescription.productHighlight}">
            <p>
                ${bannerDescription.productHighlight}
            </p>
        </c:if>
        <c:if test="${not empty bannerDescription.productFeatures}">
            ${bannerDescription.productFeatures}
        </c:if>
    </section>
</section>