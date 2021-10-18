package iit.uni.miskolc.junit5test.demoTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceImplTest {

    @Mock Dependency dependency;

    @InjectMocks ServiceImpl service;

    @Test
    void calculate() {
        //GIVEN

        //WHEN
        service.calculate();

        //THEN
        verify(dependency, times(1)).helpNoParameterNoReturnValue();
    }

    @Test
    void return5Test(){
        //GIVEN
        final int FIVE= 5;
        //WHEN
        int result = service.returnFive();
        //THEN
        assertEquals(FIVE,result);
    }

    @Test
    void dependencyReturnValueIsUsed(){
        //GIVEN
        final int FIVE= 5;
        when(dependency.helpNoParameterReturnValue()).thenReturn(FIVE);
        //WHEN
        int result = service.callHelpAndUseReturnValue();
        //THEN
        verify(dependency, times(1)).helpNoParameterReturnValue();
        assertEquals(FIVE,result);
    }

    @Test
    void callHelpAndPassParameter5Test() {
        // GIVEN
        final int FIVE = 5;

        // WHEN
        service.callHelpAndPassParameter5();

        // THEN
        ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);

        verify(dependency, times(1)).helpWithParameterNoReturnValue(captor.capture());
        assertEquals(FIVE,captor.getValue());
    }

    @Test
    void getImportantAbstractTest(){
        //GIVEN
        String testString = "abcdsfdgdgdgf";
        String expected = "<b>abc...</b>";
        String goal = service.getFirst3Char(testString);
        when(dependency.important(goal)).thenReturn("<b>abc...</b>");

        //WHEN
        String result = service.getImportantAbstract(testString);

        //THEN
        verify(dependency, times(1)).important(goal);
        assertEquals(expected, result);
    }


}