package edu.ucsd.cse110.lab2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import org.robolectric.RobolectricTestRunner;
@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {
    @Test
    public void test_one_plus_one_equals_two() {
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            var one = (Button) activity.findViewById(R.id.btn_one);
            var plus = (Button) activity.findViewById(R.id.btn_plus);
            var equals = (Button) activity.findViewById(R.id.btn_equals);
            TextView display = activity.findViewById(R.id.display);
            one.performClick();
            plus.performClick();
            one.performClick();
            equals.performClick();
            assertEquals(display.getText().toString(), "2");
        });

    }
}
