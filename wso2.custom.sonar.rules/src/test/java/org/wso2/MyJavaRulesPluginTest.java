/*
 * Copyright (C) 2012-2022 SonarSource SA - mailto:info AT sonarsource DOT com
 * This code is released under [MIT No Attribution](https://opensource.org/licenses/MIT-0) license.
 */
package org.wso2;

import org.junit.jupiter.api.Test;
import org.sonar.api.*;
import org.sonar.api.utils.Version;

import static org.assertj.core.api.Assertions.assertThat;

class MyJavaRulesPluginTest {

  @Test
  void testName() {
    Plugin.Context context = new Plugin.Context(new MockedSonarRuntime());

    new MyJavaRulesPlugin().define(context);

    assertThat(context.getExtensions()).hasSize(2);
  }
  private static class MockedSonarRuntime implements SonarRuntime {

    @Override
    public Version getApiVersion() {
      return Version.create(7, 9);
    }

    @Override
    public SonarProduct getProduct() {
      return SonarProduct.SONARQUBE;
    }

    @Override
    public SonarQubeSide getSonarQubeSide() {
      return SonarQubeSide.SCANNER;
    }

    @Override
    public SonarEdition getEdition() {
      return SonarEdition.COMMUNITY;
    }
  }

}
