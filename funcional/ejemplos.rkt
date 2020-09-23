#lang racket

; Listas

(define lista-numeros '(1 3 5 7 9))
(define lista-dias-semana (list "Lunes" "Martes" "Miercoles"))

; car
(car lista-numeros) ; -> el primer elemento de la lista.
(cdr lista-numeros) ; -> nos devuelve una NUEVA lista sin el primer elemento.


; Implementar la funcion obtener que devuelva un elemento de la posicion pos
; de la lista que se recibe como parametro
(define (obtener lista pos)
  (if (eq? pos 0)
      (car lista)
      (obtener (cdr lista) (- pos 1))))

; Implementar una funcion sumar-lista que se va encargar de sumar
; todos los elementos de una lista de numeros
(define (sumar-lista lista)
  (if (empty? lista)
      0
      (+ (car lista) (sumar-lista (cdr lista)))))

; Implementar una funcion longitud que te devuelve el tamanho de la lista
(define (longitud lista)
  (if (empty? lista)
      0
      (+ 1 (longitud (cdr lista)))))

; TAIL RECURSION (recursividad de cola)
(define (sumar-lista-tail lista suma)
  (if (empty? lista)
      suma
      (sumar-lista-tail (cdr lista) (+ suma (car lista)))))

; longitud-tail
(define (longitud-lista-tail lista res)
  (if (empty? lista)
      res
      (longitud-lista-tail (cdr lista) (+ res 1))))

; Implementar una funcion que nos devuelva el promedio de una lista
; de numeros
(define (promedio-lista lista)
  (/ (sumar-lista-tail lista 0) (longitud-lista-tail lista 0)))

(define (promedio-lista-2 lista sum long)
  (if (empty? lista)
       (/ sum long)
       (promedio-lista-2 (cdr lista) (+ sum (car lista)) (+ 1 long) )))

; Implementar una funcion que nos devuelva el numero de mayor de una lista
(define (mayor-lista lista mayor)
  (if (empty? lista)
      mayor
      (mayor-lista (cdr lista) (if (>= (car lista) mayor)
                                   (car lista)
                                   mayor))))

(define (menor-lista lista menor)
  (if (empty? lista)
      menor
      (menor-lista (cdr lista) (if (<= (car lista) menor)
                                   (car lista)
                                   menor))))

; Lista cuyos elementos tambien sean listas
(define lista-alumnos (list (list "Hernan" 37) (list "Diana" 25)))






