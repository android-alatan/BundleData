package io.androidalatan.bundle

import android.os.Bundle
import android.os.Parcelable
import io.androidalatan.bundle.api.BundleData

class BundleDataImpl constructor(private val bundle: Bundle) : BundleData {
    override fun hasValue(key: String) = bundle.containsKey(key)

    override fun getStringOrNull(key: String) = bundle.getString(key)

    override fun setString(key: String, value: String): BundleData {
        bundle.putString(key, value)
        return this
    }

    override fun getIntOrNull(key: String) = bundle.getInt(key)

    override fun setInt(key: String, value: Int): BundleData {
        bundle.putInt(key, value)
        return this
    }

    override fun getByteOrNull(key: String) = bundle.getByte(key)

    override fun setByte(key: String, value: Byte): BundleData {
        bundle.putByte(key, value)
        return this
    }

    override fun getLongOrNull(key: String) = bundle.getLong(key)

    override fun setLong(key: String, value: Long): BundleData {
        bundle.putLong(key, value)
        return this
    }

    override fun getDoubleOrNull(key: String) = bundle.getDouble(key)

    override fun setDouble(key: String, value: Double): BundleData {
        bundle.putDouble(key, value)
        return this
    }

    override fun getFloatOrNull(key: String) = bundle.getFloat(key)

    override fun setFloat(key: String, value: Float): BundleData {
        bundle.putFloat(key, value)
        return this
    }

    override fun getBooleanOrNull(key: String) = bundle.getBoolean(key)

    override fun setBoolean(key: String, value: Boolean): BundleData {
        bundle.putBoolean(key, value)
        return this
    }

    override fun getStringArray(key: String): Array<String> = bundle.getStringArray(key) ?: emptyArray()

    override fun setStringArray(key: String, value: Array<String>): BundleData {
        bundle.putStringArray(key, value)
        return this
    }

    override fun setObject(key: String, obj: Parcelable): BundleData {
        bundle.putParcelable(key, obj)
        return this
    }

    override fun <T> getObjectOrNull(key: String): T? {
        return bundle.getParcelable(key)
    }

    override fun setParcelableList(key: String, list: List<Parcelable>): BundleData {
        bundle.putParcelableArrayList(key, ArrayList(list))
        return this
    }

    override fun <T : Parcelable> getParcelableList(key: String): List<T> {
        return bundle.getParcelableArrayList(key) ?: emptyList()
    }

    override fun getAll(): Map<String, Any> {
        return bundle.keySet()
            .map { it to (bundle.get(it) ?: Any()) }
            .toMap()
    }

    override fun rawBundle() = bundle

}