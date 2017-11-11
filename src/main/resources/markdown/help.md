# Instrucciones del Juego

El juego es del tipo aventura de texto, se recibe cierta informacion en la 
pantalla y se esperan ciertos comandos en el cuadro de dialogo para interactuar con el juego.

## Comandos

### Iniciar el juego

Para iniciar el juego se debe usar el siguiente comando:

```( iniciar | comenzar | empezar ) ( el )* juego```

### Instrucciones

Para obtener los objetivos actuales del juego:

``` ( obtener | repasar | leer ) (las)* instrucciones  ```

### Donde estoy?

Para poder recibir algun tipo de informacion acerca del entorno donde el jugador se encuentra se puede ejecutar el siguinte comando:

``` ( donde estoy | que paso | que hubo | que hay aqui ) ```

### Cosultar inventario

Para consultar los objetos que se han obtenido a lo largo del juego se ejecuta el comando:

``` ( revisar | consultar) (el)* inventario ```

### Acciones

Durante el juego hay ciertas acciones que el jugador puede hacer con los objetos de su entorno, los siguientes comandos reflejan las acciones:

 Accion   | Comando
----------|------------------------------------------------------------------------------------------
tomar     | ``` ( tomar / agarrar / recoger ) (el / la / los / las )* ID ```
ver       | ``` ( ver / revisar / observar ) (el / la / los / las )* ID ``` 
abrir     | ``` ( abrir ) (el / la / los / las )* ID ``` 
cerrar    | ``` ( cerrar ) (el / la / los / las )* ID ``` 
escribir  | ``` ( ingresar / escribir / digitar ) (el / la / los / las )* ID en (el / la / los / las )* ID ``` 
usar      | ``` ( usar / utilizar ) (el / la / los / las )* ID ( en ) (el / la / los / las )* ID ``` 

* ```ID``` se refiere a algun objeto en la habitacion
* Para la accion ```usar``` el primer ```ID``` hace referencia a un objeto dentro del inventario, el ultimo ```ID``` debe ser un objeto en la habitacion
