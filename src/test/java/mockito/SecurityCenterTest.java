package mockito;


import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SecurityCenterTest {

    DoorPanel doorPanel;
    SecurityCenter securityCenter;
    @BeforeEach
    public void setUp() {
        doorPanel = mock(DoorPanel.class);

        securityCenter = new SecurityCenter(doorPanel);
    }
    @Test
    public void should_verify_doorIsClosed_by_mockito(){
        securityCenter.switchOn();
        verify(doorPanel,times(1));

    }

}