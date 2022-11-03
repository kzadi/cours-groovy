package dev.jzadi.groovy.operateurs

//https://groovy-lang.org/operators.html

// OPERATEURS ARITHMETIQUES
// ========================

// L'addition
assert 1 + 2 == 3
// La soustraction
assert 4 - 3 == 1
// La multiplication
assert 3 * 5 == 15
// La division
assert 3 / 2 == 1.5
// % le modulo
assert 10 % 3 == 1
// ** Eleve à la puissance
assert 2**3 == 8
// Division entiere
assert 9.intdiv(5) == 1
assert 2.2.plus(1.1) == 3.3

print '=========================\n'

// OPERATEURS UNAIRES
// ==================
assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

// POST INCREMENTATION
def a = 2
def b = a++ * 3
assert a == 3 && b == 6

// POST DECREMENTATION
def c = 3
def d = c-- * 2
assert c == 2 && d == 6

// PRE INCREMENTATION
def e = 1
def f = ++e + 3
assert e == 2 && f == 5

// PRE DECREMENTATION
def g = 4
def h = --g + 1
assert g == 3 && h == 4

print '=========================\n'

// OPERATEURS D'ASSIGANTIONS
// =========================

def aa = 4
aa += 3
assert aa == 7

def bb = 5
bb -= 3
assert bb == 2

def cc = 5
cc *= 3
assert cc == 15

def dd = 10
dd /= 2
assert dd == 5

def ee = 10
ee %= 3
assert ee == 1

def ff = 3
ff **= 2
assert ff == 9

// OPERATEURS RELATIONNELS
// =======================

assert 1 + 2 == 3
assert 3 != 4
assert -2 < 3
assert 2 <= 2
assert 3 <= 4
assert 5 > 1
assert 5 >= -2

// OPERATEURS LOGIQUES
// ===================
assert !false
assert true && true
assert true || false

// le ! est prioritaire sur le && et le && est prioriotaire sur le ||
assert (!false && false) == false
assert true || true && false

// OPERATEUR TERNAIRE
// ==================
def prenom = 'Joachim';
result = (prenom != null && prenom.length() > 0) ? 'OK' : 'NOK'
printf 'result = %s\n', result

// OPERATEUR ELVIS
// ===============
prenom = ''
result = prenom ?: "Anonyme"
printf 'result = %s\n', result

prenom = 'Power'
result ?= prenom
printf 'result = %s\n', result
