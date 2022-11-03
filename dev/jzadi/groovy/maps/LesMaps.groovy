package dev.jzadi.groovy.maps

// Groovy �tend l'API Map en Java pour fournir des m�thodes pour des op�rations telles que le filtrage,
// la recherche et le tri. Il fournit �galement une vari�t� de raccourcis pour cr�er et manipuler des Map.

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

// Ajout d'�l�ments
def employe = [prenom: 'Archange']
employe["age"] = 18
employe.ville = 'Paris'
employe.put('conjoint', 'Marie')
assert employe == [prenom: 'Archange', age: 18, ville: 'Paris', conjoint: 'Marie']

// En d'autres termes, Groovy prend en charge l'acc�s aux paires cl�-valeur � la mani�re d'un bean.
// Nous pouvons �galement utiliser des variables au lieu de litt�raux comme cl�s lors de l'ajout de nouveaux �l�ments � la Map

def loisir = "loisir"
def loisirMap = [(loisir): "Lecture"]
employe.putAll(loisirMap);
assert employe == [prenom: 'Archange', age: 18, ville: 'Paris', conjoint: 'Marie', loisir: 'Lecture']
println "employe = $employe"

//R�cup�ration d'�l�ments
assert employe['prenom'] == 'Archange'
assert employe.prenom == 'Archange'
assert employe.get("prenom") == 'Archange'
assert employe.getAt("prenom") == 'Archange'
assert mapVide.cle == null

// Suppression d'�l�ments
def map = [1: 20, a: 30, 2: 42, 4: 34, ba: 67, 6: 39, 7: 49]
def minusMap = map.minus([2: 42, 4: 34])
assert minusMap == [1: 20, a: 30, ba: 67, 6: 39, 7: 49]

// Ensuite, nous pouvons �galement supprimer des entr�es en fonction d'une condition.
// Nous pouvons y parvenir en utilisant la m�thode removeAll() :
minusMap.removeAll { it -> it.key instanceof String }
assert minusMap == [1: 20, 6: 39, 7: 49]

// Inversement, pour conserver toutes les entr�es qui satisfont une condition,
// on peut utiliser la m�thode retentionAll() :
minusMap.retainAll { item -> item.value % 2 == 0 }
assert minusMap == [1: 20]

// Iteration des elements
map.each { el -> println "$el.key : $el.value" }
map.eachWithIndex { el, i -> println "($i) $el.key: $el.value" }

//Il est �galement possible de demander que la cl�, la valeur et l'index soient fournis s�par�ment :
map.eachWithIndex { cle, valeur, i -> println "$i $cle: $valeur" }