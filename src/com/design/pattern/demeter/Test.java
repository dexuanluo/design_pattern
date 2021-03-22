package com.design.pattern.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandIssueCourse(new TeamLeader());
    }
}
