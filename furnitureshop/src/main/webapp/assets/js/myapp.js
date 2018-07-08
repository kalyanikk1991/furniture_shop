$(function() {
	//Solving active menu problem
	switch(menu){
	
	case 'Aabout Us':
		$('#about').addClass('active');
		break;
		
	case 'Products':
		$('#product').addClass('active');
		break;
		
	default:
		$('#home').addClass('active');
		break;
	}
	
	
	
});