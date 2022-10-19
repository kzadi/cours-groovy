package com.j4ltechnologies.groovy.variables

// Le mot cle def permet de definir une variable en groovy
// NB : Le nom d'une variable ne peut commencer par un nombre

def nom = 'Zadi';
println nom;

// On peut aussi utiliser la synthaxe Java
String prenom = 'Joachim';
println prenom;

printf("Je m'appelle %s %s\n", prenom, nom);
printf "Je m'appelle %s %s\n", prenom, nom;

// On peut utiliser l'interpollation comme en PHP
println 'Mon prenom est ${prenom}'; // Pas d'interpretation de la variable prenom
println "Mon prenom est ${prenom}"; // Pas d'interpretation de la variable

//Les variables d'un script ne nécessitent pas de définition de type:
def x = 12
y = -10.2
println x;
println y;
assert x + y == 1.8

// Groovy est un langage dynamiquement typé
y = 'Ange';
println y;

def (a, b, c) = [10, -20, 30];
println a;
println b;
println c;