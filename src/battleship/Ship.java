package battleship;

public enum Ship {
    CarrierHorizontal (5),
    CarrierVertical (5),
    CruiserHorizontal (4),
    CruiserVertical (4),
    DestroyerHorizontal (3),
    DestroyerVertical (3),
    SubmarineHorizontal (2),
    SubmarineVertical (2);

    Ship(int length) {
    }
}
