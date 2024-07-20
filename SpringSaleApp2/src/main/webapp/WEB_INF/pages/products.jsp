<%-- 
    Document   : products
    Created on : Jul 20, 2024, 2:19:44 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1 class="text-center text-info">Quan Tri San Pham</h1>
<c:url value="/products" var="action"/>
<form:form method="post" action="${action}" modelAttribute="product" enctype="multipart/form-data">
    
    <form:errors path="+" element="div" cssClass="alert alert-danger"/>
    
    <div class="mb-3 mt-3">
        <label for="name" class="form-label">Ten san pham</label>
        <form:input path="name" type="text" class="form-control" id="name" placeholder="Ten San Pham" name="name"/>
    </div>
    <div class="mb-3 mt-3">
        <label for="price" class="form-label">Gia san pham</label>
        <form:input path="price" type="number" class="form-control" id="price" placeholder="Gia San Pham" name="price"/>
    </div>
    <div class="mb-3 mt-3">    
        <form:select path="categoryId" class="form-select">
            <label for="cate" class="form-label">Danh muc san pham</label>
            <c:forEach items="${cates}" var="c">
                <option value="${c.id}">${c.name}</option>
            </c:forEach>
            
            
        </form:select>
    </div>
    <div class="mb-3 mt-3">
        <label for="file" class="form-label">Anh san pham</label>
        <form:input path="file" accept=".png,jpg" type="file" class="form-control" id="file" name="file"/>
    </div>
    
    <div class="mb-3 mt-3">
        <button class="btn btn-success">Them san pham</button>
    </div>

</form:form>