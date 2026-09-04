// Actividad 1: Callback

const users = [
    { id: 1, name: "Ana" },
    { id: 2, name: "Luis" },
    { id: 3, name: "Maria" }
];

function getUserById(id, callback) {
    setTimeout(() => {
        const user = users.find(user => user.id === id);

        if (user) {
            callback(null, user);
        } else {
            callback("Usuario no encontrado", null);
        }
    }, 1500);
}

getUserById(2, (error, user) => {
    if (error) {
        console.error("Error:", error);
    } else {
        console.log("Usuario encontrado:", user);
    }
});


// Actividad 2: Promesas

function getUserByIdPromise(id) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const user = users.find(user => user.id === id);

            if (user) {
                resolve(user);
            } else {
                reject("Usuario no encontrado");
            }
        }, 1500);
    });
}

getUserByIdPromise(3)
    .then(user => console.log("Usuario encontrado:", user))
    .catch(error => console.error("Error:", error));


// Actividad 3: Async/Await

async function fetchUser(id) {
    try {
        const user = await getUserByIdPromise(id);
        console.log("Usuario encontrado:", user);
    } catch (error) {
        console.error("Error:", error);
    }
}

fetchUser(1);