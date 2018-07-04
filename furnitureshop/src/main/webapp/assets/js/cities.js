var cnt= document.getElementById('content');

var names=["Adilabad",
"Agra",
"Ahmedabad",
"Ahmednagar",
"Aizawl",
"Ajitgarh (Mohali)",
"Ajmer",
"Akola",
"Alappuzha",
"Aligarh",
"Alirajpur",
"Allahabad",
"Almora",
"Alwar",
"Ambala",
"Ambedkar Nagar",
"Amravati",
"Amreli district",
"Amritsar",
"Anand",
"Anantapur",
"Anantnag",
"Angul",
"Anjaw",
"Anuppur",
"Araria",
"Ariyalur",
"Arwal",
"Ashok Nagar",
"Auraiya",
"Aurangabad",
"Aurangabad",
"Azamgarh",
"Badgam",
"Bagalkot",
"Bageshwar",
"Bagpat",
"Bahraich",
"Baksa",
"Balaghat",
"Balangir",
"Balasore",
"Ballia",
"Balrampur",
"Banaskantha",
"Banda",
"Bandipora",
"Bangalore Rural",
"Bangalore Urban",
"Banka",
"Bankura",
"Banswara",
"Barabanki",
"Baramulla",
"Baran",
"Bardhaman",
"Bareilly",
"Bargarh (Baragarh)",
"Barmer",
"Barnala",
"Barpeta",
"Barwani",
"Bastar",
"Basti",
"Bathinda",
"Beed",
"Begusarai",
"Belgaum",
"Bellary",
"Betul",
"Bhadrak"
];
var select=document.createElement('select');

for(var i=0;i<names.length;i++)
{

	var option=document.createElement('option');
	{
		option.innerHTML=names[i];
	}
	
	
	select.appendChild(option);
}
cnt.appendChild(select);
select.style.width="100%";
select.style.padding="12px 14px";

