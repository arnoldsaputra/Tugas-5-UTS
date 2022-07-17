package com.mobile.Kantin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kantin(
    val imageKantin : Int,
    val nameKantin: String,
    val descKantin: String
) : Parcelable
