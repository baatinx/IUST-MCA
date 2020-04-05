function addUser(id, name, age, gender) { // suppose this funtion takes 3 seconds to insert a record  in db
    setTimeout(function () {
        console.log('1. user added in the database.');
    }, 300);
}


function getUserDetails(id) { //n this function takes 2 seconds to fetch a record from db
    setTimeout(function () {
        console.log('2. user details are as follows...');

    }, 200);
}


addUser(1, 'basit', 90, 'male');
getUserDetails(1);

// this is due to its non blocking nature;
// to fix this we will use callback