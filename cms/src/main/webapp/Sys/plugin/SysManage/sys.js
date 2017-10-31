/**
 * Created by Mr SJL on 2017/9/4.
 */
$(function () {
    var layer;
    layui.use(['layer', 'element', 'table'], function(){
        Fv.config.layer = layui.layer;
        Fv.config.element = layui.element;
        Fv.config.table = layui.table;
    });
    var sys = "01";
    Fv.ajax.syncGet("/sys/getMenu/" + sys,
        {}
        , function (data) {
            main.menu.left_menu(data, "#left_menu");
            // main.menu.top_menu(data, "#top_menu");
            //JavaScript代码区域
            layui.use('element', function(){
                var element = layui.element;

            });
            Fv.ajax.loadJs(["/Sys/plugin/SysConfig/LeftMenuManage/LeftMenuManage.js"]);

        },
        function () {
            layer.alert("System Exception, Please contact manager!", {
                icon : 2
            })
        })
})