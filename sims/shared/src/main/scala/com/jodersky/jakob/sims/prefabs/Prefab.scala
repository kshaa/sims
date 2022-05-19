/*
 * Simple Mechanics Simulator (SiMS)
 * copyright (c) 2009 Jakob Odersky
 * made available under the MIT License
*/

package com.odersky.jakob.sims.prefabs

import com.odersky.jakob.sims.dynamics._
import com.odersky.jakob.sims.dynamics.joints._

trait Prefab {
  val bodies: Iterable[Body] = Nil
  val joints: Iterable[Joint] = Nil
}
