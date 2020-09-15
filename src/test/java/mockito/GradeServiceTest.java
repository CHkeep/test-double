package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GradeServiceTest {

    GradeService gradeService;
    GradeSystem gradeSystem;
    @BeforeEach
    public void setup(){
        gradeSystem = mock(GradeSystem.class);
        when(gradeSystem.gradesFor(1L)).thenReturn(Arrays.asList(90.0, 80.0, 100.0));
        gradeService = new GradeService(gradeSystem);
    }

    @Test
    public void should_return_90_by_mockito(){
        double result = gradeService.calculateAverageGrades(1L);
        verify(gradeSystem,times(1)).equals(result);
    }

}