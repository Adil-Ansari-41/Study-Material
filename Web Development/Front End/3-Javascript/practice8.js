// let currmode="light";
// const mode=()=>{
//     if(currmode==="light"){
//        currmode="dark";
//         document.querySelector("body").style.backgroundColor="black";
//     } else{
//         currmode="light";
//         document.querySelector("body").style.backgroundColor="white";
//     }
// }

// btn1.addEventListener("click",mode)

let currmode="light";
let body=document.querySelector("body");
const mode=()=>{
    if(currmode==="light"){
       currmode="dark";
       body.classList.add("dark");
        body.classList.remove("light");
    } else{
        currmode="light";
        body.classList.add("light");
        body.classList.remove("dark");
    }
}

btn1.addEventListener("click",mode)