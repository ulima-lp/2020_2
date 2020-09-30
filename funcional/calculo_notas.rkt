#lang racket
(require csv-reading)

(define lista-alumnos-notas (cdr (csv->list (make-csv-reader
            (open-input-file "/Users/hernan/ULIMA/2020_2/LP_624/clases/2020_2/funcional/notas.csv")
            '((separator-chars #\|)
              (strip-leading-whitespace? . #t)
              (strip-trailing-whitespace? . #t))))))

; Implementar un programa que me calcule las notas finales
(define (calcular-notas-finales lista)
  (map (lambda (alumno)
         (append (list (exact->inexact (/ (+ (* 3 (string->number (list-ref alumno 1)))
            (* 3 (string->number (list-ref alumno 2)))
            (* 4 (string->number (list-ref alumno 3)))) 10)))
                 (list (list-ref alumno 0)))) lista))


; Implementar un programa que me calcule la nota mas alta (valor y quien la saco?)
(define (mayor-nota lista mayor)
  (if (empty? lista)
      mayor
      (mayor-nota (cdr lista) (if (> (list-ref (car lista) 0) (list-ref mayor 0))
                                  (car lista)
                                  mayor))))

(define (mayor-nota-final lista)
  (mayor-nota (calcular-notas-finales lista) (car (calcular-notas-finales lista))))

; Implementar un programa que me calcule la nota mas baja (valor y quien la saco?)

; Implementar un programa que me calcule el promedio final de todo el salon