package com.movtery.zalithlauncher.ui.screens.content.home

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.movtery.zalithlauncher.R
import com.movtery.zalithlauncher.ui.theme.AetherWordmark
import kotlin.random.Random

private class Star(val x: Float, val y: Float, val r: Float, val a: Float)

/**
 * Aether ana ekran başlık kartı: yıldızlı gece gökyüzü + kayan aurora ışıkları.
 * Lisans gereği "resmî olmayan sürüm" etiketini her zaman gösterir.
 */
@Composable
fun AetherHeroCard(modifier: Modifier = Modifier) {
    val scheme = MaterialTheme.colorScheme
    val stars = remember {
        val rnd = Random(7)
        List(48) { Star(rnd.nextFloat(), rnd.nextFloat(), 0.6f + rnd.nextFloat() * 1.2f, 0.25f + rnd.nextFloat() * 0.6f) }
    }
    val transition = rememberInfiniteTransition(label = "aether")
    val drift by transition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(16000, easing = LinearEasing), RepeatMode.Reverse),
        label = "drift"
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.extraLarge)
            .background(Brush.verticalGradient(listOf(scheme.surfaceContainerLowest, scheme.surfaceContainerHigh)))
            .drawBehind {
                val w = size.width
                val h = size.height
                //aurora ışıkları
                fun blob(color: androidx.compose.ui.graphics.Color, cx: Float, cy: Float, radius: Float) {
                    drawCircle(
                        brush = Brush.radialGradient(
                            colors = listOf(color.copy(alpha = 0.38f), color.copy(alpha = 0f)),
                            center = Offset(cx, cy),
                            radius = radius
                        ),
                        radius = radius,
                        center = Offset(cx, cy)
                    )
                }
                blob(scheme.primary, w * (0.15f + 0.30f * drift), h * 0.25f, w * 0.55f)
                blob(scheme.secondary, w * (0.85f - 0.30f * drift), h * 0.15f, w * 0.50f)
                blob(scheme.tertiary, w * (0.55f + 0.15f * drift), h * 1.0f, w * 0.45f)
                //yıldızlar
                stars.forEach { s ->
                    drawCircle(
                        color = scheme.onSurface.copy(alpha = s.a * (0.6f + 0.4f * drift)),
                        radius = s.r.dp.toPx(),
                        center = Offset(s.x * w, s.y * h)
                    )
                }
            }
            .padding(horizontal = 22.dp, vertical = 20.dp)
    ) {
        Text(
            text = "AETHER",
            style = AetherWordmark,
            color = scheme.onSurface
        )
        Spacer(Modifier.height(4.dp))
        Text(
            modifier = Modifier.alpha(0.8f),
            text = stringResource(R.string.aether_tagline),
            style = MaterialTheme.typography.bodyMedium,
            color = scheme.onSurface
        )
        Spacer(Modifier.height(14.dp))
        Surface(
            shape = CircleShape,
            color = scheme.surface.copy(alpha = 0.55f),
            contentColor = scheme.onSurfaceVariant
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp),
                text = stringResource(R.string.aether_unofficial),
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}
