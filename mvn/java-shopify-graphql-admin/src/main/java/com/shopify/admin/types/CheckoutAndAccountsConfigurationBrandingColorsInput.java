package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing a base set of colors, from which every component pulls its colors.
 */
public class CheckoutAndAccountsConfigurationBrandingColorsInput {
  /**
   * The main colors, used for the surface background, text, links, and more.
   */
  private CheckoutAndAccountsConfigurationBrandingBaseColorRolesInput base;

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  private CheckoutAndAccountsConfigurationBrandingControlColorRolesInput control;

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  private CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesInput primaryButton;

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  private CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesInput secondaryButton;

  public CheckoutAndAccountsConfigurationBrandingColorsInput() {
  }

  /**
   * The main colors, used for the surface background, text, links, and more.
   */
  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesInput getBase() {
    return base;
  }

  public void setBase(CheckoutAndAccountsConfigurationBrandingBaseColorRolesInput base) {
    this.base = base;
  }

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  public CheckoutAndAccountsConfigurationBrandingControlColorRolesInput getControl() {
    return control;
  }

  public void setControl(CheckoutAndAccountsConfigurationBrandingControlColorRolesInput control) {
    this.control = control;
  }

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesInput getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(
      CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesInput primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesInput getSecondaryButton(
      ) {
    return secondaryButton;
  }

  public void setSecondaryButton(
      CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesInput secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingColorsInput{base='" + base + "', control='" + control + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingColorsInput that = (CheckoutAndAccountsConfigurationBrandingColorsInput) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(control, that.control) &&
        Objects.equals(primaryButton, that.primaryButton) &&
        Objects.equals(secondaryButton, that.secondaryButton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, control, primaryButton, secondaryButton);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The main colors, used for the surface background, text, links, and more.
     */
    private CheckoutAndAccountsConfigurationBrandingBaseColorRolesInput base;

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    private CheckoutAndAccountsConfigurationBrandingControlColorRolesInput control;

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    private CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesInput primaryButton;

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    private CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesInput secondaryButton;

    public CheckoutAndAccountsConfigurationBrandingColorsInput build() {
      CheckoutAndAccountsConfigurationBrandingColorsInput result = new CheckoutAndAccountsConfigurationBrandingColorsInput();
      result.base = this.base;
      result.control = this.control;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      return result;
    }

    /**
     * The main colors, used for the surface background, text, links, and more.
     */
    public Builder base(CheckoutAndAccountsConfigurationBrandingBaseColorRolesInput base) {
      this.base = base;
      return this;
    }

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    public Builder control(CheckoutAndAccountsConfigurationBrandingControlColorRolesInput control) {
      this.control = control;
      return this;
    }

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    public Builder primaryButton(
        CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesInput primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    public Builder secondaryButton(
        CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesInput secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }
  }
}
