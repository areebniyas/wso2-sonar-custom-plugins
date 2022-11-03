package org.wso2.checks;

import org.junit.jupiter.api.Test;
import org.sonar.java.checks.verifier.CheckVerifier;
import org.wso2.checks.licenseHeader.IncInCommentsCheck;

class IncInCommentsCheckTest {

    @Test
    void test() {
        CheckVerifier.newVerifier()
                .onFile("src/test/files/IncInCommentsCheck.java")
                .withCheck(new IncInCommentsCheck())
                .verifyIssues();
    }
}
