package com.example.genonedex.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DexScrollEntry(
    @StringRes private val dexNo: Int,
    @DrawableRes private val miniSprite: Int,
    @StringRes private val name: Int,
)
