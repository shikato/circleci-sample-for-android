package org.shikato.circleci_sample.circleci_sample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    private Context mContext;

    @Before
    public void setUp() throws Exception {
        // Contextを取得
        mContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @Test
    public void test1() {
        assertThat(true, is(true));
    }
}