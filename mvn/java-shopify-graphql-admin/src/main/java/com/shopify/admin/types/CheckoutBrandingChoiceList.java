package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The choice list customizations.
 */
public class CheckoutBrandingChoiceList {
  /**
   * The settings that apply to the 'group' variant of ChoiceList.
   */
  private CheckoutBrandingChoiceListGroup group;

  public CheckoutBrandingChoiceList() {
  }

  /**
   * The settings that apply to the 'group' variant of ChoiceList.
   */
  public CheckoutBrandingChoiceListGroup getGroup() {
    return group;
  }

  public void setGroup(CheckoutBrandingChoiceListGroup group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingChoiceList{group='" + group + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingChoiceList that = (CheckoutBrandingChoiceList) o;
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
     * The settings that apply to the 'group' variant of ChoiceList.
     */
    private CheckoutBrandingChoiceListGroup group;

    public CheckoutBrandingChoiceList build() {
      CheckoutBrandingChoiceList result = new CheckoutBrandingChoiceList();
      result.group = this.group;
      return result;
    }

    /**
     * The settings that apply to the 'group' variant of ChoiceList.
     */
    public Builder group(CheckoutBrandingChoiceListGroup group) {
      this.group = group;
      return this;
    }
  }
}
