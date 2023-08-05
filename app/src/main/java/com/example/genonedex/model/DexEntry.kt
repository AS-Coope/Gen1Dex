package com.example.genonedex.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DexEntry(
    @StringRes val dexNo: Int,
    @DrawableRes val regSprite: Int,
    @StringRes val name: Int,
    @StringRes val dexSpecies: Int,
    @StringRes val desc: Int,
    @StringRes val weight: Int,
    @StringRes val height: Int,
    @StringRes val type1: Int,
    @StringRes val type2: Int
)
