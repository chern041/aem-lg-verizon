<%@include file="/apps/brand-experience/global.jsp"%>

<%!
    private final String IMAGE_PATH_PROPERTY = "imagePath";
%>

<c:set var="imagePath" value="<%= properties.get(IMAGE_PATH_PROPERTY)%>"/>

<c:if test="${isEditMode}">
    <p style="color:white; background-color:orange; text-align:center; padding:50px">
       Banner Image
    </p>
</c:if>
<c:if test="${not empty imagePath}">
    <img class="banner-product-img" src="${imagePath}"/>
</c:if>

