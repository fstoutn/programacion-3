// Punto 1

let palabras = [];

for (let i = 0; i < 5; i++) {
    let palabra = prompt("Ingrese una palabra:");
    palabras.push(palabra);
}

console.log(palabras);


// Punto 2

palabras.unshift(prompt("Ingrese una palabra para agregar al inicio:"));

palabras.push(prompt("Ingrese una palabra para agregar al final:"));

palabras.splice(1, 1);

console.log(palabras);


// Punto 3

for (let i = 0; i < palabras.length; i++) {
    console.log("Longitud de " + palabras[i] + ": " + palabras[i].length);
}

let palabraMasLarga = palabras[0];

for (let i = 1; i < palabras.length; i++) {
    if (palabras[i].length > palabraMasLarga.length) {
        palabraMasLarga = palabras[i];
    }
}

console.log("Palabra mas larga: " + palabraMasLarga);

for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].includes("a")) {
        console.log(palabras[i] + " contiene la letra a");
    }
}


// Punto 4

let palabrasInvertidas = [];

for (let i = 0; i < palabras.length; i++) {
    let palabraInvertida = palabras[i].split("").reverse().join("");
    palabrasInvertidas.push(palabraInvertida);
}

console.log(palabrasInvertidas);

alert("Palabras invertidas: " + palabrasInvertidas.join(", "));


// Punto 5

let comprobar = prompt("Quiere comprobar palindromos?");

if (comprobar.toLowerCase() === "si") {
    for (let i = 0; i < palabras.length; i++) {
        let palabraInvertida = palabras[i].split("").reverse().join("");

        if (palabras[i].toLowerCase() === palabraInvertida.toLowerCase()) {
            console.log(palabras[i] + " es un palindromo");
        }
    }
}


// Punto 6

let cantidad = 0;

for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].length > 4) {
        cantidad++;
    }
}

console.log("Cantidad de palabras con mas de 4 caracteres: " + cantidad);

let palabrasUnidas = palabras.join("-");

console.log("Palabras unidas: " + palabrasUnidas);
