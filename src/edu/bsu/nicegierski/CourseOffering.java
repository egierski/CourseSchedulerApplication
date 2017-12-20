package edu.bsu.nicegierski;

public class CourseOffering {
    private final String title;
    private final String number;
    private final String crn;
    private final String section;
    public CourseOffering(Builder builder){
        this.title = builder.title;
        this.number = builder.number;
        this.crn = builder.crn;
        this.section = builder.section;

    }

    public static final class Builder{
        private String title;
        private String number;
        private String crn;
        private String section;

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }
        public Builder setNumber(String number){
            this.number = number;
            return this;
        }
        public Builder setCrn(String crn){
            this.crn = crn;
            return this;
        }
        public Builder setSection(String section){
            this.section = section;
            return this;
        }
        public CourseOffering build() {
            return new CourseOffering(this);
        }
    }

}
