#lang racket
; funcion map
(define lista-numeros (list 1 3 5))

(define (cuadrado x) (* x x))

; Funcion Lambda: -> creadora de funciones
; funciones anonimas

(define lista-alumnos (list (list "Diana" 12 16)
                            (list "Claudia" 15 13)
                            (list "Diego" 7 16)))

; Implementar una funcion que nos calcule la nota EP1 de cada uno de los alumnos
; EP1 = (nota1 * 3 + nota2 * 7) / 10
(define (obtener lista pos)
  (if (= pos 0)
      (car lista)
      (obtener (cdr lista) (- pos 1))))

(define (calcular-ep1 lista)
  (map exact->inexact (map (lambda (alumno) (/ (+ (* 3 (obtener alumno 1)) (* 7 (obtener alumno 2))) 10)) lista)))

; Funcion filter
; (filter <predicado> <lista>)

; Funciones para trabajar con listas
; - empty?
; - length
; - list-ref
; - append: concatenar listas
; - cons: agregar un elemento al inicio de la lista








