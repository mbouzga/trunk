<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Pet Shop</title>
</head>

<body>
	<div id="wrap">

		<div class="header">
			<div class="logo">
				<a href="index.html"><img src="images/logo.gif" alt="" title=""
					border="0" /></a>
			</div>
			<div id="menu">
				<ul>
					<li><a href="index.html">home</a></li>
					<li><a href="about.html">about us</a></li>
					<li class="selected"><a href="category.html">pets</a></li>
					<li><a href="specials.html">specials pets</a></li>
					<li><a href="myaccount.html">my accout</a></li>
					<li><a href="register.html">register</a></li>
					<li><a href="details.html">prices</a></li>
					<li><a href="contact.html">contact</a></li>
				</ul>
			</div>


		</div>


		<div class="center_content">
			<div class="left_content">
				<div class="crumb_nav">
					<a href="index.html">home</a> &gt;&gt; categories
				</div>
				<div class="title">
					<span class="title_icon"><img src="images/bullet1.gif"
						alt="" title="" /></span>Categories
				</div>
				<br>
				<table>
					<tr>
						<td><form action="./java/controlleurs/access" method="get">
								<INPUT type=submit Value="accessoires">
							</form>Accessoires</td>
					</tr>
					<tr>
						<td>
							<form action="controlleurs/holidaysgiftsControle" method="get">
								<INPUT border=0 src="images/holidays-gitfs.jpg " type=image
									Value=submit align="middle">
							</form> Cadeaux pour les fetes
						</td>
					</tr>
					<tr>
						<td><form action="controlleurs/specialsControle" method="get">
								<INPUT border=0 src="images/specials.jpg " type=image
									Value=submit align="middle">
							</form>Specials</td>
					</tr>
					<tr>
						<td>
							<form action="controlleurs/petsgiftsControle" method="get">
								<INPUT border=0 Value="pets gifts" align="middle">
							</form> Cadeaux pour vos animaux
						</td>
					</tr>
				</table>
			</div>







			<div class="clear"></div>
		</div>
		<!--end of center content-->





	</div>

</body>

</html>