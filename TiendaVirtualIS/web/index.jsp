 <%--
  Created by IntelliJ IDEA.
  User: lds
  Date: 16/03/2017
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 --><!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Andrea's shoes</title>

  <!-- Bootstrap Core CSS -->
  <link href="static/frontend/css/bootstrap.css" rel="stylesheet">

  <!-- Custom CSS -->
  <link href="static/frontend/css/business-casual.css" rel="stylesheet">

  <!-- Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->


</head>

<body>

<div class="brand">Andrea's shoes</div>
<div class="address-bar">CRA 84# 33AA-1 La castellana | Medellin,Antioquia 90210 | 123.456.7890</div>


<!-- Navigation -->
<nav class="navbar navbar-default" role="navigation">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
      <a class="navbar-brand" href="static/frontend/index.html">Business Casual</a>
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

      <ul class="nav navbar-nav">
        <li>
          <a href="static/frontend/index.html" target="_blank">Inicio</a>
        </li>
        <li>
          <a href="/usuarios" target="_blank">Registro</a>
        </li>
        <li>
          <a href="/inicio" target="_blank">Catalogo Hombres</a>
        </li>
        <li>
          <a href="/usuarios" target="_blank">Catalogo Mujeres</a>
        </li>
      </ul>
    </div>
    <!-- /.navbar-collapse -->
  </div>
  <!-- /.container -->
</nav>

<div class="container">

<div class="row">
                <div class="box">
                  
                   <img id="relax-banner" src="static/frontend/img/relax_banner.jpg">
                 
                </div>
              </div>

  <div class="row">
    <div class="box">
      <div class="col-lg-12 text-center">
        <div id="carousel-example-generic" class="carousel slide">
          <!-- Indicators -->
          <ol class="carousel-indicators hidden-xs">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
          </ol>

          <!-- Wrapper for slides -->
          <div class="carousel-inner">
            <div class="item active">
              <img class="img-responsive img-full" src="static/frontend/img/slide-1.jpg" alt="">
            </div>
            <div class="item">
              <img class="img-responsive img-full" src="static/frontend/img/slide-2.jpg" alt="">
            </div>
            <div class="item">
              <img class="img-responsive img-full" src="static/frontend/img/slide-3.jpg" alt="">
            </div>
          </div>

          <!-- Controls -->
          <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
            <span class="icon-prev"></span>
          </a>
          <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
            <span class="icon-next"></span>
          </a>
        </div>
        <h2 class="brand-before">
          <small>Bienvenido a</small>
        </h2>
        <h1 class="brand-name">Andrea's shoes</h1>
        <hr class="tagline-divider">
        <h2>
            <strong>Todo conforme a tu preferencia</strong>
        </h2>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="box">
      <div class="col-lg-12">
        <hr>
        <h2 class="intro-text text-center">Nuestros
          <strong>productos</strong>
        </h2>
        <hr>
        <img class="img-responsive img-border img-left" src="static/frontend/img/intro-pic.jpg" alt="">
        <hr class="visible-xs">
        </a>
        <a href="static/frontend/img/intro-pic.jpg">
        <img class="img-responsive img-border img-left" src="static/frontend/img/intro-pic.jpg" alt="">
        </a>
        <a href="static/frontend/img/intro-pic.jpg">
        <img class="img-responsive img-border img-left" src="static/frontend/img/intro-pic.jpg" alt="">
        </a>
        <a href="static/frontend/img/intro-pic.jpg">
        <img class="img-responsive img-border img-left" src="static/frontend/img/intro-pic.jpg" alt="">
        </a>
         <a href="static/frontend/img/intro-pic.jpg">
        <img class="img-responsive img-border img-left" src="static/frontend/img/intro-pic.jpg" alt="">
        </a>

       
      </div>
    </div>
  </div>

  <div class="row">
    <div class="box">
      <div class="col-lg-12">
        <hr>
        <h2 class="intro-text text-center">Que es Andrea's shoes </strong>
        </h2>
        <hr>
        <p>Somos una tienda de zapatos online con las últimas tendencias de la temporada.
          En Andrea's shoes encontrarás gran variedad de zapatos de las mejores marcas. Nuestro stock es limitado y
          los precios están sujetos a cambios sin previo aviso.  <a href="/Nosotros"> ver más</a></p>
      </div>
    </div>
  </div>

</div>
<!-- /.container -->

<footer>
  <div class="container">
    <div class="row" >
      <div class="col-lg-20 centro text-center"> 
        <h5 > Copyright 2017- Ingenieria de software</h5>
        <ul id="list-footer"> 
        <li> <a href="#" title="inicie Sesión" data-toggle="modal" data-target="#login-modal">Administrador</a>
        <li> <a href="/Nosotros"  target="_blank" title="Informacion">Acerca de nosotros</a> </li>
        <li> <a href="infoEmpresa.html" target="_blank" title="contacto">Contáctenos</a> </li>
        </ul>
      </div>
    </div>
  </div>

</footer>

<!-- jQuery -->
<script src="static/frontend/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="static/frontend/js/bootstrap.min.js"></script>

<!-- Script to Activate the Carousel -->
<script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
</script>

</body>

<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
  <div class="modal-dialog">
    <div class="loginmodal-container">
      <h1>Inicie Sesión</h1><br>
      <form action="admin.jsp">
        <input type="text" name="user" placeholder="Usuario">
        <input type="password" name="pass" placeholder="Contraseña">
        <input type="submit" name="login" class="login loginmodal-submit" value="Iniciar Sesión">
      </form>

      <div class="login-help">
        <a href="#">Registrar</a> - <a href="#">¿Olvidó su contraseña?</a>
      </div>
    </div>
  </div>
</div>
</html>
