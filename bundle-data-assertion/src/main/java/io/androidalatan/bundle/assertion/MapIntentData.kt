package io.androidalatan.bundle.assertion

import android.content.Intent
import io.androidalatan.bundle.api.BundleData
import io.androidalatan.bundle.api.IntentData

class MapIntentData(
    private val mapData: MutableMap<String, Any>,
    uriString: String = "",
    type: String = "",
    mapBundleData: MapBundleData = MapBundleData(mapData)
) : IntentData, BundleData by mapBundleData {

    private var lastUriString: String = uriString
    private var lastType: String = type

    fun newMapData(newMapData: Map<String, Any>) {
        this.mapData.putAll(newMapData)
    }

    fun setUriString(uriString: String) {
        this.lastUriString = uriString
    }

    fun setType(type: String) {
        this.lastType = type
    }

    override fun rawIntent(): Intent {
        TODO("Not yet implemented")
    }

    override fun getUriStringOrNull(): String = lastUriString
    override fun getTypeOrNull(): String = lastType
}