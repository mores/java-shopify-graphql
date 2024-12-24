package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderDisputeSummary implements com.shopify.types.Node {
  
  private String id;

  
  private DisputeType initiatedAs;

  
  private DisputeStatus status;

  public OrderDisputeSummary() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public DisputeType getInitiatedAs() {
    return initiatedAs;
  }

  public void setInitiatedAs(DisputeType initiatedAs) {
    this.initiatedAs = initiatedAs;
  }

  
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
    
    private String id;

    
    private DisputeType initiatedAs;

    
    private DisputeStatus status;

    public OrderDisputeSummary build() {
      OrderDisputeSummary result = new OrderDisputeSummary();
      result.id = this.id;
      result.initiatedAs = this.initiatedAs;
      result.status = this.status;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder initiatedAs(DisputeType initiatedAs) {
      this.initiatedAs = initiatedAs;
      return this;
    }

    
    public Builder status(DisputeStatus status) {
      this.status = status;
      return this;
    }
  }
}
