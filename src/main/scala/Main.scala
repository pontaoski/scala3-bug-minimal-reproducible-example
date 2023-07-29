import projekt.packagea.packagea
import projekt.packageb.packageb

@main def hello: Unit =
  given b: packageb = packageb()
  val a = packagea()
  a.hello()
