// //print all even numbers from 0-100
// for(let i=0;i<=100;i++){
// if(i % 2==0){
//     console.log("even=",i)
// }
// }
// //print all odd numbers from 0-100
// for(let i=0;i<=100;i++){
//     if(i % 2==0){
//         console.log("odd=",i)
//     }
//     }

//create a game to guess correct number take number from user
let num=7;
let guess=prompt("Guess the Number");
    while(num != guess){
        guess=prompt("Guess the Number");
    }
    console.log("correct answer");