var http = require("http");
var fs = require("fs");
var path = require("path");

http.createServer(function (req, res) {
  if (req.url === "/") {
    fs.readFile("./public/html/index.html", "UTF-8", function (err, html) {
      if (err) {
        res.writeHead(400, { "Content-Type": "text/html" });
        res.end("read error");
      } else {
        res.writeHead(200, { "Content-Type": "text/html" });
        res.end(html);
      }
    });
  } else if (req.url.match('\.css$')) {
    var pathToCss = path.join(__dirname, 'public', req.url);
    pathToCss.normalize();
    var cssFileStream = fs.createReadStream(pathToCss, 'UTF-8');
    res.writeHead(200, { 'Content-Type': 'text/css' });
    cssFileStream.pipe(res);

  } else if (req.url.match('\.jpg$')) {
    var pathToImage = path.join(__dirname, 'public', req.url);
    var imageFileStream = fs.createReadStream(pathToImage);
    res.writeHead(200, { 'Content-Type': 'image/jpg' });
    imageFileStream.pipe(res);
  } else {
    res.writeHead(400, { "Content-Type": "text/html" });
    res.end("no page found");
  }
}).listen(2000);