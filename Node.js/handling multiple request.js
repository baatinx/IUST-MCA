function request(order_no) {
  console.log('customer order received , order_no :', order_no);
  response(function () {
    console.log('order delivered order_no : ', order_no);
  });
}

function response(callback) {
  setTimeout(callback, 5000);
}

request(1);
request(2);
request(3);
request(4);