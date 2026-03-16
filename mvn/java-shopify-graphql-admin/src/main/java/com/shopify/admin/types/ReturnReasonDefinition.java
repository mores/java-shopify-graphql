package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A standardized reason for returning an item.
 *
 * - Shopify offers an expanded library of return reasons available to all merchants
 * - For each product, Shopify suggests a curated subset of reasons based on the product's category
 * - Suggested reasons aren't the only valid options. When creating a return via
 * the API, you can use any reason from the [full library](https://shopify.dev/docs/api/admin-graphql/latest/queries/returnReasonDefinitions).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReturnReasonDefinition implements com.shopify.admin.types.Node {
  /**
   * Whether the return reason has been removed from taxonomy.
   *   
   * Deleted reasons should not be presented to customers when creating new returns, but may still
   * appear on existing returns that were created before the reason was deleted. This field enables
   * graceful deprecation of return reasons without breaking historical data.
   */
  private boolean deleted;

  /**
   * A unique, human-readable, stable identifier for the return reason.
   *   
   * Example values include "arrived-late", "comfort", "too-tight", "color-too-bright", and "quality".
   * The handle remains consistent across API versions and localizations, making it suitable for programmatic use.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The localized, user-facing name of the return reason.
   *   
   * This field returns the reason name in the requested locale, automatically falling back to
   * English if no translation is available. Use this field when displaying return reasons to
   * customers or merchants.
   */
  private String name;

  public ReturnReasonDefinition() {
  }

  /**
   * Whether the return reason has been removed from taxonomy.
   *   
   * Deleted reasons should not be presented to customers when creating new returns, but may still
   * appear on existing returns that were created before the reason was deleted. This field enables
   * graceful deprecation of return reasons without breaking historical data.
   */
  public boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
  }

  /**
   * A unique, human-readable, stable identifier for the return reason.
   *   
   * Example values include "arrived-late", "comfort", "too-tight", "color-too-bright", and "quality".
   * The handle remains consistent across API versions and localizations, making it suitable for programmatic use.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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
   * The localized, user-facing name of the return reason.
   *   
   * This field returns the reason name in the requested locale, automatically falling back to
   * English if no translation is available. Use this field when displaying return reasons to
   * customers or merchants.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "ReturnReasonDefinition{deleted='" + deleted + "', handle='" + handle + "', id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnReasonDefinition that = (ReturnReasonDefinition) o;
    return deleted == that.deleted &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, handle, id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the return reason has been removed from taxonomy.
     *   
     * Deleted reasons should not be presented to customers when creating new returns, but may still
     * appear on existing returns that were created before the reason was deleted. This field enables
     * graceful deprecation of return reasons without breaking historical data.
     */
    private boolean deleted;

    /**
     * A unique, human-readable, stable identifier for the return reason.
     *   
     * Example values include "arrived-late", "comfort", "too-tight", "color-too-bright", and "quality".
     * The handle remains consistent across API versions and localizations, making it suitable for programmatic use.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The localized, user-facing name of the return reason.
     *   
     * This field returns the reason name in the requested locale, automatically falling back to
     * English if no translation is available. Use this field when displaying return reasons to
     * customers or merchants.
     */
    private String name;

    public ReturnReasonDefinition build() {
      ReturnReasonDefinition result = new ReturnReasonDefinition();
      result.deleted = this.deleted;
      result.handle = this.handle;
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * Whether the return reason has been removed from taxonomy.
     *   
     * Deleted reasons should not be presented to customers when creating new returns, but may still
     * appear on existing returns that were created before the reason was deleted. This field enables
     * graceful deprecation of return reasons without breaking historical data.
     */
    public Builder deleted(boolean deleted) {
      this.deleted = deleted;
      return this;
    }

    /**
     * A unique, human-readable, stable identifier for the return reason.
     *   
     * Example values include "arrived-late", "comfort", "too-tight", "color-too-bright", and "quality".
     * The handle remains consistent across API versions and localizations, making it suitable for programmatic use.
     */
    public Builder handle(String handle) {
      this.handle = handle;
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
     * The localized, user-facing name of the return reason.
     *   
     * This field returns the reason name in the requested locale, automatically falling back to
     * English if no translation is available. Use this field when displaying return reasons to
     * customers or merchants.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
