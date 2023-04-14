//let sustantivo= "perro";
//let sustantivoDos="negro";
//let sustantivoTres="corrio";
//let sustantivoCuatro="rapidamente";
//let resultado= "el " + sustantivo + " " + sustantivoDos + " " + sustantivoTres + " " + sustantivoCuatro + "a la tienda";
//console.log(resultado)
// let listaSupermercado= [[3, "pollo"], [4, "carne"], [5,"leche"],[2,"galletas"],[1,"huevos"]]
// console.log("Voy a comprar " + listaSupermercado[0][0] + " unidades de " + listaSupermercado[0][1])
//console.log("Voy a comprar " + listaSupermercado[1][0] + " unidades de " + listaSupermercado[1][1])
//console.log("Voy a comprar " + listaSupermercado[2][0] + " unidades de " + listaSupermercado[2][1])
//console.log("Voy a comprar " + listaSupermercado[3][0] + " unidades de " + listaSupermercado[3][1])
//console.log("Voy a comprar " + listaSupermercado[4][0] + " unidades de " + listaSupermercado[4][1])

// function proximoEnLafila(arrays, elemneto){
//     arrays.push(elemneto);
//      return arrays.shift()
// }
// var list=[4,5,3,2,1]
// console.log(list)
// console.log(proximoEnLafila(list, 10))
// console.log(list)

// function suma(elemento){
//     if (elemento + 2 == 4){
//         console.log("la condicon se cumple y el valor es 4")
//     } else if (elemento + 10 == 15){
//         console.log("la condicon se cumaple y el valor es 15")
//     } else{
//         console.log("la condicion no se cumple.")
//     }
// }
// suma(5)

// function golf(par, golpes){
//     if(golpes == 1){
//         return "Hole-in-one!"
//     } else if(golpes <= par -2){
//         return "Eagle"
//     } else if(golpes==par){
//         return "Par"
//     } else if(golpes == par + 1){
//         return "Bogey"
//     } else if(golpes == par + 2){
//         return "Double Bogey"
//     } else if(golpes >= par + 3){
//         return "Go-Home!"
//     } else{
//         "no obtuvistes ningun puntaje"
//     }
// }
// console.log(golf(5,7))

// Bienvenido. En este kata, se le pide que eleve al cuadrado cada dígito de un número y los concatene.
// Por ejemplo, si ejecutamos 9119 a través de la función, saldrá 811181, porque 9 2 es 81 y 1 2 es 1. (81-1-1-81)
// Ejemplo #2: Una entrada de 765 devolverá/debería devolver 493625 porque 7 2 es 49, 6 2 es 36 y 5 2 es 25. (49-36-25)
// Nota: La función acepta un número entero y devuelve un número entero.
// ¡Feliz codificación!

// function squareDigits(num){
//    let resultado= num.toString()
//    let contenedor= ""
//    for (let  i= 0;  i< resultado.length; i++) {
//       contenedor += Math.pow(parseInt(resultado[i]),2).toString()
//    } 
//    return parseInt(contenedor)
//   }
//   console.log(squareDigits(89045));



// En esta pequeña tarea, se le da una cadena de números separados por espacios y tiene que devolver el número más alto y el más bajo.

// Ejemplos
// highAndLow("1 2 3 4 5");  // return "5 1"
// highAndLow("1 2 -3 4 5"); // return "5 -3"
// highAndLow("1 9 3 4 -5"); // return "9 -5"



function highAndLow(numbers){
  let resultado= numbers.split(" ").map(valor => parseInt(valor))
  let maximo= Math.max(...resultado)
  let minimo= Math.min(...resultado)
  return maximo.toString() + " " + minimo.toString()
   
 }
 console.log(highAndLow("1 2 3 4 5 0"))