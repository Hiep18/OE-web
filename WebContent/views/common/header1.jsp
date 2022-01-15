<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Page Loader -->
	<div id="loader-wrapper">
		<div id="loader"></div>

		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>

	</div>
	<nav class="navbar navbar-expand-lg">
		<div class="container-fluid">
			<a class="navbar-brand" href="index"> <i class="fas fa-film mr-2"></i>
				G5-Movie
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link nav-link-1"
						aria-current="page" href="index">Trang chủ</a></li>
					<li class="nav-item"><a class="nav-link nav-link-2"
						href="dangnhap">Đăng nhập</a></li>
					<li class="nav-item"><a class="nav-link nav-link-3"
						href="dangky">Đăng ký</a></li>
					<li class="nav-item"><a class="nav-link nav-link-4"
						href="quenmatkhau">Quên mật khẩu</a></li>
					<li class="nav-item"><a class="nav-link nav-link-1"
						href="yeuthich">Ưa thích</a></li>
					<li class="nav-item"><a class="nav-link nav-link-2"
						href="lichsu">Lịch sử</a></li>
					<li class="nav-item"><a class="nav-link nav-link-3"
						href="dangxuat">Đăng xuất</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="tm-hero d-flex justify-content-center align-items-center"
		data-parallax="scroll" data-image-src="<c:url value='/views/user/img/background.jpg'/>">
	</div>
</body>
</html>