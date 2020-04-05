function addUser(id, name, age, gender, callback) { // suppose this funtion takes 3 seconds to insert a record  in db
    setTimeout(function () {
        console.log('1. user added in the database.');
        callback();
    }, 300);

    //callback(); //if we use here callback , it will be then fight between settimeout n callback, 
    //that callback will always win, because its time is less than that
    // we can use any name for callback function, but using callback for it is a standard 
}


function getUserDetails(id) { //n this function takes 2 seconds to fetch a record from db
    setTimeout(function () {
        console.log('2. user details are as follows...');

    }, 200);
}


addUser(1, 'basit', 90, 'male', getUserDetails);