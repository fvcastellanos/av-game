grammar AdventureGame;

// Tokens
WS : [ \r\n\t] + -> skip ;
ID : ( [0-9]+ )* [a-zA-Z] [a-zA-Z0-9]* ;

// Rules
startGame : ( 'iniciar' | 'comenzar' | 'empezar' ) ( 'el' )* 'juego' ;
clue : ('ayuda' | 'alguna pista' | 'no se que hacer') ;

whereAmI : ( 'donde estoy' | 'que paso' | 'que hubo' | 'que hay aqui' );
getInstructions : ( 'obtener' | 'repasar' | 'leer' ) ('las')* 'instrucciones' ;
viewInventory : ( 'revisar' | 'consultar') ('el')* 'inventario' ;

takeItem : ( 'tomar' | 'agarrar' | 'recoger' ) ('el' | 'la' | 'los' | 'las' )* ID;
viewItem : ( 'ver' | 'revisar' | 'observar' ) ('el' | 'la' | 'los' | 'las' )* ID;
openItem : ( 'abrir' ) ('el' | 'la' | 'los' | 'las' )* ID;
closeItem : ( 'cerrar' ) ('el' | 'la' | 'los' | 'las' )* ID;
writeItem : ( 'ingresar' | 'escribir' | 'digitar' ) ('el' | 'la' | 'los' | 'las' )* ID 'en' ('el' | 'la' | 'los' | 'las' )* ID;

use : ( 'usar' | 'utilizar' ) ('el' | 'la' | 'los' | 'las' )* ID ( 'en' ) ('el' | 'la' | 'los' | 'las' )* ID ;

commands :
    startGame
    | whereAmI
    | getInstructions
    | viewInventory
    | takeItem
    | viewItem
    | openItem
    | closeItem
    | writeItem
    | use
    | clue
    ;

command : commands command* ;
