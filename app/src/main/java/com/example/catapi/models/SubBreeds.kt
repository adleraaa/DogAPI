package com.example.earthquakes.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize


data class SubBreeds(
    val breeds: Breeds,
    val subBreeds: String
): Parcelable
