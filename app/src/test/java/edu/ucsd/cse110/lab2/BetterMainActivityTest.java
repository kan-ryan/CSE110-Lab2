package edu.ucsd.cse110.lab2;

import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {
    @Test
    public void test_two_plus_two_equals_four() {
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {

        });

    }
}
