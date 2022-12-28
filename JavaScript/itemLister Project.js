let submitItem = document.querySelector('form');
let appendItem = document.querySelector('.main-items');

submitItem.addEventListener('submit', submitEvent);

function submitEvent(e) {

    e.preventDefault();

    let itemValue = document.getElementById('itemValue');

    let newItem = document.createElement('LI');
    newItem.className = 'items';
    newItem.innerHTML = itemValue.value;

    let dltButton = document.createElement('button');
    dltButton.className = 'deleteButton';
    dltButton.innerHTML = 'Delete Item';

    newItem.appendChild(dltButton);

    appendItem.append(newItem);

    itemValue.value = '';
}

let itemList = document.querySelector('.main-items');

itemList.addEventListener('click', deleteItem);

function deleteItem(e) {
    if (e.target.classList.contains('deleteButton')) {
        if (confirm('Are You Sure ?')) {
            let li = e.target.parentElement;
            itemList.removeChild(li);
        }
    }
}