package dev.jzadi.groovy.lists

// Groovy utilise une liste de valeurs séparées par des virgules,
// entourées de crochets, pour désigner les listes.
// Les listes Groovy sont de simples JDK java.util.List,
// car Groovy ne définit pas ses propres classes de collection.
// L'implémentation de liste concrète utilisée lors de la définition
// des littéraux de liste est java.util.ArrayList par défaut,
// sauf si vous décidez de spécifier le contraire, comme nous le verrons plus tard.

def nombres = [1, 2, 3]
assert nombres instanceof List
assert nombres.size() == 3

def heterogenes = [1, "a", true]

assert nombres instanceof ArrayList

// On utilise l'operateur as pour effectuer une convertion explicite
nombres = nombres as LinkedList
assert nombres instanceof LinkedList

LinkedList autreNombres = [4, 5, 6]
assert autreNombres instanceof LinkedList

// Acess aux elements
def lettres = ['a', 'b', 'c', 'd']

assert lettres[0] == 'a'
assert lettres[1] == 'b'
assert lettres[-1] == 'd'
assert lettres[-2] == 'c'
println "lettres = $lettres"

lettres << 'e'
assert lettres == ['a', 'b', 'c', 'd', 'e']
assert lettres[4] == 'e'
assert lettres[1..3] == ['b', 'c', 'd']
println "lettres = $lettres"

lettres = lettres + ['f', 'g', 'h']
assert lettres == ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
println "lettres = $lettres"
