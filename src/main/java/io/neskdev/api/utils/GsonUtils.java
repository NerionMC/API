package io.neskdev.api.utils;

/*
 * This file is part of NELYRIA.
 *
 * Copyright © 2025, OCTA-GROUP. All rights reserved.
 *
 * Unauthorized using, copying, modifying and/or distributing of this file,
 * via any medium is strictly prohibited. This code is confidential.
 */
public class GsonUtils {
    public static <T> T fromJson(final String json, final Class<T> targetClass) {
        return GsonProvider.GSON.fromJson(json, targetClass);
    }
}
