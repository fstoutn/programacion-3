// Punto 1

let numeros1 = [1, 2, 3, 4];
let invertido = [];

for (let i = numeros1.length - 1; i >= 0; i--) {
    invertido.push(numeros1[i]);
}

console.log(invertido);


// Punto 2

let texto2 = "reconocer";
let invertido2 = "";

for (let i = texto2.length - 1; i >= 0; i--) {
    invertido2 += texto2[i];
}

if (texto2 === invertido2) {
    console.log(true);
} else {
    console.log(false);
}


// Punto 3

let texto3 = "Javascript ES Genial";
let vocales = "aeiouAEIOU";
let cantidadVocales = 0;

for (let i = 0; i < texto3.length; i++) {
    if (vocales.includes(texto3[i])) {
        cantidadVocales++;
    }
}

console.log(cantidadVocales);


// Punto 4

let numeros4 = [10, 20, 30, 40];
let ultimo = numeros4[numeros4.length - 1];

for (let i = numeros4.length - 1; i > 0; i--) {
    numeros4[i] = numeros4[i - 1];
}

numeros4[0] = ultimo;

console.log(numeros4);


// Punto 5

let numeros5 = [5, 2, 9, 1];

for (let i = 0; i < numeros5.length; i++) {
    for (let j = 0; j < numeros5.length - 1; j++) {
        if (numeros5[j] > numeros5[j + 1]) {
            let temporal = numeros5[j];
            numeros5[j] = numeros5[j + 1];
            numeros5[j + 1] = temporal;
        }
    }
}

console.log(numeros5);


// Punto 6

let texto6 = "me gusta programar en Java";
let palabraVieja = "Java";
let palabraNueva = "JavaScript";

texto6 = texto6.replaceAll(palabraVieja, palabraNueva);

console.log(texto6);


// Punto 7

let numeros7 = [1, 2, 2, 3, 4, 4, 5];
let unicos = [];

for (let i = 0; i < numeros7.length; i++) {
    if (!unicos.includes(numeros7[i])) {
        unicos.push(numeros7[i]);
    }
}

console.log(unicos);


// Punto 8

let numeros8A = [1, 2, 3, 4];
let numeros8B = [3, 4, 5, 6];
let comunes = [];

for (let i = 0; i < numeros8A.length; i++) {
    if (numeros8B.includes(numeros8A[i])) {
        comunes.push(numeros8A[i]);
    }
}

console.log(comunes);


// Punto 9

let texto9 = "hola mundo hola javascript";
let palabras = texto9.split(" ");
let contador = {};

for (let i = 0; i < palabras.length; i++) {
    let palabra = palabras[i];

    if (contador[palabra]) {
        contador[palabra]++;
    } else {
        contador[palabra] = 1;
    }
}

console.log(contador);


// Punto 10

let matriz = [
    [1, 2, 3],
    [4, 5, 6]
];

let transpuesta = [];

for (let i = 0; i < matriz[0].length; i++) {
    transpuesta[i] = [];

    for (let j = 0; j < matriz.length; j++) {
        transpuesta[i][j] = matriz[j][i];
    }
}

console.log(transpuesta);