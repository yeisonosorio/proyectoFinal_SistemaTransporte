# proyectoFinal_SistemaTransporte



## Documentación de Proyecto Sistema de Transporte - README.md
La aplicación Sistema de Trasporte tendra diferentes componentes, como una clase Bus, una clase Destino, una clase Pasajero que extiende de Persona y una clase 
RegistroViaje. Cada uno de estos componentes tendrá sus propias variables y métodos específicos.

## Los componentes clave de la aplicación son los siguientes:👇


<h1 align="center"> Endpoints a Probar</h1>
<p align="center"> Empresa de Transporte SUPI</p>
<p align="center"><img src="https://acortar.link/q72mUZ" style="width: 150px; height: 100px;"/></p> 

## Tabla de contenidos:
---

- [Bus Contronller](#Bus-Contronller)
- [Destino Controller](#Destino-Controller)
- [Pasajero Controller](#Pasajero-Controller)
- [RegistroViaje Controller](#RegistroViaje-Controller)


## Herramientas Necesarias para probar el Sistema
---

- Postman.
- Intellj IDE.
- Navegador Web.

### Para Probar Cada Endpoints.
---


## Bus Contronller
---
##Ensdpoints a probar.
--
--Post

    http://localhost:8080/bus

--JSON PARA REGISTRAR 

     {
       "id": "a1",
      "nombre": "BOGOTA"
      }


--Get Toda la lista

    http://localhost:8080/bus/list
  
--Get{id}

    http://localhost:8080/bus/id

--Put


    http://localhost:8080/bus/actua
  
  
--JSON PARA REGISTRAR 

       {
       "id": "a2",
      "nombre": "MEDELLI"
      }
  
--Delete{id}

    http://localhost:8080/bus/id
  
  
  
## Destino Controller
---

--Post

    http://localhost:8080/api/destino

--Get Toda la lista

    http://localhost:8080/api/destino/list
  
--Put 

    http://localhost:8080/api/destino/actua
  
--Delete{id}

    http://localhost:8080/api/destino/id
    


### Pasajero Controller
---
##Ensdpoints a probar.

--Post

    http://localhost:8080/api/pasajero

--JSON PARA PROBAR EL REGISTRO

     {
       "id": "a1",
       "nombre": "yeison osorio",
       "documento": "10121123",
       "correo": "yeison@gamilc.com"
     }

--Get Toda la lista

    http://localhost:8080/api/pasajero/list
  
--Put 

    http://localhost:8080/api/pasajero/actua

--JSON PARA PROBAR EL REGISTRO

     {
       "id": "a1",
       "nombre": "yeison ferney osorio",
       "documento": "10121123",
       "correo": "yeison@hotmail.com"
     }


--Delete{id} le envia el id

    http://localhost:8080/api/pasajero/id
    
## RegistroViaje Controller
---
##Ensdpoints a probar.

--Post

    http://localhost:8080/api/registro-viaje

-- JSON PARA REGISTRAR


     [
    {
        "id": "V0001",
        "bus": {
            "id": "B001",
            "placa": "ABC123",
            "capacidad": "50"
        },
        "destino": {
            "id": "D001",
            "nombre": "Lima"
        },
        "fecha": "2023-01-31",
        "hora": "08:00:00",
        "pasajeros": [
            {
                "id": "P0001",
                "nombre": "Juan Perez",
                "documento": null,
                "correo": null
            },
            {
                "id": "P0002",
                "nombre": "Maria Rodriguez",
                "documento": null,
                "correo": null
            },
            {
                "id": "P0003",
                "nombre": "Yeison Rodriguez",
                "documento": null,
                "correo": null
            }
        ]
    }
]



--Get Toda la lista

    http://localhost:8080api/registro-viaje/list
  
--Put le envia el Json

    http://localhost:8080/api/registro-viaje/actua


--JSON PARA ACTUALIZAR 


          [
    {
        "id": "V0002",
        "bus": {
            "id": "B002",
            "placa": "EUJ26C",
            "capacidad": "50"
        },
        "destino": {
            "id": "D001",
            "nombre": "Lima"
        },
        "fecha": "2023-01-31",
        "hora": "08:00:00",
        "pasajeros": [
            {
                "id": "P0001",
                "nombre": "Juan Perez",
                "documento": null,
                "correo": null
            },
            {
                "id": "P0002",
                "nombre": "Maria Rodriguez",
                "documento": null,
                "correo": null
            },
            {
                "id": "P0003",
                "nombre": "Yeison Rodriguez",
                "documento": null,
                "correo": null
            },
             {
                "id": "P0004",
                "nombre": "Yeison Rodriguez",
                "documento": null,
                "correo": null
            }, {
                "id": "P0005",
                "nombre": "Yeison Rodriguez",
                "documento": null,
                "correo": null
            }
        ]
    }
]


--Delete{id}   le envia el id

    http://localhost:8080/api/registro-viaje/id
    
