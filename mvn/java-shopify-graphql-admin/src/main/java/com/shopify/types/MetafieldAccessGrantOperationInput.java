package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for possible operations for modifying access grants. Exactly one option is required.
 *
 * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
 */
public class MetafieldAccessGrantOperationInput {
  /**
   * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
   *   
   * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
   */
  private MetafieldAccessGrantInput create;

  /**
   * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
   *   
   * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
   */
  private MetafieldAccessGrantInput update;

  /**
   * The input fields for an explicit access grant to be deleted for the metafields under this definition.
   */
  private MetafieldAccessGrantDeleteInput delete;

  public MetafieldAccessGrantOperationInput() {
  }

  /**
   * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
   *   
   * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
   */
  public MetafieldAccessGrantInput getCreate() {
    return create;
  }

  public void setCreate(MetafieldAccessGrantInput create) {
    this.create = create;
  }

  /**
   * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
   *   
   * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
   */
  public MetafieldAccessGrantInput getUpdate() {
    return update;
  }

  public void setUpdate(MetafieldAccessGrantInput update) {
    this.update = update;
  }

  /**
   * The input fields for an explicit access grant to be deleted for the metafields under this definition.
   */
  public MetafieldAccessGrantDeleteInput getDelete() {
    return delete;
  }

  public void setDelete(MetafieldAccessGrantDeleteInput delete) {
    this.delete = delete;
  }

  @Override
  public String toString() {
    return "MetafieldAccessGrantOperationInput{create='" + create + "', update='" + update + "', delete='" + delete + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessGrantOperationInput that = (MetafieldAccessGrantOperationInput) o;
    return Objects.equals(create, that.create) &&
        Objects.equals(update, that.update) &&
        Objects.equals(delete, that.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, update, delete);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
     *   
     * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
     */
    private MetafieldAccessGrantInput create;

    /**
     * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
     *   
     * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
     */
    private MetafieldAccessGrantInput update;

    /**
     * The input fields for an explicit access grant to be deleted for the metafields under this definition.
     */
    private MetafieldAccessGrantDeleteInput delete;

    public MetafieldAccessGrantOperationInput build() {
      MetafieldAccessGrantOperationInput result = new MetafieldAccessGrantOperationInput();
      result.create = this.create;
      result.update = this.update;
      result.delete = this.delete;
      return result;
    }

    /**
     * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
     *   
     * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
     */
    public Builder create(MetafieldAccessGrantInput create) {
      this.create = create;
      return this;
    }

    /**
     * The input fields for an explicit access grant to be created or updated for the metafields under this definition.
     *   
     * Explicit grants are [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafields).
     */
    public Builder update(MetafieldAccessGrantInput update) {
      this.update = update;
      return this;
    }

    /**
     * The input fields for an explicit access grant to be deleted for the metafields under this definition.
     */
    public Builder delete(MetafieldAccessGrantDeleteInput delete) {
      this.delete = delete;
      return this;
    }
  }
}
