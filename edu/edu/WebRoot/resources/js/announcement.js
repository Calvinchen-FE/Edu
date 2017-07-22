var Announcement = function(){  
    this.init = function(){  
        $('#inquireBtn').unbind('click').bind('click', function() {  
//            $('#pageNo').val(1);// 每次查询都默认为打开第一页  
            announcement.settingQuery();  
        });  
    };  
    //根据查询条件查询  
    this.settingQuery = function(){  
        $('#pageBar').html('');  
        var url = 'announcement/getAllTzgg.do';  
        var inquireData = announcement.acquireInquireData();  
        $.ajax({
            type: 'post',  
            async: true,  
            url: url,  
            data: JSON.stringify(inquireData),
            dataType: "JSON",
            contentType:'application/json;charset=UTF-8',//关键是要加上这行
            traditional:true,//这使json格式的字符不会被转码
            success: function (result) {
                announcement.callback(result);  
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
            xHtml += '<tr><td colspan="2">没有数据</td></tr>';  
            $('#dataList').html(xHtml);  
        } else {  
            for (var i = 0; i < list.length; i++) {  
                detailId = i;  
                xHtml += '<tr>';  
                xHtml += '<td>'+ list[i].tzggnr + '</td>';  
                xHtml += '<td>'+ list[i].create_at + '</td>';  
                xHtml += '</tr>';  
            }  
            $('#dataList').html(xHtml);  
            var pageBarStr = pageBar.pageInit(showData.page.totalPage, showData.page.pageNo,showData.page.totalCount, announcement.clickPage, 5);
            $('.search-footer').html(pageBarStr);  
        } 
    };  
      
    this.clickPage = function(page){  
        $('#pageNo').val(page);// 修改为当前页,然后翻页查询  
        announcement.settingQuery();  
    };  
};  
var announcement;  
$(function(){  
      
    announcement = new Announcement();  
    announcement.init();  
    //默认显示查询结果  
    announcement.settingQuery();  
});
