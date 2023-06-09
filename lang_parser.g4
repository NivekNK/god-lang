grammar lang_parser;
import lang_lexer;

program: statement* EOF;

statement
    : int_block
    | float_block
    | string_block
    | assign_block
    | const_block
    | if_block
    | for_block
    | while_block
    | sqrt_block
    | pow_block
    | abs_block
    | print_block
    | scanf_block
    | plus_block
    | minus_block
    | div_block
    | multi_block
    | operation END
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

int_block: INT_TOKEN VAR_NAME (END | ASSIGN NUMBER END);

float_block: FLOAT_TOKEN VAR_NAME (END | ASSIGN FLOATING_POINT END);

string_block: STRING_TOKEN VAR_NAME (END | ASSIGN STRING END);

assign_block: VAR_NAME ASSIGN (NUMBER | FLOATING_POINT | STRING) END;

const_block
    : (CONST_TOKEN INT_TOKEN VAR_NAME ASSIGN NUMBER END)
    | (CONST_TOKEN FLOAT_TOKEN VAR_NAME ASSIGN FLOATING_POINT END)
    | (CONST_TOKEN STRING_TOKEN VAR_NAME ASSIGN STRING END)
    ;

if_block: IF_TOKEN LPAREN condition_statement RPAREN LBRACE statement* RBRACE (ELSE_TOKEN LBRACE statement* RBRACE)?;

for_block: FOR_TOKEN LPAREN INT_TOKEN VAR_NAME ASSIGN NUMBER END condition_statement END operation RPAREN LBRACE statement* RBRACE;

while_block: WHILE_TOKEN LPAREN condition_statement RPAREN LBRACE statement* RBRACE;

sqrt_block: SQRT_TOKEN LPAREN FLOATING_POINT RPAREN END;

pow_block: POW_TOKEN LPAREN FLOATING_POINT COMMA NUMBER RPAREN END;

abs_block: ABS_TOKEN LPAREN FLOATING_POINT RPAREN END;

print_block: PRINT_TOKEN LPAREN (STRING | VAR_NAME) RPAREN END;

scanf_block: SCANF_TOKEN '<' (INT_TOKEN | FLOAT_TOKEN | STRING_TOKEN) '>' LPAREN RPAREN END;

plus_block: VAR_NAME ASSIGN VAR_NAME PLUS_TOKEN VAR_NAME END;

minus_block: VAR_NAME ASSIGN VAR_NAME MINUS_TOKEN VAR_NAME END;

div_block: VAR_NAME ASSIGN VAR_NAME DIV_TOKEN VAR_NAME END;

multi_block: VAR_NAME ASSIGN VAR_NAME MULTI_TOKEN VAR_NAME END;

WS: (' ' | '\r' | '\t' | '\n')+ -> skip;
