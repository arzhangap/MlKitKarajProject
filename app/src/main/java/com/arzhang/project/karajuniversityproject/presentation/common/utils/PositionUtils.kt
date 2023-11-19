package com.arzhang.project.karajuniversityproject.presentation.common.utils

import android.graphics.PointF
import android.util.Log
import androidx.compose.ui.geometry.Size
import kotlin.math.max

fun adjustPoint(point: PointF, imageWidth: Int, imageHeight: Int, screenWidth: Int, screenHeight: Int): PointF {
    val x = point.x / imageWidth * screenWidth
    val y = point.y / imageHeight * screenHeight
    return PointF(x, y)
}

fun adjustSize(size: Size, imageWidth: Int, imageHeight: Int, screenWidth: Int, screenHeight: Int): Size {
    val scaleFactor = max(screenWidth / imageWidth, screenHeight / imageHeight)
    val width = scaleFactor * size.width
    val height = scaleFactor * size.height
    return Size(width, height)
}