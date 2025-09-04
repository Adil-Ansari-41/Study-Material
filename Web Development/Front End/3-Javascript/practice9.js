//Q1

let data="user Data";
class user{
    constructor(name,email){
        this.name=name;
        this.email=email;
    }
        viewdata(){
            console.log("Data=",data);  
    }
}

let user1=new user("zaid","zaid123@gmail.com");

//Q2

class admin extends user{
    constructor(name,email){
        super(name,email);
    }
   editdata(){
     data="some new data";
   }
}

let admin1=new admin("admin","admin123@gmail.com");