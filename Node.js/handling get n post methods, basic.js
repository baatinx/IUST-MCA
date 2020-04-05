var http = require('http');
var fs = require('fs');
var path = require('path');
var querystring = require('querystring');

http.createServer(function (req, res) {
    if (req.method === 'GET') {

        if (req.url === '/') {
            res.write('welcome user');
            res.end();
        } else if (req.url === '/form') {
            var pathToForm = path.join(__dirname, '/public/html/form.html');
            pathToForm.normalize();
            res.writeHead(200, { 'content-type': 'text/html' });
            fs.createReadStream(pathToForm, "UTF-8").pipe(res);
        }

    } else if (req.method === 'POST') {
        var data = "";
        req.on("data", function (chunk) {
            data += chunk;
        });
        req.on("end", function () {
            res.writeHead(200, { 'Content-Type': 'text/plain' }); // why to send header status here, for file read
            //formdata = querystring.parse(data);
            //res.end();
            //console.log(formdata);
            res.end(`${data}`);
        });
    }
}).listen(2000);