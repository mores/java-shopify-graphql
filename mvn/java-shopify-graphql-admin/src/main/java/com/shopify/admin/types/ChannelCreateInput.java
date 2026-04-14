package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a [`Channel`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel).
 */
public class ChannelCreateInput {
  /**
   * A unique, human-readable identifier for the channel within the shop. For
   * example, `amazon-us-A1B2C3D4E5F6G7`. Used for lookups via [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle).
   * If not provided, auto-generated from the specification handle and account ID.
   * Must be unique across all channels on the shop.
   */
  private String handle;

  /**
   * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
   * to bind to this channel. The specification must have been deployed by the
   * calling application via `shopify app deploy`. Determines the channel's
   * regional coverage, capabilities, and requirements.
   */
  private String specificationHandle;

  /**
   * A unique identifier for the merchant's account on the external platform, such
   * as an Amazon Seller ID or Google Merchant Center ID. Used together with
   * `specificationHandle` to uniquely identify the channel connection.
   */
  private String accountId;

  /**
   * The merchant-facing name for the external account. Displayed in Shopify Admin
   * wherever the channel connection is referenced, such as in Markets and order
   * attribution. Should match how the merchant recognises the account on the
   * external platform.
   */
  private String accountName;

  public ChannelCreateInput() {
  }

  /**
   * A unique, human-readable identifier for the channel within the shop. For
   * example, `amazon-us-A1B2C3D4E5F6G7`. Used for lookups via [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle).
   * If not provided, auto-generated from the specification handle and account ID.
   * Must be unique across all channels on the shop.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
   * to bind to this channel. The specification must have been deployed by the
   * calling application via `shopify app deploy`. Determines the channel's
   * regional coverage, capabilities, and requirements.
   */
  public String getSpecificationHandle() {
    return specificationHandle;
  }

  public void setSpecificationHandle(String specificationHandle) {
    this.specificationHandle = specificationHandle;
  }

  /**
   * A unique identifier for the merchant's account on the external platform, such
   * as an Amazon Seller ID or Google Merchant Center ID. Used together with
   * `specificationHandle` to uniquely identify the channel connection.
   */
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * The merchant-facing name for the external account. Displayed in Shopify Admin
   * wherever the channel connection is referenced, such as in Markets and order
   * attribution. Should match how the merchant recognises the account on the
   * external platform.
   */
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  @Override
  public String toString() {
    return "ChannelCreateInput{handle='" + handle + "', specificationHandle='" + specificationHandle + "', accountId='" + accountId + "', accountName='" + accountName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelCreateInput that = (ChannelCreateInput) o;
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
     * A unique, human-readable identifier for the channel within the shop. For
     * example, `amazon-us-A1B2C3D4E5F6G7`. Used for lookups via [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle).
     * If not provided, auto-generated from the specification handle and account ID.
     * Must be unique across all channels on the shop.
     */
    private String handle;

    /**
     * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
     * to bind to this channel. The specification must have been deployed by the
     * calling application via `shopify app deploy`. Determines the channel's
     * regional coverage, capabilities, and requirements.
     */
    private String specificationHandle;

    /**
     * A unique identifier for the merchant's account on the external platform, such
     * as an Amazon Seller ID or Google Merchant Center ID. Used together with
     * `specificationHandle` to uniquely identify the channel connection.
     */
    private String accountId;

    /**
     * The merchant-facing name for the external account. Displayed in Shopify Admin
     * wherever the channel connection is referenced, such as in Markets and order
     * attribution. Should match how the merchant recognises the account on the
     * external platform.
     */
    private String accountName;

    public ChannelCreateInput build() {
      ChannelCreateInput result = new ChannelCreateInput();
      result.handle = this.handle;
      result.specificationHandle = this.specificationHandle;
      result.accountId = this.accountId;
      result.accountName = this.accountName;
      return result;
    }

    /**
     * A unique, human-readable identifier for the channel within the shop. For
     * example, `amazon-us-A1B2C3D4E5F6G7`. Used for lookups via [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle).
     * If not provided, auto-generated from the specification handle and account ID.
     * Must be unique across all channels on the shop.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
     * to bind to this channel. The specification must have been deployed by the
     * calling application via `shopify app deploy`. Determines the channel's
     * regional coverage, capabilities, and requirements.
     */
    public Builder specificationHandle(String specificationHandle) {
      this.specificationHandle = specificationHandle;
      return this;
    }

    /**
     * A unique identifier for the merchant's account on the external platform, such
     * as an Amazon Seller ID or Google Merchant Center ID. Used together with
     * `specificationHandle` to uniquely identify the channel connection.
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * The merchant-facing name for the external account. Displayed in Shopify Admin
     * wherever the channel connection is referenced, such as in Markets and order
     * attribution. Should match how the merchant recognises the account on the
     * external platform.
     */
    public Builder accountName(String accountName) {
      this.accountName = accountName;
      return this;
    }
  }
}
