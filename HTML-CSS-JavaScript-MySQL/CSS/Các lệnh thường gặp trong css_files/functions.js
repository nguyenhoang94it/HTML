$(function() {
    var pull 		= $('#pull');
    menu 		= $('#ja-cssmenu');
    menuHeight	= menu.height();
    $(pull).on('click', function(e) {
	e.preventDefault();
	menu.show();
	});
});
