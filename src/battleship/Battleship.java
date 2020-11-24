package battleship;

public interface Battleship {
    /**
     * Pick a player designation
     * @param userName player name
     * @param wantedPlayerDesignation user asks for this designation. Can be a race condition
     * @return selected designation
     * @throws GameException both designations are already taken - this is at least the third attempt in a two player game
     * @throws StatusException can only be called if game hasn't started yet
     */
    BattleshipPlayers pick(String userName, BattleshipPlayers wantedPlayerDesignation)
            throws GameException, StatusException;

    /**
     * puts the chosen class ship on the desired position
     * @param ship ship chosen class, option between horizontal and vertical
     * @param positionX desired x-coordinate on the board
     * @param positionY desired y-coordinate on the board
     * @return
     */
    Ship set(Ship ship, int positionX, int positionY);

}
