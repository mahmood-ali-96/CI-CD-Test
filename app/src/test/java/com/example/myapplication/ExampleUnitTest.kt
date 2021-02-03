package com.example.myapplication

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkInternet(){
        var context : Context = InstrumentationRegistry.getInstrumentation().targetContext
        var player:Player = Player("mahmood", 5, 5)
        assertEquals(false, player.isOnline(context))
    }
}