package com.j4ltechnologies.groovy.maps

// Groovy étend l'API Map en Java pour fournir des méthodes pour des opérations telles que le filtrage,
// la recherche et le tri. Il fournit également une variété de raccourcis pour créer et manipuler des Map.

// Creation des Maps

// Map vide
def mapVide = [:]
println "mapVide = $mapVide";

// NB
assert mapVide instanceof LinkedHashMap

// Map avec valeurs
def personne = [prenom: 'Joachim', age: '35', ville: 'Paris']
println "personne = $personne"

def autrePersonne = personne.clone()
assert autrePersonne == personne

// Ajout d'éléments
def employe = [prenom: 'Archange']
employe["age"] = 18
employe.ville = 'Paris'
employe.put('conjoint', 'Marie')
assert employe == [prenom: 'Archange', age: 18, ville: 'Paris', conjoint: 'Marie']

// En d'autres termes, Groovy prend en charge l'accès aux paires clé-valeur à la manière d'un bean.
// Nous pouvons également utiliser des variables au lieu de littéraux comme clés lors de l'ajout de nouveaux éléments à la Map

def loisir = "loisir"
def loisirMap = [(loisir): "Lecture"]
employe.putAll(loisirMap);
assert employe == [prenom: 'Archange', age: 18, ville: 'Paris', conjoint: 'Marie', loisir: 'Lecture']
println "employe = $employe"

//Récupération d'éléments
assert employe['prenom'] == 'Archange'
assert employe.prenom == 'Archange'
assert employe.get("prenom") == 'Archange'
assert employe.getAt("prenom") == 'Archange'
assert mapVide.cle == null

// Suppression d'éléments
def map = [1: 20, a: 30, 2: 42, 4: 34, ba: 67, 6: 39, 7: 49]
def minusMap = map.minus([2: 42, 4: 34])
assert minusMap == [1: 20, a: 30, ba: 67, 6: 39, 7: 49]

// Ensuite, nous pouvons également supprimer des entrées en fonction d'une condition.
// Nous pouvons y parvenir en utilisant la méthode removeAll() :
minusMap.removeAll { it -> it.key instanceof String }
assert minusMap == [1: 20, 6: 39, 7: 49]

// Inversement, pour conserver toutes les entrées qui satisfont une condition,
// on peut utiliser la méthode retentionAll() :
minusMap.retainAll { item -> item.value % 2 == 0 }
assert minusMap == [1: 20]

// Iteration des elements
map.each { el -> println "$el.key : $el.value" }
map.eachWithIndex { el, i -> println "($i) $el.key: $el.value" }

//Il est également possible de demander que la clé, la valeur et l'index soient fournis séparément :
map.eachWithIndex { cle, valeur, i -> println "$i $cle: $valeur" }