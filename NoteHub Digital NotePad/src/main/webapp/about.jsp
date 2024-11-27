<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="keywords" content="notehub, developer, web platform" />
<meta name="description"
	content="NoteHub is your go-to platform for managing and organizing your notes efficiently." />
<meta name="author" content="Mohammad Shahid" />
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon" />

<title>NoteHub</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700;900&display=swap"
	rel="stylesheet">

<!-- Add Font Awesome for icons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" />

<style>
/* General page layout */
body {
	font-family: 'Roboto', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.navbar {
	position: fixed;
	top: 20px;
	left: 20px;
	font-size: 18px;
	background-color: rgba(7, 6, 112, 0.966);
	/* Semi-transparent background */
	padding: 10px;
	z-index: 1000;
	border-radius: 8px;
}

.navbar ul {
	list-style-type: none;
	padding: 0;
	margin: 0;
}

.navbar li {
	display: inline;
}

.navbar a {
	text-decoration: none;
	color: #fff;
	font-weight: bold;
	padding: 10px 20px;
}

.navbar a:hover {
	color: #f39c12;
}

/* Hero area styling */
.hero_area {
	position: relative;
	height: 100vh;
	width: 100%;
	background-image: url('images/hero-bg.png');
	background-size: cover;
	background-position: center;
	display: flex;
	align-items: center;
	justify-content: center;
	color: #fff;
}

.hero_area .container-fluid {
	text-align: center;
}

.heading_container h2 {
	font-size: 3rem;
	font-weight: 700;
	margin-bottom: 20px;
}

.heading_container span {
	color: #f39c12;
}

.img-box {
	margin: 20px auto;
	display: inline-block;
}

.img1 {
	width: 250px;
	height: 250px;
	border-radius: 50%;
	border: 5px solid #fff;
	object-fit: cover;
}

.detail-box h5 {
	font-size: 2rem;
	margin-top: 15px;
	font-weight: bold;
}

.detail-box p {
	font-size: 1.2rem;
	color: #ddd;
}

.social_box {
	margin-top: 20px;
}

/* Styling social icons */
.social_box a {
	margin: 0 15px;
	font-size: 32px;
	color: #fff;
	transition: all 0.3s ease;
	text-decoration: none;
}

/* Icon hover effects */
.social_box a:hover {
	color: #f39c12;
	transform: scale(1.1);
}

/* Accessibility and focus styles for icons */
.social_box a:focus {
	outline: none;
	box-shadow: 0 0 0 3px rgba(255, 165, 0, 0.7);
}
</style>
</head>

<body class="sub_page">

	<!-- Home navigation link -->
	<div class="navbar">
		<ul>
			<li><a href="index.jsp">Home</a></li>
		</ul>
	</div>

	<div class="hero_area">
		<div class="container-fluid">
			<h1>
				Welcome to <span>NoteHub</span>
			</h1>

			<div class="img-box">
				<img src="images/dev.jpg" class="img1" alt="Mohammad Shahid">
			</div>

			<div class="detail-box">
				<h5>Mohammad Shahid</h5>
				<p>Lead Developer & Creator of NoteHub</p>
			</div>

			<div class="social_box">
				<a href="https://www.facebook.com/share/19SsWhfHuz/"
					title="Facebook"> <i class="fab fa-facebook"></i>
				</a> <a href="https://github.com/Dvpshahid9970" title="GitHub"> <i
					class="fab fa-github"></i>
				</a> <a href="https://www.linkedin.com/in/mohsha814/" title="LinkedIn">
					<i class="fab fa-linkedin"></i>
				</a> <a
					href="https://www.instagram.com/mohd_shahid81/profilecard/?igsh=MWR2OHZ6b2x1YW5kOA=="
					title="Instagram"> <i class="fab fa-instagram"></i>
				</a> <a href="https://www.youtube.com/@cricketnaso" title="YouTube">
					<i class="fab fa-youtube"></i>
				</a>
			</div>
		</div>
	</div>

</body>

</html>
