<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/bs-3.3.5/jq-2.1.4,dt-1.10.8/datatables.min.css" />
<script type="text/javascript" src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
<!-- <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script> -->
<!-- <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script> -->
<script>
$(function() {
    USERS.init();
}); 

var USERS = {
    dtTable: $('#list-users'),
    dt: null,
    dtOptions: {
    	pageLength: 3,
        bPaginate: true,
        bLengthChange: true,
        bAutoWidth: false,
        processing: true,
        ordering: true,
        serverSide: false,
        searching: true,
        ajax: {
            url: 'userlist',
            type: 'GET',
            dataSrc: ''
        },
        columns: [
        	{data: "userId"}, 
        	{data: "userPwd"}, 
        	{data: "userNm"}, 
        	{data: "regDtm"}, 
        	{data: "statusCd"}, 
        	{data: "phone"}, 
        	{data: "address"}, 
        	{data: "email"}, 
        	{data: "coin"}
        ]
    }
};

USERS.init = function() {
    var me = this;
	
    me.dt = me.dtTable.DataTable(me.dtOptions);
    me.dt.draw();
    // 조회 ----------------------------------------------------------------
    /* $(me.formSearch).submit(function(event) {
        event.preventDefault();
        me.dt.draw();
    }); */
};
</script>