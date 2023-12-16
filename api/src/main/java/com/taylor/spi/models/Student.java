/*
 * File: src\main\java\com\taylor\api\models\Student.java
 * Project: jpa
 * Created Date: Friday, December 15th 2023, 12:11:04 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Saturday, 16th December 2023 8:06:58 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Friday, December 15th 2023	Rui Yu		Initial version
 */

package com.taylor.spi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {

    private String name;
    private Boolean sex;
    private Integer age;
    private Integer score;
}