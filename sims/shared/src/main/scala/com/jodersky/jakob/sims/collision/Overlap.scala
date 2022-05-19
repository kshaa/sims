/*
 * Simple Mechanics Simulator (SiMS)
 * copyright (c) 2009 Jakob Odersky
 * made available under the MIT License
*/

package com.odersky.jakob.sims.collision

import com.odersky.jakob.sims.geometry._

case class Overlap(poly: ConvexPolygon, sideNum: Int, overlap: Double)
