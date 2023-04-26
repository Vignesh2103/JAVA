function fun() {
    
    let val1=document.getElementById("myemail").value;
    alert(val1)
   

    
}

// function ready() {
//     alert('DOM is ready');

//     // image is not yet loaded (unless it was cached), so the size is 0x0
//     alert(`Image size: ${img.offsetWidth}x${img.offsetHeight}`);
//   }

//   //document.addEventListener("DOMContentLoaded", ready);


// function displayGreeting() {
//    let name = document.getElementById("email").value;
//    document.getElementById("output").innerHTML="Hello"+name+"Welcome to the page";

//   }
 function display(){
  let queryString = window.location.search;
  let params = new URLSearchParams(queryString);
  let fname =params.get('fname');
  let username= params.get('username');
   let data=`
   <p>Welcome to Home Page ${fname}<p>
   <p>You logged as ${username} <p>
   `
   ;
   document.getElementById('datacontainer').innerHTML=data;

 }