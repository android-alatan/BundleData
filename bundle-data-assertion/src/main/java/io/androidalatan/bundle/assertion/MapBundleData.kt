package io.androidalatan.bundle.assertion

import android.os.Bundle
import android.os.Parcelable
import io.androidalatan.bundle.api.BundleData

class MapBundleData(private val map: MutableMap<String, Any>) : BundleData {
    override fun hasValue(key: String): Boolean = map.containsKey(key)

    override fun getStringOrNull(key: String) = map[key] as? String

    override fun setString(key: String, value: String): BundleData {
        map[key] = value
        return this
    }

    override fun getIntOrNull(key: String) = map[key] as? Int

    override fun setInt(key: String, value: Int): BundleData {
        map[key] = value
        return this
    }

    override fun getByteOrNull(key: String) = map[key] as? Byte

    override fun setByte(key: String, value: Byte): BundleData {
        map[key] = value
        return this
    }

    override fun getLongOrNull(key: String) = map[key] as? Long

    override fun setLong(key: String, value: Long): BundleData {
        map[key] = value
        return this
    }

    override fun getDoubleOrNull(key: String) = map[key] as? Double

    override fun setDouble(key: String, value: Double): BundleData {
        map[key] = value
        return this
    }

    override fun getFloatOrNull(key: String) = map[key] as? Float

    override fun setFloat(key: String, value: Float): BundleData {
        map[key] = value
        return this
    }

    override fun getBooleanOrNull(key: String) = map[key] as? Boolean

    override fun setBoolean(key: String, value: Boolean): BundleData {
        map[key] = value
        return this
    }

    override fun getStringArray(key: String) = map[key] as? Array<String> ?: emptyArray()

    override fun setStringArray(key: String, value: Array<String>): BundleData {
        map[key] = value
        return this
    }

    override fun setObject(key: String, obj: Parcelable): BundleData {
        map[key] = obj
        return this
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> getObjectOrNull(key: String): T? {
        return map[key] as? T
    }

    override fun setParcelableList(key: String, list: List<Parcelable>): BundleData {
        map[key] = list
        return this
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : Parcelable> getParcelableList(key: String): List<T> {
        return map[key] as? List<T> ?: emptyList()
    }

    override fun getAll(): Map<String, Any> = map.toMap()

    override fun rawBundle(): Bundle {
        TODO()
    }
}