package com.j4ltechnologies.groovy.closures

//Une définition d'une closure suit cette syntaxe

// { [parametres de la closure -> ] déclarations }

// Deffinition de la closure
def closureUn = { println 'Bonjour ma closure une' }
// appel de la closure
closureUn.call();

def closureDeux = { prenom -> println "Bonjour $prenom depuis la closure deux" }
closureDeux.call('Joachim')

//Quelques exemples de définitions de closures valides:
def closureTrois = { ++item };
println closureTrois.call(item = 0)

def closureQuatre = { -> ++item };
println closureQuatre.call()

def closureCinq = { it -> ++it };
println closureCinq.call(8)

//def closureSix = { reader ->
//    def ligne = reader.readLine()
//    ligne.trim()
//}
//println closureSix.call("Joachim")

//Les closures comme objets

//Vous pouvez assigner une fermeture à une variable, c'est une instance de groovy.lang.Closure
def listener = { e -> println "Vous avez cliquez sur $e.source" }
assert listener instanceof Closure

//Si vous n'utilisez pas def ou var, vous pouvez utiliser la Closure comme type
Closure callback = { println "OK...!" }

//Optionnellement, vous pouvez spécifier le type de retour de la closure en utilisant un type générique de Closure
Closure<Boolean> isFichier = { File it -> it.name.endsWith('.txt') }

def concat1 = { String... args -> args.join('') }
assert concat1('abc', 'def') == 'abcdef'

def concat2 = { String[] args -> args.join('') }
assert concat2('abc', 'def') == 'abcdef'

def multiConcat = { int n, String... args ->
    args.join('') * n
}
assert multiConcat(2, 'abc', 'def') == 'abcdefabcdef'