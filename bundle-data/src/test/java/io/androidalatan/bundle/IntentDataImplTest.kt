package io.androidalatan.bundle

import android.content.Intent
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class IntentDataImplTest {

    private val intent = mock<Intent>()
    private val intentData = IntentDataImpl(intent)

    @Test
    fun getUriStringOrNull() {
        val dataString = "data-1"
        whenever(intent.dataString).thenReturn(dataString)
        Assertions.assertEquals(dataString, intentData.getUriStringOrNull())
    }

    @Test
    fun getTypeOrNull() {
        val type = "data-1"
        whenever(intent.type).thenReturn(type)
        Assertions.assertEquals(type, intentData.getTypeOrNull())
    }

    @Test
    fun rawIntent() {
        Assertions.assertEquals(intent, intentData.rawIntent())
    }
}