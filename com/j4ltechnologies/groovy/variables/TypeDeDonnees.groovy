package com.j4ltechnologies.groovy.variables

import java.time.LocalDate

// LES TYPES DE DONNEES EN GROOVY

//byte --> Entier signé, codé sur 1 octet soit 8 bits
byte b = 10
printf 'b = %s\n', b
printf 'byteMin = %s\n', Byte.MIN_VALUE
printf 'byteMax = %s\n', Byte.MAX_VALUE
println '========================\n'

//short --> Entier signé, codé sur 2 octets soit 16 bits
short s = 154
printf 's = %s\n', s;
printf 'shortMin = %s\n', Short.MIN_VALUE;
printf 'shortMax = %s\n', Short.MAX_VALUE;
println '========================\n'

//int --> Entier signé codé sur 4 octets soit 32 bits
int i = 10245;
printf 'i = %s\n', i
printf 'intMin = %s\n', Integer.MIN_VALUE
printf 'intMax = %s\n', Integer.MAX_VALUE
println '========================\n'

//long --> Entier signé codé sur 8 octets soit 64 bits
def l = 1024545698774562321l;
printf 'l = %s\n', l
printf 'longMin = %s\n', Long.MIN_VALUE
printf 'longMax = %s\n', Long.MAX_VALUE
println '========================\n'

//float --> flottant signé codé sur 4 octets soit 32 bits
def f = 102.45f;
printf 'f = %s\n', f
printf 'floatMin = %s\n', Float.MIN_VALUE
printf 'floatMax = %s\n', Float.MAX_VALUE
println '========================\n'

//double --> flottant signé codé sur 8 octets soit 64 bits
def d = 10.45d;
printf 'd = %s\n', d
printf 'doubleMin = %s\n', Double.MIN_VALUE
printf 'doubleMax = %s\n', Double.MAX_VALUE
println '========================\n'

//char
char c = 'G'
printf 'c = %s\n', c

//Boolean
boolean flag = true;
printf 'flag = %s\n', flag

//String
String chaine = 'Groovy';
printf 'chaine = %s\n', chaine