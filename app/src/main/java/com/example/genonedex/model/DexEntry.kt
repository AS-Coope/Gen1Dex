package com.example.genonedex.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DexEntry(
    @StringRes private val dexNo: Int,
    @DrawableRes private val regSprite: Int,
    @StringRes private val name: Int,
    @StringRes private val desc: Int,
    @StringRes private val weight: Int,
    @StringRes private val height: Int,
    @StringRes private val type1: Int,
    @StringRes private val type2: Int
)
