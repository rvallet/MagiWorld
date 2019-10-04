import main.java.player.*;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTesting {
    Player warrior = new CreatePlayer().instanceMaker("1","Daz&Röt",100,100,0,0);
    Player ranger = new CreatePlayer().instanceMaker("2","2Llothien",100,0,100,0);
    Player wizard = new CreatePlayer().instanceMaker("3","Yssien",100,0,0,100);

    @Test
    public void Given_ChoiceValue1_When_CreatePlayer_Then_InstanceWarrior(){
        assertTrue(Objects.equals(warrior.getClass(), Warrior.class));
    }

    @Test
    public void Given_ChoiceValue2_When_CreatePlayer_Then_InstanceRanger(){
        assertTrue(Objects.equals(ranger.getClass(), Ranger.class));
    }

    @Test
    public void Given_ChoiceValue3_When_CreatePlayer_Then_InstanceWizard(){
        assertTrue(Objects.equals(wizard.getClass(), Wizard.class));
    }

    @Test
    public void Given_Target_When_BasicAttack_Then_DamagedTarget(){
        int result = ranger.getLife()-warrior.getStrength();
        warrior.basicAttack(ranger);
        assertTrue(result == ranger.getLife());
    }
}
