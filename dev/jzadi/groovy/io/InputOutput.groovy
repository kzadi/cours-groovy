package dev.jzadi.groovy.io

// Entree Sortie
print 'Saisir votre prenom : '
def prenom = System.console().readLine()
println "Votre prenom est $prenom"

print 'Saisir votre �ge : '
def age = System.console().readLine().toInteger()
println "Votre age est $age ans"

print 'Saisir votre ann�e de naissance : '
def annee = System.console().readLine() as Integer
println "Vous �tes n�e en $annee"
