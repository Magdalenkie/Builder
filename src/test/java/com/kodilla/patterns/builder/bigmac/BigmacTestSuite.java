package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmackNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(RollType.WHOLEMEAL)
                .burgers(1)
                .sauce(SauceType.MIXED_SAUCE)
                .ingredients(IngredientsType.BACON)
                .ingredients(IngredientsType.MUSHROOMS)
                .ingredients(IngredientsType.LETTUCE)
                .ingredients(IngredientsType.ONION)
                .build();
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(1, howManyBurgers);
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains(IngredientsType.LETTUCE));
    }
}
