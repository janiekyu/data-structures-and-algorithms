// console.log('hello');

// const isCapitalized = (str) => {
//   console.log(str.match(/[A-Z]\w*/g));
// };

// var para = 'Given by our hand in the meadow that is called Runnymede, between Windsor and Staines, on the fifteenth day of June in the seventeenth year of our reign (i.e. 1215: the new regnal year began on 28 May).';

// isCapitalized(para);


// const citiesAtoJ = (arr) => {
//   let arrayString = arr.toString();
//   console.log(arrayString.match(/[A-J]\w*/g));
// };

// const cities = ['Albuquerque', 'Chicago', 'Philadelphia', 'Newark', 'Sacramento', 'Eugene'];

// citiesAtoJ(cities);


const matchMonth = (input) => {

  console.log((/\b[Oo](ct)(ober\b)? /gi).test(input));

  // const matchMonth = (input) => {
  //   if ((/\b[Oo](ct)(ober\b)?/gi).test(input)) {
  //     return true;
  //   } else return false;
  // };
};


let monthString = 'October boct october oct Oct oberw November nov octob OCTOBER notOctober';

matchMonth('octob');
