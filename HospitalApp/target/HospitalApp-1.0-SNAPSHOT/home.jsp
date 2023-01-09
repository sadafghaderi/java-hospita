<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fa">
<head>
    <meta charset="UTF-8">
    <title>نوبت دهی آنلاین</title>
    <jsp:include page="include.jsp"></jsp:include>

</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<section id="banner">
    <img class="logo" src="hos.pic/logo3.png">
    <div class="banner-text">
        <h1>نوبت دهی آنلاین</h1>
        <p>با بهترین دکتر های متخصص</p>
        <div class="banner-btn">
            <a href="readMore.html"><span></span> بیشتر بخوانید</a>
            <a href="login.html"><span></span> ورود به حساب</a>

        </div>
    </div>
</section>

<jsp:include page="sidenav.jsp"></jsp:include>

<div id="menuBtn">
    <img src="hos.pic/menu.png" id="menu">
</div>


<!--درباره ما(feature)-->

<section id="feature">
    <div class="title-text">
        <p>در باره ما</p>
        <h1>به روز ترین سایت نوبت دهی</h1>
    </div>
    <div class="feature-box">
        <div class="features">
            <h1>رزرو ، نوبت دهی و مشاوره پزشکی</h1>
            <p>زیر نظر بهترین پزشکان فوق تخصص </p>
            <p>در سراسر کشور</p>
        </div>

        <div class="features-img">
            <img src="hos.pic/f2.jpg">
        </div>
    </div>
</section>


<!--بخش های نوبت دهی-->
<section id="service">
    <div class="title-text">
        <p>رزرونوبت،مشاور</p>
        <h1>بخش های پزشکی </h1>

    </div>

    <div class="service-box">
        <div class="single-service">
            <img src="hos.pic/pic1.jpg">
            <div class="overlay">
            </div>
            <div class="service-desc">
                <h1>زنان و زایمان</h1>
                <hr>
                <p></p>
            </div>
        </div>
        <div class="single-service">
            <img src="hos.pic/pic2.jpg">
            <div class="overlay">
            </div>

            <div class="service-desc">
                <a href="doctor.jsp"><h1>دندانپزشکی</h1></a>
                <hr>
                <p></p>
            </div>
        </div>
        <div class="single-service">
            <img src="hos.pic/pic3.jpg">
            <div class="overlay">
            </div>

            <div class="service-desc">
                <h1>گوش و حلق و بینی</h1>
                <hr>
                <p></p>
            </div>
        </div>
        <div class="single-service">
            <img src="hos.pic/pic4.jpg">
            <div class="overlay">
            </div>

            <div class="service-desc">
                <h1>مغز و اعصاب</h1>
                <hr>
                <p></p>
            </div>
        </div>
        <div class="single-service">
            <img src="hos.pic/pic5.jpg">
            <div class="overlay">
            </div>

            <div class="service-desc">
                <h1>قلب و عروق </h1>
                <hr>
                <p></p>
            </div>
        </div>
        <div class="single-service">
            <img src="hos.pic/pic6.jpg">
            <div class="overlay">
            </div>

            <div class="service-desc">
                <h1>چشم و بینایی</h1>
                <hr>
                <p></p>
            </div>
        </div>


    </div>
</section>

<!--نظرات شما  (testimonial)-->
<section id="testimonial">
    <div class="title-text">
        <p>نظرات و انتقادات</p>
        <h1>نظرات شما </h1>

    </div>
    <div class="testimonial-row">

        <Div class="testimonial-col">
            <div class="user">
                <img src="hos.pic/p1.jpg">
                <div class="user-info">
                    <h4>reza</h4>
                </div>
            </div>
            <p>خیلی راحت و سریع تونستم از همون دکتری که میخواستم بدون اتلاف وقت نوبت بگیرم و حتی اگه مشکلی هم بود
                پشتیبانی سریع برطرف میکرد واقعا ممنون</p>
        </Div>
        <Div class="testimonial-col">

            <div class="user">
                <img src="hos.pic/p2.jpg">
                <div class="user-info">
                    <h4>sofia</h4>
                </div>
            </div>
            <p>چند بار از سایت های دیگه اقدام کرده بودم ولی نتونسته بودم دکتر مناسبی که میخواستم رو پیدا کنم ولی از توی
                این سایت تونستم راحت برای همون روزی که میخوام وقت بگیرم</p>
        </Div>
        <Div class="testimonial-col">
            <div class="user">
                <img src="hos.pic/p3.jpg">
                <div class="user-info">
                    <h4>sahar</h4>
                </div>
            </div>
            <p>من برای مشاوره پزشکی با این سایت آشنا شدم .. بعد از حدود یک ربع با یک مشاور عالی کانکت شدم و واقعا بهترین
                مشاوره ها رو دادن ممنون از تیم خوبتون</p>
        </Div>

    </div>

</section>

<!--(footer) تماس با ما -->
<section id="footer">
    <div class="title-text">
        <p> پشتیبانی</p>
        <h1>تماس با ما </h1>
    </div>

    <div class="footer-row">
        <div class="footer-left">
            <h1>:ایمیل جهت تماس با ما </h1>
            <p>nobatdehisadaf@gmail.com</p>
        </div>
        <div class="footer-right">
            <h1>:شماره های پشتیبان </h1>
            <p>+98 911 25 25 658</p>
            <p>+98 912 10 14 154</p>
        </div>
    </div>

</section>


<script>
    var menuBtn = document.getElementById("menuBtn")
    var menu = document.getElementById("menu")
    var sideNav = document.getElementById("sideNav")

    sideNav.style.right = "-200px"
    menuBtn.onclick = function () {
        if (sideNav.style.right == "-200px") {
            sideNav.style.right = "0"
            menu.src = "hos.pic/close.png"
        } else {
            sideNav.style.right = "-200px"
            menu.src = "hos.pic/menu.png"
        }
    }
    var scroll = new SmoothScroll('a[href*="#"]', {
        speed: 500,
        speedAsDuration: true
    });

</script>


</body>
</html>
