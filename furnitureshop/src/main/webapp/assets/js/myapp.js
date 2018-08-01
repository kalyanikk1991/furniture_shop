$(function() {
	//Solving active menu problem
	switch(menu){
	
	case 'Aabout Us':
		$('#about').addClass('active');
		break;
		
	case 'contact':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
		
	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
	
	
	//code forjquery datatable
	//create a dataset
	
	var products=[
	              
	              ['1','abc'],
	              ['2','efg'],
	              ['3','hij'],
	              ['4','klm'],
	              ['5','nop'],
	              ['6','uvw'],
	              ['7','qrs'],
	              ['8','xyz']
	              
	              ];
	
	
	var $table=$('#productListTable');
	//execute the below codeonly where we have this table
	
	if($table.length){
		
		
		$table.DataTable({
			
			data:products
			
		});
		
		
		
		}
	
	
});