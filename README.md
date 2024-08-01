# Ejercicio 2

La siguiente información corresponde a la URL del ejecicio 2 del challange tecnico. La URL para acceder a esta operación es:

# API endpoint
## POST 
[http://localhost:8080/tasaOperacion](http://localhost:8080/tasaOperacion)

## Información en formato JSON

```json
{
    "monto": 850,
    "tarjeta": {
        "marca": "VISA",
        "numeroTarjeta": "1344532635356635",
        "cliente": {
            "dni": 19015485,
            "nombre": "Allison",
            "apellido": "Melgar"
        }
    },
    "fechaHoraOperacion": "2024-07-31T21:00:20"
}