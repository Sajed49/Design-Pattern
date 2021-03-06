package factory.toy;

import lombok.Data;

/**
 * @author sajed
 * @date 4/30/20
 */
@Data
public class BabyElephant extends Toy{
    private int maxFuel = 100;

    @Override
    public void recharge() {
        super.setFuel(maxFuel);
        System.out.println("Fuel recharged to: "+ super.getFuel());
    }

    @Override
    public void play() {
        System.out.println("Baby Elephant: Sings elephant song.");
    }
}
