<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>pet shop</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<div id="wrap">

       
       
       
       	<div class="left_content">
        	
            <div class="title"><span class="title_icon"><img src="image/bullet1.gif" alt="" title="" /></span>Cadeaux pour vos pets</div>
        
        	
            
            <c:forEach items="${produits}" var="produit" varStatus="status">
        	<div class="feat_prod_box">
            
            	<div class="prod_img"><a href="ProduitServlet?paramId=${produit.id}"><img src="image/${produit.photo}" alt="" title="" class="thumb" border="0" /></a></div>
                
                <div class="prod_det_box">
                
                	<div class="box_top"></div>
                    <div class="box_center">
                    <div class="prod_title">
                    <a href="ProduitServlet?paramId=${produit.id}"><c:out value="${produit.nom}"></c:out></a>
                    </div>
                    <p class="details"><c:out value="${produit.description}"></c:out></p>
                    <a href="ProduitServlet?paramId=${produit.id}">Plus de details</a>
                    <div class="clear"></div>
                    </div>
                    
                    <div class="box_bottom"></div>
                </div>    
            <div class="clear"></div>
            </div> 
            </c:forEach>           
            
                      <div class="pagination">
            <span class="disabled"></span><span class="current">1</span>
            <a href="#?page=2">2</a>
            <a href="#?page=3">3</a>…<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2"></a>
            </div>   
                     
            
        <div class="clear"></div>
        </div><!--end of left content-->
        
       
    

</div>
</body>
</html>