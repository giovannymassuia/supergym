package io.giovannymassuia.examples.supergym.domain;

import java.util.List;
import lombok.Getter;

@Getter
public class Exercise {

    private String exerciseId;
    private String title;
    private String description;
    private MuscleGroup muscleGroup;
    private List<String> medias;

    public enum MuscleGroup {
        CHEST, BICEPS, TRICEPS, LEGS, BACK, SHOULDERS;
    }
}
