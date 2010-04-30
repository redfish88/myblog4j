<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html:base/>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Cacti's Farm</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="/skin/default/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<div id="wrapper">
	<div id="logo">
		<h1>Cacti's Farm</h1>
		<p>Sweet Sweet Home..</p>
	</div>
	<hr />
	<!-- end #logo -->
	<div id="header">
		<div id="menu">
			<ul>
				<li><a href="/index.do" class="first">Home</a></li>
				<li class="current_page_item"><a href="/index.do#">Blog</a></li>
				<li><a href="/photo.do">Photos</a></li>
				<li><a href="/about.html">About</a></li>
				<li><a href="/feeling.do">Feeling</a></li>
			</ul>
		</div>
		<!-- end #menu -->
		<div id="search">
			<form method="get" action="">
				<fieldset>
				<input type="text" name="s" id="search-text" size="15" />
				<input type="submit" id="search-submit" value="GO" />
				</fieldset>
			</form>
		</div>
		<!-- end #search -->
	</div>
	<!-- end #header -->
	<!-- end #header-wrapper -->
	<div id="page">
	<div id="page-bgtop">
		<div id="content">
			<div class="post">
				<h2 class="title"><a href="#">文章标题 </a></h2>
				<p class="meta">Sunday, April 26, 2009 7:27 AM Posted by <a href="#">Author</a></p>
				<div class="entry">
					<p>文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.文章的正文出现在这里.</p>
				</div>
			</div>
			<div></div>
            <div class="scott">
            <span class="disabled"> < </span>
            <span class="current">1</span>
            <a href="/index.do?page=2">2</a>
            <a href="/index.do?page=3">3</a>
            <a href="/index.do?page=4">4</a>
            <a href="/index.do?page=2"> > </a>
            </div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<h2>2010/02/30</h2>
					<p>开始了新版本的制作,一定要完成.</p>
				</li>
				<li>
					<h2>随机文章 </h2>
					<ul>
						<li><a href="#">Frist..</a></li>
						<li><a href="#">Second..</a></li>
						<li><a href="#">Three..</a></li>
					</ul>
				</li>
				<li>
					<h2>友情链接</h2>
					<ul>
						<li><a href="#">中华家族谱</a></li>
						<li><a href="#">N Easy Teamwork</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	</div>
	<!-- end #page -->
	<div id="footer-bgcontent">
	<div id="footer">
		<p>程序由luke sun制作, 原始网页模板来自 <a href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>
	</div>
	</div>
	<!-- end #footer -->
</div>
</body>
</html>
