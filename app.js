'use strict';

// Simple node js + express script to locally host the index.html file.  

var express = require('express');
var app = express();
var host = 3000;
var path = require('path');

// Makes items from local FS available at the path /images
app.use('/images', express.static(path.join(__dirname, 'images')))

// Adding route
app.get('/', function(req, res){
	res.sendFile(path.join(__dirname, '../cs251a-cobra', 'index.html'));
	// res.send("Welcome guest");
});


app.listen(host, function () {
  console.log('Example app listening on port 3000!')
})






