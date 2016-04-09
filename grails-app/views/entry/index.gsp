<%--
  Created by IntelliJ IDEA.
  User: Kamil
  Date: 08.04.2016
  Time: 09:43
--%>

<%@ page import="pl.reg0.grailsrecruitmenttask.EntryStatus" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Entries list</title>
    <meta name="layout" content="main" />
</head>

<body>
    <form method="post">
        <input type="text" name="filter" placeholder="filter by..." required="required">
        <input type="submit" value="Search">
    </form>
    <div id="entries">
    <g:each in="${ entries }">
        <div class="entry">
            <hr>
            <h2>${ it.title } <span style="font-size: 0.7em">by ${ it.author.name }</span></h2>
            <g:if test="${ it.status == EntryStatus.DRAFT }">
                <div class="warning">This is a draft</div>
            </g:if><g:elseif test="${ it.status == EntryStatus.UNPUBLISHED}">
            <div class="warning">This is post is not public</div>
            </g:elseif>
            <p>
                ${ it.contents }
            </p>
        </div>
    </g:each>
    </div>
</body>
</html>