/*
 * File: src\main\java\com\taylor\spi\\utilities\ProviderUtility.java
 * Project: jpa
 * Created Date: Friday, December 15th 2023, 9:03:49 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Saturday, 16th December 2023 9:40:53 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Friday, December 15th 2023	Rui Yu		Initial version
 */

package com.taylor.spi.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import com.taylor.spi.api.StudentProvider;
import com.taylor.spi.exceptions.ProviderNotFoundException;

public class ProviderUtility {

    private static final String DEFAULT_PROVIDER = "com.taylor.spi.impl.TaylorStudentProvider";
    private static List<StudentProvider> services = null;

    // Get all providers
    public static List<StudentProvider> providers() {
        if (services == null) {
            services = new ArrayList<>();
            ServiceLoader<StudentProvider> loader = ServiceLoader.load(StudentProvider.class);
            loader.forEach(services::add);
        }

        if(services.size() == 0){
            throw new ProviderNotFoundException("No provider found");
        }

        return services;
    }

    // Get default provider
    public static StudentProvider defaultProvider() {
        return provider(DEFAULT_PROVIDER);
    }

    // Get provider by name
    public static StudentProvider provider(String providerName) {
        for (StudentProvider studentProvider : providers()) {
            if (providerName.equals(studentProvider.getClass().getName())) {
                return studentProvider;
            }
        }

        throw new ProviderNotFoundException("Student provider " + providerName + " not found");
    }
}