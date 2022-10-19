package com.j4ltechnologies.groovy.exceptions

//int i = 1 / 0;
try {
    def i = 1 / 0;
    print i;
} catch (ArithmeticException e) {
    println 'Bloc catch pour la classe ArithmeticException'
    def cause = e.getCause() ?: 'NULL'
    printf 'cause = %s\n', cause;
    printf 'message = %s\n', e.getMessage();
} catch (Exception e) {
    println 'Bloc catch pour la classe Exception'
} finally {
    println "Bloc Finally. executé quoiqu'il advienne"
}

println '\nSuite du code';
