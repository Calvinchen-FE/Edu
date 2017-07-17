var TrainingInfo = function(){  
    this.init = function(){  
        $('#inquireBtn').unbind('click').bind('click', function() {  
//            $('#pageNo').val(1);// 每次查询都默认为打开第一页  
            trainingInfo.settingQuery();  
        });  
    };  
    //根据查询条件查询  
    this.settingQuery = function(){  
        $('#pageBar').html('');  
        var url = 'trainingInfo/getAllPxhd.do';  
        var inquireData = trainingInfo.acquireInquireData();  
        $.ajax({
            type: 'post',  
            async: true,  
            url: url,  
            data: JSON.stringify(inquireData),
            dataType: "JSON",
            contentType:'application/json;charset=UTF-8',//关键是要加上这行
            traditional:true,//这使json格式的字符不会被转码
            success: function (result) {
                trainingInfo.callback(result);  
            }  
        });  
      
    };  
    this.acquireInquireData = function(){ 
        var data = {
        		pageSize:10,  
                pageNo : $('#pageNo').val()
        };  
        return data;  
    };    
  
    //返回查询结果  
    this.callback = function(showData) { 
    	var pageNoInput = '<input type="hidden" id="pageNo" value="'+showData.page.pageNo+'"/>';
    	$('body').append($(pageNoInput));
        var xHtml = '';  
        var list = showData.list;
        if (list.length == 0) {  
            xHtml += '<tr><td colspan="7">没有数据</td></tr>';  
            $('#dataList').html(xHtml);  
        } else {  
            for (var i = 0; i < list.length; i++) {  
                detailId = i;  
                xHtml += '<tr><td>'+ i +'</td>'+
		        '<td>'+ list[i].hdzt +'</td>'+
		        '<td>'+ list[i].bmjzsj +'</td>'+
		        '<td>'+ list[i].hdsj +'</td>'+
		        '<td>'+ list[i].hddd +'</td>'+
		        '<td>'+ list[i].hdzzdw +'</td>'+
		        '<td>'+ list[i].zdcyrs +'</td>'+
		        '<td>'+ list[i].pjbz +'</td>'+
		        '<td>'+ list[i].pjnf +'</td>'+
		        '<td><a class="link" href="javascript:;">报名</a></td>'+
		        '</tr>';
            }  
            $('#dataList').html(xHtml);  
            var pageBarStr = pageBar.pageInit(showData.page.totalPage, showData.page.pageNo,showData.page.totalCount, trainingInfo.clickPage, 5);
            $('.search-footer').html(pageBarStr);  
        } 
    };  
      
    this.clickPage = function(page){  
        $('#pageNo').val(page);// 修改为当前页,然后翻页查询  
        trainingInfo.settingQuery();  
    };  
};  
var trainingInfo;  
$(function(){  
      
    trainingInfo = new TrainingInfo();  
    trainingInfo.init();  
    //默认显示查询结果  
    trainingInfo.settingQuery();  
});
