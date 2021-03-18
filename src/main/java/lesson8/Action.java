package lesson8;

public interface Action {

    void runFree();
    void jumpFree();
    void runTreadmill(Treadmill treadmill);
    void jumpWall(Wall wall);
    void runTreadmill(int treadmill);
    void jumpWall(int wall);
    boolean runTreadmillAgain(int treadmill);
    boolean jumpWallAgain(int wall);

    String getName();

}