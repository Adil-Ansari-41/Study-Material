// let heading=document.querySelector("h2");
// heading.innerText= heading.innerText + " HTML CSS JAVASCRIPT";

// let divs=document.querySelectorAll(".box");
// // divs.innerHTML ="<b>HELLO WORLD </b>";
// divs[0].innerHTML="<b>HTML</b>";
// divs[1].innerHTML="<b>CSS</b>";
// divs[2].innerHTML="<b>JAVASCRIPT</b>";

// // for(div of divs){
// //     div.innerText="HELLO";
// // }

let newbtn=document.createElement("button");
newbtn.innerText="click me";
newbtn.style.backgroundColor="red";
newbtn.style.color="white";

document.querySelector("body").prepend(newbtn);

//Q2

let para=document.querySelector("p");

para.setAttribute("para", "newpara");

para.classList.add("newpara");