package br.gaius.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class WorkstationTest {

    private Workstation workstation;
    
    @BeforeEach
    void setup() {
        workstation = new Workstation("A100");
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"A101", "B202", "C195", "W171", "J999"})
    void should_ReturnTrue_When_IdMatches(String newId) {
        //given
        String expected = newId;
        String actual;
        
        //when
        workstation.setId(newId);
        actual = workstation.getId();
        
        //then
        assertEquals(expected, actual);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"AA01", "B2A2", "C19A", "W17100", "00J999", "C", "123"})
    void should_ThrowException_When_IdDoesNotMatches(String newId) {
        //given
        
        //when
        Executable executable = () -> workstation.setId(newId);
        
        //then
        assertThrows(IllegalArgumentException.class, executable);
    }
}
