<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/spring1/users/">用户管理</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="/spring1/users/new">新增</a></li>
        <li><a href="/spring1/users/">列表</a></li>
      </ul>
      <form class="navbar-form navbar-right" role="search" method="get" action="/spring1/users/">
        <div class="form-group">
          <input class="form-control" placeholder="请输入用户名" type="text" name="userName">
        </div>
        <button type="submit" class="btn btn-default">查询</button>
      </form>
    </div>
  </div>
</nav>