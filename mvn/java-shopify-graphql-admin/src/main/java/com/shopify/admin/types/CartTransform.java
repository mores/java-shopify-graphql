package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A deployed cart transformation function that actively modifies how products
 * appear and behave in customer carts. Cart transforms enable sophisticated
 * merchandising strategies by programmatically merging, expanding, or updating
 * cart line items based on custom business logic.
 *
 * Use the `CartTransform` object to:
 * - Monitor active bundling and cart modification logic
 * - Track transform function deployment status and configuration
 * - Manage error handling behavior for cart processing failures
 * - Coordinate multiple transforms when running complex merchandising strategies
 * - Analyze transform performance and customer interaction patterns
 *
 * Each cart transform links to a specific [Shopify
 * Function](https://shopify.dev/docs/apps/build/functions) that contains the
 * actual cart modification logic. The `blockOnFailure` setting determines whether
 * cart processing should halt when the transform encounters errors, or whether it
 * should allow customers to proceed with unmodified carts. This flexibility
 * ensures merchants can balance feature richness with checkout reliability.
 *
 * Transform functions operate during cart updates, product additions, and checkout
 * initiation, providing multiple touchpoints to enhance the shopping experience.
 * They integrate seamlessly with existing cart APIs while extending functionality
 * beyond standard product catalog capabilities.
 *
 * The function ID connects to your deployed function code, while the configuration
 * settings control how the transform behaves in different scenarios. Multiple
 * transforms can work together, processing cart modifications in sequence to
 * support complex merchandising workflows.
 *
 * Learn more about [customized bundles](https://shopify.dev/docs/apps/selling-strategies/bundles/add-a-customized-bundle),
 * and about the [Cart Transform Function
 * API](https://shopify.dev/docs/api/functions/latest/cart-transform).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartTransform implements com.shopify.admin.types.HasMetafields, com.shopify.admin.types.Node {
  /**
   * Whether a run failure will block cart and checkout operations.
   */
  private boolean blockOnFailure;

  /**
   * The ID for the Cart Transform function.
   */
  private String functionId;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  public CartTransform() {
  }

  /**
   * Whether a run failure will block cart and checkout operations.
   */
  public boolean getBlockOnFailure() {
    return blockOnFailure;
  }

  public void setBlockOnFailure(boolean blockOnFailure) {
    this.blockOnFailure = blockOnFailure;
  }

  /**
   * The ID for the Cart Transform function.
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
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
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "CartTransform{blockOnFailure='" + blockOnFailure + "', functionId='" + functionId + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransform that = (CartTransform) o;
    return blockOnFailure == that.blockOnFailure &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockOnFailure, functionId, id, metafield, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether a run failure will block cart and checkout operations.
     */
    private boolean blockOnFailure;

    /**
     * The ID for the Cart Transform function.
     */
    private String functionId;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    public CartTransform build() {
      CartTransform result = new CartTransform();
      result.blockOnFailure = this.blockOnFailure;
      result.functionId = this.functionId;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * Whether a run failure will block cart and checkout operations.
     */
    public Builder blockOnFailure(boolean blockOnFailure) {
      this.blockOnFailure = blockOnFailure;
      return this;
    }

    /**
     * The ID for the Cart Transform function.
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
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
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
