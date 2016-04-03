<%@include file="/apps/brand-experience/global.jsp"%>
<%@page import="com.brandexperience.cq.service.SliderTabComponentService,
                com.brandexperience.cq.model.SliderTab"
%>

<%
    SliderTabComponentService service = sling.getService(SliderTabComponentService.class);
    SliderTab sliderTab = service.getSliderTab(pageContext);
%>

<c:set var="sliderTab" value="<%= sliderTab %>"/>

<div class="slider-tab">
    <div class="slider-nav">
        <ul>
            <c:forEach begin="1" end="${sliderTab.numberOfSlides}" varStatus="i">
                <li<c:if test="${i.first}"> class="active"</c:if>>
                    <cq:include path="sliderItem-${i.index}" resourceType="brand-experience/components/content/sliderTabItem"/>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>