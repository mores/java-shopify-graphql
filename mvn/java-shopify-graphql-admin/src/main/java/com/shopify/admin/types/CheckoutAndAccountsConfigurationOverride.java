package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A checkout and account configuration override modifies a parent configuration for specific markets.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutAndAccountsConfigurationOverride implements com.shopify.admin.types.CheckoutAndAccountsConfigurationInterface, com.shopify.admin.types.Node {
  /**
   * The branding configuration.
   */
  private CheckoutAndAccountsConfigurationBranding branding;

  /**
   * The date and time when the configuration was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The date and time when the configuration was last edited.
   */
  private OffsetDateTime editedAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The configuration name.
   */
  private String name;

  /**
   * The date and time when the configuration was last updated.
   */
  private OffsetDateTime updatedAt;

  public CheckoutAndAccountsConfigurationOverride() {
  }

  /**
   * The branding configuration.
   */
  public CheckoutAndAccountsConfigurationBranding getBranding() {
    return branding;
  }

  public void setBranding(CheckoutAndAccountsConfigurationBranding branding) {
    this.branding = branding;
  }

  /**
   * The date and time when the configuration was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The date and time when the configuration was last edited.
   */
  public OffsetDateTime getEditedAt() {
    return editedAt;
  }

  public void setEditedAt(OffsetDateTime editedAt) {
    this.editedAt = editedAt;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The configuration name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The date and time when the configuration was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationOverride{branding='" + branding + "', createdAt='" + createdAt + "', editedAt='" + editedAt + "', id='" + id + "', name='" + name + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationOverride that = (CheckoutAndAccountsConfigurationOverride) o;
    return Objects.equals(branding, that.branding) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(editedAt, that.editedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branding, createdAt, editedAt, id, name, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The branding configuration.
     */
    private CheckoutAndAccountsConfigurationBranding branding;

    /**
     * The date and time when the configuration was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The date and time when the configuration was last edited.
     */
    private OffsetDateTime editedAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The configuration name.
     */
    private String name;

    /**
     * The date and time when the configuration was last updated.
     */
    private OffsetDateTime updatedAt;

    public CheckoutAndAccountsConfigurationOverride build() {
      CheckoutAndAccountsConfigurationOverride result = new CheckoutAndAccountsConfigurationOverride();
      result.branding = this.branding;
      result.createdAt = this.createdAt;
      result.editedAt = this.editedAt;
      result.id = this.id;
      result.name = this.name;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The branding configuration.
     */
    public Builder branding(CheckoutAndAccountsConfigurationBranding branding) {
      this.branding = branding;
      return this;
    }

    /**
     * The date and time when the configuration was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The date and time when the configuration was last edited.
     */
    public Builder editedAt(OffsetDateTime editedAt) {
      this.editedAt = editedAt;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The configuration name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The date and time when the configuration was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
