package org.wso2;

import org.sonar.plugins.java.api.JavaCheck;
import org.wso2.checks.licenseHeader.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class RulesList {

    private RulesList() {
    }

    public static List<Class<? extends JavaCheck>> getChecks() {
        List<Class<? extends JavaCheck>> checks = new ArrayList<>();
        checks.addAll(getJavaChecks());
//    checks.addAll(getJavaTestChecks());
        return Collections.unmodifiableList(checks);
    }

    /**
     * These rules are going to target MAIN code only
     */
    public static List<Class<? extends JavaCheck>> getJavaChecks() {
        return Collections.unmodifiableList(Arrays.asList(
                IncInCommentsCheck.class));
    }

    /**
     * These rules are going to target TEST code only
     */
    public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
        return Collections.unmodifiableList(Arrays.asList(
//      NoIfStatementInTestsRule.class
        ));
    }
}
