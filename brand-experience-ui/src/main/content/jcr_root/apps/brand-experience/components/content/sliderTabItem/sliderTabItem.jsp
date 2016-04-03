<%@include file="/apps/brand-experience/global.jsp"%>
<%@page import="com.brandexperience.cq.service.SliderTabItemComponentService,
                com.brandexperience.cq.model.SliderTabItem"
%>

<%
    SliderTabItemComponentService service = sling.getService(SliderTabItemComponentService.class);
    SliderTabItem sliderTabItem = service.getSliderTabItem(pageContext);
%>

<c:set var="sliderTabItem" value="<%= sliderTabItem %>"/>

<c:if test="${not empty sliderTabItem.imagePath}">
<img src="${sliderTabItem.imagePath}"/>
</c:if>
<div class="slider-nav-desc">
    <c:if test="${not empty sliderTabItem.header}">
        <h3>${sliderTabItem.header}</h3>
    </c:if>
    <c:if test="${not empty sliderTabItem.paragraph}">
        <p>${sliderTabItem.paragraph}</p>
    </c:if>
</div>