var details = require('./shared memory module export data');
console.log('details accessed via "ADMISSION" section ( old records )');
console.log('registration fee -> ' + details.registrationFee);
console.log('security deposite fee -> ' + details.securityDepositeFee);
details.registrationFee += 1000;
details.securityDepositeFee += 1000;
console.log('fee details updated sucessfully');
