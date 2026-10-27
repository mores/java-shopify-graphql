package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Tracks the progress of an asynchronous shipping label purchase request.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShippingLabelPurchaseResult implements com.shopify.admin.types.JobResult, com.shopify.admin.types.Node {
  /**
   * This indicates if the job is still queued or has been run.
   */
  private boolean done;

  /**
   * Purchase-processing errors for the request. Synchronous validation errors are
   * returned from the `shippingLabelPurchase` mutation's `userErrors` field instead.
   */
  private List<ShippingLabelPurchaseError> errors;

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  private String id;

  /**
   * The shipping labels created by the purchase request. Labels are returned only after successful purchase.
   */
  private List<ShippingLabel> shippingLabels;

  /**
   * The current purchase status. A purchase starts as `PENDING_PURCHASE` and ends as either `PURCHASED` or `PURCHASE_FAILED`.
   */
  private ShippingLabelPurchaseResultStatus status;

  public ShippingLabelPurchaseResult() {
  }

  /**
   * This indicates if the job is still queued or has been run.
   */
  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  /**
   * Purchase-processing errors for the request. Synchronous validation errors are
   * returned from the `shippingLabelPurchase` mutation's `userErrors` field instead.
   */
  public List<ShippingLabelPurchaseError> getErrors() {
    return errors;
  }

  public void setErrors(List<ShippingLabelPurchaseError> errors) {
    this.errors = errors;
  }

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The shipping labels created by the purchase request. Labels are returned only after successful purchase.
   */
  public List<ShippingLabel> getShippingLabels() {
    return shippingLabels;
  }

  public void setShippingLabels(List<ShippingLabel> shippingLabels) {
    this.shippingLabels = shippingLabels;
  }

  /**
   * The current purchase status. A purchase starts as `PENDING_PURCHASE` and ends as either `PURCHASED` or `PURCHASE_FAILED`.
   */
  public ShippingLabelPurchaseResultStatus getStatus() {
    return status;
  }

  public void setStatus(ShippingLabelPurchaseResultStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ShippingLabelPurchaseResult{done='" + done + "', errors='" + errors + "', id='" + id + "', shippingLabels='" + shippingLabels + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLabelPurchaseResult that = (ShippingLabelPurchaseResult) o;
    return done == that.done &&
        Objects.equals(errors, that.errors) &&
        Objects.equals(id, that.id) &&
        Objects.equals(shippingLabels, that.shippingLabels) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, errors, id, shippingLabels, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * This indicates if the job is still queued or has been run.
     */
    private boolean done;

    /**
     * Purchase-processing errors for the request. Synchronous validation errors are
     * returned from the `shippingLabelPurchase` mutation's `userErrors` field instead.
     */
    private List<ShippingLabelPurchaseError> errors;

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    private String id;

    /**
     * The shipping labels created by the purchase request. Labels are returned only after successful purchase.
     */
    private List<ShippingLabel> shippingLabels;

    /**
     * The current purchase status. A purchase starts as `PENDING_PURCHASE` and ends as either `PURCHASED` or `PURCHASE_FAILED`.
     */
    private ShippingLabelPurchaseResultStatus status;

    public ShippingLabelPurchaseResult build() {
      ShippingLabelPurchaseResult result = new ShippingLabelPurchaseResult();
      result.done = this.done;
      result.errors = this.errors;
      result.id = this.id;
      result.shippingLabels = this.shippingLabels;
      result.status = this.status;
      return result;
    }

    /**
     * This indicates if the job is still queued or has been run.
     */
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    /**
     * Purchase-processing errors for the request. Synchronous validation errors are
     * returned from the `shippingLabelPurchase` mutation's `userErrors` field instead.
     */
    public Builder errors(List<ShippingLabelPurchaseError> errors) {
      this.errors = errors;
      return this;
    }

    /**
     * A globally-unique ID that's returned when running an asynchronous mutation.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The shipping labels created by the purchase request. Labels are returned only after successful purchase.
     */
    public Builder shippingLabels(List<ShippingLabel> shippingLabels) {
      this.shippingLabels = shippingLabels;
      return this;
    }

    /**
     * The current purchase status. A purchase starts as `PENDING_PURCHASE` and ends as either `PURCHASED` or `PURCHASE_FAILED`.
     */
    public Builder status(ShippingLabelPurchaseResultStatus status) {
      this.status = status;
      return this;
    }
  }
}
