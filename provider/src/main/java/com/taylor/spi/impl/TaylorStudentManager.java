/*
 * File: src\main\java\com\taylor\provider\impl\TaylorStudentManager.java
 * Project: jpa
 * Created Date: Friday, December 15th 2023, 3:47:38 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Saturday, 16th December 2023 9:35:27 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Friday, December 15th 2023	Rui Yu		Initial version
 */

package com.taylor.spi.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.taylor.spi.api.StudentManager;
import com.taylor.spi.models.Student;

public class TaylorStudentManager implements StudentManager {

    private List<Student> students = new ArrayList<>();

    public TaylorStudentManager() {
        students.add(new Student("Taylor", true, 44, 80));
        students.add(new Student("Tommy", true, 45, 82));
        students.add(new Student("Marisa", false, 40, 84));
        students.add(new Student("Henry", true, 47, 85));
        students.add(new Student("Jerry", true, 43, 87));
        students.add(new Student("Wavel", false, 44, 89));
    }

    @Override
    public List<Student> getStudents(boolean sex) {
        return students.stream()
                .filter(s -> s.getSex() == sex)
                .collect(Collectors.toList());
    }
}