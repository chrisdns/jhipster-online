package io.github.jhipster.online.service.util;

import io.github.jhipster.online.config.Constants;
import org.springframework.core.env.Environment;

import java.util.Arrays;

public class ProfileUtil {

    public static boolean areEmailsEnabled(Environment env) {
        return Arrays
            .stream(env.getActiveProfiles())
            .noneMatch(e -> e.equals(Constants.PROFILE_NO_MAIL));
    }
}
