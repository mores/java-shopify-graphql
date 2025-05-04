package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `publishableUnpublishToCurrentChannel` mutation.
 */
public class PublishableUnpublishToCurrentChannelPayload {
  /**
   * Resource that has been unpublished.
   */
  private Publishable publishable;

  /**
   * The user's shop.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public PublishableUnpublishToCurrentChannelPayload() {
  }

  /**
   * Resource that has been unpublished.
   */
  public Publishable getPublishable() {
    return publishable;
  }

  public void setPublishable(Publishable publishable) {
    this.publishable = publishable;
  }

  /**
   * The user's shop.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PublishableUnpublishToCurrentChannelPayload{publishable='" + publishable + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishableUnpublishToCurrentChannelPayload that = (PublishableUnpublishToCurrentChannelPayload) o;
    return Objects.equals(publishable, that.publishable) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishable, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Resource that has been unpublished.
     */
    private Publishable publishable;

    /**
     * The user's shop.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public PublishableUnpublishToCurrentChannelPayload build() {
      PublishableUnpublishToCurrentChannelPayload result = new PublishableUnpublishToCurrentChannelPayload();
      result.publishable = this.publishable;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Resource that has been unpublished.
     */
    public Builder publishable(Publishable publishable) {
      this.publishable = publishable;
      return this;
    }

    /**
     * The user's shop.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
