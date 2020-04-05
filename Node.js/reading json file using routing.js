var http = require('http');
var staff = require('./public/data/staff.json');

var server = http.createServer(function (req, res) {
    if (req.url === '/') {
        res.writeHead(200, { 'Content-Type': 'text/json' });
        res.end(JSON.stringify(staff));
    } else if (req.url === '/node') {
        var nodeData = staff.filter(function (item) {
            return item.language === 'node.js';
        });
        res.writeHead(200, { 'Content-Type': 'text/json' });
        res.end(JSON.stringify(nodeData));
    } else if (req.url === '/angular') {
        var angularData = staff.filter(function (item) {
            return item.language === 'angular.js';
        });
        res.writeHead(200, { 'Content-Type': 'text/json' });
        res.end(JSON.stringify(angularData));
    } else if (req.url === '/react') {
        var reactData = staff.filter(function (item) {
            return item.language === 'react.js';
        });
        res.writeHead(200, { 'Content-Type': 'text/json' });
        res.end(JSON.stringify(reactData));
    }
    else {
        res.writeHead(400, { 'Content-Type': 'text/html' });
        res.end('no page found');

    }

});
server.listen(3000);