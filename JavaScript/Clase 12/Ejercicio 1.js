// La clase de hoy ser trata de crear una función en el lenguaje de JavaScript, esta función nos tiene que solucionar el ingreso de una contraseña del usuario, la cuál debe ser correcta:

// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)

function validatePassword(password) {
    // Verifica que tenga al menos 8 caracteres
    if (password.length < 8) {
        return false;
    }

    // Verifica que tenga al menos un número
    if (!/\d/.test(password)) {
        return false;
    }

    // Verifica que tenga al menos una letra mayúscula
    if (!/[A-Z]/.test(password)) {
        return false;
    }

    // Si pasó todas las condiciones, la contraseña es válida
    return true;
}