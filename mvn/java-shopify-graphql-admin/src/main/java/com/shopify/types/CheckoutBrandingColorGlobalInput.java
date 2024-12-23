package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to customize the overall look and feel of the checkout.
 */
public class CheckoutBrandingColorGlobalInput {
  /**
   * A semantic color used for components that communicate general, informative content.
   */
  private String info;

  /**
   * A semantic color used for components that communicate successful actions or a positive state.
   */
  private String success;

  /**
   * A semantic color used for components that display content that requires
   * attention. For example, something that might be wrong, but not blocking.
   */
  private String warning;

  /**
   * A semantic color used for components that communicate critical content. For
   * example, a blocking error such as the requirement to enter a valid credit card number.
   */
  private String critical;

  /**
   * A color that's strongly associated with the merchant. Currently used for
   * primary buttons, such as **Pay now**, and secondary buttons, such as **Buy again**.
   */
  private String brand;

  /**
   * A color used for interaction, like links and focus states.
   */
  private String accent;

  /**
   * A color used to highlight certain areas of the user interface. For example, the [`Text`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/titles-and-text/text#textprops-propertydetail-appearance) component.
   */
  private String decorative;

  public CheckoutBrandingColorGlobalInput() {
  }

  /**
   * A semantic color used for components that communicate general, informative content.
   */
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  /**
   * A semantic color used for components that communicate successful actions or a positive state.
   */
  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  /**
   * A semantic color used for components that display content that requires
   * attention. For example, something that might be wrong, but not blocking.
   */
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  /**
   * A semantic color used for components that communicate critical content. For
   * example, a blocking error such as the requirement to enter a valid credit card number.
   */
  public String getCritical() {
    return critical;
  }

  public void setCritical(String critical) {
    this.critical = critical;
  }

  /**
   * A color that's strongly associated with the merchant. Currently used for
   * primary buttons, such as **Pay now**, and secondary buttons, such as **Buy again**.
   */
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * A color used for interaction, like links and focus states.
   */
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  /**
   * A color used to highlight certain areas of the user interface. For example, the [`Text`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/titles-and-text/text#textprops-propertydetail-appearance) component.
   */
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingColorGlobalInput{info='" + info + "', success='" + success + "', warning='" + warning + "', critical='" + critical + "', brand='" + brand + "', accent='" + accent + "', decorative='" + decorative + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingColorGlobalInput that = (CheckoutBrandingColorGlobalInput) o;
    return Objects.equals(info, that.info) &&
        Objects.equals(success, that.success) &&
        Objects.equals(warning, that.warning) &&
        Objects.equals(critical, that.critical) &&
        Objects.equals(brand, that.brand) &&
        Objects.equals(accent, that.accent) &&
        Objects.equals(decorative, that.decorative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, success, warning, critical, brand, accent, decorative);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A semantic color used for components that communicate general, informative content.
     */
    private String info;

    /**
     * A semantic color used for components that communicate successful actions or a positive state.
     */
    private String success;

    /**
     * A semantic color used for components that display content that requires
     * attention. For example, something that might be wrong, but not blocking.
     */
    private String warning;

    /**
     * A semantic color used for components that communicate critical content. For
     * example, a blocking error such as the requirement to enter a valid credit card number.
     */
    private String critical;

    /**
     * A color that's strongly associated with the merchant. Currently used for
     * primary buttons, such as **Pay now**, and secondary buttons, such as **Buy again**.
     */
    private String brand;

    /**
     * A color used for interaction, like links and focus states.
     */
    private String accent;

    /**
     * A color used to highlight certain areas of the user interface. For example, the [`Text`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/titles-and-text/text#textprops-propertydetail-appearance) component.
     */
    private String decorative;

    public CheckoutBrandingColorGlobalInput build() {
      CheckoutBrandingColorGlobalInput result = new CheckoutBrandingColorGlobalInput();
      result.info = this.info;
      result.success = this.success;
      result.warning = this.warning;
      result.critical = this.critical;
      result.brand = this.brand;
      result.accent = this.accent;
      result.decorative = this.decorative;
      return result;
    }

    /**
     * A semantic color used for components that communicate general, informative content.
     */
    public Builder info(String info) {
      this.info = info;
      return this;
    }

    /**
     * A semantic color used for components that communicate successful actions or a positive state.
     */
    public Builder success(String success) {
      this.success = success;
      return this;
    }

    /**
     * A semantic color used for components that display content that requires
     * attention. For example, something that might be wrong, but not blocking.
     */
    public Builder warning(String warning) {
      this.warning = warning;
      return this;
    }

    /**
     * A semantic color used for components that communicate critical content. For
     * example, a blocking error such as the requirement to enter a valid credit card number.
     */
    public Builder critical(String critical) {
      this.critical = critical;
      return this;
    }

    /**
     * A color that's strongly associated with the merchant. Currently used for
     * primary buttons, such as **Pay now**, and secondary buttons, such as **Buy again**.
     */
    public Builder brand(String brand) {
      this.brand = brand;
      return this;
    }

    /**
     * A color used for interaction, like links and focus states.
     */
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    /**
     * A color used to highlight certain areas of the user interface. For example, the [`Text`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/titles-and-text/text#textprops-propertydetail-appearance) component.
     */
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }
  }
}
