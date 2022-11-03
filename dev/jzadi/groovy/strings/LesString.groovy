package dev.jzadi.groovy.strings

def nom = "Joachim";
println nom
println 'Mon nom est ' + nom
println 'Mon nom est '.concat(nom)
println "Mon nom est $nom"
println 'Mon nom est $nom'
printf 'Mon nom est %s\n', nom

// '''...''' ou """...""" --> Conserve le formatatge du texte
def chaine = '''Voici un objet groovy 
qui represente une chaine de carateres'''

println chaine
println chaine.length()

def prenom = 'Joachim'
println prenom[2]
println prenom[-2]

println prenom.indexOf('c')
println prenom[0..4]
println prenom[4..0]

println prenom.substring(2)
println prenom.substring(2, 4)
println prenom.subSequence(2, 4)

println chaine.split(" ")
println chaine - 'groovy'
println chaine.replace("groovy", "Java")

// La plupart des methodes de la classe String Java sont applicable en Groovy

println prenom.toList();
println(prenom * 3);

def chaineUne = /Un trophé verte pour $prenom/
def chaineDeux = $/Un trophé bleu pour $prenom/$

println chaineUne;
println chaineDeux;








