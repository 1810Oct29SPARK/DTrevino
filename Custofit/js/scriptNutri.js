// Global variables
var API_KEY = `QIxxSC2TM4HbAEH3zLwO6CDoFGUDsjYXaa7z4kCq`;

var AUTO_SUGGEST = "https://ndb.nal.usda.gov/ndb/search/autosuggest?manu=&amp;ingred=&amp;ds=Standard+Reference&amp;fgcd=&term=";
// var LIST_URL = `https://api.nal.usda.gov/ndb/list?format=json&lt=g&sort=n&api_key=${API_KEY}`;

var SEARCH_URL = `https://api.nal.usda.gov/ndb/search/?format=json&sort=n&max=25&ds=Standard+Reference&offset=0&api_key=${API_KEY}&q=`;
var SPECIFIC_FOOD_SEARCH = `https://api.nal.usda.gov/ndb/reports/?&type=b&format=json&api_key=${API_KEY}&ndbno=`;



function createHTML(name,calories, protein, fat, carbs){
	var bgClass;

  var htmlString =	'<div class="setBorder ' + bgClass + '">' +
                                            '<strong> Name </strong>' +
                                            '<div class="name">' + name + '</div>' + 
                                            '<p> Calories </p>' +
                                            '<div class="nutrition">' +  calories + '</div>'+
                                            '<p> Fat </p>' +
                                            '<div class="nutrition">' +fat+ '</div>' +
                                            '<p> Carbs </p>' +
                                            '<div class="nutrition">' + carbs+ '</div>' + 
                                            '<p> Protein </p>' +
                                            '<div class="nutrition">' + protein+ '</div>'+
										'</div>';
	$('#dietResults').prepend(htmlString);
}

$(document).ready(function() {
  // $('#fetch').on('click', function() {
  //   console.log("Button clicked")
  // })
  $('#searchItem, #fetch').on('click, keyup', function(e) {

    if (e.which == 13) {
      var searchTerm = $('#searchItem').val();

      $.ajax({
        type: "GET",
        url: SEARCH_URL + searchTerm,
        success: function(data) {

          if (!data.list.item[0].ndbno) {
            return;
          }

          var ndbno = data.list.item[0].ndbno;

          $.ajax({
            type: "GET",
            url: SPECIFIC_FOOD_SEARCH + ndbno,
            success: function(data) {
              console.log(data)
              console.log("Success!")

              
              var nutrients_object = data.report.food.nutrients;
              var name = data.report.food.name;
              var calories = nutrients_object[1].value; 
              var protein = nutrients_object[2].value; 
              var fat = nutrients_object[3].value; 
              var carbs = nutrients_object[4].value;


             
              

              $('tbody > tr').remove();
              
              createHTML(name,calories, protein, fat, carbs);
            },
            error: function(jqXHR) {
              console.log("Error in second AJAX call.")
              $('tbody > tr').remove();
              $('#results').append("<tr><td>Not found.</td><td> </td></tr>");
            }
          });

        },
        error: function(jqXHR) {
          console.log("something went wrong.")
        }
      });

    }
  });
})
