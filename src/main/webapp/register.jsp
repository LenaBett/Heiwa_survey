<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
    margin: 0;
    padding: 0;
    height: 100vh;
    width: 100%;
    background: linear-gradient(to right, #061957, #2d0b55);
}
.registration-form{
    background: #f5f5f5;
    padding: 12px 20px;
    width: 500px;
    margin: 65px auto;
    display: -webkit-box;
    display: flex;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    flex-direction: column;
    border-radius: 4px;
    box-shadow: 0 2px 25px rgba(0, 0, 0, 0.2);
  }

input[type=text], input[type=password] {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 0px;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 80%;

}

button:hover {
  opacity: 0.8;
}

.container {
  padding: 16px;
  width: 50%;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
</head>
<body>

<h2>${initParam.AppName}</h2>


<form action="./user" method="post">

  <div class="registration-form">
    <span style="font-weight:bold;font-size:13px;">Register</span>
    <input type="text" placeholder="Enter Username" name="username" required>

    <input type="password" placeholder="Enter Password" name="password" required>

    <input type="password" placeholder="Confirm Password" name="confirmPassword" required>

    <button type="submit">Register</button>

    <span style="font-weight:bold;font-size:13px;color:red;">Have An Account? <a href="index.jsp">Login</a></span>
  </div>

</form>

</body>
</html>