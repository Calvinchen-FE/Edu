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
<div id="page-title">
</div>
<div id="page-content">
        <div class="panel" name="datatable">
            <div class="panel-heading">
                <h3 class="panel-title"><span data-lang="goodsBuy_title">培训信息</span></h3>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="goodsBuy_table_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer"><div class="row"><div class="col-sm-12">
                            <table class="table table-striped table-bordered table-hover text-center dataTable">
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
                                <tbody  id="dataList">
                                </tbody>
                            </table>
                        </div></div>
                        <div class="row">
                            <div class="col-sm-2">
                            <div class="dataTables_info" id="goodsBuy_table_info">第 0 到 0 条记录，共 0 条</div>
                            </div>
                            <div class="col-sm-2">
                                <div><label>每页显示条数: <select class="form-control input-sm"><option value="5">5</option><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select></label></div>
                            </div>
                            <div class="col-sm-8">
                                <div class="dataTables_paginate paging_full_numbers">
                                    <ul class="pagination">
                                        <li class="paginate_button first disabled" id="goodsBuy_table_first"><a href="javascript:;" >首页</a></li>
                                        <li class="paginate_button previous disabled"><a href="javascript:;">上页</a></li>
                                        <li class="paginate_button previous disabled"><a href="javascript:;">当前第1页</a></li>
                                        <li class="paginate_button next disabled"><a href="javascript:;">下页</a></li>
                                        <li class="paginate_button last disabled"><a href="javascript:;">末页</a></li>
                                        <li class="paginate_button disabled" style="position: relative;top: 4px;">
                                            &nbsp;&nbsp;
                                            跳转到第<input style="width:40px;" type="text">页
                                        </li>
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
    <div class="modal fade" tabindex="-1" role="dialog" id="baodao">
      <div class="modal-dialog" role="document">
        <div class="modal-content modal-lg">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title">学生明细</h4>
          </div>
          <div class="modal-body">
            
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-success" data-dismiss="modal">确认报到信息</button>
            <button type="button" class="btn btn-primary">取消</button>
          </div>
        </div>
      </div>
    </div>
	<jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>
