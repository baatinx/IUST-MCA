function autenticateAdmin(username, password) {
  if (username == 'admin' & password == 'root') {
    return true;
  } else {
    return false;
  }
}
var serverName = '127.0.0.1';

module.exports.validateAdmin = autenticateAdmin;
module.exports.servAddr = serverName;