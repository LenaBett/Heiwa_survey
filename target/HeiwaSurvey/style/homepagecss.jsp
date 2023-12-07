<style media="screen">

html {
  height:100%;
  background-color: #d1d1d1;
}

* {
	box-sizing: border-box;
}
body {
	font-family: 'Montserrat', sans-serif;
	line-height: 1.6;
	margin: 0;
	min-height: 100vh;
}
ul {
  margin: 0;
  padding: 0;
  list-style: none;
}

h2,h3,a {
    font-size: 1em;
    color: rgba(124, 124, 124, 0.8);
}

a {
	text-decoration: none;
}

.logo {
	margin: 0;
	font-size: 1.45em;
}

.main-nav {
	margin-top: 5px;

}
.logo a,
.main-nav a {
	padding: 10px 15px;
	text-transform: uppercase;
	text-align: center;
	display: block;
}

.main-nav a {
	color: rgba(124, 124, 124, 0.8);
	font-size: 1em;
}

.main-nav a:hover {
	color: #718daa;
}

.header {
	padding-top: .5em;
	padding-bottom: .5em;
	border: 0.5px solid #a2a2a2;
	-webkit-box-shadow: 0px 0px 14px 0px rgba(0,0,0,0.75);
	-moz-box-shadow: 0px 0px 14px 0px rgba(0,0,0,0.75);
	box-shadow: 0px 0px 14px 0px rgba(0,0,0,0.75);
	-webkit-border-radius: 5px;
	-moz-border-radius: 1px;
	border-radius: 5px;
	transition: height 0.3s ease;
}
@media (min-width: 769px) {
	.header,
	.main-nav {
		display: flex;
	}
	.header {
		flex-direction: column;
		align-items: center;
    	.header{
		width: 80%;
		margin: 0 auto;
		max-width: 1150px;
	}
}

@media (min-width: 1025px) {
	.header {
		flex-direction: row;
		justify-content: space-between;
	}
}

.wrapper {
  display: flex;
  height: 500px;
  padding-top: .5em;
  padding-bottom: .5em;
  flex-wrap: wrap;
  align-content: space-around;
  background-color: white;
}

.text-div {
  flex: 1;
  width: 80%;
}
a:link, a:visited {
  color: #424242;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: white;
}
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body {
  background-image: url('background.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
.background{
    width: 430px;
    height: auto;
    transition: height 0.3s ease;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;

}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
span.login {
      float: left;
      padding-top: 10px;
      padding-bottom: 10px;
      font-weight:bold;
      font-size:14px;
      color:rgba(124, 124, 124, 0.8);
}

/*Create Survey Form*/
form{
    height: auto;
    width: 400px;
    transition: height 0.3s ease;
    background-color: rgba(255,255,255,0.13);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
.dynamicForm{
    height: 700px;
    transition: height 0.3s ease;
    width: 800px;
    background-color: rgba(242, 244, 244, 0.8);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(143, 251, 255, 0.8);
    transition: height 0.3s ease;
    padding: 50px 35px;
}

.formBackground{
    width: 800px;
    height: 500px;
    transition: height 0.3s ease;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
    z-index: -1;
}
.formBackground .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}

.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: #8a8a8a;
    letter-spacing: 0.5px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    color: rgba(124, 124, 124, 0.8);
    font-weight: 500;
    line-height: 42px;
    text-align: center;
}

label{
    display: block;
     color: rgba(124, 124, 124, 0.8);
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
}
input{
    display: block;
    height: 50px;
    width: 100%;
    background-color: rgba(255,255,255,0.07);
    border-radius: 3px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
    color:
}
::placeholder{
   color: #696868;
}
button{
    margin-top: 50px;
    width: 15%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
.addQuestion , .createSurvey {
    display:inline-block;
    margin-top: 20px;
    width: 30%;
    background-color: #ffffff;
    color: rgba(124, 124, 124, 0.8);
    padding: 15px 0;
    font-size: 14px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}
span.psw {
      float: right;
      color: #424242;
      padding-top: 10px;
      font-weight:bold;
      font-size:14px;
      color:#424242;
    }
span {
      float: left;
      padding-top: 10px;
    }

span.answerType{
      float: left;
      padding-top: 5px;
    }



    /* Home Page Cards */
.card {
    width: 90%;
    background-color: ffffff;
    margin-left: 100px;
    margin-top: 30px;
    border: 0.5px solid #a2a2a2;
    box-shadow: 0 10px 10px 0 rgba(143, 251, 255, 0.8);
    transition: 0.3s;
    border-radius: 40px; /* 5px rounded corners */
}

.custom-card-body {
  padding: 15px 0;
  display: flex;
  justify-content: space-between; /* Align children at the beginning and end */
  align-items: flex-start; /* Align children at the start */
}
.card:hover {
    box-shadow: 0 12px 16px 0 rgba(255, 166, 94, 0.8);
}

.content-container {
  padding-top: 5px;
  margin-left: 30px;
  flex: 1; /* Allow the content container to grow to fill available space */
}

.button-container {
  margin-left: 10%; /* Push the button container to the right */
  margin-top: 30px; /* Add space between paragraph and buttons */
}

a.btn-primary{
    margin-top: 20px;
    margin-right: 50px;
    width: 90%;
    position: center;
    background-color: #ffffff;
    color: rgba(124, 124, 124, 0.8);
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    border: 1px solid #a2a2a2;
    cursor: pointer;
}

/*Take survey form */

</style>