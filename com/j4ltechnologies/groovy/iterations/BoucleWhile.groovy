package com.j4ltechnologies.groovy.iterations

// BOUCLE WHILE

//Groovy prend en charge les boucles while {…} habituelles comme Java :
int i = 1;
while (i <= 5) {
    print "$i ";
    i++;
}

println "\n==========================";

def x = 0, y = 5

while (y-- > 0) {
    x++
}
assert x == 5
printf "x = %s\n", x


println "\n==========================";
//La boucle do/while de la classe Java est désormais prise en charge. Exemple:
def compteur = 5
def factoriel = 1

do {
    factoriel *= compteur--
} while (compteur > 1)

assert factoriel == 120
printf "factoriel = %s\n", factoriel
