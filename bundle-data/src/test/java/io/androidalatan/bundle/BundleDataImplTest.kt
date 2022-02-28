package io.androidalatan.bundle

import android.net.Uri
import android.os.Bundle
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

class BundleDataImplTest {
    private val bundle = Mockito.mock(Bundle::class.java)
    private val bundleData = BundleDataImpl(bundle)

    @Test
    fun hasValue() {
        val key1 = "key-1"
        Assertions.assertFalse(bundleData.hasValue(key1))

        whenever(bundle.containsKey(key1)).thenReturn(true)
        Assertions.assertTrue(bundleData.hasValue(key1))

    }

    @Test
    fun getString() {
        val key1 = "key-1"
        val value1 = "value-1"
        val key2 = "key-2"
        val value2 = "value-2"

        whenever(bundle.getString(key1)).thenReturn(value1)
        whenever(bundle.getString(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getStringOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getStringOrNull(key2))
    }

    @Test
    fun setString() {
        val key1 = "key-1"
        val value1 = "value-1"

        bundleData.setString(key1, value1)
        Mockito.verify(bundle)
            .putString(key1, value1)
    }

    @Test
    fun getInt() {
        val key1 = "key-1"
        val value1 = 1
        val key2 = "key-2"
        val value2 = 2

        whenever(bundle.getInt(key1)).thenReturn(value1)
        whenever(bundle.getInt(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getIntOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getIntOrNull(key2))
    }

    @Test
    fun setInt() {
        val key1 = "key-1"
        val value1 = 1

        bundleData.setInt(key1, value1)
        Mockito.verify(bundle)
            .putInt(key1, value1)
    }

    @Test
    fun getByte() {
        val key1 = "key-1"
        val value1 = 1.toByte()
        val key2 = "key-2"
        val value2 = 2.toByte()

        whenever(bundle.getByte(key1)).thenReturn(value1)
        whenever(bundle.getByte(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getByteOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getByteOrNull(key2))
    }

    @Test
    fun setByte() {
        val key1 = "key-1"
        val value1 = 1.toByte()

        bundleData.setByte(key1, value1)
        Mockito.verify(bundle)
            .putByte(key1, value1)
    }

    @Test
    fun getLong() {
        val key1 = "key-1"
        val value1 = 1L
        val key2 = "key-2"
        val value2 = 2L

        whenever(bundle.getLong(key1)).thenReturn(value1)
        whenever(bundle.getLong(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getLongOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getLongOrNull(key2))
    }

    @Test
    fun setLong() {
        val key1 = "key-1"
        val value1 = 1L

        bundleData.setLong(key1, value1)
        Mockito.verify(bundle)
            .putLong(key1, value1)
    }

    @Test
    fun getDouble() {
        val key1 = "key-1"
        val value1 = 1.0
        val key2 = "key-2"
        val value2 = 2.0

        whenever(bundle.getDouble(key1)).thenReturn(value1)
        whenever(bundle.getDouble(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getDoubleOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getDoubleOrNull(key2))
    }

    @Test
    fun setDouble() {
        val key1 = "key-1"
        val value1 = 1.0

        bundleData.setDouble(key1, value1)
        Mockito.verify(bundle)
            .putDouble(key1, value1)
    }

    @Test
    fun getFloat() {
        val key1 = "key-1"
        val value1 = 1f
        val key2 = "key-2"
        val value2 = 2f

        whenever(bundle.getFloat(key1)).thenReturn(value1)
        whenever(bundle.getFloat(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getFloatOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getFloatOrNull(key2))
    }

    @Test
    fun setFloat() {
        val key1 = "key-1"
        val value1 = 1f

        bundleData.setFloat(key1, value1)
        Mockito.verify(bundle)
            .putFloat(key1, value1)
    }

    @Test
    fun getBoolean() {
        val key1 = "key-1"
        val value1 = true
        val key2 = "key-2"
        val value2 = false

        whenever(bundle.getBoolean(key1)).thenReturn(value1)
        whenever(bundle.getBoolean(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getBooleanOrNull(key1))
        Assertions.assertEquals(value2, bundleData.getBooleanOrNull(key2))
    }

    @Test
    fun setBoolean() {
        val key1 = "key-1"
        val value1 = true

        bundleData.setBoolean(key1, value1)
        Mockito.verify(bundle)
            .putBoolean(key1, value1)
    }

    @Test
    fun getStringArray() {
        val key1 = "key-1"
        val value1 = arrayOf("1")
        val key2 = "key-2"
        val value2 = arrayOf("2")

        whenever(bundle.getStringArray(key1)).thenReturn(value1)
        whenever(bundle.getStringArray(key2)).thenReturn(value2)

        Assertions.assertEquals(value1, bundleData.getStringArray(key1))
        Assertions.assertEquals(value2, bundleData.getStringArray(key2))
    }

    @Test
    fun setStringArray() {
        val key1 = "key-1"
        val value1 = arrayOf("value-1")

        bundleData.setStringArray(key1, value1)
        Mockito.verify(bundle)
            .putStringArray(key1, value1)
    }

    @Test
    fun getAll() {
        val key1 = "key-1"
        val value1 = "value-1"
        val key2 = "key-2"
        val value2 = 2f
        whenever(bundle.keySet()).thenReturn(setOf(key1, key2))
        whenever(bundle.get(key1)).thenReturn(value1)
        whenever(bundle.get(key2)).thenReturn(value2)

        val mapData = bundleData.getAll()
        Assertions.assertEquals(mapOf(key1 to value1, key2 to value2), mapData)
    }

    @Test
    fun setObject() {
        val key1 = "key-1"
        val value1 = mock<Uri>()
        bundleData.setObject(key1, value1)
        verify(bundle).putParcelable(key1, value1)
    }

    @Test
    fun getObjectOrNull() {
        val key1 = "key-1"
        val value1 = mock<Uri>()
        val key2 = "key-2"

        whenever(bundle.getParcelable<Uri>(key1)).thenReturn(value1)
        Assertions.assertEquals(value1, bundleData.getObjectOrNull<Uri>(key1))
        Assertions.assertNull(bundleData.getObjectOrNull(key2))
    }

    @Test
    fun setParcelableList() {
        val key1 = "key-1"
        val value1 = mock<Uri>()
        bundleData.setParcelableList(key1, listOf(value1))
        verify(bundle).putParcelableArrayList(key1, ArrayList(listOf(value1)))
    }

    @Test
    fun getParcelableList() {
        val key1 = "key-1"
        val value1 = mock<Uri>()
        val key2 = "key-2"

        whenever(bundle.getParcelableArrayList<Uri>(key1)).thenReturn(ArrayList(listOf(value1)))
        Assertions.assertEquals(listOf(value1), bundleData.getParcelableList<Uri>(key1))
        Assertions.assertEquals(emptyList<Uri>(), bundleData.getParcelableList<Uri>(key2))
    }
}