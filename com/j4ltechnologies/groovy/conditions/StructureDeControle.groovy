package com.j4ltechnologies.groovy.conditions

// LES STRUCTURES DE CONTROLES
// ===========================

// IF ... ELSE
def x = false
def y = false

if (!x) {
    x = true
}
assert x == true

if (x) {
    x = false
} else {
    y = true
}
assert x == y

def z = 1.23
def result = ""

// SWITCH
switch (z) {
    case "foo":
        result = "OK pour foo"
        // lets fall through
    case "bar":
        result += "bar"
        break
    case [4, 5, 6, 'dasn la liste']:
        result = "liste"
        break
    case 12..30:
        result = "intervalle"
        break
    case Integer:
        result = "Entier"
        break
    case Number:
        result = "Nombre"
        break
    case ~/fo*/:
        result = "foo regex"
        break
    case { it < 0 }: // or { x < 0 }
        result = "negatif"
        break
    default:
        result = "defaut"
}
assert result == "Nombre"

// AUTRE SWITCH
def partner = switch (person = 'Manou') {
    case 'Romeo' -> 'Juliet'
    case 'Adam' -> 'Eve'
    case 'Antony' -> 'Cleopatra'
    case 'Bonnie' -> 'Clyde'
    default -> 'Joachim'
}
assert partner == 'Joachim'

