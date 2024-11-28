// function countvowels(str){
//     let count=0;
//     for (const char of str){
//         if(char === "a" || char === "e" || char === "i" || char === "o" || char === "u" )
//              {
//             count++;
//         }
//     }
//      console.log(count);
// }

// //Arrow Function 

// const countvow=(str) =>{
//     let count=0;
//     for (const char of str){
//         if(char === "a" || char === "e" || char === "i" || char === "o" || char === "u" )
//              {
//             count++;
//         }
//     }
//      console.log(count);
// }

// //forEach Loop 

// let square=[1,2,3,4,5,];

// square.forEach((val)=>{
//     console.log(val,(val*val));
// });

//student marks

// let marks=[45,64,96,48,93,64];

// let newmarks=marks.filter((val)=>{
//    return val >90;
// });
// console.log(newmarks);

//Q2

let number=prompt("Enter a Number");

let arr=[];

for(let i=1;i<=number;i++){
    arr[i-1]=i;
};
console.log(arr);

let sum=arr.reduce((res,current)=>{
    return res + current;
});
console.log("sum =",sum);


let factorial=arr.reduce((res,current)=>{
    return res * current;
});
console.log("factorial =",factorial);