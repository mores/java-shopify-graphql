package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
 */
public class ChannelUpdateInput {
  /**
   * A new unique identifier for the channel within the shop. Must be unique across
   * all channels on the shop. Handles are typically set at creation and rarely
   * changed — use when correcting a handle or migrating legacy channel records.
   */
  private String handle;

  /**
   * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
   * to bind to this channel. When changed, the platform re-evaluates the
   * specification's country coverage against the shop's region markets and
   * reconciles product feeds accordingly.
   */
  private String specificationHandle;

  /**
   * An updated identifier for the merchant's account on the external platform.
   * Changing this value signals that the channel connection now represents a
   * different external account.
   */
  private String accountId;

  /**
   * An updated merchant-facing name for the external account. Displayed in Shopify
   * Admin when multiple channels exist for the same app, to help merchants
   * distinguish between connections.
   */
  private String accountName;

  public ChannelUpdateInput() {
  }

  /**
   * A new unique identifier for the channel within the shop. Must be unique across
   * all channels on the shop. Handles are typically set at creation and rarely
   * changed — use when correcting a handle or migrating legacy channel records.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
   * to bind to this channel. When changed, the platform re-evaluates the
   * specification's country coverage against the shop's region markets and
   * reconciles product feeds accordingly.
   */
  public String getSpecificationHandle() {
    return specificationHandle;
  }

  public void setSpecificationHandle(String specificationHandle) {
    this.specificationHandle = specificationHandle;
  }

  /**
   * An updated identifier for the merchant's account on the external platform.
   * Changing this value signals that the channel connection now represents a
   * different external account.
   */
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * An updated merchant-facing name for the external account. Displayed in Shopify
   * Admin when multiple channels exist for the same app, to help merchants
   * distinguish between connections.
   */
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  @Override
  public String toString() {
    return "ChannelUpdateInput{handle='" + handle + "', specificationHandle='" + specificationHandle + "', accountId='" + accountId + "', accountName='" + accountName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelUpdateInput that = (ChannelUpdateInput) o;
    return Objects.equals(handle, that.handle) &&
        Objects.equals(specificationHandle, that.specificationHandle) &&
        Objects.equals(accountId, that.accountId) &&
        Objects.equals(accountName, that.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, specificationHandle, accountId, accountName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A new unique identifier for the channel within the shop. Must be unique across
     * all channels on the shop. Handles are typically set at creation and rarely
     * changed — use when correcting a handle or migrating legacy channel records.
     */
    private String handle;

    /**
     * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
     * to bind to this channel. When changed, the platform re-evaluates the
     * specification's country coverage against the shop's region markets and
     * reconciles product feeds accordingly.
     */
    private String specificationHandle;

    /**
     * An updated identifier for the merchant's account on the external platform.
     * Changing this value signals that the channel connection now represents a
     * different external account.
     */
    private String accountId;

    /**
     * An updated merchant-facing name for the external account. Displayed in Shopify
     * Admin when multiple channels exist for the same app, to help merchants
     * distinguish between connections.
     */
    private String accountName;

    public ChannelUpdateInput build() {
      ChannelUpdateInput result = new ChannelUpdateInput();
      result.handle = this.handle;
      result.specificationHandle = this.specificationHandle;
      result.accountId = this.accountId;
      result.accountName = this.accountName;
      return result;
    }

    /**
     * A new unique identifier for the channel within the shop. Must be unique across
     * all channels on the shop. Handles are typically set at creation and rarely
     * changed — use when correcting a handle or migrating legacy channel records.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
     * to bind to this channel. When changed, the platform re-evaluates the
     * specification's country coverage against the shop's region markets and
     * reconciles product feeds accordingly.
     */
    public Builder specificationHandle(String specificationHandle) {
      this.specificationHandle = specificationHandle;
      return this;
    }

    /**
     * An updated identifier for the merchant's account on the external platform.
     * Changing this value signals that the channel connection now represents a
     * different external account.
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * An updated merchant-facing name for the external account. Displayed in Shopify
     * Admin when multiple channels exist for the same app, to help merchants
     * distinguish between connections.
     */
    public Builder accountName(String accountName) {
      this.accountName = accountName;
      return this;
    }
  }
}
