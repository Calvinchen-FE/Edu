<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>培训信息</title>
  </head>
  
  <body>
    <div id="container" class="effect mainnav-lg">
        <jsp:include page="header.jsp"></jsp:include>
        <div>
            <div id="content-container"><!--面包屑导航-->
				<div id="page-content">
			        <div class="panel">
			            <div class="panel-heading">
			                <h3 class="panel-title"><span>培训信息</span></h3>
			            </div>
			            <div class="panel-body">
							<div class="row">
								<div class="col-sm-12">
									<div id="goodsBuy_table_wrapper"
										class="dataTables_wrapper form-inline dt-bootstrap no-footer">
										<div class="row">
											<div class="col-sm-12">
												<table
													class="table table-striped table-bordered table-hover text-center dataTable">
													<tr>
														<th>序号</th>
					                                    <th>活动主题</th>
					                                    <th>截止日期</th>
					                                    <th>活动时间</th>
					                                    <th>活动地点</th>
					                                    <th>组织单位</th>
					                                    <th>名额</th>
					                                    <th>活动类型</th>
					                                    <th>状态</th>
					                                    <th>操作</th>
													</tr>
													<tbody id="dataList">
													</tbody>
												</table>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-4"></div>
											<div class="col-sm-8">
												<div class="search-footer dataTables_paginate paging_full_numbers "> 
													<ul id="pageBar" class="pagination">
													</ul>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
			        </div>
				</div>

            <!--左侧垂直导航-->
            <jsp:include page="leftnav.jsp"></jsp:include>
        </div>
      </div>  
    </div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script type="text/javascript" src="<%=basePath%>/resources/js/trainingInfo.js"></script>
  </body>
</html>
