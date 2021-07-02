/*
 * Created by Anastasiia Lapa on 30.06.2021.
 */
package ua.training.moreorless.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.training.moreorless.game.Model;

public class TestModel {

    private Model model;

    @Before
    public void createModel(){
        model = new Model();
        model.setBoundsOfRange();
    }

    @Test
    public void testSetBoundsOfRange(){
        Assert.assertEquals(100,model.getMaxValue());
        Assert.assertEquals(0,model.getMinValue());
    }
    @Test
    public void testSetSecretValue() {
        for (int i = 0; i <= 1000; i++) {
            model.setSecretValue();
            Assert.assertNotEquals(0, model.getSecretValue());
            Assert.assertNotEquals(100, model.getSecretValue());
        }
    }

    @Test
    public void testChekInput(){
        do {
            model.setSecretValue();
        } while (model.getSecretValue() != 90);
        int equalsInput = 90;
        Assert.assertEquals(0,model.checkInput(equalsInput));
        int smallerInput = 89;
        Assert.assertEquals(-1,model.checkInput(smallerInput));
        int biggerInput = 91;
        Assert.assertEquals(1,model.checkInput(biggerInput));
    }

}
