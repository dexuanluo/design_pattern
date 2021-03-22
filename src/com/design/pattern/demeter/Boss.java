package com.design.pattern.demeter;


public class Boss {
    public void commandIssueCourse(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
