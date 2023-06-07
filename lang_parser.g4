grammar lang_parser;
import lang_lexer;

statement
    : (int_block
    | float_block
    | string_block
    | if_block
    | for_block
    | while_block
    | sqrt_block
    | pow_block
    | abs_block)*
    ;

condition_statement
    : VAR_NAME (MINOR | MAJOR) NUMBER
    | 'true'
    | 'false'
    ;

operation
    : VAR_NAME PLUS_TOKEN PLUS_TOKEN
    | VAR_NAME MINUS_TOKEN MINUS_TOKEN
    ;

int_block: CONST_TOKEN? INT_TOKEN VAR_NAME (END | ASSIGN NUMBER END);

float_block: CONST_TOKEN? FLOAT_TOKEN VAR_NAME (END | ASSIGN FLOATING_POINT END);

string_block: CONST_TOKEN? STRING_TOKEN VAR_NAME (END | ASSIGN STRING END);

if_block: IF_TOKEN LPAREN condition_statement RPAREN LBRACE statement RBRACE (ELSE_TOKEN LBRACE statement RBRACE)?;

for_block: FOR_TOKEN LPAREN INT_TOKEN VAR_NAME ASSIGN NUMBER END condition_statement END operation RPAREN LBRACE statement RBRACE;

while_block: WHILE_TOKEN LPAREN condition_statement RPAREN statement LBRACE;

sqrt_block: SQRT_TOKEN LPAREN FLOATING_POINT RPAREN END;

pow_block: POW_TOKEN LPAREN FLOATING_POINT COMMA NUMBER RPAREN END;

abs_block: ABS_TOKEN LPAREN FLOATING_POINT RPAREN END;

WS: (' ' | '\r' | '\t' | '\n')+ -> skip;