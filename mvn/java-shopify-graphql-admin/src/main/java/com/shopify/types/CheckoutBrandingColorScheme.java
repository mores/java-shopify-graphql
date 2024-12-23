package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A base set of color customizations that's applied to an area of Checkout, from which every component
 * pulls its colors.
 */
public class CheckoutBrandingColorScheme {
  /**
   * The main colors of a scheme. Used for the surface background, text, links, and more.
   */
  private CheckoutBrandingColorRoles base;

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  private CheckoutBrandingControlColorRoles control;

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  private CheckoutBrandingButtonColorRoles primaryButton;

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  private CheckoutBrandingButtonColorRoles secondaryButton;

  public CheckoutBrandingColorScheme() {
  }

  /**
   * The main colors of a scheme. Used for the surface background, text, links, and more.
   */
  public CheckoutBrandingColorRoles getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingColorRoles base) {
    this.base = base;
  }

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  public CheckoutBrandingControlColorRoles getControl() {
    return control;
  }

  public void setControl(CheckoutBrandingControlColorRoles control) {
    this.control = control;
  }

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  public CheckoutBrandingButtonColorRoles getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutBrandingButtonColorRoles primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  public CheckoutBrandingButtonColorRoles getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(CheckoutBrandingButtonColorRoles secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorScheme{base='" + base + "', control='" + control + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorScheme that = (CheckoutBrandingColorScheme) o;
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
     * The main colors of a scheme. Used for the surface background, text, links, and more.
     */
    private CheckoutBrandingColorRoles base;

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    private CheckoutBrandingControlColorRoles control;

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    private CheckoutBrandingButtonColorRoles primaryButton;

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    private CheckoutBrandingButtonColorRoles secondaryButton;

    public CheckoutBrandingColorScheme build() {
      CheckoutBrandingColorScheme result = new CheckoutBrandingColorScheme();
      result.base = this.base;
      result.control = this.control;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      return result;
    }

    /**
     * The main colors of a scheme. Used for the surface background, text, links, and more.
     */
    public Builder base(CheckoutBrandingColorRoles base) {
      this.base = base;
      return this;
    }

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    public Builder control(CheckoutBrandingControlColorRoles control) {
      this.control = control;
      return this;
    }

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    public Builder primaryButton(CheckoutBrandingButtonColorRoles primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    public Builder secondaryButton(CheckoutBrandingButtonColorRoles secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }
  }
}
