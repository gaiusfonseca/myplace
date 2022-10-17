package br.gaius.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class WorkstationTest {

    private Workstation workstation;
    
    @BeforeEach
    void setup() {
        workstation = new Workstation("A100");
    }
    
    @Test
    void should_ThrowException_When_LengthIsGreaterThan4() {
        //given
        String invalidId = "A1000";
        
        //when
        Executable executable = () -> workstation.setId(invalidId);
        
        //them
        assertThrows(IllegalArgumentException.class, executable);
    }
    
    @Test
    void should_ThrowException__When_LengthIsLessThan4() {
        //given
        String invalidId = "A10";
        
        //when
        Executable executable = () -> workstation.setId(invalidId);
        
        //them
        assertThrows(IllegalArgumentException.class, executable);
    }

}
