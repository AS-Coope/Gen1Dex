package com.example.genonedex.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DexScrollEntry(
    @StringRes val dexNo: Int,
    @DrawableRes val miniSprite: Int,
    @StringRes val name: Int,
)
