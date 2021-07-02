/*
 * Created by Anastasiia Lapa on 27.06.2021.
 */
package ua.training.moreorless.game;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int secretValue;
    private int maxValue;
    private int minValue;
    private List<Integer> statisticList = new ArrayList<>();

    public void setSecretValue() {
        secretValue = (int) Math.ceil(Math.random() * (maxValue - minValue - 1)+minValue);
    }

    public void setBoundsOfRange() {
        this.minValue = GlobalConstants.PRIMARY_MIN_VALUE;
        this.maxValue = GlobalConstants.PRIMARY_MAX_VALUE;
    }

    public int checkInput(int input) {
        statisticList.add(input);
        if (input == secretValue)
            return 0;
        else if (input > secretValue) {
            maxValue = input;
            return 1;
        } else {
            minValue = input;
            return -1;
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getSecretValue() {
        return secretValue;
    }

    public List<Integer> getStatisticList() {
        return statisticList;
    }
}
