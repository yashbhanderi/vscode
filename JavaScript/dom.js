// Query Selector.....................

// let list = document.querySelector('.items');

// list.style.color = 'red';

// // for(let i=0;i<list.length;i++) {
// //     list[i].style.backgroundColor = 'Blue';
// //     list[i].style.color = 'white';
// //     list[i].style.border = '2px solid red';
// // }

// TRAVERSING DOM............\\

// let items = document.querySelector('.main-items');

// PARENT NODE.................. \\

// items.parentNode.style.backgroundColor = 'tomato';

// items.parentNode.parentNode.style.backgroundColor = 'black';
// console.log(items.parentNode.parentNode);

// CHILD NODE.............\\

// items.children[0].style.backgroundColor = 'pink';
// items.children[items.child].style.backgroundColor = 'pink';

// console.log(items.children[0]);

// SIBLINGS..............\\

// let sib = document.querySelector('#header');

// sib.nextElementSibling.style.backgroundColor = 'Green';

// CREATE ELEMENT ...................\\

// let ele = document.createElement('LI');

// ele.className = 'items-5 items';
// ele.innerHTML = 'Item-5';

// console.log(ele);

// let lastItem = document.querySelector('.main-items');

// lastItem.lastElementChild.appendChild(ele);

// InsertBefore..............\\

// let myItem = document.createElement('LI');

// myItem.className = 'items';
// myItem.innerHTML = 'Item-0';

// let listItems = document.querySelector('section');

// // listItems.insertBefore(myItem,listItems.children[0]);

// listItems.appendChild(myItem);

// EVENTS...............................\\

// EVENT LISTENER..................................................\\

// myEvent.addEventListener('mouseover',myFunction);
// myEvent.addEventListener('mouseout',myFunction2);

// function myFunction() {
//     myEvent.style.backgroundColor = 'Red';
// }
// function myFunction2() {
//     myEvent.style.backgroundColor = 'greenyellow';
// }

// MULTIPLE EVENT LISTENER..................................................\\

// let allClick = document.querySelectorAll('.items');

// for (let i = 0; i < allClick.length; i++) {
//     allClick[i].addEventListener('mouseover', function changeBG()
//     {
//         allClick[i].style.backgroundColor = 'Red';
//         allClick[i].style.color = 'white';
//     });
//     allClick[i].addEventListener('mouseout', function changeBG(){
//         allClick[i].style.backgroundColor = 'white';
//         allClick[i].style.color = 'black';
//     });
// }

// EVENT CALLS..,,,,,,,,,,,,,,,,,,,\\

// let firstItem = document.querySelector('input[type="text"]');

// firstItem.addEventListener('keydown',firstFunction);

// function firstFunction(e) {
//     console.log(e);
//     console.log(e.target);
// }

// SUBMIT,,,,,,,,,,\\

// ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ITEM LISTER PROJECT,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\

// let inputItem = document.querySelector('#itemValue');

// let submitItem = document.querySelector('form');
// let appendItem = document.querySelector('.main-items');

// submitItem.addEventListener('submit',submitEvent);

// function submitEvent(e) {
    
//     var x = 'yash Bhanderi';
//     e.preventDefault();

//     let itemValue = document.getElementById('itemValue');

//     let newItem = document.createElement('LI');
//     newItem.className = 'items';
//     newItem.innerHTML = itemValue.value;

//     let dltButton = document.createElement('button');
//     dltButton.className = 'deleteButton';
//     dltButton.innerHTML = 'Delete Item';

//     newItem.appendChild(dltButton);

//     appendItem.append(newItem);

//     itemValue.value = '';
// }

// console.log(x);

// let deleteItemList = document.querySelector('.main-items');

// deleteItemList.addEventListener('click',deleteItem);

// function deleteItem(e) {
//     if(e.target.classList.contains('deleteButton')) {
//         if(confirm('Are You Sure ?')) {
//             let li = e.target.parentElement;
//             deleteItemList.removeChild(li);
            
//         }
//     }
// }

// console.log('');



// ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,ITEM LISTER PROJECT,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\

