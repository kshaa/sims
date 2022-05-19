/*
 * Simple Mechanics Simulator (SiMS)
 * copyright (c) 2009 Jakob Odersky
 * made available under the MIT License
*/

package com.odersky.jakob.sims.collision

import com.odersky.jakob.sims.geometry._
import com.odersky.jakob.sims.dynamics._

/**Collision between two circles.*/
case class CircleCollision(c1: Circle, c2: Circle) extends Collision {
  val shape1 = c1
  val shape2 = c2
  val normal = (c2.pos - c1.pos).unit
  val points = {
    val distance = (c2.pos - c1.pos).length
    val p = shape1.pos + normal * (distance - c2.radius)
    List(p)
  } 
}
