package com.example.marsphotos.rules

import kotlinx.coroutines.Dispatchers
import org.apache.tools.ant.types.Description
import org.junit.rules.TestWatcher

class TestDispatcherRule(
    val testDispatcher: TestDispatcher = UnconfinedTestDispatcher(),
) : TestWatcher() {
    override fun starting(description: Description) {
        Dispatchers.setMain(testDispatcher)
    }

    override fun finished(description: Description) {
        Dispatchers.resetMain()
    }
}