package com.dimitar.algorithms.mix;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class OneAwayTest extends TestCase {

    @Test
    public void testIsOneAway() {

        Assert.assertFalse(OneAway.isOneAway("mate","vukor") );
        Assert.assertFalse(OneAway.isOneAway("mate","tema") );
        Assert.assertFalse(OneAway.isOneAway("pale","elp") );
        Assert.assertFalse(OneAway.isOneAway("ple","bble") );
        Assert.assertFalse(OneAway.isOneAway("pales","bale") );
        Assert.assertFalse(OneAway.isOneAway("pales","bae") );
        Assert.assertFalse(OneAway.isOneAway("LALA","MALAK") );
        Assert.assertFalse(OneAway.isOneAway("LALA","ALAL") );

        Assert.assertTrue(OneAway.isOneAway("pale","ple") );
        Assert.assertTrue(OneAway.isOneAway("pales","pale") );
        Assert.assertTrue(OneAway.isOneAway("LALA","MALA") );
        Assert.assertTrue(OneAway.isOneAway("LALA","WALA") );
        Assert.assertTrue(OneAway.isOneAway("LALA","LALAK") );
        Assert.assertTrue(OneAway.isOneAway("LALA","KLALA") );
    }
}