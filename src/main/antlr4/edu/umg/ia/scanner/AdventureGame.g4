grammar AdventureGame;

// Lexemas
WS : [ \r\n\t] + -> skip ;

ID : [a-zA-Z] [a-zA-Z0-9]* ;
TEXTO : '"' [a-zA-Z0-9!,.?; ] '"' ;
//ARTICULO: 'la' | 'los' | 'las';
// EL_ARTICULO : 'el';

// Reglas
iniciarJuego : ( 'iniciar' | 'comenzar' | 'empezar' ) ( 'el' )* 'juego' ;

dondeEstoy: ( 'donde estoy' | 'que paso' | 'que hubo' );

comandos :
    iniciarJuego
    | dondeEstoy
    ;

comando : comandos comando*;
