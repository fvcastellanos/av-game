grammar Game;

ID : [a-zA-Z] [a-zA-Z0-9]* ;
TEXTO : '"' [a-zA-Z0-9' '!,.?;] '"' ;
FLECHA : '->' ;

introduccion : 'introduccion' TEXTO ;
epilogo : 'epilogo' TEXTO ;

objeto : ' objeto' TEXTO 'con descripcion' TEXTO ;
objetos : objeto | objeto objetos ; 
bloqueObjetos : 'objetos' '[' objetos ']' ;

pista : 'pista' TEXTO ;
pistas : pista | pista pistas;
bloquePistas : 'pistas' '[' pistas ']';

accion : 'accion' TEXTO 'sobre el objeto' TEXTO ';' ; 
acciones : accion | accion acciones ;
bloqueAcciones : 'acciones' '[' acciones ']' ;

evento: 'evento' TEXTO 'descripcion' TEXTO bloquePistas bloqueAcciones ;
eventos : evento | evento eventos ;
bloqueEventos : 'eventos' '[' eventos ']' ;

objetivo : 'objetivo' TEXTO 'descripcion' TEXTO introduccion* epilogo* bloqueEventos ;
objetivos : objetivo | objetivo objetivos;
bloqueObjetivos : 'objetivos' ':' '[' objetivos ']' ;

capitulo : 'capitulo' TEXTO introduccion epilogo* '[' bloqueObjetos bloqueObjetivos ']' ;
capitulos : capitulo | capitulo capitulos;
bloqueCapitulos : 'capitulos' '[' capitulos ']' ;

historia : 'historia' TEXTO introduccion epilogo '[' bloqueCapitulos ']' ;
