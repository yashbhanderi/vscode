// Binding This Keyword...
if (true) {
    // function printName() {
    //     console.log(this.name + " is my First Name and " + this.surname + " is my Last Name ");
    // }

    // const per1 = {
    //     name: "Yash",
    //     surname: "Bhanderi"
    // };
    // const per2 = {
    //     name: "Dhruv",
    //     surname: "Kakadiya"
    // };
    // const per3 = {
    //     name: "Jemish",
    //     surname: "Variya"
    // };

    // const printName1 = printName.bind(per1);
    // const printName2 = printName.bind(per2);
    // const printName3 = printName.bind(per3);

    // printName1();
    // console.log( typeof printName1 );
}

// Arrow Functions...
if (true) {
    // const myFunc = function () {
    //     console.log("This is my Name : Yash Bhanderi");
    // }

    // myFunc2 = () => console.log("This is my real Name : Yash");

    // myFunc();
    // myFunc2();
}

// Spread Operator....
if (true) {

    // const arr1 = ["Yash ", " Bhanderi "];
    // const arr2 = [" is ", " My Name"];

    // const arr3 = [...arr1, ...arr2];

    // console.log(arr3);

    // const myName = {
    //     fName: "Yash",
    //     lName: "Bhanderi"
    // };

    // const myAddress = {
    //     city: "Surat",
    //     state: "Gujarat"
    // };

    // const mySelf = { ...myName, ...myAddress, country: "India" };

    // console.log(mySelf);
}

// class & Inheritance...

if (true) {
    // class Person{
    //     constructor(name) {
    //         console.log("constructor has called !");
    //         this.name = name;
    //     }

    //     fullName() {
    //         console.log(this.name + " is my full name.");
    //     }
    // }

    // const person1 = new Person("Yash Bhanderi");
    // const person2 = new Person("Dhruv Kakadiya");
    // const person3 = new Person("Jemish Variya");

    // console.log(person1.name);
    // person1.fullName();
    // person2.fullName();
    // person3.fullName();

    // Inheritance...

    // class Student extends Person{
    //     constructor(name, stream ) {
    //         super(name);
    //         this.stream = stream;
    //         console.log( stream + " is my stream." );
    //     }

    //     getCollege() {
    //         console.log( "Software engineering in LD College of Engineering, Ahmedabad" );
    //     }
    // }

    // const student1 = new Student("Yash Bhanderi", "Engineering");

    // console.log( student1.name ); 
    // student1.fullName();
    // student1.getCollege();
}

