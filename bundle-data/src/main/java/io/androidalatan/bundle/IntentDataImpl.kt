package io.androidalatan.bundle

import android.content.Intent
import io.androidalatan.bundle.api.BundleData
import io.androidalatan.bundle.api.IntentData

class IntentDataImpl(
    private val intent: Intent,
    bundleData: BundleData = intent.extras?.let {
        BundleDataImpl(it)
    } ?: IntentData.EMPTY
) : IntentData, BundleData by bundleData {

    override fun getUriStringOrNull() = intent.dataString

    override fun getTypeOrNull() = intent.type

    override fun rawIntent(): Intent = intent
}