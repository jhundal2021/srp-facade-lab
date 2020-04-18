package srpfacadelab;

import java.util.List;

public class RPG_PlayerFacade{
    private RpgPlayer player;
    public RPG_PlayerFacade(IGameEngine gameEngine){
        this.player = new RpgPlayer(gameEngine);
    }

    public void takeDamage(int damage){
        this.player.takeDamage(damage);
    }
}