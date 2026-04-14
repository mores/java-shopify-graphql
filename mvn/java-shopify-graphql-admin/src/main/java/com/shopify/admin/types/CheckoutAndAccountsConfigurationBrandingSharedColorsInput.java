package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing shared colors.
 */
public class CheckoutAndAccountsConfigurationBrandingSharedColorsInput {
  /**
   * The accent color for interactive elements.
   */
  private String accent;

  /**
   * The button color.
   */
  private String button;

  /**
   * The form control color.
   */
  private String control;

  /**
   * The decorative color.
   */
  private String decorative;

  /**
   * The critical/error color.
   */
  private String critical;

  /**
   * The success color.
   */
  private String success;

  /**
   * The warning color.
   */
  private String warning;

  /**
   * The informational color.
   */
  private String info;

  public CheckoutAndAccountsConfigurationBrandingSharedColorsInput() {
  }

  /**
   * The accent color for interactive elements.
   */
  public String getAccent() {
    return accent;
  }

  public void setAccent(String accent) {
    this.accent = accent;
  }

  /**
   * The button color.
   */
  public String getButton() {
    return button;
  }

  public void setButton(String button) {
    this.button = button;
  }

  /**
   * The form control color.
   */
  public String getControl() {
    return control;
  }

  public void setControl(String control) {
    this.control = control;
  }

  /**
   * The decorative color.
   */
  public String getDecorative() {
    return decorative;
  }

  public void setDecorative(String decorative) {
    this.decorative = decorative;
  }

  /**
   * The critical/error color.
   */
  public String getCritical() {
    return critical;
  }

  public void setCritical(String critical) {
    this.critical = critical;
  }

  /**
   * The success color.
   */
  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  /**
   * The warning color.
   */
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  /**
   * The informational color.
   */
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSharedColorsInput{accent='" + accent + "', button='" + button + "', control='" + control + "', decorative='" + decorative + "', critical='" + critical + "', success='" + success + "', warning='" + warning + "', info='" + info + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSharedColorsInput that = (CheckoutAndAccountsConfigurationBrandingSharedColorsInput) o;
    return Objects.equals(accent, that.accent) &&
        Objects.equals(button, that.button) &&
        Objects.equals(control, that.control) &&
        Objects.equals(decorative, that.decorative) &&
        Objects.equals(critical, that.critical) &&
        Objects.equals(success, that.success) &&
        Objects.equals(warning, that.warning) &&
        Objects.equals(info, that.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accent, button, control, decorative, critical, success, warning, info);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The accent color for interactive elements.
     */
    private String accent;

    /**
     * The button color.
     */
    private String button;

    /**
     * The form control color.
     */
    private String control;

    /**
     * The decorative color.
     */
    private String decorative;

    /**
     * The critical/error color.
     */
    private String critical;

    /**
     * The success color.
     */
    private String success;

    /**
     * The warning color.
     */
    private String warning;

    /**
     * The informational color.
     */
    private String info;

    public CheckoutAndAccountsConfigurationBrandingSharedColorsInput build() {
      CheckoutAndAccountsConfigurationBrandingSharedColorsInput result = new CheckoutAndAccountsConfigurationBrandingSharedColorsInput();
      result.accent = this.accent;
      result.button = this.button;
      result.control = this.control;
      result.decorative = this.decorative;
      result.critical = this.critical;
      result.success = this.success;
      result.warning = this.warning;
      result.info = this.info;
      return result;
    }

    /**
     * The accent color for interactive elements.
     */
    public Builder accent(String accent) {
      this.accent = accent;
      return this;
    }

    /**
     * The button color.
     */
    public Builder button(String button) {
      this.button = button;
      return this;
    }

    /**
     * The form control color.
     */
    public Builder control(String control) {
      this.control = control;
      return this;
    }

    /**
     * The decorative color.
     */
    public Builder decorative(String decorative) {
      this.decorative = decorative;
      return this;
    }

    /**
     * The critical/error color.
     */
    public Builder critical(String critical) {
      this.critical = critical;
      return this;
    }

    /**
     * The success color.
     */
    public Builder success(String success) {
      this.success = success;
      return this;
    }

    /**
     * The warning color.
     */
    public Builder warning(String warning) {
      this.warning = warning;
      return this;
    }

    /**
     * The informational color.
     */
    public Builder info(String info) {
      this.info = info;
      return this;
    }
  }
}
