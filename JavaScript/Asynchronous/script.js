// Promise

// Promise - Producer Part

// const getName = (name) => {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       console.log("In the getName");
//       resolve(name);
//     }, 2000);
//   });
// };

// const getHobbies = (name) => {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       console.log("In the getHobbies");
//       resolve(["Travelling", " Cricket", " Movies"]);
//     }, 2000);
//   });
// };

// Promise - Consumer Part

// getName("Yash Bhanderi")
//   .then((name) => {
//     console.log("getName : " + name);
//     return getHobbies(name);
//   })
//   .then((hobbies) => {
//     console.log("getHobbies : " + hobbies);
//   });

// Error
// getName("Yash Bhanderi")
//   .then((name) => {
//     console.log("getName : " + name);
//     throw new Error(name);
//   })
//   .catch((msg) => console.log(msg));

// Async Await

// const getName = (a) => {
//   setTimeout(() => {
//     console.log("In the getName");
//   }, 2000);
//   return a + a;
// };

// const getHobbies = (a) => {
//   setTimeout(() => {
//     console.log("In the getHobbies");
//   }, 2000);
//   return a + a;
// };

// const showHobbies = async () => {
//   await getName("Yash Bhanderi");
//   await getHobbies("Travelling");
//   return "Resolved!";
// };

// console.log("Before Calling");
// showHobbies().then((msg) => console.log(msg));
// console.log("After Calling");
// console.log("End ");

DT = new Date();
utc = DT.getTime() + DT.getTimezoneOffset() * 60000;
today = new Date(utc + 3600000 * +5.5);
time =
    today.getDate() +
    "" +
    (today.getMonth() + 1) +
    "" +
    today.getFullYear() +
    "" +
    today.getHours() +
    "" +
    today.getMinutes() +
    "" +
    today.getSeconds();
