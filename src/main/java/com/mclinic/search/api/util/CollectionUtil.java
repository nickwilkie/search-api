/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package com.mclinic.search.api.util;

import java.util.Collection;

public class CollectionUtil {

    /**
     * Method to check if the collection is empty or not.
     *
     * @param collection the collection
     * @return true if the collection is null or the collection is empty.
     */
    public static Boolean isEmpty(final Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
