@main def main(): Unit =

  // 1) FUNCIÓN DE INTEGRACIÓN (Simpson 1/3)
  def integracion(f: Double => Double, a: Double, b: Double): Double =
    val xMedio = (a + b) / 2
    val numerador = f(a) + 4 * f(xMedio) + f(b)
    (b - a) * numerador / 6

  // 2) FUNCIÓN PARA CALCULAR EL ERROR
  def errorAprox(esperado: Double, obtenido: Double): Double =
    (esperado - obtenido).abs

  // 3) LISTA DE INTEGRALES
  val integrales = List(
    (() => integracion(x => -x*x + 8*x - 12, 3, 5), 7.33),
    (() => integracion(x => 3*x*x, 0, 2), 8.0),
    (() => integracion(x => x + 2*x*x - x*x*x + 5*x*x*x*x, -1, 1), 3.333),
    (() => integracion(x => (2*x + 1) / (x*x + x), 1, 2), 1.09861),
    (() => integracion(x => math.exp(x), 0, 1), 1.71828),
    (() => integracion(x => 1 / (x - 1), 2, 3), 0.828427),
    (() => integracion(x => 1 / (1 + x*x), 0, 1), 0.785398)
  )

  // 4) PROCESAR TODO CON MAP
  val resultados = integrales.map { (calc, esperado) =>
    val obtenido = calc()
    val error = errorAprox(esperado, obtenido)
    (obtenido, error)
  }

  // 5) MOSTRAR RESULTADOS
  resultados.zipWithIndex.foreach { case ((obtenido, error), i) =>
    println(s"Integral ${i + 1}:")
    println(s"  Valor obtenido = $obtenido")
    println(s"  Error = $error\n")
  }