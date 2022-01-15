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
	<%@ include file="/views/common/header1.jsp"%>

	<div class="container-fluid tm-container-content tm-mt-60">
		<div class="row mb-4">
			<h2 class="col-12 tm-text-primary">Avatar</h2>
		</div>
		<div class="row tm-mb-90">
			<div class="col-xl-8 col-lg-7 col-md-6 col-sm-12">
				<iframe id="tm-video" src="https://www.youtube.com/embed/5PSNL1qE6VY"></iframe>
			</div>
			<div class="col-xl-4 col-lg-5 col-md-6 col-sm-12">
				<div class="tm-bg-gray tm-video-details">
					<div class="text-center mb-5">
						<a href="#" class="btn btn-primary tm-btn-big">Like</a>
					</div>
					<div class="mb-4">
						<h3 class="tm-text-gray-dark mb-3">Mô tả</h3>
						<p>Đây là một bộ phim HAY!!</p>
					</div>
				</div>
			</div>
		</div>
		<!-- row -->
	</div>
	<!-- container-fluid, tm-container-content -->
	<%@ include file="/views/common/footer.jsp"%>
</body>
</html>