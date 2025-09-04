const fs = require('fs');


fs.readFile('file.txt', 'utf8',  (err, data)=>{
    console.log(err, data);
})

console.log(fs.readFileSync('file.txt').toString);
fs.writeFile('file2.txt', "This is data add in file2.txt", ()=>{})
fs.writeFileSync('file.txt3', "This is adding data using sysn");
