package dev.jzadi.groovy.methodes

// Declaration d'une methode
def ditBonjour() {
    println 'Bonjour depuis la methode ... !'
}

// appel de la methodes
ditBonjour();

def somme(int a = 10, int b) {
    printf "$a + $b = %s\n", a + b
}

somme(3, 6)
somme(3)

String soustraction(int a = 0, int b = 0) {
    return "$a - $b = " + (a - b)
}

def resultat = soustraction(35, 15)
println resultat

// Surcharge de methode
def somme(String a, int b) {
    return Integer.parseInt(a) + b
}

println somme('10',5);