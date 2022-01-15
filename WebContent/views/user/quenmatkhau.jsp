<%@ page pageEncoding="utf-8"%>
<%@ include file="/views/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<LINK REL="StyleSheet"
	HREF="<%=request.getContextPath()%>/views/user/general.css"
	TYPE="text/css">
<title>G5-Movie</title>
<%@ include file="/views/common/head.jsp"%>
</head>
<body>
	<%@ include file="/views/common/header1.jsp"%>

	<div class="container-fluid tm-mt-60" style="text-align: center;">
		<div class="row tm-mb-50">
			<div class="col-lg-12 col-12 mb-5">
				<h2 class="tm-text-primary mb-5">Quên mật khẩu</h2>
				<form id="contact-form" action="" method="POST"
					class="tm-contact-form mx-auto">
					<div class="form-group">
						<input type="text" name="name" class="form-control rounded-0"
							placeholder="Tên đăng nhập" required />
					</div>
					<div class="form-group">
						<input type="email" name="email" class="form-control rounded-0"
							placeholder="Email" required />
					</div>
					<div class="form-group tm-text-right">
						<button type="submit" class="btn btn-primary">Lấy lại mật khẩu</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- container-fluid, tm-container-content -->


	<%@ include file="/views/common/footer.jsp"%>
</body>
</html>