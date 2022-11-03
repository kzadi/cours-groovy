package dev.jzadi.groovy.iterations


// LA BOUCLE FOR
// -------------
String message = '';
for (def i = 1; i <= 5; i++) {
    printf 'Bonjour %s fois\n', i
}

print '==========================\n'

for (def i in 1..5) {
    printf 'Bonjour %s fois\n', i
}

print '==========================\n'
1.upto(5) { printf 'Bonjour %s fois\n', it }

print '==========================\n'
1.step(10, 2) { printf 'Bonjour %s fois\n', it }

print '==========================\n'

// La forme plus élaborée de la boucle for classique de Java avec des
// expressions séparées par des virgules est désormais prise en charge.
// Exemple:

def tab = []
def compteur = 5

for (def factorielle = 1, i = 1; i <= compteur; i++, factorielle *= i) {
    tab << factorielle
}
assert tab == [1, 2, 6, 24, 120]
printf 'tab = %s\n', Arrays.asList(tab)

//Groovy prend en charge les instructions multi-affectations depuis Groovy 1.6
def (String x, int y) = ["foo", 50]
assert "$x $y" == "foo 50"

//Celles-ci peuvent désormais apparaître dans les boucles for :
def baNums = []
for (def (String u, int v) = ['bar', 50]; v < 55; u++, v++) {
    baNums << "$u $v"
}
assert baNums == ["bar 50", "bas 51", "bat 52", "bau 53", "bav 54"]

// La boucle for dans Groovy est beaucoup plus simple et fonctionne
// avec n'importe quel type de tableau, collection, carte, etc.

// itération sur une plage
def xx = 0
for (def i in 0..9) {
    xx += i
}
assert xx == 45

// itération sur une liste
m = 0
for (def i in [0, 1, 2, 3, 4]) {
    m += i
}
assert m == 10

// itération sur un tableau
def array = (0..4).toArray()
m = 0
for (def i in array) {
    m += i
}
assert m == 10

// itération sur une map
def map = ['abc': 1, 'def': 2, 'xyz': 3]
m = 0
for (def e in map) {
    m += e.value
}
assert m == 6

// itération sur les valeurs d'une map
m = 0
for (def v in map.values()) {
    m += v
}
assert m == 6

// itération sur les caractères d'une chaîne
def texte = "Joachim"
def liste = []
for (c in texte) {
    liste.add(c)
}
assert liste == ['J', 'o', 'a', 'c', 'h', 'i', 'm']
printf 'liste = %s\n', Arrays.asList(liste)

