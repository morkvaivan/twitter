package org.example.twitter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;

class DumbPasswordEncoderTest {
    @Test
    void encode() {
        DumbPasswordEncoder encoder = new DumbPasswordEncoder();

        Assert.assertEquals("secret: 'mypwd'", encoder.encode("mypwd"));
        Assert.assertThat(encoder.encode("mypwd"), containsString("mypwd"));
    }
}
