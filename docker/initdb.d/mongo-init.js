db.createUser({
  user: 'admin',
  pwd: 'admin',
  roles: [{
    role: 'readWrite',
    db: 'springCloudDemo'
  }]
});
db.car.insertMany([
  {
    "model": "citroen",
    "color": "red",
    "price": "15000"
  },
  {
    "model": "ford",
    "color": "blue",
    "price": "20000"
  },
  {
    "model": "toyota",
    "color": "green",
    "price": "18000"
  },
  {
    "model": "honda",
    "color": "silver",
    "price": "22000"
  },
  {
    "model": "chevrolet",
    "color": "white",
    "price": "17000"
  },
  {
    "model": "bmw",
    "color": "black",
    "price": "30000"
  },
  {
    "model": "nissan",
    "color": "gray",
    "price": "19000"
  },
  {
    "model": "volkswagen",
    "color": "yellow",
    "price": "21000"
  },
  {
    "model": "subaru",
    "color": "orange",
    "price": "25000"
  },
  {
    "model": "kia",
    "color": "purple",
    "price": "16000"
  },
  {
    "model": "hyundai",
    "color": "brown",
    "price": "17500"
  },
  {
    "model": "mercedes",
    "color": "silver",
    "price": "28000"
  },
  {
    "model": "audi",
    "color": "blue",
    "price": "32000"
  },
  {
    "model": "lexus",
    "color": "white",
    "price": "29000"
  },
  {
    "model": "jeep",
    "color": "green",
    "price": "23000"
  },
  {
    "model": "porsche",
    "color": "red",
    "price": "50000"
  },
  {
    "model": "chrysler",
    "color": "gray",
    "price": "18000"
  },
  {
    "model": "dodge",
    "color": "black",
    "price": "24000"
  },
  {
    "model": "volvo",
    "color": "blue",
    "price": "26000"
  },
  {
    "model": "buick",
    "color": "red",
    "price": "22000"
  }
]);