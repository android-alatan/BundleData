package io.androidalatan.bundle.api

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable

interface IntentData : BundleData {
    fun rawIntent(): Intent
    fun getUriStringOrNull(): String?
    fun getTypeOrNull(): String?

    companion object {
        val EMPTY: IntentData = object : IntentData {

            override fun hasValue(key: String): Boolean = false

            override fun getStringOrNull(key: String): String? = null

            override fun getIntOrNull(key: String): Int? = null

            override fun getByteOrNull(key: String): Byte? = null

            override fun getLongOrNull(key: String): Long? = null

            override fun getDoubleOrNull(key: String): Double? = null

            override fun getFloatOrNull(key: String): Float? = null

            override fun getBooleanOrNull(key: String): Boolean? = null

            override fun getStringArray(key: String) = emptyArray<String>()
            override fun rawIntent(): Intent {
                throw UnsupportedOperationException("This is EMPTY IntentData ")
            }

            override fun setString(key: String, value: String): BundleData = this

            override fun setInt(key: String, value: Int): BundleData = this

            override fun setByte(key: String, value: Byte) = this

            override fun setLong(key: String, value: Long) = this

            override fun setDouble(key: String, value: Double) = this

            override fun setFloat(key: String, value: Float) = this

            override fun setBoolean(key: String, value: Boolean) = this

            override fun setStringArray(key: String, value: Array<String>) = this

            override fun setObject(key: String, obj: Parcelable) = this

            override fun <T> getObjectOrNull(key: String): T? = null

            override fun setParcelableList(key: String, list: List<Parcelable>) = this

            override fun <T : Parcelable> getParcelableList(key: String): List<T> = emptyList()

            override fun getAll(): Map<String, Any> = emptyMap()

            override fun rawBundle(): Bundle {
                throw UnsupportedOperationException("This is EMPTY IntentData ")
            }

            override fun getUriStringOrNull(): String? = null
            override fun getTypeOrNull(): String? = null
        }
    }
}