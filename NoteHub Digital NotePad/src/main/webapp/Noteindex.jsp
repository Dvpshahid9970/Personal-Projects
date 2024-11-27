<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>NoteIndex</title>
    

    <%@include file="All_js_css.jsp" %>

    <!-- Optional custom styles -->
    <style>
        /* Set the background image to cover the entire screen */
        body {
            background-image: url('images/hero-bg.png');
            background-size: cover; /* Ensure the background image covers the screen */
            background-position: center; /* Center the background image */
            background-attachment: fixed; /* Fix the background image, so it stays when scrolling */
            margin: 0;
            padding: 0;
        }

        /* Make the navbar fixed on top */
        .navbar {
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1000;
        }

        /* Add margin to the body content to prevent it from hiding behind the navbar */
        body {
            padding-top: 70px; /* Adjust based on navbar height */
        }

        /* Make carousel container take full screen size */
        .carousel-inner {
            height: 80vh; /* Full viewport height */
        }

        /* Adjust the carousel image to cover the entire screen */
        .carousel-item img {
            width: 60%;
            height: 50vh;
            object-fit: cover;
            position : absolute;
            top: 110px;
            left: 210px;
            -webkit-animation: upDown 5s infinite;
          animation: upDown 5s infinite;
        }
        
        

          @-webkit-keyframes upDown {
         0% {
           -webkit-transform: translateY(-45px);
                   transform: translateY(-45px);
         }
         50% {
           -webkit-transform: translateY(45px);
                   transform: translateY(45px);
         }
         100% {
           -webkit-transform: translateY(-45px);
                   transform: translateY(-45px);
         }
       }

       @keyframes upDown {
         0% {
           -webkit-transform: translateY(-45px);
                   transform: translateY(-45px);
         }
         50% {
           -webkit-transform: translateY(45px);
                   transform: translateY(45px);
         }
         100% {
           -webkit-transform: translateY(-45px);
                   transform: translateY(-45px);
         }
       }
                                 
        /* Style for the carousel text */
        .detail-box {
            position : absolute;
            top: 150px;
            left: 60px;
            color: white;
            padding: 20px;
        }
        .detail-box h1 {
           font-size: 4rem; /* You can adjust this value as needed */
         }

        .btn1 {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
        }

        .btn1:hover {
            background-color: #0056b3;
        }
      
    </style>
</head>

<body>

    <!-- Navbar -->
    <div class="container-fluid">
        <%@include file="navbar.jsp"%>
    </div>

    <!-- Hero Image and Slider -->
    <div id="customCarousel1" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="detail-box">
                                <h1>NoteHub</h1>
                                <p>
                                   <h3>Digital NotePad</h3>
                                </p>
                                <p>
                                 NoteHub is a versatile digital notepad designed to streamline your note-taking experience. With a user-friendly interface.
                                </p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="img-box">
                                <img src="images/notepad1.png" alt="Slider Image">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Optional Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
