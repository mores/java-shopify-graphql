package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The choice list customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingChoiceList {
  /**
   * The 'group' variant of ChoiceList.
   */
  private CheckoutAndAccountsConfigurationBrandingChoiceListGroup group;

  public CheckoutAndAccountsConfigurationBrandingChoiceList() {
  }

  /**
   * The 'group' variant of ChoiceList.
   */
  public CheckoutAndAccountsConfigurationBrandingChoiceListGroup getGroup() {
    return group;
  }

  public void setGroup(CheckoutAndAccountsConfigurationBrandingChoiceListGroup group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingChoiceList{group='" + group + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingChoiceList that = (CheckoutAndAccountsConfigurationBrandingChoiceList) o;
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
    private CheckoutAndAccountsConfigurationBrandingChoiceListGroup group;

    public CheckoutAndAccountsConfigurationBrandingChoiceList build() {
      CheckoutAndAccountsConfigurationBrandingChoiceList result = new CheckoutAndAccountsConfigurationBrandingChoiceList();
      result.group = this.group;
      return result;
    }

    /**
     * The 'group' variant of ChoiceList.
     */
    public Builder group(CheckoutAndAccountsConfigurationBrandingChoiceListGroup group) {
      this.group = group;
      return this;
    }
  }
}
