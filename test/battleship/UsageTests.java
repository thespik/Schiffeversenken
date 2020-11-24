package battleship;

import org.junit.Assert;
import org.junit.Test;

public class UsageTests {

    private static final String ONE = "Peter";
    private static final String TWO = "Hans";
    private static final String THREE = "Boy";

    private Battleship getBattleship() {
        return new BattleshipImpl();
    }

    @Test
    public void goodDesignation1() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER1);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, oneDesignation);
    }

    @Test
    public void goodDesignation2() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER1);
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER2);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, oneDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, twoDesignation);
    }

    @Test
    public void goodDesignation3() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER2);
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER1);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, oneDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, twoDesignation);
    }

    @Test
    public void goodDesignation4() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER1);
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER1);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, oneDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, twoDesignation);
    }

    @Test
    public void goodDesignation5() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER2);
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER2);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, oneDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, twoDesignation);
    }

    @Test
    public void goodDesignation6() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER1);
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER1);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, twoDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, oneDesignation);
    }

    @Test
    public void goodDesignation7() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER2);
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER2);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, twoDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, oneDesignation);
    }

    @Test
    public  void goodDesignation8() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER2);
        //reconsider
        oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER1);
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER2);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, oneDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, twoDesignation);
    }

    @Test
    public void goodDesignation9() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        BattleshipPlayers twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER2);
        //reconsider
        twoDesignation = bs.pick(TWO, BattleshipPlayers.PLAYER1);
        BattleshipPlayers oneDesignation = bs.pick(ONE, BattleshipPlayers.PLAYER2);
        Assert.assertEquals(BattleshipPlayers.PLAYER1, twoDesignation);
        Assert.assertEquals(BattleshipPlayers.PLAYER2, oneDesignation);

    }

    @Test(expected=GameException.class)
    public void failureDesignation3times() throws GameException, StatusException {
        Battleship bs = this.getBattleship();
        bs.pick(ONE, BattleshipPlayers.PLAYER1);
        bs.pick(TWO, BattleshipPlayers.PLAYER1);
        bs.pick(THREE, BattleshipPlayers.PLAYER1);
    }

    @Test
    public void goodShip1() {
        Battleship bs = this.getBattleship();

        Ship placement = bs.set(Ship.DestroyerHorizontal,1, 2);

    }
}
