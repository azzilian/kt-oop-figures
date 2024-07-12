package mate.academy.figure

import mate.academy.behavior.Drawing
import mate.academy.model.Color
import kotlin.math.floor

class IsoscelesTrapezoid(val base1: Double, val base2: Double, val height: Double, color: Color)
    : Figure("IsoscelesTrapezoid", color), Drawing {

    companion object {
        const val MULTIPLIER = 0.5
        const val FLOOR_NUMBER = 10.0
    }

    override fun calculateArea(): Double = floor(MULTIPLIER * (base1 + base2) * height * FLOOR_NUMBER) / FLOOR_NUMBER

    override fun draw() {
        println("Figure: $name, area: ${calculateArea()} sq. units, base1: $base1 units, "
                + "base2: $base2 units, height: $height units, color: $color")
    }
}
