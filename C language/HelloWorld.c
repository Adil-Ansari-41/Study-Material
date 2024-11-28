#include <stdio.h>
#include <string.h>
#include <stdlib.h>
// void square(int n);
// void _square(int* n);

// void func1(int *n);


//void nam(char arr[]);



//int countlength(char arr[]);

//void func1(struct student s1);

typedef struct student{
int roll;
float cgpa;
char name[15];

}stu;

typedef struct InformationTechnology {
    char name[15];
    int roll;
    float cgpa;
}it ;

typedef struct address{
int houseno;
int block;
char city[100];
char state[100];
}add;


void printadd(struct address add);


struct vector{
    int x;
    int y;

};

void func1(struct vector v1,struct vector v2,struct vector sum);
// int countv(char str[]);


// void c(char str[],char ch);


struct complex{
    int real;
    int img;
};


typedef struct banckaccount{
    int accountno;
    char name[100];
}acc;
int main() {

//     int age;
//     int *ptr=&age;

// printf("Enter Age:");
// scanf("%d",&age);

//     printf("%d\n",age);

//     printf("%d\n",*ptr);

//     printf("%d\n",*(&age));



// int x;
// int *ptr;

// ptr=&x;
// *ptr=0;

// printf("x=%d \n",x);
// printf("*ptr=%d\n",*ptr);

// *ptr +=5;
// printf("x=%d \n",x);
// printf("*ptr=%d\n",*ptr);

// (*ptr) ++;
// printf("x=%d \n",x);
// printf("*ptr=%d\n",*ptr);


// int i;
// printf("Enter number:");
// scanf("%d",&i);

// int *ptr=&i;
// int **pptr=&ptr;


// printf("i=%d \n",**pptr);



// int number=4;
// square(number);
// printf("number =%d \n",number);

// _square(&number);
// printf("number =%d \n",number);



// int n=4;
// printf("%u \n",&n);

// func1(&n);


// int marks[3];

// printf("Enter Marks of PHY  :\n");
// scanf("%d",&marks[0]);

// printf("Enter Marks of ENG :\n");
// scanf("%d",&marks[1]);

// printf("Enter Marks of MATHS :\n");
// scanf("%d",&marks[2]);

// printf("Marks of PHY=%d \n Marks of ENG=%d \n Marks of MATHS=%d \n",marks[0],marks[1],marks[2]);

//float prices[3];

// printf("Enter 3 prices :");
// scanf("%f",&prices[0]);
// scanf("%f",&prices[1]);
// scanf("%f",&prices[2]);

// printf("Total Price 1:%f \n",prices[0]+(0.18*prices[0]));
// printf("Total Price 2:%f \n",prices[1]+(0.18*prices[1]));
// printf("Total Price 3:%f \n",prices[2]+(0.18*prices[2]));



// int arr[]={1,2,3,4,5};
// printf("%d \n",*(arr+2));

// printf("%d \n",*(arr+10));




// int n;
// printf("Enter Number :");
// scanf("%d",&n);

// int fib[n];
// fib[0]=0;
// fib[1]=1;

// printf("%d \t%d \t",fib[0],fib[1]);
// for(int i=2; i<n;i++){
//     fib[i]=fib[i-1]+fib[i-2];

//     printf("%d \t",fib[i]);
// }



// char name[]="ADIL";
// char sname[]="Ansari";
// char fname[40];
 
// nam(name);
// printf("\n");
// nam(sname);
// printf("\n");
// printf("%s",name);

// printf("Enter name:");
// scanf("%s",fname);
// printf("%s",fname);


//char str[40];

// printf("Enter Name:");
// fgets(str,12,stdin);
// puts(str);


// char *change="Hello World";
// puts(change);

// change="World";
// puts(change);

// char nchange[]="Hello World";
// puts(nchange);

// nchange="Hello";


// char name[20]="Adil";
// //fgets(name,20,stdin);

// strlen(name);

// printf("Length is: %d",strlen(name));

// char str1[]="new ";
// char str2[]="old ";

// strcat(str1,str2);
// puts(str1);


// char first[]="Apple";
// char second[]="Apple";

// printf("%d",strcmp(second,first));



// char str[100];
// char ch;
// int i=0;

// while(ch!='\n'){
//     scanf("%c",&ch);
//     str[i]=ch;
//     i++;
// }

// str[i]='\0';
// puts(str);


// char pass[10];
// char salt[]="abc";

// printf("Enter Password:");
// fgets(pass,10,stdin);


// strcat(pass,salt);
// puts(pass);

// char str[]="Hello World";

// printf("vowels are: %d",countv(str));

// char str[]="Adil Ansari";
// char ch='i';

// c(str,ch);



// struct student s1;

// s1.roll=12;
// s1.cgpa=9.2;
// //s1.name="Adil";
// strcpy(s1.name,"Adil");

// printf("student Name:%s \nstudent roll:%d \nstudent cgpa:%f \n",s1.name,s1.roll,s1.cgpa);

// printf(" \n\n");
// struct student IT[100];
// IT[0].roll=21;
// IT[0].cgpa=9.6;
// strcpy(IT[0].name,"Ali");

// printf("student Name:%s \nstudent Roll No:%d \nstudent cgpa:%f",IT[0].name,IT[0].roll,IT[0].cgpa);


//struct student s1={45,9.2,"faraz"};
//stu s2={0};


// it s1;
// strcpy(s1.name,"adil");
// s1.roll=12;
// s1.cgpa=6.7;

//it s1={"Adil",12,9.4};


// struct address add[5];
// printf("Enter Info for Person 1:");
// scanf("%d",&add[0].houseno);
// scanf("%d",&add[0].block);
// scanf("%s",add[0].city);
// scanf("%s",add[0].state);

// printf("Enter Info for Person 2:");
// scanf("%d",&add[1].houseno);
// scanf("%d",&add[1].block);
// scanf("%s",add[1].city);
// scanf("%s",add[1].state);

// printf("Enter Info for Person 3:");
// scanf("%d",&add[2].houseno);
// scanf("%d",&add[2].block);
// scanf("%s",add[2].city);
// scanf("%s",add[2].state);

// printf("Enter Info for Person 4:");
// scanf("%d",&add[3].houseno);
// scanf("%d",&add[3].block);
// scanf("%s",add[3].city);
// scanf("%s",add[3].state);

// printf("Enter Info for Person 5:");
// scanf("%d",&add[4].houseno);
// scanf("%d",add[4].block);
// scanf("%s",add[4].city);
// scanf("%s",add[4].state);

// printadd(add[0]);
// printadd(add[1]);
// printadd(add[2]);
// printadd(add[3]);
// printadd(add[4]);

//func1(s1);
//printf("student Name:%s \nstudent Roll No:%d \nstudent cgpa:%f",s1.name,s1.roll,s1.cgpa);

//struct student *ptr=&s1;
//printf("student name:%s \n \n",(*ptr).name);
//printf("student name:%s",ptr->name);


// struct vector v1={5,10};
// struct vector v2={3,7};
// struct vector sum={0};

// func1(v1,v2,sum);

// struct complex num1={5,6};
// struct complex *ptr=&num1;
// printf("real part=%d \n",ptr->real);
// printf("img part=%d \n",ptr->img);



// acc acc1={123,"Adil"};
// acc acc2={234,"zaid"};

// printf("Account No:%d \n Name:%s \n",acc1.accountno,acc1.name);
// printf("Account No:%d \n Name:%s \n",acc2.accountno,acc2.name);


// FILE *fptr;

// fptr=fopen("text.txt","r");

// int a;
// fscanf(fptr,"%d",&a);
// int b;
// fscanf(fptr,"%d",&b);

// printf("%d\n",a);
// printf("%d\n",b);

// fclose(fptr);

// fptr=fopen("text.txt","w");
// fprintf(fptr,"%d",a+b);
// fclose(fptr);
// FILE *fptr;

// fptr=fopen("odd.text","w");

// int n;

// printf("Enter Number:");
// scanf("%d",&n);

// for(int i=1;i<=n;i++){
// if(i % 2 !=0){
// fprintf(fptr,"%d\n",i);
// }
// }

// fclose(fptr);

// FILE *fptr;

// fptr=fopen("student.txt","w");

// char name[20];
// int age;
// float cgpa;

// printf("Enter Name:");
// scanf("%s",name);
// printf("Enter age:");
// scanf("%d",&age);
// printf("Enter cgpa:");
// scanf("%f",&cgpa);

// fprintf(fptr,"Student Name:%s\n",name);
// fprintf(fptr,"Student Age:%d\n",age);
// fprintf(fptr,"Student CGPA:%f\n",cgpa);
// int n;
// fscanf(fptr,"%d",&n);
// printf("Number=%d \n",n);
// fscanf(fptr,"%d",&n);
// printf("Number=%d \n",n);
// fscanf(fptr,"%d",&n);
// printf("Number=%d \n",n);
// fscanf(fptr,"%d",&n);
// printf("Number=%d \n",n);
// fscanf(fptr,"%d",&n);
// printf("Number=%d \n",n);
//fclose(fptr);
//  FILE *fptr;

//  fptr=fopen("text.txt","r");

// char ch=fgetc(fptr);
// while(ch !=EOF){
//     printf("%c",ch);
//     ch=fgetc(fptr);
// }
// printf("\n");

// fputc('A',fptr);
// fputc('p',fptr);
// fputc('p',fptr);
// fputc('l',fptr);
// fputc('e',fptr);

// fputc('A',fptr);
// fputc('p',fptr);
// fputc('p',fptr);
// fputc('l',fptr);
// fputc('e',fptr);


// printf("%c",fgetc(fptr));
// printf("%c",fgetc(fptr));
// printf("%c",fgetc(fptr));
// printf("%c",fgetc(fptr));
// printf("%c",fgetc(fptr));

//  fprintf(fptr,"%c",'M');
//  fprintf(fptr,"%c",'a');
//  fprintf(fptr,"%c",'n');
//  fprintf(fptr,"%c",'g');
//  fprintf(fptr,"%c",'o');
// fclose(fptr);
// char ch;
// fscanf(fptr,"%c",&ch);
// printf("character=%c",ch);


// if(fptr==NULL){
//     printf("file doesn't exist \n");
// } else{
//     fclose(fptr);
// }

 //fclose(fptr);

// printf("%d \n",(5*sizeof(int)));
// printf("%d \n",sizeof(float));
// printf("%d \n",sizeof(char));

// float *ptr;
// ptr=(float *)calloc(5, sizeof(float));

// ptr[0]=1;
// ptr[1]=4;
// ptr[2]=3;
// ptr[3]=8;
// ptr[4]=9;

// for(int i=0; i<5;i++){
//     printf("%f\n",ptr[i]);
// }

//int *ptr;
//int n;
// printf("Enter Number:");
// scanf("%d",&n);

// ptr=(int*)calloc(5,sizeof(int));

// printf("Enter Number:");
// for(int i=0;i<5;i++){
//     scanf("%d",&ptr[i]);
// }

// for(int i=0;i<5;i++){
//     printf("Number %d is %d \n",i,ptr[i]);
// }
// free(ptr);

int *ptr;
ptr=(int*)calloc(5,sizeof(int));

ptr[0]=1;
ptr[1]=3;
ptr[2]=5;
ptr[3]=7;
ptr[4]=9;

for(int i=0;i<5;i++){
    printf("ODD Number:%d\n",ptr[i]);
}
ptr=realloc(ptr,6);
ptr[0]=2;
ptr[1]=4;
ptr[2]=6;
ptr[3]=8;
ptr[4]=10;
ptr[5]=12;
for(int i=0;i<6;i++){
    printf("EVEN Number:%d\n",ptr[i]);
}
free(ptr);
return 0;
}

// void func1(struct vector v1,struct vector v2,struct vector sum){
//     sum.x=v1.x + v2.x;
//     sum.y=v1.y + v2.y;

//     printf("sum of x is :%d \n",sum.x);
//     printf("sum of x is :%d \n",sum.y);
// }

// void printadd(struct address add){
//     printf("Address is:%d, %d, %s, %s\n",add.houseno,add.block,add.city,add.state);
// }
//void func1(struct student s1){
   // printf("student information:\n student roll:%d \nstudent cgpa:%f \nstudent name:%s \n",s1.roll,s1.cgpa,s1.name);
//}

// void c(char str[],char ch){
//     for(int i=0;str[i]!='\0';i++){
//         if(str[i]==ch){
// printf("character is present!");
// return;

//         }
//     }
//     printf("character is Not present");
// }

// int countv(char str[]){
//     int count=0;

//     for(int i=0;str[i]!='\0';i++){
//         if(str[i]=='a' ||  str[i]=='e' ||  str[i]=='i' ||  str[i]=='o' ||  str[i]=='u'){
//             count++;
//         }
//     }
//     return count;
//}


// void nam(char arr[]){
//     for(int i=0; arr[i] !='\0' ; i++){
//     printf("%c",arr[i]);
// }
// }

// int countlength(char arr[]){
//     int count=0;
//     for(int i=0;arr[i] !=0;i++){
//         count++;
//     }
//     return count-1;
// }
// void square(int n){
//     n= n*n;
//     printf("square =%d \n",n);
// }

// void _square(int* n){
//     *n= (*n)*(*n);
//     printf("square =%d \n",*n);

// }


// void func1(int *n){
//     printf("%u \n",n);
// }