#lang racket


(define lista-valores '(1 2 4.5 "casa"))
(define lista-alumnos (list (list "Diana" 25) (list "Hernan" 37)))

(define (obtener lista pos)
  (if (= pos 0)
      (car lista)
      (obtener (cdr lista) (- pos 1))))

; Definir una funcion que me devuelva la edad de un alumno segun su posicion
(define (obtener-edad lista pos)
  (obtener (obtener lista pos) 1))

(define lista-alumnos-notas-ep1 (list (list "20143434" "Hernan" 10 14)
                                      (list "20162323" "Diana" 15 13)))
; EP1 = (nota1 * 3 + nota2 * 7) / 10
; Definir una funcion que me devuelva la nota EP1 de un alumno de una posicion determinada
(define (calcular-ep1 nota1 nota2)
  (/ (+ (* 3 nota1) (* 7 nota2)) 10))

(define (calcular-ep1-2 alumno)
  (/ (+ (* 3 (obtener alumno 2)) (* 7 (obtener alumno 3))) 10))

(define (obtener-nota-ep1 lista pos)
  (calcular-ep1-2 (obtener lista pos)))

; Concepto: Las funciones son miembros de primer nivel
(define (operar n1 n2 operacion)
  (operacion n1 n2))

; Funcion map
(define lista-numeros '(1 2 3 4 5))
(define (cuadrado num)(* num num))
(map cuadrado lista-numeros) ; La funcion cuadrado se va a ejecutar para CADA elemento de la lista -> nueva lista

; Implementar una funcion que teniendo una lista alumnos con notas (EP1) me devuelva una lista de solo las notas (EP1)
(define (notas-ep1 lista)
  (map calcular-ep1-2 lista-alumnos-notas-ep1)) ; -> lista notas calculadas






