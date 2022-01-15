<%@ page pageEncoding="utf-8"%>
<%@ include file="/views/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>G5-Movie</title>
<%@ include file="/views/common/head.jsp"%>
</head>
<body>
	<%@ include file="/views/common/header.jsp"%>

	<div class="container-fluid tm-container-content tm-mt-60">
		<div class="row mb-4">
			<h2 class="col-6 tm-text-primary">Danh sách</h2>
			<div class="col-6 d-flex justify-content-end align-items-center">
				<form action="" class="tm-text-primary">
					Trang <input type="text" value="1" size="1"
						class="tm-input-paging tm-text-primary"> of 200
				</form>
			</div>
		</div>
		<div class="row tm-mb-90 tm-gallery">
			<div class="col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5">
				<h5 class="tm-text-secondary"
					style="white-space: nowrap; overflow: hidden;">Wall E</h5>
				<figure class="effect-ming tm-video-item">
					<img src="<c:url value='views/user/img/poster1.jpg'/>" alt="Image"
						class="img-fluid">
					<figcaption
						class="d-flex align-items-center justify-content-center">
						<h2>Wall E</h2>
						<a href="chitiet">View more</a>
					</figcaption>
				</figure>
				<div class="d-flex justify-content-between tm-text-gray">
					<span class="tm-text-gray-light">18 Oct 2020</span> <span>9,906
						views</span>
				</div>
			</div>
			<div class="col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5">
				<h5 class="tm-text-secondary"
					style="white-space: nowrap; overflow: hidden;">Avatar</h5>
				<figure class="effect-ming tm-video-item">
					<img src="<c:url value='views/user/img/poster2.jpg'/>" alt="Image"
						class="img-fluid">
					<figcaption
						class="d-flex align-items-center justify-content-center">
						<h2>Avatar</h2>
						<a href="chitiet">View more</a>
					</figcaption>
				</figure>
				<div class="d-flex justify-content-between tm-text-gray">
					<span class="tm-text-gray-light">14 Oct 2020</span> <span>16,100
						views</span>
				</div>
			</div>
			<div class="col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5">
				<h5 class="tm-text-secondary"
					style="white-space: nowrap; overflow: hidden;">Aladin</h5>
				<figure class="effect-ming tm-video-item">
					<img src="<c:url value='views/user/img/poster3.jpg'/>" alt="Image"
						class="img-fluid">
					<figcaption
						class="d-flex align-items-center justify-content-center">
						<h2>Aladin</h2>
						<a href="chitiet">View more</a>
					</figcaption>
				</figure>
				<div class="d-flex justify-content-between tm-text-gray">
					<span class="tm-text-gray-light">14 Oct 2020</span> <span>16,100
						views</span>
				</div>
			</div>
			<div class="col-xl-3 col-lg-4 col-md-6 col-sm-6 col-12 mb-5">
				<h5 class="tm-text-secondary"
					style="white-space: nowrap; overflow: hidden;">Lord of the
					Rings</h5>
				<figure class="effect-ming tm-video-item">
					<img src="<c:url value='views/user/img/poster4.jpg'/>" alt="Image"
						class="img-fluid">
					<figcaption
						class="d-flex align-items-center justify-content-center">
						<h2>LoR</h2>
						<a href="photo-detail.html">View more</a>
					</figcaption>
				</figure>
				<div class="d-flex justify-content-between tm-text-gray">
					<span class="tm-text-gray-light">14 Oct 2020</span> <span>16,100
						views</span>
				</div>
			</div>
		</div>
		<!-- row -->
		<div class="row tm-mb-90">
			<div
				class="col-12 d-flex justify-content-between align-items-center tm-paging-col">
				<a href="javascript:void(0);"
					class="btn btn-primary tm-btn-prev mb-2 disabled">Previous</a>
				<div class="tm-paging d-flex">
					<a href="javascript:void(0);" class="active tm-paging-link">1</a> <a
						href="javascript:void(0);" class="tm-paging-link">2</a> <a
						href="javascript:void(0);" class="tm-paging-link">3</a> <a
						href="javascript:void(0);" class="tm-paging-link">4</a>
				</div>
				<a href="javascript:void(0);" class="btn btn-primary tm-btn-next">Next
					Page</a>
			</div>
		</div>
	</div>
	<!-- container-fluid, tm-container-content -->

	<%@ include file="/views/common/footer.jsp"%>
</body>
</html>