var data=require('./module basic using export object ems login');
if(data.validateUser('admin','root')){
    console.log('login attempt sucessfull');
}else{
    console.log('login attempt failed, try again after some time ');
}

var obj=data.admin;
console.log('original file admin name->'+obj.name);
obj.name='mustafa basit';
console.log('updated local object admin name ->'+obj.name);
console.log('original file admin name->'+data.admin.name +'               //because of object reference');
