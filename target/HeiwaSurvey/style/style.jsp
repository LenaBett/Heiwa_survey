<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        background-color
    }

    .topnav {
        margin: 15px;
        overflow: hidden;
        background-color: #32cd32;
    }

    .topnav a {
        float: left;
        color: #000000;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 17px;
    }

    .topnav a:hover {
        background-color: #ddd;
        color: black;
    }

    .topnav a.active {
        background-color: <%= request.getParameter("pageColor") %>;
        color: #000000;
    }

    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }

    input[type=text], input[type=password] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }

    button {
      background-color: <%= request.getParameter("pageColor") %>;
      color: white;
      padding: 14px 20px;
      margin: 8px 100px;
      border: none;
      cursor: pointer;
      width: 40%;
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
      padding-top: 10px;
    }

    .linkBtn a:link {
        background-color: #f44336;
        color: white;
        padding: 14px 25px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
    }

    .linkBtn a:visited {
        background-color: #f44336;
        color: white;
        padding: 14px 25px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
    }

    .linkBtn a:hover {
        background-color: green;
    }

    .linkBtn a:active {
        background-color: green;
    }

    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      -webkit-font-smoothing: antialiased;
    }
    body {
        margin: 0;
        padding: 0;
        height: 100vh;
        width: 100%;
        background: linear-gradient(to bottom, #061957, #2d0b55);
      }

    .h2{
      display: block;
        font-size: 2em;
        margin-top: 0.67em;
        margin-bottom: 0.67em;
        margin-left: 0;
        margin-right: 0;
        font-weight: bold
        color: #fff
      }

    .h1{
    display: block;
      font-size: 2em;
      margin-top: 0.67em;
      margin-bottom: 0.67em;
      margin-left: 0;
      margin-right: 0;
      font-weight: bold
      color: #fff
    }

    .login-form {
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
    .login-form h1 {
      padding: 35px 35px 0 35px;
      font-weight: 300;
    }
    .login-form .content {
      padding: 35px;
      text-align: center;
    }
    .login-form .input-field {
      padding: 12px 5px;
    }
    .login-form .input-field input {
      font-size: 13px;
      display: block;
      font-family: 'Rubik', sans-serif;
      width: 90%;
      padding: 10px 1px;
      border: 0;
      border-bottom: 1px solid #747474;
      outline: none;
      -webkit-transition: all .2s;
      transition: all .2s;
    }
    .login-form .input-field input::-webkit-input-placeholder {
      text-transform: uppercase;
    }
    .login-form .input-field input::-moz-placeholder {
      text-transform: uppercase;
    }
    .login-form .input-field input:-ms-input-placeholder {
      text-transform: uppercase;
    }
    .login-form .input-field input::-ms-input-placeholder {
      text-transform: uppercase;
    }
    .login-form .input-field input::placeholder {
      text-transform: uppercase;
    }
    .login-form .input-field input:focus {
      border-color: #222;
    }
    .login-form a.link {
      text-decoration: none;
      color: #747474;
      letter-spacing: 0.2px;
      text-transform: uppercase;
      display: inline-block;
      margin-top: 20px;
    }
    .login-form .action {
      display: -webkit-box;
      display: flex;
      -webkit-box-orient: horizontal;
      -webkit-box-direction: normal;
              flex-direction: row;
    }

    .login-form .action button:hover {
      background: grey;
    }
    .login-form .action button:nth-child(2) {
      background: #2d3b55;
      position: center;
      width: 50%;
      color: #fff;
      border-bottom-left-radius: 0;
      border-bottom-right-radius: 4px;
    }
    .login-form .action button:nth-child(2):hover {
      background: #3c4d6d;
    }

</style>