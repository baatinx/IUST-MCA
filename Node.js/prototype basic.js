function person(id, name, contact) {
  this.id = id;
  this.name = name;
  this.contact = contact;
  console.log('ID -> ' + this.id + ' , NAME -> ' + this.name + ' , CONTACT -> ' + this.contact);
}

person.prototype = {
  login: function () {
    this.username = name;
    this.password = contact;
    console.log('login sucessfull. (username - >' + this.username + ' , password -> ' + this.password);
  }
};

console.log('function call');
person(1, 'basit', 7006787893);
//person.login();
console.log('object function called');
var basit = new person(1, 'basit', 7006787893);
basit.login();