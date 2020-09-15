package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

   GradeService gradeService;
   StubGradeSystem stubGradeSystem;
    @BeforeEach
   public void setup(){
        stubGradeSystem = new StubGradeSystem();
        gradeService = new GradeService(stubGradeSystem);

   }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = (long) gradeService.calculateAverageGrades(1L);
        Assertions.assertEquals(90.0, result);
    }
}
