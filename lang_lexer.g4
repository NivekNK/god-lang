lexer grammar lang_lexer;

INT_TOKEN: 'apolo';
FLOAT_TOKEN: 'poseidon';
STRING_TOKEN: 'atenea';

CONST_TOKEN: 'cronos';

PRINT_TOKEN: 'hermes';
SCANF_TOKEN: 'helios';

IF_TOKEN: 'themis';
ELSE_TOKEN: 'eris';

FOR_TOKEN: 'eon';
WHILE_TOKEN: 'prometeo';

AND_TOKEN: 'omega';
OR_TOKEN: 'phi';

PLUS_TOKEN: 'sigma';
MINUS_TOKEN: 'delta';
DIV_TOKEN: 'lambda';
MULTI_TOKEN: 'chi';

SQRT_TOKEN: 'demeter';
ABS_TOKEN: 'aletheia';
POW_TOKEN: 'dionisio';

STRING: '"' .*? '"';

fragment NATURAL: [0-9];
NUMBER: NATURAL+;
FLOATING_POINT: NATURAL+ '.' NATURAL+;

LPAREN: '(';
RPAREN: ')';

LBRACE: '{';
RBRACE: '}';

END: '-->';

ASSIGN: '=';

VAR_NAME: [a-z]+;

SPACE: ' ';

NEW_LINE: '\n';

MAJOR: '>';

MINOR: '<';

COMMA: ',';
