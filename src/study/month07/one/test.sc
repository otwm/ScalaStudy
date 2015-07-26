

/**
 * Ÿ�� �µ�
 */
val xc = 75.0000
/**
 * Ÿ�� ����
 */
val vc = 5000.0000
/**
 * ������
 * @param r ���� ����
 * @param x �µ�
 */
class Pipe(val r: Double, val x: Double)
val pipe1 = new Pipe(10.0000, 30.0000)
val pipe2 = new Pipe(20.0000, 50.0000)
val pipe3 = new Pipe(300.0000, 95.0000)
val pipe4 = new Pipe(40.0000, 2.0000)
val allPipe = List(pipe1, pipe2, pipe3, pipe4)
val lowerPipe = allPipe.filter(_.x < xc)
val upperPipe = allPipe.filter(_.x > xc)
/**
 *
 * @param pipes ��������
 * @return ǥ�ؿµ�,��������
 */
def standardTemperature(pipes: List[Pipe]) = {
  var sum1: Double = 0.0
  var sum2: Double = 0.0
  for (pipe <- pipes) {
    sum1 += pipe.x * pipe.r
    sum2 += pipe.r
  }
  (sum1 / sum2, sum2)
}

val lowerInfo = standardTemperature(lowerPipe)
val upperInfo = standardTemperature(upperPipe)
println(s"=================================================")
println(s"val ${lowerInfo._1}, ${lowerInfo._2}")
println(s"val ${upperInfo._1}, ${upperInfo._2}")
/**
 *
 *
 * t0,t1 ������ �ð�
 * v0,v1 ������ ����
 * r0,r1 ������ ���� ����
  v0 = t0 * r0
  v1 = t1 * r1

  v0*x0 + v1*x1 / v0 + v1 =  xc
  t0*r0*x0 + t1*r1*x1 / t0*r0 +  t1*r1 = xc
  t0*r0*x0 + t1*r1*x1 = xc * ( t0*r0 +  t1*r1 )
  t0*r0*x0 = xc * ( t0*r0 +  t1*r1 ) - t1*r1*x1
  t0*r0*x0 = xc * t0*r0 + xc * t1*r1  - t1*r1*x1
  t0*r0*x0 - xc * t0*r0 = xc * t1*r1  - t1*r1*x1
  t0 * ( r0*x0 - xc * r0 ) = t1 *
  t0 = ((xc * r1  - r1*x1 ) / ( r0*x0 - xc * r0 )) * t1
  c = ((xc * r1  - r1*x1 ) / ( r0*x0 - xc * r0 ))
  t0 = c * t1

  t0 * x0 + t1 * x1 = vc

  c * t1 * x0 + t1 * x1 = vc
  t1 * ( c * x0 + x1 ) = vc
  t1 = vc / ( c * x0 + x1 )

 */

/**
 * lower ��������
 */
val r0 = lowerInfo._2
/**
 * upper ��������
 */
val r1 = upperInfo._2

/**
 * lower ��տµ�
 */
val x0 = lowerInfo._2
/**
 * upper ��տµ�
 */
val x1 = upperInfo._2

val c = ((xc * r1  - r1*x1 ) / ( r0*x0 - xc * r0 ))

println(s"�׷��� c: ${c}")

val t1 = vc / ( c * x0 + x1 )
val t0 = c * t1

( t0 * r0 * x0 + t1 * r1 * x1 ) / ( t0 * r0  + t1 * r1  )
t0 * r0  + t1 * r1