//this is single line comment
/*this is 
multi line
comment*/

//variables and Datatypes

// console.log("Hello World");
// console.log('javascript');
// document.write("hello");

// name="Adil";
// console.log("name");
// console.log(name);
// age=18;
// console.log("age");
// console.log(age);
// price=90.86;
// console.log("price");
// console.log(price);

// x=null;
// console.log("x");
// console.log(x);
// y=undefined;
// console.log("y");
// console.log(y);

// isfollow=false;
// console.log(isfollow);

// var num_one=45;
// let b123=29;
// const PI$=3.14;

// console.log(num_one);
// console.log(b123);
// console.log(PI$);

// {
//     let a=5;
//     console.log(a);
// }
// {
//     let a=10;
//     console.log(a);
// }

// let date=18;

// let cost=50.78;

// let b=BigInt("123");

// let s=Symbol("Hello!");

// const student={
//     name:"zaid",
//     age:18,
//     cgpa:8.5,
//     ispass:true
// };
// console.log(student["age"]);
// console.log(student.name);
// student["age"]=student["age"]+1;
// console.log(student.age);
// student["name"]="Faiz";
// console.log(student.name);

//Operators

//Arithmetic operators

// let a=10;
// let b=5;
// console.log("a=",a,"& b=",b)
// console.log("a+b=",a+b);
// console.log("a-b=",a-b);
// console.log("a*b=",a*b);
// console.log("a/b=",a/b);
// console.log("a%b=",a%b); //Modulus operator
// console.log("a^b=",a**b,"b^a=",b**a); //a^b  or b^a
// console.log("a+1=",a++,"b+1=",b--);//unary operator using post increment and post decrement in this line
// console.log("a+1=",++a,"b+1=",--b);//unary operator using pre increment and pre decrement in this line


//Assignment operator

// let a=5;
// let b=2;

// a +=4;//a+4=9
// console.log(a);
// b -=1;//a-1=0
// console.log(b);
// a *=4;//a*4=20
// console.log(a);
// b /=1;// a/1=2
// console.log(b);
// a **=4;//a^4=625
// console.log(a);

//Comparison operator

// let a=5;
// let b="5"; //convert this string into number and then compare it
// console.log("a=",a,"b=",b);

// console.log("a==b",a==b);
// console.log("a!=b",a!=b);
// console.log("a<b=",a<b);
// console.log("a<=b=",a<=b);
// console.log("a>b=",a>b);
// console.log("a>=b=",a>=b);


// //strick version in comparison operator  check data type also
// console.log("a===b",a===b); 
// console.log("a!==b",a!==b);

//Logical operator

// let a=6;
// let b=5;
// console.log("a=",a,"b=",b);

// //Logical AND (&&) if both condition true then result is true and if any condition false then result is false
// console.log("a<b && a==b =",a<b && a==b);
// console.log("a>b && a!=b =",a>b && a!=b);

// //Logical OR (||) if both condition false then result is false and if any condition true then result is true
// console.log("a<b || a==b =",a<b || a==b);
// console.log("a>b || a!=b =",a>b || a!=b);
// console.log("a>b || a==b =",a>b || a==b);

// //Logical NOT (!) its convert true into false and false into true
// console.log("!(a>b)=",!(a>b));

/*Conditional Statements  */

//if statement
// let age=25;

// if(age >=18){
//     console.log("you can vote");
// }
// if(age<18){
//     console.log("you can n't vote");
// }

// let mode="dark";
// let color;
// if(mode ==="dark"){
//     color="black";
// }
// if(mode==="light"){
//     color="white";
// }
// console.log("color=",color);

/*if-eles Statement */
// let mode="dark";
// let color;
// if(mode ==="dark"){
//     color="black";
// }else{
//     color="white";
// }
// console.log("color=",color);

// let a=6;

// if( a%2 ===0){
//     console.log(a,"Even Number");
// }else{
//     console.log(a,"Odd Number");
// }

//else-if
// let mode="blue";
// let color="black";

// if(mode=="dark"){  //first check this condition
//     color="black";
// }else if(mode==="light"){  //then check this condition
//     color="white";
// }else if(mode==="blue"){  //then check this condition
//     color="blue";
// } else{                    //if all condition are false then execute this condition
//     color="white"
// }
// console.log(color);

//Ternary Operator  
// let age=25;

// let result=age>18?"adult":"not adult";  //similar to if else statement 
// console.log(result);

// age>18?console.log("adult"):console.log("not adult");

/*POPUP*/
// alert("hello"); //one time popup
// let age=prompt("Enter your age:");  //show popup and take input from user
// console.log(age);


/*Loop control */

/*for Loop*/
// for(i=1;i<=5;i++){
//     console.log("Hello ");
// }
// //Calculate sum of 1 to 5
// // let sum=0;
// // for(i=1;i<=5;i++){
// //     sum=sum+i;
// // }
// // console.log(sum);
// //Calculate sum of 1 to n take n from user
// let sum=0;
// let n=prompt("Enter a number");
// for(i=1;i<=n;i++){
//     sum=sum+i;
// }
// console.log(sum);

/*while Loop*/
// let i=1;
// while(i<=5){
//     console.log("Loop");
//     i++;
// }

/*do while Loop*/
// let i=20;
// do{
//     console.log("Hello");
//     i++;
// }while(i<=10);

/*for of Loop*/
// let str="JavaScript";

// let size=0;
// for(let val of str){
//     console.log("val=",val);
//     size++;
// }
// console.log("string size=",size);

// /*for in Loop*/
// let student={
//     name:"zaid",
//     age:20,
//     cgpa:7.5,
//     ispass:true,
// };
// for(let key in student){
//     console.log("key=",key,"value=",student[key]);
// }

/*Strings */
// let str="hello";
// let ste2='hello';

// //str.length to calculate the string value
// console.log(str[0]);
// console.log(str[3]);

// //Template Literals 
// let specialString=`This is a template Literals`;
// console.log(specialString);

// let obj={
//     item:"pen",
//     price:10,
// };
// console.log("the cost of ",obj.item,"is",obj.price,"rupees");

// console.log(`the cost of ${obj.item} is ${obj.price} rupees`);
// console.log("to brake the \n next line useing back slach n");
// console.log("use tab space \t in this line using back slach t");

/* String methods/functions */
//strings are immutable means it cann't  change the value
// let str="Javascript";
// str.toUpperCase(); //not execute this method 
// console.log(str);
// let newstr=str.toUpperCase(); //now this method execute
// console.log(newstr);

// let str2="Javascript";
// let newstr2=str.toLowerCase(); //now this method execute
// console.log(newstr2);

// let str3="      Java   script    ";
// let newstr3=str.trim(); //removes white spaces
// console.log(newstr3);

// let str4="0123456";
// console.log(str4.slice(1,5));//return part of string

// let str5="Java";
// let str6="Script";
// console.log(str5.concat(str6)); //concatination it add str5 and str6

// let str7="hello";
// console.log(str7.replace("h","e"));//it change the value
// console.log(str7.replaceAll("l","e"));//it change all the value

// let str8="Javascript";
// console.log(str8.charAt(4));//its find the index value

//Array 
//array are mutable means it can be change the value
// let marks=[48,43,63,74,63,25,];
// console.log(marks);
// console.log(marks.length);//length is property 
// //property mean gives some value and function proform some operation
// marks[0]=50;

// let names=["zaid","faraz","anas","ali"];
// console.log(names);

// //for loop for array
// for(let index=0;index < names.length;index++){
//     console.log(names[index]);
// }

// //for of loop for array
// for(let value of names){
//     console.log(value.toUpperCase());
// }

//Array Methods

// let fruits=["apple","mango","banana","litchi"];

// fruits.push("grape","orange","papaya");  //push method
// console.log(fruits);

// let deletedfruits=fruits.pop();  //pop method
// console.log(deletedfruits);

// let marks=[56,34,45,25,78];
// console.log(marks.toString());  //array to string

// let IT=["zaid","ali","anas"];
// let CS=["arham","faraz","fahad"];

// let names=IT.concat(CS,marks);   //add two or more arrays
// console.log(names);

// IT.unshift("Rahil");  //add to zero index
// console.log(IT);

// let deleted=IT.shift(); //its delete and return the value
// console.log(deleted);

// console.log(marks.slice(1,4)); //its return piece of the array

// let new_marks=[45,53,64,75,23,86,45,86,45];
// new_marks.splice(2,1,75);  //its use to add and remove value in array
// console.log(new_marks);

/*Functions */

// function myfunction(){
//     console.log("Hello World");
//     console.log("Javascript");
// }
// myfunction();

// function sum1(a,b){
//     console.log(a+b);
// }
// sum1(3,6);

// function sum2(a,b){   //parameters are local variables of function and it is block scope
//     s= a + b;
//     return s;
// }
// let value=sum2(2,3);
// console.log(value);

//Arrow Function 
// const arrowsum=(a,b)=>{
//     console.log(a+b);
// }
// arrowsum(3,2);

// const arrowmulti=(a,b)=>{
//     return a* b;
// }
// let value=arrowmulti(5,10);
// console.log(value);

//ForEach Loop in Array 

// function abc(){
//     console.log("hello");
// }
// function myfun(abc){
//     return abc;
// }

// //paremeters in forEach are val, idx and arr
// /*forEach are HOF (Higher order function) it means HOF and HOM are methods in JS that either take another
//  function as a paremeter inside them or return another function as output */
// array=[1,2,3,4,5];
// array.forEach(function printval(val){
//     console.log(val);
// });
// array.forEach((val, idx, arr)=>{
//     console.log(val, idx, arr);
// });

//Array Methods Map
// let nums=[45,64,35];

// let newarray=nums.map((val)=>{
//     return val;
// });
// console.log(newarray);

// //filter

// let arr=[1,2,3,4,5,6,7,8,9];

// let evenarr=arr.filter((val)=>{
//     return val % 2 === 0;
// });
// console.log(evenarr);

// //reduce

// let num=[1,2,3,4];

// let newnum=num.reduce((res,current)=>{
//     return res+current;
// });
// console.log(newnum);

// let num2=[1,2,3,4];

// let newnum2=num2.reduce((res,current)=>{
//     return res>current? res:current;
// });
// console.log(newnum2);


// //DOM

// console.dir(document);

// let heading=document.getElementById("heading");

// console.dir(heading);

// let heading2=document.getElementsByClassName("heading2");
// console.dir(heading2);

// let para=document.getElementsByTagName("p");
// console.dir(para);

//  let firstelements=document.querySelector("p");
// console.dir(firstelements);

// let allelements=document.querySelectorAll("p");
// console.dir(allelements);

// let elements=document.querySelector(".heading2");
// console.dir(elements);

// let element=document.querySelector("#heading");
// console.dir(element);

// tagName
// element.tagName
// console.log(heading.firstChild.nodeName);
// console.log(heading.lastChild.nodeName);
// console.log(heading.lastChild.tagName);

// //innerText
// console.log(heading.innerText);

// //innerHTML
// console.log(heading.innerHTML);

// //textContent
// console.log(firstelements.textContent);

// let div=document.querySelector("div");
// console.log(div);

// let id=div.getAttribute("id");
// console.log(id);

// let namediv=div.getAttribute("name");
// console.log(namediv);

// console.log(div.setAttribute("class","newbox"));

// let div2=document.getElementById("box");

// console.log(div2.style);

// div2.style.backgroundColor="green";

// let newbtn=document.createElement("button");
// newbtn.innerText="click me !";
// console.log(newbtn);

// let div=document.querySelector("div");
// div.append(newbtn);
// // div.prepend(newbtn);
// // div.before(newbtn);
// // div.after(newbtn);

// let newheading=document.createElement("h1");
// newheading.innerHTML="<i>NEW HEADING</i>";

// document.querySelector("body").prepend(newheading);

// document.querySelector("body").style.backgroundColor="yellow";

// let para=document.getElementsByClassName("para");
// para.remove();

/*Events*/

// let btn1=document.querySelector("#btn1");
// btn1.onclick=()=>{
//     console.log("button1 was click");
//     let a=25;
//     a++;
//     console.log(a);
// };

// let div1=document.querySelector("#div1");
// div1.onmouseover=()=>{
//     console.log("you are in div");
// }

// btn1.onclick=(evt)=>{
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log(evt.clientX, evt.clientY);
// };

// Event Listeners

//add Event Listener
// btn1.addEventListener("click",(evt)=>{
//     console.log("button1 was click");
//     console.log(evt);
//     console.log(evt.type);
// })

// btn1.addEventListener("click",()=>{
//     console.log("button1 was click - handler2");
// })

//remove Event Listener

// btn1.addEventListener("click",(evt)=>{
//     console.log("button1 was click - handler1");
// })

// btn1.addEventListener("click",()=>{
//     console.log("button1 was click - handler2");
// })
// const handler3=()=>{
//     console.log("button1 was click - handler3");
// }
// btn1.addEventListener("click",handler3)

// btn1.addEventListener("click",()=>{
//     console.log("button1 was click - handler4");
// })

// btn1.removeEventListener("click",handler3)

/*Classes and  object*/

//Object

// const student={
//     fullname:"Zaid khan",
//     marks:94.3,
//     printmarks:function (){
//         console.log("marks =",this.marks);// this means student.marks
//     },
// };

// const employee={
//     calctax1(){                  //method1
//         console.log("tax rate is 10%");
//     },
//     calctax2 : function () {         //method2
//         console.log("tax rate is 10%");
//     },
// };

// const zaid={
//     salary:50000,
// };

// zaid.__proto__=employee;

// //Classes

// class car{
//     constructor(mileage){
//         console.log("creating constructor");
//         this.mileage=mileage;
//     }
// start(){
//     console.log("start")
// }
// stop(){
//     console.log("stop")
// }
// setbrand(brand){
//     this.brandname=brand;
// }
// }

// let carmodel=new car(10);
// carmodel.setbrand("fortuner");
// let carmodel2=new car();

// //Inheritance

// class parent{
//     hello(){
//         console.log("hello");
//     }
// }

// class child extends parent{}

// let obj=new child();

// //Super Keyword

// class person{
//     constructor(){
//         console.log("enter parent constructor");
//         this.species="homo";
//     }
//     eat(){
//         console.log("eat");
//     }
// }

// class engineer extends person{
//     constructor (branch){
//         console.log("enter child constructor");
//         super();  //to invoke parent class constructor
//         this.branch=branch;
//         console.log("exit child constructor");
//     }
//     work(){
//         super.eat();
//         console.log("solve problem")
//     }
// }

// let engobj=new engineer("chemical engineer");

/*Error Handling */

// let a=10;
// let b=5;
// console.log("a=",a);
// console.log("b=",b);
// console.log("a+b=",a+b);
// console.log("a-b=",a-b);
// try{
//     console.log("a*b=",a*c);  //error
// } catch(err){
//     console.log(err);
// }

// console.log("a%b=",a%b,);
// console.log("a=",a);
// console.log("b=",b);
// console.log("a+b=",a+b);
// console.log("a-b=",a-b);

// /*Synchronous*/
// console.log("Hello");
// console.log("Hello");
// console.log("Hello");

/*Asynchronous*/ 

// function hello(){
//     console.log("Hello");
// }

// setTimeout(hello,2000);//timeout:2s=2000ms

// setTimeout(()=>{
//     console.log("Hello");
// },2000);

// console.log("one");

// /*Callbacks*/
// function sum(a,b){
// console.log(a+b);
// }

// function calculator(a,b,sum){
//     sum(a,b);
// }

// calculator(1,2,sum);

/*Callback Hell*/
// function getdata(dataid,getnextdata){
//     setTimeout(()=>{
//         console.log("data",dataid);
//        if( getnextdata){
//         getnextdata();
//        }
//     },2000);
// }

// getdata(1,()=>{
//     getdata(2,() =>{
//         getdata(3,()=>{
//             getdata(4);
//         });
//     });
// });
// // getdata(2);
// // getdata(3);

/*Promises*/
// let promise=new Promise((resolve,reject) =>{
//     console.log("This is a promise");
//     resolve("Hello");
//     reject("Error");
// });


// const getpromise=()=>{
//     return new Promise((resolve,reject) =>{
//             console.log("This is a promise");
//             resolve("success");
//             reject("Network Error");
//         });
// };

// let promise=getpromise();
// promise.then((res)=>{
//     console.log("promise Fullfilled",res)
// });

// promise.catch((err)=>{
//     console.log("rejected",err);
// });

// function asynfun1(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//           console.log("Data 1");
//           resolve("success");
//         },4000);
//     });
// }

// function asynfun2(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//           console.log("Data 2");
//           resolve("success");
//         },4000);
//     });
// }

// console.log("Fetching Data 1....");
// let p1=asynfun1();
// p1.then((res)=>{
//     console.log(res);
// });

// console.log("Fetching Data 2....");
// let p2=asynfun2();
// p2.then((res)=>{
//     console.log(res);
// });


// console.log("Fetching Data 1....");
// let p1=asynfun1();
//  p1.then((res)=>{
    
//     console.log("Fetching Data 2....");
//     let p2=asynfun2();
//     p2.then((res)=>{

//     })
// });

// console.log("Fetching Data 1....");
// asynfun1().then((res)=>{
//     console.log("Fetching Data 2....");
//     asynfun2().then((res)=>{   });
// });


// asynfun1(1)
// .then((res)=>{
//     return asynfun2(2);
// })
// .then((res)=>{
//     console.log(res);
// });

/*Async-Await*/

// async function hello(){
//     console.log("Hello");
// };

// function api(){
//     return new Promise((resolve,reject) =>{
//         setTimeout(() =>{
//        console.log("Data");
//        resolve(200);
//         },2000);
//     });
// }

// async function getweatherdata(){
//     await api();  //1st 
//     await api();  //2st
//     await api();  //3st
//     await api();  //4st
//     await api();  //5st
//     await api();  //6st
// };

// //getweatherdata();

// //Immediately Invoked Function Exprission
// //one time use

// (async function (){
//     await api();  //1st 
//     await api();  //2st
//     await api();  //3st
//     await api();  //4st
//     await api();  //5st
//     await api();  //6st
// })();

/*fetch API */  //Application Programming Interface

const url="https://cat-fact.herokuapp.com/facts";
const factpara=document.querySelector("#facts");
const btn = document.querySelector("#btn");
// let promise=fetch(url);
// console.log(promise);


const getfacts = async ()=>{
console.log("getting Data....");
   let response = await fetch(url);
   console.log(response);  //JSON Format
  let data = await response.json();
  factpara.innerText= data[0].text;
};

btn.addEventListener("click",getfacts);