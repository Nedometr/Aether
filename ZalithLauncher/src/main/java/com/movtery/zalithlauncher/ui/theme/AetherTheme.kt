package com.movtery.zalithlauncher.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Aether: gece mavisi zemin, aurora (turkuaz / mor / gül) vurgular.
 */
internal val aetherDark = darkColorScheme(
    primary = Color(0xFF6FE3D2),
    onPrimary = Color(0xFF00382F),
    primaryContainer = Color(0xFF00504A),
    onPrimaryContainer = Color(0xFF8CF6E5),
    secondary = Color(0xFFB9B3FF),
    onSecondary = Color(0xFF2A2470),
    secondaryContainer = Color(0xFF413B88),
    onSecondaryContainer = Color(0xFFE2DFFF),
    tertiary = Color(0xFFFFB1CB),
    onTertiary = Color(0xFF521D33),
    tertiaryContainer = Color(0xFF6D3349),
    onTertiaryContainer = Color(0xFFFFD9E4),
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF0B0F1E),
    onBackground = Color(0xFFE1E3F5),
    surface = Color(0xFF0B0F1E),
    onSurface = Color(0xFFE1E3F5),
    surfaceVariant = Color(0xFF41465A),
    onSurfaceVariant = Color(0xFFC3C7DD),
    outline = Color(0xFF8D91A7),
    outlineVariant = Color(0xFF41465A),
    scrim = Color(0xFF000000),
    inverseSurface = Color(0xFFE1E3F5),
    inverseOnSurface = Color(0xFF2E3142),
    inversePrimary = Color(0xFF006B5E),
    surfaceDim = Color(0xFF0B0F1E),
    surfaceBright = Color(0xFF313549),
    surfaceContainerLowest = Color(0xFF060914),
    surfaceContainerLow = Color(0xFF12162A),
    surfaceContainer = Color(0xFF161A2E),
    surfaceContainerHigh = Color(0xFF202439),
    surfaceContainerHighest = Color(0xFF2B2F44),
)

internal val aetherLight = lightColorScheme(
    primary = Color(0xFF00695C),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF9DF2E2),
    onPrimaryContainer = Color(0xFF00201C),
    secondary = Color(0xFF5A55A6),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE2DFFF),
    onSecondaryContainer = Color(0xFF14095A),
    tertiary = Color(0xFF8B4A63),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD9E4),
    onTertiaryContainer = Color(0xFF380B21),
    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFF8F9FF),
    onBackground = Color(0xFF191B26),
    surface = Color(0xFFF8F9FF),
    onSurface = Color(0xFF191B26),
    surfaceVariant = Color(0xFFE0E3F6),
    onSurfaceVariant = Color(0xFF434659),
    outline = Color(0xFF747689),
    outlineVariant = Color(0xFFC4C6DA),
    scrim = Color(0xFF000000),
    inverseSurface = Color(0xFF2E303C),
    inverseOnSurface = Color(0xFFF0F0FF),
    inversePrimary = Color(0xFF6FE3D2),
    surfaceDim = Color(0xFFD8D9E7),
    surfaceBright = Color(0xFFF8F9FF),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFF1F3FF),
    surfaceContainer = Color(0xFFECEDFB),
    surfaceContainerHigh = Color(0xFFE6E8F5),
    surfaceContainerHighest = Color(0xFFE1E2F0),
)

/** Daha yumuşak, büyük yuvarlak köşeler */
val AetherShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(18.dp),
    large = RoundedCornerShape(24.dp),
    extraLarge = RoundedCornerShape(32.dp),
)
