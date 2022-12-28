

export class College {
    constructor(name) {
        console.log("College constructor has called !");
        this.name = name;
    }

    getCollege() {
        console.log( "I am studying in " + this.name );
    }
}

export function collegeAddress() {
    console.log( "My College is in Ahmedabad, Gujarat." );
}

export var degree = "Software Engineering";