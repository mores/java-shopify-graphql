package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A shop's privacy policy settings.
 */
public class PrivacyPolicy {
  /**
   * Whether the policy is auto managed.
   */
  private boolean autoManaged;

  /**
   * Policy template supported locales.
   */
  private List<String> supportedLocales;

  public PrivacyPolicy() {
  }

  /**
   * Whether the policy is auto managed.
   */
  public boolean getAutoManaged() {
    return autoManaged;
  }

  public void setAutoManaged(boolean autoManaged) {
    this.autoManaged = autoManaged;
  }

  /**
   * Policy template supported locales.
   */
  public List<String> getSupportedLocales() {
    return supportedLocales;
  }

  public void setSupportedLocales(List<String> supportedLocales) {
    this.supportedLocales = supportedLocales;
  }

  @Override
  public String toString() {
    return "PrivacyPolicy{autoManaged='" + autoManaged + "', supportedLocales='" + supportedLocales + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivacyPolicy that = (PrivacyPolicy) o;
    return autoManaged == that.autoManaged &&
        Objects.equals(supportedLocales, that.supportedLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoManaged, supportedLocales);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the policy is auto managed.
     */
    private boolean autoManaged;

    /**
     * Policy template supported locales.
     */
    private List<String> supportedLocales;

    public PrivacyPolicy build() {
      PrivacyPolicy result = new PrivacyPolicy();
      result.autoManaged = this.autoManaged;
      result.supportedLocales = this.supportedLocales;
      return result;
    }

    /**
     * Whether the policy is auto managed.
     */
    public Builder autoManaged(boolean autoManaged) {
      this.autoManaged = autoManaged;
      return this;
    }

    /**
     * Policy template supported locales.
     */
    public Builder supportedLocales(List<String> supportedLocales) {
      this.supportedLocales = supportedLocales;
      return this;
    }
  }
}
