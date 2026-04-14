package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the choice list.
 */
public class CheckoutAndAccountsConfigurationBrandingChoiceListInput {
  /**
   * The 'group' variant of ChoiceList.
   */
  private CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput group;

  public CheckoutAndAccountsConfigurationBrandingChoiceListInput() {
  }

  /**
   * The 'group' variant of ChoiceList.
   */
  public CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput getGroup() {
    return group;
  }

  public void setGroup(CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingChoiceListInput{group='" + group + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingChoiceListInput that = (CheckoutAndAccountsConfigurationBrandingChoiceListInput) o;
    return Objects.equals(group, that.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The 'group' variant of ChoiceList.
     */
    private CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput group;

    public CheckoutAndAccountsConfigurationBrandingChoiceListInput build() {
      CheckoutAndAccountsConfigurationBrandingChoiceListInput result = new CheckoutAndAccountsConfigurationBrandingChoiceListInput();
      result.group = this.group;
      return result;
    }

    /**
     * The 'group' variant of ChoiceList.
     */
    public Builder group(CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput group) {
      this.group = group;
      return this;
    }
  }
}
