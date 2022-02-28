package io.androidalatan.bundle.api

import android.os.Bundle
import android.os.Parcelable

interface BundleData {
    fun hasValue(key: String): Boolean
    fun getStringOrNull(key: String): String?
    fun setString(key: String, value: String): BundleData
    fun getIntOrNull(key: String): Int?
    fun setInt(key: String, value: Int): BundleData
    fun getByteOrNull(key: String): Byte?
    fun setByte(key: String, value: Byte): BundleData
    fun getLongOrNull(key: String): Long?
    fun setLong(key: String, value: Long): BundleData
    fun getDoubleOrNull(key: String): Double?
    fun setDouble(key: String, value: Double): BundleData
    fun getFloatOrNull(key: String): Float?
    fun setFloat(key: String, value: Float): BundleData
    fun getBooleanOrNull(key: String): Boolean?
    fun setBoolean(key: String, value: Boolean): BundleData
    fun getStringArray(key: String): Array<String>
    fun setStringArray(key: String, value: Array<String>): BundleData
    fun setObject(key: String, obj: Parcelable): BundleData
    fun <T> getObjectOrNull(key: String): T?
    fun setParcelableList(key: String, list: List<Parcelable>): BundleData
    fun <T : Parcelable> getParcelableList(key: String): List<T>
    fun getAll(): Map<String, Any>

    fun rawBundle(): Bundle

}