$(document).ready(function(){
    $('a').click(function(){
        //alert("i am angger");
        var selected = $(this);
        $('a').removeClass('active');
        $(selected).addClass('active')
    });
    var $a = $('.a'),
    $b = $('.b'),
    $c = $('.c'),
    $d = $('.d'),	
    $home = $('.hom-weedid'),
    $aboutme = $('.im'),
    $vidio = $('.skills');
    /* $contact = $('.contact'); */
    

    $a.click(function(){
        $home.fadeIn();
        $aboutme.fadeOut();
        $vidio.fadeOut();
        $contact.fadeOut();
    });
    $b.click(function(){
        $aboutme.fadeIn();
        $home.fadeOut();
        $vidio.fadeOut();
        $contact.fadeOut();
    });
   
    $c.click(function(){
        $vidio.fadeIn();
        $home.fadeOut();
        $aboutme.fadeOut();
        $contact.fadeOut();
    });
    $d.click(function(){
        $contact.fadeIn();
        $home.fadeOut();
        $aboutme.fadeOut();
        $vidio.fadeOut();
    });
})