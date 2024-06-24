<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="./home-style.css">
    <script type="text/javascript" src="./home-script.js"></script> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    <title>TechCafe</title>
    <link rel="shortcut icon" href="images/Abstract Chef Cooking Restaurant Free Logo.png" type="image/x-icon" style="border-radius:50%;">
    
</head>
<body>
    <div class="navbars">
    <ul class="nav justify-content-center">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#"><div class="navheading" id="heading">
                <img src="./images/Abstract Chef Cooking Restaurant Free Logo.png" alt="">
                <span>TechCafe<span>
          </div></a>
          </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">catogories</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Offers</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">contact</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">about</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#"></a>
          </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true"></a>
        </li>
      </ul>
    </div>
      <div class="buttons">
    <button onclick="Login()">login</button>
    <button onclick="signup()">signup</button>
</div>
    <center>
  <div class="heading" id="heading">
        <img src="./images/Abstract Chef Cooking Restaurant Free Logo.png" alt="">
        <h1>Tech caffee<h1>
  </div>
  <div class="login" id="login">
    <div class="card">
        <div class="card-body">
            <form action="Login" methode="GET">
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label" >Email address</label>
                  <input type="email" class="form-control" id="Email" aria-describedby="emailHelp" name="Email">
                  <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                  <label for="exampleInputPassword1" class="form-label" >Password</label>
                  <input type="password" class="form-control" id="Password"  name="Password">
                </div>
                <div class="mb-3 form-check">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1">
                  <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>
                <button type="submit" value="Login" class="btn btn-primary">Submit</button>
              </form>
        </div>
      </div>

</div>
<div class="signup" id="signup">
<div class="card">
    <div class="card-body">
    <form action="signup" method="GET">
   	 	<input type="text" placeholder="UserName" id="UserName" name="UserName">
        <br><br>
        <input type="text" placeholder="Email" id="Email" name="Email">
        <br><br>
        <input type="text" placeholder="Password" id="Password" name="Password">
        <br><br>
        <input type="submit" value="signup" onclick="verify()">
    </form>
    </div>
  </div>

</div>
<div class="verify" id="verify">
    <div class="card">
        <div class="card-body">
            <form action="verifyotp" methode="GET">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Enter Otp</label>
                    <input type="email" class="form-control" id="vcode" aria-describedby="emailHelp" name="vcode" id="vcode">
                    <div id="emailHelp" class="form-text"></div>
                  </div>
              
                <button type="submit" value="verifyotp" class="btn btn-primary">Submit</button>
              </form>
        </div>
      </div>
    
    </div>
  </center>
  <p>"Welcome to Tech Cafffee, where every bite is a delight! Explore our diverse menu, crafted with care using the freshest ingredients. Join us for a culinary journey that promises satisfaction in every taste. We're excited to have you dine with us!"</p>
  <div class="caro">
  <div id="carouselExample" class="carousel slide" >
    <div class="carousel-inner">
      <div class="carousel-item active ">
        <img src="images/pexels-enginakyurt-3228876.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="images/pexels-robinstickel-70497.jpg" class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="images/pexels-dana-tentis-118658-262959 copy.jpg" class="d-block w-100" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
</div>
</body>
</html>