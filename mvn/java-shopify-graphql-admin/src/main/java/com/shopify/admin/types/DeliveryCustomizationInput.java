package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create and update a delivery customization.
 */
public class DeliveryCustomizationInput {
  /**
   * Function handle scoped to your current app ID. Only finds functions within your app.
   */
  private String functionHandle;

  /**
   * The title of the delivery customization.
   */
  private String title;

  /**
   * The enabled status of the delivery customization.
   */
  private Boolean enabled;

  /**
   * Additional metafields to associate to the delivery customization.
   */
  private List<MetafieldInput> metafields = Collections.emptyList();

  public DeliveryCustomizationInput() {
  }

  /**
   * Function handle scoped to your current app ID. Only finds functions within your app.
   */
  public String getFunctionHandle() {
    return functionHandle;
  }

  public void setFunctionHandle(String functionHandle) {
    this.functionHandle = functionHandle;
  }

  /**
   * The title of the delivery customization.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The enabled status of the delivery customization.
   */
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Additional metafields to associate to the delivery customization.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "DeliveryCustomizationInput{functionHandle='" + functionHandle + "', title='" + title + "', enabled='" + enabled + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCustomizationInput that = (DeliveryCustomizationInput) o;
    return Objects.equals(functionHandle, that.functionHandle) &&
        Objects.equals(title, that.title) &&
        Objects.equals(enabled, that.enabled) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionHandle, title, enabled, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Function handle scoped to your current app ID. Only finds functions within your app.
     */
    private String functionHandle;

    /**
     * The title of the delivery customization.
     */
    private String title;

    /**
     * The enabled status of the delivery customization.
     */
    private Boolean enabled;

    /**
     * Additional metafields to associate to the delivery customization.
     */
    private List<MetafieldInput> metafields = Collections.emptyList();

    public DeliveryCustomizationInput build() {
      DeliveryCustomizationInput result = new DeliveryCustomizationInput();
      result.functionHandle = this.functionHandle;
      result.title = this.title;
      result.enabled = this.enabled;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * Function handle scoped to your current app ID. Only finds functions within your app.
     */
    public Builder functionHandle(String functionHandle) {
      this.functionHandle = functionHandle;
      return this;
    }

    /**
     * The title of the delivery customization.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The enabled status of the delivery customization.
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Additional metafields to associate to the delivery customization.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
