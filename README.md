# Prueba de Fizz-Buzz

La "prueba de Fizz-Buzz" es una pregunta de entrevista diseñada para ayudar a filtrar al 99.5% de los candidatos a puestos de programación que no parecen ser capaces de programar. El texto del ejercicio de programación es el siguiente:

"Escriba un programa que imprima los números del 1 al 100. Pero para los múltiplos de tres imprima “Fizz” en lugar del número y para los múltiplos de cinco imprima “Buzz”. Para los números que son múltiplos de ambos tres y cinco imprima “FizzBuzz”."

Fuente: ["Using FizzBuzz to Find Developers who Grok Coding"](http://tickletux.wordpress.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/)

## Comentarios Adicionales

"Sería más interesante si los números fueran del -50 al +50." -- mt

### Artículos:

1. ["Why Can't Programmers.. Program?"](http://www.codinghorror.com/blog/archives/000781.html)
2. [Artículo en el blog de Peripatetic Axiom](http://peripateticaxiom.blogspot.co.uk/2007/02/fizzbuzz.html)
3. [Artículo de Imran On Tech](http://imranontech.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/)
4. [FizzBuzz en muchos lenguajes de programación](https://rosettacode.org/wiki/FizzBuzz)

### Video

[Cómo escribir FizzBuzz en Ruby, con desarrollo basado en pruebas](http://youtu.be/CHTep2zQVAc)

### Opiniones y Discusiones

- Nunca recibí la prueba de Fizz-Buzz, pero últimamente me han hecho preguntas tan estúpidas que me sorprendió que me las hicieran. Pregúntame sobre HTML. Mi favorita. ¿Cómo se escribe un bucle for? WTH? (circa 2014)

#### Por qué Fizz-Buzz es "difícil":

No podemos entender por qué tantas personas "fallan" la prueba de Fizz-Buzz a menos que entendamos por qué es "difícil" (para ellos). Comprendiendo eso, podemos evaluar la utilidad de esta herramienta y otras como herramientas de filtrado para candidatos.

- **Punto 1:** No se ajusta a ninguno de los patrones que se les enseñaron en las tareas escolares.
- **Punto 2:** No es posible representar directamente y simplemente las pruebas necesarias, sin duplicación, en casi cualquier lenguaje de programación moderno comúnmente utilizado.

**Solución:**

Una forma de estructurar el código sería:

```java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
