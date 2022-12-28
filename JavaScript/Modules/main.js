"use strict";

import { College, collegeAddress, degree } from "./college.js";
import { MySelf, myAddress, country } from "./mySelf.js";
import DefaultExport from "./defaultExport.js";

const myCollege = new College("LDCE");
const mySelf = new MySelf("Yash Bhanderi");
const defaultExport = new DefaultExport();

myCollege.getCollege();

collegeAddress();

console.log( "My degree is " + degree );


mySelf.getFullName();

myAddress();

console.log( country + " is my country." );

