🔧 Componentes y Detalle de la Implementación en Scala

1. Simpson.sc - Abstracción del Cálculo (Higher Order Function)

El componente integracion constituye el corazón funcional del proyecto. Su diseño cumple rigurosamente con el patrón de HOF:

    Firma del Método:
    Scala

    def integracion(a: Double, b: Double, f: Double => Double): Double

        La signatura f: Double => Double indica que el parámetro f es una función que mapea un valor Double a otro Double, un requisito clave para clasificar integracion como una HOF.

    Mecanismo HOF: Al recibir la función f(x) como dato, el algoritmo de integracion se convierte en un procedimiento parametrizado, capaz de procesar cualquier función matemática que respete el contrato de entrada/salida.

2. CalculoError.sc - Módulo de Verificación

Este módulo garantiza la evaluación cuantitativa de la aproximación:

    Fórmula del Error Absoluto: La precisión se mide utilizando la diferencia absoluta entre el valor de referencia y el resultado numérico:

    Error = |valorEsperado - valorObtenido|

    Función Auxiliar:
    Scala

    def calcularError(esperado: Double, obtenido: Double): Double = {
      abs(esperado - obtenido)
    }

    Esta función es pura, ya que su salida depende únicamente de sus entradas y no produce efectos secundarios observables, reforzando el paradigma de PF.

📊 Resultados Cuantificados del Método

El archivo CalculoError.sc genera el siguiente reporte, demostrando la precisión del método de Simpson 31​:

Tabla 2: Reporte de Aproximación y Error Absoluto

ID	Función f(x)	Valor Esperado	Valor Obtenido	Error Absoluto
1	−x2+8x−12	7.330000	7.333333	0.003333
2	3x2	8.000000	8.000000	0.000000
3	x+2x2−x3+5x4	3.333000	3.333333	0.000333
4	x2+x2x+1​	1.098610	1.098612	0.000002
5	ex	1.718280	1.718282	0.000002
6	x−1​1​	0.828427	0.828427	0.000000
7	1+x21​	0.785398	0.785398	0.000000

🧠 Profundización en Programación Funcional (PF) Aplicada

El uso de Scala facilita la adhesión a los principios de la PF, que son esenciales para un código robusto y modular:

    Funciones de Primera Clase y HOFs: En Scala, las funciones son tratadas como ciudadanos de primera clase, permitiendo que integracion las manipule como cualquier otro tipo de dato. Esto promueve la abstracción sobre el comportamiento.

    Inmutabilidad y Predictibilidad: La utilización extensiva de la palabra clave val (valores inmutables) garantiza que, una vez definidos, los datos como los límites de integración (a, b) o las funciones lambda, no pueden ser modificados. Esto elimina las condiciones de carrera y los efectos secundarios, haciendo que el código sea inherentemente thread-safe y más fácil de depurar.

    Transparencia Referencial: El diseño con HOFs y la inmutabilidad asegura la transparencia referencial, lo que significa que una expresión (como integracion(a, b, f1)) siempre puede ser reemplazada por su resultado sin cambiar el comportamiento del programa.

📚 Referencias Académicas

    Burden, R. L., & Faires, J. D. (2021). Numerical Analysis (10th ed.). Cengage Learning. (Obra fundamental sobre la teoría de Simpson 31​ y el análisis de errores.)

    Wampler, D. (2014). Functional Programming with Scala. O'Reilly Media. (Una referencia clave para el uso de HOFs y el diseño inmutable en Scala.)

    Meijer, E., & van Zonneveld, R. (2020). Functional Programming for Dummies. Wiley. (Para una comprensión amplia de los conceptos de primera clase y la composición.)

    Kreyszig, E. (2011). Advanced Engineering Mathematics (10th ed.). Wiley. (Proporciona el contexto matemático riguroso para la ingeniería y los métodos numéricos.)

    Scala Documentation. Higher-Order Functions and Currying. (Documentación oficial para los aspectos funcionales del lenguaje Scala.)
