function display(){
    alert("hi");
    let queryString = window.location.search;
    let params = new URLSearchParams(queryString);
    let fname= params.get('fname');
    let data =`
    <p>You logged as ${fname}</p>
    `;
    document.getElementById('datacontainer').innerHTML=data;
 
  
   }