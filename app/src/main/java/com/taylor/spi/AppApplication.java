package com.taylor.spi;

import java.util.List;

import com.taylor.spi.api.StudentManager;
import com.taylor.spi.models.Student;
import com.taylor.spi.utilities.ProviderUtility;

public class AppApplication {

    public static void main(String[] args) {
        System.out.println("Enter SPI main application.");

        ProviderUtility.providers().forEach(provider -> {
            System.out.println(String.format("%10s%4s%4s%6s", "Name", "Sex", "Age", "Score"));
            System.out.println("------------------------");

            StudentManager manager = provider.create();
            List<Student> students = manager.getStudents(true);
            for (Student student : students) {
                System.out.println(String.format("%10s%4s%4s%6s",
                        student.getName(),
                        student.getSex() ? "M" : "W",
                        student.getAge(),
                        student.getScore()));
            }
        });

        System.out.println("Exit SPI main application.");
    }
}
