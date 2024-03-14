package com.example.calculadora;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class BienvenidaActivityTest {

    @Rule
    public ActivityScenarioRule<BienvenidaActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(BienvenidaActivity.class);

    @Test
    public void bienvenidaActivityTest() {
    }
}
