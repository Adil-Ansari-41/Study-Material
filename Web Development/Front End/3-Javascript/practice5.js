//Q1
let marks=[85,97,44,37,76,60];

let sum=0;

for(let val of marks){
    sum +=val;
}

let avg=sum/marks.length;
console.log(`avgrage marks of the class = ${avg}` );

//Q2

let items=[250,645,300,900,50]

// let i=0;
// for(let val of items){
//     let offer =val/10;
//     items[i]=items[i]-offer;
//     console.log(`Final price with 10%  offer is ${items[i]}`);
//     i++;
// }

for(let i=0;i< items.length;i++){
    let offer =items[i]/10;
    items[i]-=offer;
}
console.log(items);

//Q3

let companies=["Blooming","Microsoft","Uber","Google","IBM","Netflix"];

companies.splice(0,1,);
companies.splice(2,1,"Ola");
companies.splice(6,0,"Amazon");
console.log(companies);