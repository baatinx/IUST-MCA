<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>form processing</title>
    <style >
    .d1{
      width: 300px;
      margin:  50px auto;
      overflow: auto;
      background-color: #eee;
      padding: 30px; }
    .d2{
      overflow: auto;
      text-align: center;
      padding: 5px 20px;
    }
    li{
      display: inline-block;
      list-style: none;
      font:bold 16px red;
      text-transform: capitalize;
    }
    .li1{
      float: left;


    }
.li2{
  float: right;
}
input[type="submit"]{
  float: right;;
}
    </style>
  </head>
  <body>
    <form  action="registration_processing.php" method="POST">

<div class="d1">
  <div class="d2">
    <li class="li1">name</li>
    <li class="li2">  <input type="text" name="name" ></li>
  </div>
  <div class="d2">
    <li  class="li1">address</li>
    <li class="li2">  <input type="text" name="address"></li>
  </div>
  <div class="d2">
    <li  class="li1">gender</li>
    <li class="li2">
        <select name="gender">
        <option value="female">female</option>
      <option value="male">male</option>
    </select>
  </li>
  </div>
  <div class="d2">
    <li class="li1">email</li>
    <li class="li2">  <input  type="text" name="email" ></li>
  </div>
  <div class="d2">
    <li class="li1">contact</li>
    <li class="li2">  <input type="text" name="contact"></li>
  </div>
<br><br>
  <input type="submit" name="submit" value="submit">

</div>

    </form>
  </body>
</html>
