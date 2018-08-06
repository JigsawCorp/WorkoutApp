package com.jigsawcorp.android.jigsaw.Model;

import android.content.res.Resources;

import com.jigsawcorp.android.jigsaw.R;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Program {
    public enum TrainingTypes {RESISTANCE, CARDIO, FLEXIBILITY, OTHER}
    public enum DifficultyLevels {BEGINNER, INTERMEDIATE, ADVANCED, EXPERT, UNSPECIFIED}
    public enum SplitTypes {FULL_BODY, UPPER_LOWER, PPL, BRO, OTHER}
    private UUID mId;
    private String mName, mDescription;
    private boolean mIsDayBased;
    private int mDuration, mDaysPerWeek;
    private TrainingTypes mTrainingType;
    private DifficultyLevels mDifficultyLevel;
    private SplitTypes mSplitType;
    private List<UUID> mProgramWorkouts;

    // Default Constructor
    public Program() {
        mId = UUID.randomUUID();
        mName = "";
        mProgramWorkouts = new ArrayList<>();
        mTrainingType = TrainingTypes.RESISTANCE;
        mDifficultyLevel = DifficultyLevels.UNSPECIFIED;
        mSplitType = SplitTypes.FULL_BODY;
        mIsDayBased = true;
        mDuration = 7;
        mDaysPerWeek = 3;
        mDescription = "";
    }

    // Constructor from Database
     public Program(UUID id, String name, List<UUID> programWorkouts, TrainingTypes trainingType, DifficultyLevels difficultyLevel, SplitTypes splitType, boolean isDayBased, int duration, int daysPerWeek, String description) {
        mId = id;
        mName = name;
        mProgramWorkouts = programWorkouts;
        mTrainingType = trainingType;
        mDifficultyLevel = difficultyLevel;
        mSplitType = splitType;
        mIsDayBased = isDayBased;
        mDuration = duration;
        mDaysPerWeek = daysPerWeek;
        mDescription = description;
     }

    public void setName(String name) {
        mName = name;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setTrainingType(TrainingTypes type) {
        mTrainingType = type;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        mDaysPerWeek = daysPerWeek;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public TrainingTypes getTrainingType() {
        return mTrainingType;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public boolean isDayBased() {
        return mIsDayBased;
    }

    public void setDayBased(boolean dayBased) {
        mIsDayBased = dayBased;
    }

    public int getDuration() {
        return mDuration;
    }

    public void setDuration(int duration) {
        mDuration = duration;
    }

    public int getDaysPerWeek() {
        return mDaysPerWeek;
    }

    public DifficultyLevels getDifficultyLevel() {
        return mDifficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevels difficultyLevel) {
        mDifficultyLevel = difficultyLevel;
    }

    public SplitTypes getSpliType() {
        return mSplitType;
    }

    public void setSpliType(SplitTypes spliType) {
        mSplitType = spliType;
    }

    public List<UUID> getProgramWorkouts() {
        return mProgramWorkouts;
    }

    public void setProgramWorkouts(List<UUID> programWorkouts) {
        mProgramWorkouts = programWorkouts;
    }
}
