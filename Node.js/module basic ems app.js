var loginSegement = require('./module basic ems login.js');
if (loginSegement.validateAdmin('admin', 'root')) {
    console.log('login sucessful');
    var serverName = loginSegement.servAddr;
    console.log(serverName);
}else{
    console.log('login error');
}