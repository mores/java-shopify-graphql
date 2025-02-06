package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to install a validation.
 */
public class ValidationCreateInput {
  /**
   * The function ID representing the extension to install.
   */
  private String functionId;

  /**
   * Whether the validation should be live on the merchant checkout.
   */
  private Boolean enable = false;

  /**
   * Whether the validation should block on failures other than expected violations.
   */
  private Boolean blockOnFailure = false;

  /**
   * Additional metafields to associate to the validation.
   */
  private List<MetafieldInput> metafields = Collections.emptyList();

  /**
   * The title of the validation.
   */
  private String title;

  public ValidationCreateInput() {
  }

  /**
   * The function ID representing the extension to install.
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * Whether the validation should be live on the merchant checkout.
   */
  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  /**
   * Whether the validation should block on failures other than expected violations.
   */
  public Boolean getBlockOnFailure() {
    return blockOnFailure;
  }

  public void setBlockOnFailure(Boolean blockOnFailure) {
    this.blockOnFailure = blockOnFailure;
  }

  /**
   * Additional metafields to associate to the validation.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The title of the validation.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ValidationCreateInput{functionId='" + functionId + "', enable='" + enable + "', blockOnFailure='" + blockOnFailure + "', metafields='" + metafields + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationCreateInput that = (ValidationCreateInput) o;
    return Objects.equals(functionId, that.functionId) &&
        Objects.equals(enable, that.enable) &&
        Objects.equals(blockOnFailure, that.blockOnFailure) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionId, enable, blockOnFailure, metafields, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The function ID representing the extension to install.
     */
    private String functionId;

    /**
     * Whether the validation should be live on the merchant checkout.
     */
    private Boolean enable = false;

    /**
     * Whether the validation should block on failures other than expected violations.
     */
    private Boolean blockOnFailure = false;

    /**
     * Additional metafields to associate to the validation.
     */
    private List<MetafieldInput> metafields = Collections.emptyList();

    /**
     * The title of the validation.
     */
    private String title;

    public ValidationCreateInput build() {
      ValidationCreateInput result = new ValidationCreateInput();
      result.functionId = this.functionId;
      result.enable = this.enable;
      result.blockOnFailure = this.blockOnFailure;
      result.metafields = this.metafields;
      result.title = this.title;
      return result;
    }

    /**
     * The function ID representing the extension to install.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * Whether the validation should be live on the merchant checkout.
     */
    public Builder enable(Boolean enable) {
      this.enable = enable;
      return this;
    }

    /**
     * Whether the validation should block on failures other than expected violations.
     */
    public Builder blockOnFailure(Boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      return this;
    }

    /**
     * Additional metafields to associate to the validation.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The title of the validation.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
