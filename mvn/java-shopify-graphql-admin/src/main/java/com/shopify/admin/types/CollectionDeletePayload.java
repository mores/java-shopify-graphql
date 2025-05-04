package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionDelete` mutation.
 */
public class CollectionDeletePayload {
  /**
   * The ID of the collection that was deleted. Returns `null` if the collection doesn't exist.
   */
  private String deletedCollectionId;

  /**
   * The shop associated with the collection.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CollectionDeletePayload() {
  }

  /**
   * The ID of the collection that was deleted. Returns `null` if the collection doesn't exist.
   */
  public String getDeletedCollectionId() {
    return deletedCollectionId;
  }

  public void setDeletedCollectionId(String deletedCollectionId) {
    this.deletedCollectionId = deletedCollectionId;
  }

  /**
   * The shop associated with the collection.
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
    return "CollectionDeletePayload{deletedCollectionId='" + deletedCollectionId + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionDeletePayload that = (CollectionDeletePayload) o;
    return Objects.equals(deletedCollectionId, that.deletedCollectionId) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCollectionId, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the collection that was deleted. Returns `null` if the collection doesn't exist.
     */
    private String deletedCollectionId;

    /**
     * The shop associated with the collection.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CollectionDeletePayload build() {
      CollectionDeletePayload result = new CollectionDeletePayload();
      result.deletedCollectionId = this.deletedCollectionId;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the collection that was deleted. Returns `null` if the collection doesn't exist.
     */
    public Builder deletedCollectionId(String deletedCollectionId) {
      this.deletedCollectionId = deletedCollectionId;
      return this;
    }

    /**
     * The shop associated with the collection.
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
