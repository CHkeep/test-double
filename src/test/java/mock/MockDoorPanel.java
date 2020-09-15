package mock;

public class MockDoorPanel extends DoorPanel{
    private boolean wasCalled = false;
    public void close(){
        this.wasCalled = true;
    }
    void  vertifyThatMockDoorPanelwasCalled(){
        assert(wasCalled);
    }
}
