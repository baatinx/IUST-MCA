var obj1 = {
  name: 'basit',
  age: 20,
  gender: 'male',
  address: 'solina',
  putDetails: function () {
    console.log(this === obj1);
  }
}

function myfunc() {
  console.log(this === global)

}

obj1.putDetails();

myfunc();