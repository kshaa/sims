/*
 * Simple Mechanics Simulator (SiMS)
 * copyright (c) 2009 Jakob Odersky
 * made available under the MIT License
*/

package com.odersky.jakob.sims.collision


import com.odersky.jakob.sims.geometry._
import com.odersky.jakob.sims.dynamics._

/**A world detects its collisions through concrete implementations of this class.*/
abstract class Detector {
  
  /**The world whose shapes are to be checked for collisions.*/
  val world: World
  
  /**Returns all collisions between shapes in the world <code>world</code>.*/
  def collisions: Seq[Collision]
}