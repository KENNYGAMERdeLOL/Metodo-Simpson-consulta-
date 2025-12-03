ntegración Numérica con Método de Simpson 1/3 usando Programación Funcional en Scala

📌 1. Introducción

La integración numérica permite aproximar el valor de una integral definida cuando la solución analítica es complicada, imposible o poco práctica. En este trabajo se implementa el método de Simpson 1/3, una técnica clásica de aproximación basada en un polinomio cuadrático que interpola tres puntos de la función.

Además, se aplica programación funcional en Scala mediante funciones de orden superior, funciones como parámetros y uso de map para procesar varias integrales de forma expresiva y concisa.

📌 2. Fundamento Teórico del Método de Simpson 1/3

El método de Simpson 1/3 aproxima la integral definida:
image

mediante un polinomio cuadrático que pasa por:
image

Interpretación Se divide el intervalo [a,b] en dos partes.

Se evalúa la función en:

    el límite inferior,

    el límite superior,

    el punto medio.

La función es aproximada por una parábola (polinomio de grado 2).

📌 3. Diseño de la Función integracion

La función integracion debe:

Parámetros

Una función f(x) — función de orden superior.

Los límites de integración: *a → límite inferior *b → límite superior

Resultado Devuelve un número real equivalente a la aproximación de la integral mediante Simpson. Pasos internos 1.Calcular el punto medio:
image

2.Evaluar la función en los tres puntos: f(a)

𝑓(𝑥ˉ)

f(b)

3.Aplicar la fórmula:
image

📌 4. Cálculo del Error Aproximado

El error se define como la diferencia absoluta entre:

    El valor esperado (proporcionado por el docente).

    El valor obtenido mediante Simpson.

Error

∣   esperado − obtenido   ∣ Error=∣esperado−obtenido∣

Este error cuantifica qué tan precisa fue la aproximación numérica.
image

Este error cuantifica qué tan precisa fue la aproximación numérica.

📌 5. Conclusiones del Trabajo

El método de Simpson 1/3 es una técnica efectiva y sencilla para aproximar integrales definidas.

El uso de programación funcional en Scala permite expresar estos cálculos de manera más organizada, declarativa y flexible.

El enfoque mediante funciones de orden superior facilita el manejo de múltiples integrales sin repetir código.

El cálculo del error permite comparar la aproximación numérica con valores teóricos o exactos.

La combinación de matemáticas y programación funcional muestra cómo Scala es una herramienta potente para problemas numéricos.
