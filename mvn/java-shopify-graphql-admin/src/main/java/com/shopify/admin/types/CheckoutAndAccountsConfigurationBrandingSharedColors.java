package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Shared color customizations for semantic and functional colors.
 */
public class CheckoutAndAccountsConfigurationBrandingSharedColors {
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
   * The critical/error color.
   */
  private String critical;

  /**
   * The decorative color.
   */
  private String decorative;

  /**
   * The informational color.
   */
  private String info;

  /**
   * The success color.
   */
  private String success;

  /**
   * The warning color.
   */
  private String warning;

  public CheckoutAndAccountsConfigurationBrandingSharedColors() {
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
   * The critical/error color.
   */
  public String getCritical() {
    return critical;
  }

  public void setCritical(String critical) {
    this.critical = critical;
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
   * The informational color.
   */
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
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

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingSharedColors{accent='" + accent + "', button='" + button + "', control='" + control + "', critical='" + critical + "', decorative='" + decorative + "', info='" + info + "', success='" + success + "', warning='" + warning + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSharedColors that = (CheckoutAndAccountsConfigurationBrandingSharedColors) o;
    return Objects.equals(accent, that.accent) &&
        Objects.equals(button, that.button) &&
        Objects.equals(control, that.control) &&
        Objects.equals(critical, that.critical) &&
        Objects.equals(decorative, that.decorative) &&
        Objects.equals(info, that.info) &&
        Objects.equals(success, that.success) &&
        Objects.equals(warning, that.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accent, button, control, critical, decorative, info, success, warning);
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
     * The critical/error color.
     */
    private String critical;

    /**
     * The decorative color.
     */
    private String decorative;

    /**
     * The informational color.
     */
    private String info;

    /**
     * The success color.
     */
    private String success;

    /**
     * The warning color.
     */
    private String warning;

    public CheckoutAndAccountsConfigurationBrandingSharedColors build() {
      CheckoutAndAccountsConfigurationBrandingSharedColors result = new CheckoutAndAccountsConfigurationBrandingSharedColors();
      result.accent = this.accent;
      result.button = this.button;
      result.control = this.control;
      result.critical = this.critical;
      result.decorative = this.decorative;
      result.info = this.info;
      result.success = this.success;
      result.warning = this.warning;
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
     * The critical/error color.
     */
    public Builder critical(String critical) {
      this.critical = critical;
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
     * The informational color.
     */
    public Builder info(String info) {
      this.info = info;
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
  }
}
