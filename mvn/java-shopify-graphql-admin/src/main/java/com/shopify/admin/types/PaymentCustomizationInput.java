package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create and update a payment customization.
 */
public class PaymentCustomizationInput {
  /**
   * The ID of the function providing the payment customization.
   */
  private String functionId;

  /**
   * The title of the payment customization.
   */
  private String title;

  /**
   * The enabled status of the payment customization.
   */
  private Boolean enabled;

  /**
   * Additional metafields to associate to the payment customization.
   */
  private List<MetafieldInput> metafields = Collections.emptyList();

  public PaymentCustomizationInput() {
  }

  /**
   * The ID of the function providing the payment customization.
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * The title of the payment customization.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The enabled status of the payment customization.
   */
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Additional metafields to associate to the payment customization.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "PaymentCustomizationInput{functionId='" + functionId + "', title='" + title + "', enabled='" + enabled + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentCustomizationInput that = (PaymentCustomizationInput) o;
    return Objects.equals(functionId, that.functionId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(enabled, that.enabled) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionId, title, enabled, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the function providing the payment customization.
     */
    private String functionId;

    /**
     * The title of the payment customization.
     */
    private String title;

    /**
     * The enabled status of the payment customization.
     */
    private Boolean enabled;

    /**
     * Additional metafields to associate to the payment customization.
     */
    private List<MetafieldInput> metafields = Collections.emptyList();

    public PaymentCustomizationInput build() {
      PaymentCustomizationInput result = new PaymentCustomizationInput();
      result.functionId = this.functionId;
      result.title = this.title;
      result.enabled = this.enabled;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * The ID of the function providing the payment customization.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * The title of the payment customization.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The enabled status of the payment customization.
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Additional metafields to associate to the payment customization.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
