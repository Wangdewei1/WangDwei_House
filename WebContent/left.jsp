<%@ page import="cn.tool.Const" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<div class="sidebar">
    <a class="btn_create" href="<%=Const.ROOT%>post/toadd"><s:message code="addcreate.message1"/></a>
    <dl class="company_center_aside">
        <dt><s:message code="left.message1"/></dt>
        <dd>
            <a href="<%=Const.ROOT%>deliver/getDeliver"><s:message code="left.message1"/></a>
        </dd>
    </dl>
    <dl class="company_center_aside">
        <dt><s:message code="left.message3"/></dt>
        <dd>
            <a href="<%=Const.ROOT%>post/getPost"><s:message code="left.message4"/></a>
        </dd>
    </dl>
    <dl class="company_center_aside">
        <dt>面试管理</dt>
        <dd><a href="<%=Const.ROOT%>deliver/getDeliver1">通过审核</a></dd>
        <dd><a href="<%=Const.ROOT%>deliver/getDeliver2">初试</a></dd>
        <dd><a href="<%=Const.ROOT%>deliver/getDeliver3">复试</a></dd>
        <dd><a href="<%=Const.ROOT%>deliver/getDeliver31">offer</a></dd>
        <dd><a href="<%=Const.ROOT%>deliver/getDeliver4">人才库</a></dd>
    </dl>

</div><!-- end .sidebar -->