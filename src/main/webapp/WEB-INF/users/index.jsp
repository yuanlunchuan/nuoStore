<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
</head>
<body>
  <%@ include file="_header.jsp"%>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="alert alert-dismissible alert-success">
          <button type="button" class="close" data-dismiss="alert">&times;</button>${userName}创建成功
        </div>
		<table class="table table-striped table-hover ">
		  <thead>
		    <tr>
		      <th>#</th>
		      <th>Column heading</th>
		      <th>Column heading</th>
		      <th>Column heading</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td>1</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		    <tr>
		      <td>2</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		    <tr class="info">
		      <td>3</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		    <tr class="success">
		      <td>4</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		    <tr class="danger">
		      <td>5</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		    <tr class="warning">
		      <td>6</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		    <tr class="active">
		      <td>7</td>
		      <td>Column content</td>
		      <td>Column content</td>
		      <td>Column content</td>
		    </tr>
		  </tbody>
		</table> 
      </div>
    </div>
  </div>
</body>
</html>
