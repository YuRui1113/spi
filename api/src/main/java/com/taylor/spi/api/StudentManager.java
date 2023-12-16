/*
 * File: src\main\java\com\taylor\api\spi\StudentManager.java
 * Project: jpa
 * Created Date: Friday, December 15th 2023, 12:14:12 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Saturday, 16th December 2023 8:06:25 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Friday, December 15th 2023	Rui Yu		Initial version
 */

package com.taylor.spi.api;

import java.util.List;

import com.taylor.spi.models.Student;

public interface StudentManager {

    List<Student> getStudents(boolean sex);
}