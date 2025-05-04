package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a base set of color customizations that's applied to an area of Checkout, from which
 * every component pulls its colors.
 */
public class CheckoutBrandingColorSchemeInput {
  /**
   * The main colors of a scheme. Used for the surface background, text, links, and more.
   */
  private CheckoutBrandingColorRolesInput base;

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  private CheckoutBrandingControlColorRolesInput control;

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  private CheckoutBrandingButtonColorRolesInput primaryButton;

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  private CheckoutBrandingButtonColorRolesInput secondaryButton;

  public CheckoutBrandingColorSchemeInput() {
  }

  /**
   * The main colors of a scheme. Used for the surface background, text, links, and more.
   */
  public CheckoutBrandingColorRolesInput getBase() {
    return base;
  }

  public void setBase(CheckoutBrandingColorRolesInput base) {
    this.base = base;
  }

  /**
   * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
   */
  public CheckoutBrandingControlColorRolesInput getControl() {
    return control;
  }

  public void setControl(CheckoutBrandingControlColorRolesInput control) {
    this.control = control;
  }

  /**
   * The colors of the primary button. For example, the main payment, or **Pay now** button.
   */
  public CheckoutBrandingButtonColorRolesInput getPrimaryButton() {
    return primaryButton;
  }

  public void setPrimaryButton(CheckoutBrandingButtonColorRolesInput primaryButton) {
    this.primaryButton = primaryButton;
  }

  /**
   * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
   */
  public CheckoutBrandingButtonColorRolesInput getSecondaryButton() {
    return secondaryButton;
  }

  public void setSecondaryButton(CheckoutBrandingButtonColorRolesInput secondaryButton) {
    this.secondaryButton = secondaryButton;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorSchemeInput{base='" + base + "', control='" + control + "', primaryButton='" + primaryButton + "', secondaryButton='" + secondaryButton + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorSchemeInput that = (CheckoutBrandingColorSchemeInput) o;
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
    private CheckoutBrandingColorRolesInput base;

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    private CheckoutBrandingControlColorRolesInput control;

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    private CheckoutBrandingButtonColorRolesInput primaryButton;

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    private CheckoutBrandingButtonColorRolesInput secondaryButton;

    public CheckoutBrandingColorSchemeInput build() {
      CheckoutBrandingColorSchemeInput result = new CheckoutBrandingColorSchemeInput();
      result.base = this.base;
      result.control = this.control;
      result.primaryButton = this.primaryButton;
      result.secondaryButton = this.secondaryButton;
      return result;
    }

    /**
     * The main colors of a scheme. Used for the surface background, text, links, and more.
     */
    public Builder base(CheckoutBrandingColorRolesInput base) {
      this.base = base;
      return this;
    }

    /**
     * The colors of form controls, such as the [`TextField`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/textfield) and [`ChoiceList`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/forms/choicelist) components.
     */
    public Builder control(CheckoutBrandingControlColorRolesInput control) {
      this.control = control;
      return this;
    }

    /**
     * The colors of the primary button. For example, the main payment, or **Pay now** button.
     */
    public Builder primaryButton(CheckoutBrandingButtonColorRolesInput primaryButton) {
      this.primaryButton = primaryButton;
      return this;
    }

    /**
     * The colors of the secondary button, which is used for secondary actions. For example, **Buy again**.
     */
    public Builder secondaryButton(CheckoutBrandingButtonColorRolesInput secondaryButton) {
      this.secondaryButton = secondaryButton;
      return this;
    }
  }
}
