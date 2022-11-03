package org.wso2.checks.licenseHeader;

import org.sonar.check.Rule;
import org.sonar.java.checks.CommentContainsPatternChecker;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.SyntaxTrivia;
import org.sonar.plugins.java.api.tree.Tree;
import java.util.Collections;
import java.util.List;

@Rule(key = "IncInComments")
public class IncInCommentsCheck extends IssuableSubscriptionVisitor {

    private static final String PATTERN = "WSO2 Inc.";
    private static final String MESSAGE = "Remove usage of this \"WSO2 Inc.\" suppression comment filter.";
    private final CommentContainsPatternChecker checker = new CommentContainsPatternChecker(this, PATTERN, MESSAGE);

    @Override
    public List<Tree.Kind> nodesToVisit() {
        return Collections.singletonList(Tree.Kind.TRIVIA);
    }

    @Override
    public void visitTrivia(SyntaxTrivia syntaxTrivia) {
        checker.checkTrivia(syntaxTrivia);
    }

}
