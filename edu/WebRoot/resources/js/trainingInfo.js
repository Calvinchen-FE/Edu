$(function(){
	$('#datetimepicker').datetimepicker();
	$.ajax({
		url : 'trainingInfo/getAllPxhd.do',
		async : false,
		type : "POST",
		dataType : 'json',
		data : {"kaptcha":1},
		success : function(data){
			for(var i = 0; i < data.length; i++){
				var tr = '<tr><td>'+ i +'</td>'+
		        '<td>'+ data[i].xymc +'</td>'+
		        '<td>'+ data[i].bmsj +'</td>'+
		        '<td>'+ data[i].bmsj +'</td>'+
		        '<td>'+ data[i].xm +'</td>'+
		        '<td>'+ data[i].bmbz +'</td>'+
		        '<td>'+ data[i].bmsj +'</td>'+
		        '<td>'+ data[i].pjbz +'</td>'+
		        '<td>'+ data[i].pjnf +'</td>'+
		        '<td>'+ data[i].pjsj +'</td>'+
		        '</tr>';
				$('#dataList').append($(tr));
			}
		}
	});
})
