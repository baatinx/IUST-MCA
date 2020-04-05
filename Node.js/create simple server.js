var http = require("http");
http.createServer(function (req, res) {
    res.writeHead(200, {
        "Content-Type": "text/html"
    });
    res.write("request recieved at server " + req.url + "<br/>");
    res.write("hello from server");
    res.end();
}).listen(3000);