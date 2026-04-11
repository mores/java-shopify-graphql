package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The color settings used to customize the user interface.
 */
public class CheckoutAndAccountsConfigurationBrandingColors {
  /**
   * The main colors, used for the surface background, text, links, and more.
   */
  private CheckoutAndAccountsConfigurationBrandingBaseColorRoles base;

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  private CheckoutAndAccountsConfigurationBrandingControlColorRoles control;

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  private CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRoles primaryButton;

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  private CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRoles secondaryButton;

  public CheckoutAndAccountsConfigurationBrandingColors() {
  }

  /**
   * The main colors, used for the surface background, text, links, and more.
   */
  public CheckoutAndAccountsConfigurationBrandingBaseColorRoles getBase() {
    return base;
  }

  public void setBase(CheckoutAndAccountsConfigurationBrandingBaseColorRoles base) {
    this.base = base;
  }

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  public CheckoutAndAccountsConfigurationBrandingControlColorRoles getControl() {
    return control;
  }

  public void setControl(CheckoutAndAccountsConfigurationBrandingControlColorRoles control) {
    this.control = control;
  }

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRoles getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(
      CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRoles primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRoles getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(
      CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRoles secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingColors{base='" + base + "', control='" + control + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingColors that = (CheckoutAndAccountsConfigurationBrandingColors) o;
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
    private CheckoutAndAccountsConfigurationBrandingBaseColorRoles base;

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    private CheckoutAndAccountsConfigurationBrandingControlColorRoles control;

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    private CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRoles primaryButton;

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    private CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRoles secondaryButton;

    public CheckoutAndAccountsConfigurationBrandingColors build() {
      CheckoutAndAccountsConfigurationBrandingColors result = new CheckoutAndAccountsConfigurationBrandingColors();
      result.base = this.base;
      result.control = this.control;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      return result;
    }

    /**
     * The main colors, used for the surface background, text, links, and more.
     */
    public Builder base(CheckoutAndAccountsConfigurationBrandingBaseColorRoles base) {
      this.base = base;
      return this;
    }

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    public Builder control(CheckoutAndAccountsConfigurationBrandingControlColorRoles control) {
      this.control = control;
      return this;
    }

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    public Builder primaryButton(
        CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRoles primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    public Builder secondaryButton(
        CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRoles secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }
  }
}
