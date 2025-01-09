package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A summary of the important details for a dispute on an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderDisputeSummary implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The type that the dispute was initiated as.
   */
  private DisputeType initiatedAs;

  /**
   * The current status of the dispute.
   */
  private DisputeStatus status;

  public OrderDisputeSummary() {
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
   * The type that the dispute was initiated as.
   */
  public DisputeType getInitiatedAs() {
    return initiatedAs;
  }

  public void setInitiatedAs(DisputeType initiatedAs) {
    this.initiatedAs = initiatedAs;
  }

  /**
   * The current status of the dispute.
   */
  public DisputeStatus getStatus() {
    return status;
  }

  public void setStatus(DisputeStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "OrderDisputeSummary{id='" + id + "', initiatedAs='" + initiatedAs + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderDisputeSummary that = (OrderDisputeSummary) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(initiatedAs, that.initiatedAs) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initiatedAs, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The type that the dispute was initiated as.
     */
    private DisputeType initiatedAs;

    /**
     * The current status of the dispute.
     */
    private DisputeStatus status;

    public OrderDisputeSummary build() {
      OrderDisputeSummary result = new OrderDisputeSummary();
      result.id = this.id;
      result.initiatedAs = this.initiatedAs;
      result.status = this.status;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The type that the dispute was initiated as.
     */
    public Builder initiatedAs(DisputeType initiatedAs) {
      this.initiatedAs = initiatedAs;
      return this;
    }

    /**
     * The current status of the dispute.
     */
    public Builder status(DisputeStatus status) {
      this.status = status;
      return this;
    }
  }
}
