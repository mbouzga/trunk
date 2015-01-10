<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Pet Shop</title>
<link rel="stylesheet" type="text/css" href="style.css" />

</head>
<body>
<div id="wrap">

       
       
       
       	<div class="left_content">
        	
            <div class="title"><span class="title_icon"><img src="image/bullet1.gif" alt="" title="" /></span>Special gifts</div>
        
        	
            
            <c:forEach items="${produits}" var="produit" varStatus="status">
        	<div class="feat_prod_box">
            
            	<div class="prod_img"><a href="ProduitServlet?paramId=${produit.id}"><img src="image/${produit.photo}" alt="" title="" class="thumb" border="0" /></a></div>
                
                <div class="prod_det_box">
                <span class="special_icon"><img src="image/special_icon.gif" alt="" title="" /></span>
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