package org.shikato.circleci_sample.circleci_sample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Sample
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}