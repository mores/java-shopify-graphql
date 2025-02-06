package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A version of the API, as defined by [Shopify API versioning](https://shopify.dev/api/usage/versioning).
 * Versions are commonly referred to by their handle (for example, `2021-10`).
 */
public class ApiVersion {
  /**
   * The human-readable name of the version.
   */
  private String displayName;

  /**
   * The unique identifier of an ApiVersion. All supported API versions have a date-based (YYYY-MM) or `unstable` handle.
   */
  private String handle;

  /**
   * Whether the version is actively supported by Shopify. Supported API versions
   * are guaranteed to be stable. Unsupported API versions include unstable,
   * release candidate, and end-of-life versions that are marked as unsupported.
   * For more information, refer to
   * [Versioning](https://shopify.dev/api/usage/versioning).
   */
  private boolean supported;

  public ApiVersion() {
  }

  /**
   * The human-readable name of the version.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The unique identifier of an ApiVersion. All supported API versions have a date-based (YYYY-MM) or `unstable` handle.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Whether the version is actively supported by Shopify. Supported API versions
   * are guaranteed to be stable. Unsupported API versions include unstable,
   * release candidate, and end-of-life versions that are marked as unsupported.
   * For more information, refer to
   * [Versioning](https://shopify.dev/api/usage/versioning).
   */
  public boolean getSupported() {
    return supported;
  }

  public void setSupported(boolean supported) {
    this.supported = supported;
  }

  @Override
  public String toString() {
    return "ApiVersion{displayName='" + displayName + "', handle='" + handle + "', supported='" + supported + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiVersion that = (ApiVersion) o;
    return Objects.equals(displayName, that.displayName) &&
        Objects.equals(handle, that.handle) &&
        supported == that.supported;
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, handle, supported);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The human-readable name of the version.
     */
    private String displayName;

    /**
     * The unique identifier of an ApiVersion. All supported API versions have a date-based (YYYY-MM) or `unstable` handle.
     */
    private String handle;

    /**
     * Whether the version is actively supported by Shopify. Supported API versions
     * are guaranteed to be stable. Unsupported API versions include unstable,
     * release candidate, and end-of-life versions that are marked as unsupported.
     * For more information, refer to
     * [Versioning](https://shopify.dev/api/usage/versioning).
     */
    private boolean supported;

    public ApiVersion build() {
      ApiVersion result = new ApiVersion();
      result.displayName = this.displayName;
      result.handle = this.handle;
      result.supported = this.supported;
      return result;
    }

    /**
     * The human-readable name of the version.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The unique identifier of an ApiVersion. All supported API versions have a date-based (YYYY-MM) or `unstable` handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Whether the version is actively supported by Shopify. Supported API versions
     * are guaranteed to be stable. Unsupported API versions include unstable,
     * release candidate, and end-of-life versions that are marked as unsupported.
     * For more information, refer to
     * [Versioning](https://shopify.dev/api/usage/versioning).
     */
    public Builder supported(boolean supported) {
      this.supported = supported;
      return this;
    }
  }
}
