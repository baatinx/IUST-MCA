module.exports = {
  validateUser: function (username,password) {
    if(username=='admin' & password=='root'){
      return true;
    }else{
      return false;
    }
  },
  admin: {
      name: 'danish',
      age: 20,
      address: 'natipora',
  },
  websiteAddress: 'www.islamicuniversity.com',
  officialContact: 9797114829
};
/*
//if we allow below code, it  will also run in inherited file   
var put = function () {
  console.log("you are in local put function");
}

put();
if(module.exports.validateUser('admin','root')){
  console.log('login attempt sucessfull');
}else{
  console.log('login attempt failed, try again after some time');
}
*/