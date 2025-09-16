package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private String persona;
    private int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "persona='" + persona + '\'' +
                ", edad=" + edad +
                '}';
    }
}
