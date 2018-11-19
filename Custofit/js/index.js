var menuToggle = document.querySelector("#menu-toggle");
var activeElements = document.querySelectorAll(".active-element");
var toggledMenu = menuToggle.addEventListener("click", function(){
     // forEach is not supported in IE11
  // activeElements.forEach(function(e){
  //     e.classList.toggle("active");
  // });
     for(var activated = 0; activated < activeElements.length; activated++){
          activeElements[activated].classList.toggle("active");
     }
})

var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {

     modal.style.display = "none";
      
    }
}




var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
    var username = document.getElementById("uname").value;
    var password = document.getElementById("psw").value;
    if ( username == "Danny" && password == "password"){

        window.open("file:///C:/Users/danny/Documents/Custofit/user.html"); 
        return true;  
    }
    else{
        attempt --;// Decrementing by one.
        alert("You have left "+attempt+" attempt;");
        // Disabling fields after 3 attempts.
        if( attempt == 0){
        document.getElementById("uname").disabled = true;
        document.getElementById("psw").disabled = true;
        document.getElementById("loginButton").disabled = true;
        return false;
    }
    }
}

var bodyType, bodyGoal, dietChoice, dietPlan, workoutPlan, resources; 


$(document).ready(function(){

    $("#bodyGoal").hide();
     
      $('#image1').click(function(){
          $("#bodyType").hide(1000);
          $("#bodyGoal").show(1000);
          bodyType = 1; 
      });
  
         $('#image2').click(function(){
          $("#bodyType").hide(1000);
          $("#bodyGoal").show(1000);
          bodyType = 2; 
      });
  
         $('#image3').click(function(){
          $("#bodyType").hide(1000);
          $("#bodyGoal").show(1000);
          bodyType = 3; 

      }); $('#image4').click(function(){
        $("#bodyGoal").hide(1000);
        bodyGoal = 1; 
        dietPlan(bodyType, bodyGoal);
    });

       $('#image5').click(function(){
        $("#bodyGoal").hide(1000);
        bodyGoal = 2; 
        dietPlan(bodyType, bodyGoal);
    });

       $('#image6').click(function(){
        $("#bodyGoal").hide(1000);
        bodyGoal = 3; 
        dietPlan(bodyType, bodyGoal);
    });

  })


  function dietPlan(bodyChoice, goalChoice){



        if (bodyChoice == 1 && goalChoice ==1){

        }

        else if (bodyChoice == 1 && goalChoice ==2){
            
        } 

        else if (bodyChoice == 3 && goalChoice ==3){
            
        }

        else if (bodyChoice == 2 && goalChoice ==1){
            
        }

        else if (bodyChoice == 2 && goalChoice ==2){
            
        }

        else if (bodyChoice == 2 && goalChoice ==3){
            
        }

        else if (bodyChoice == 3 && goalChoice ==1){
            
        }

        else if (bodyChoice == 3 && goalChoice ==2){
            
        }

        else {
            
        }



  }