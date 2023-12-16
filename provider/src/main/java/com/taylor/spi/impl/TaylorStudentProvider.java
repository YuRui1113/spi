/*
 * File: src\main\java\com\taylor\spi\impl\TaylorStudentProvider.java
 * Project: jpa
 * Created Date: Friday, December 15th 2023, 4:15:42 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Saturday, 16th December 2023 8:18:24 pm
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

import com.taylor.spi.api.StudentManager;
import com.taylor.spi.api.StudentProvider;

public class TaylorStudentProvider implements StudentProvider {

    @Override
    public StudentManager create() {
        return new TaylorStudentManager();
    }
}