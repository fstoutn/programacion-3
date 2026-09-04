// Punto 1: Funciones declarativas y expresadas

// Una funcion declarativa se crea usando la palabra function.
// Puede ser llamada antes o despues de su declaracion.
function calcularCuadrado(numero) {
    return numero * numero;
}

// Una funcion expresada se guarda dentro de una variable.
// Solo puede utilizarse despues de haber sido creada.
const calcularCubo = function(numero) {
    return numero * numero * numero;
};

console.log("Cuadrado:", calcularCuadrado(5));
console.log("Cubo:", calcularCubo(3));

// La diferencia principal es la forma en que se crean.
// Las funciones declarativas pueden ser utilizadas antes de su declaracion.
// Las funciones expresadas se asignan a una variable y se utilizan despues de su creacion.


// Punto 2: Arrow Functions y parametros por defecto

// La edad tiene un valor por defecto de 18.
// Si no se recibe una edad, se utilizara automaticamente 18.
const saludar = (nombre, edad = 18) => {
    return "Hola " + nombre + ", tienes " + edad + " años";
};

console.log(saludar("Ana"));
console.log(saludar("Juan", 25));


// Punto 3: Objetos con propiedades y metodos

// Las propiedades almacenan datos del objeto.
// El metodo es una funcion que pertenece al objeto y realiza una accion.
const persona = {
    nombre: "Carlos",
    edad: 25,

    presentarse: function() {
        return "Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años.";
    }
};

console.log(persona.nombre);
console.log(persona.edad);
console.log(persona.presentarse());

// Las propiedades son los datos del objeto.
// Los metodos son funciones que permiten realizar acciones utilizando esos datos.


// Punto 4: Desestructuracion

// La desestructuracion permite obtener varias propiedades de un objeto
// y guardarlas directamente en variables.
const { nombre, edad } = persona;

console.log("Nombre:", nombre);
console.log("Edad:", edad);

// Una ventaja es que permite acceder a varias propiedades de forma mas simple
// sin tener que escribir persona.nombre, persona.edad, etc. cada vez.


// Punto 5: Operador spread y rest

const numeros = [1, 2, 3];

// Spread permite copiar y combinar los elementos de un array.
const masNumeros = [...numeros, 4, 5, 6];

console.log(masNumeros);

// Rest permite recibir una cantidad indefinida de parametros
// y agruparlos en un array.
function sumarNumeros(...numeros) {
    let suma = 0;

    for (let i = 0; i < numeros.length; i++) {
        suma += numeros[i];
    }

    return suma;
}

console.log("Suma:", sumarNumeros(1, 2, 3, 4, 5));

// Spread se utiliza para expandir los elementos de un array.
// Rest se utiliza para reunir varios valores dentro de un array.


// Punto 6: Manipulacion basica del DOM

// Seleccionamos el titulo utilizando su ID.
const titulo = document.getElementById("titulo");

// Cambiamos el texto del titulo utilizando textContent.
titulo.textContent = "Lista de tareas interactiva";

// Creamos dos elementos nuevos para la lista.
const nuevoElemento1 = document.createElement("li");
nuevoElemento1.textContent = "Aprender funciones";

const nuevoElemento2 = document.createElement("li");
nuevoElemento2.textContent = "Practicar eventos";

// Agregamos los elementos creados a la lista.
const lista = document.getElementById("lista");

lista.appendChild(nuevoElemento1);
lista.appendChild(nuevoElemento2);

// Agregamos una clase al titulo.
titulo.classList.add("activo");

// Podemos quitar la clase utilizando remove.
// titulo.classList.remove("activo");

// Toggle agrega la clase si no existe y la quita si ya existe.
// titulo.classList.toggle("activo");


// Punto 7: Eventos click e input

const inputTarea = document.getElementById("inputTarea");
const btnAgregar = document.getElementById("btnAgregar");

// El evento click detecta cuando el usuario presiona el boton.
btnAgregar.addEventListener("click", function() {
    const texto = inputTarea.value;

    if (texto !== "") {
        const nuevaTarea = document.createElement("li");
        nuevaTarea.textContent = texto;

        lista.appendChild(nuevaTarea);

        inputTarea.value = "";
    }
});

// El evento input detecta cuando el usuario escribe o modifica
// el contenido del campo de texto.
inputTarea.addEventListener("input", function() {
    console.log("Texto ingresado:", inputTarea.value);
});


// Punto 8: Evento submit y preventDefault

const formulario = document.getElementById("formulario");
const inputFormulario = document.getElementById("inputFormulario");
const mensajeFormulario = document.getElementById("mensajeFormulario");

// El evento submit se ejecuta cuando se envia el formulario.
formulario.addEventListener("submit", function(evento) {

    // preventDefault evita que el navegador recargue la pagina
    // al enviar el formulario.
    evento.preventDefault();

    const valor = inputFormulario.value;

    mensajeFormulario.textContent = "Ingresaste: " + valor;
});


// Punto 9: Eventos keydown y change

// keydown detecta cuando se presiona una tecla.
inputTarea.addEventListener("keydown", function(evento) {

    // Si la tecla presionada es Enter, se agrega la tarea.
    if (evento.key === "Enter") {

        const texto = inputTarea.value;

        if (texto !== "") {
            const nuevaTarea = document.createElement("li");
            nuevaTarea.textContent = texto;

            lista.appendChild(nuevaTarea);

            inputTarea.value = "";
        }
    }
});

// Seleccionamos el elemento select.
const opciones = document.getElementById("opciones");
const opcionSeleccionada = document.getElementById("opcionSeleccionada");

// change detecta cuando cambia la opcion seleccionada.
opciones.addEventListener("change", function() {

    opcionSeleccionada.textContent = "Seleccionaste: " + opciones.value;
});

// input se ejecuta mientras el usuario modifica un campo.
// keydown se ejecuta cuando se presiona una tecla.
// change se ejecuta cuando cambia el valor de un elemento y se confirma el cambio.
