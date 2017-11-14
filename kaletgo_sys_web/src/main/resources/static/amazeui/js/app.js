$(function() {
    //     // 判断用户是否已有自己选择的模板风格
    //    if(storageLoad('SelcetColor')){
    //      $('body').attr('class',storageLoad('SelcetColor').Color)
    //    }else{
    //        storageSave(saveSelectColor);
    //        $('body').attr('class','theme-black')
    //    }

    autoLeftNav();
    $(window).resize(function() {
        autoLeftNav();
        console.log($(window).width())
    });

    //    if(storageLoad('SelcetColor')){

    //     }else{
    //       storageSave(saveSelectColor);
    //     }
})
// 风格切换

$('.tpl-skiner-toggle').on('click', function() {
    $('.tpl-skiner').toggleClass('active');
})

$('.tpl-skiner-content-bar').find('span').on('click', function() {
    $('body').attr('class', $(this).attr('data-color'))
    saveSelectColor.Color = $(this).attr('data-color');
    // 保存选择项
    storageSave(saveSelectColor);

})




// 侧边菜单开关


function autoLeftNav() {



    $('.tpl-header-switch-button').on('click', function() {
        if ($('.left-sidebar').is('.active')) {
            if ($(window).width() > 1024) {
                $('.tpl-content-wrapper').removeClass('active');
            }
            $('.left-sidebar').removeClass('active');
        } else {

            $('.left-sidebar').addClass('active');
            if ($(window).width() > 1024) {
                $('.tpl-content-wrapper').addClass('active');
            }
        }
    })

    if ($(window).width() < 1024) {
        $('.left-sidebar').addClass('active');
    } else {
        $('.left-sidebar').removeClass('active');
    }
}


// 侧边菜单
$('.sidebar-nav-sub-title').on('click', function() {
    alert(123);
    $(this).siblings('.sidebar-nav-sub').slideToggle(80)
        .end()
        .find('.sidebar-nav-sub-ico').toggleClass('sidebar-nav-sub-ico-rotate');
})

function loadNavbar(tagId,url){
    // ajax load navbar
    var menu = '';
    $.ajax({
        url:url,
        dataType:'json',
        async:false,
        success:function(data){

            for (var i=0;i<data.length;i++){
                if (data[i].children.length != 0){
                    menu += '<li class="sidebar-nav-link"> <a href="javascript:;" class="sidebar-nav-sub-title">'
                        +'<i class="am-icon-home sidebar-nav-link-logo"></i> '+data[i].title +
                        '<span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span></a>';

                    var chil = data[i].children;
                    menu += '<ul class="sidebar-nav sidebar-nav-sub">';
                    for (var j=0;j<chil.length;j++){
                        menu += '<li class="sidebar-nav-link">' +
                            '            <a onclick="navbarClick('+"'"+chil[j].id+"','"+chil[j].title+"','"+chil[j].url+"'"+')">' +
                            '                <span class="am-icon-angle-right sidebar-nav-link-logo"></span>'+chil[j].title +
                            '            </a>' +
                            '        </li>';
                    }

                    menu += '</ul></li>';
                }else{
                    menu += '<li class="sidebar-nav-link"> <a onclick="navbarClick('+"'"+data[i].id+"','"+data[i].title+"','"+data[i].url+"'"+')">'
                        +'<i class="am-icon-home sidebar-nav-link-logo"></i> '+data[i].title+'</a></li>';
                }
            }

        }
    })
    $('#'+tagId).append(menu);

    $('.sidebar-nav-sub-title').on('click', function() {
        $(this).siblings('.sidebar-nav-sub').slideToggle(80)
            .end()
            .find('.sidebar-nav-sub-ico').toggleClass('sidebar-nav-sub-ico-rotate');
    })

}

function navbarClick(id,text,url){

    var $tab = $('#center_tab');
    var $nav = $tab.find('.am-tabs-nav');
    var $bd = $tab.find('.am-tabs-bd');
// add tab
    var nav = '<li><span class="am-icon-close"></span>' +
        '<a  href="javascript: void(0)">' + 123 + '</a></li>';
    var content = '<div id="'+id+'" class="am-tab-panel"> </div>';

    $nav.append(nav);
    $bd.append(content);

    var pymParent = new pym.Parent(id, url, {});
    $tab.tabs('refresh');

    // 移除标签页
    $nav.on('click', '.am-icon-close', function() {
        var $item = $(this).closest('li');
        var index = $nav.children('li').index($item);

        $item.remove();
        $bd.find('.am-tab-panel').eq(index).remove();

        $tab.tabs('open', index > 0 ? index - 1 : index + 1);
        $tab.tabs('refresh');
    });

}

