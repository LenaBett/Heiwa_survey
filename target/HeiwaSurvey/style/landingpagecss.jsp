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

	color: white;
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
	color: white;
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

.image-div {
  flex: 1;
  width: 50%;
}

.image-div>img {
  width: 80%;
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
</style>