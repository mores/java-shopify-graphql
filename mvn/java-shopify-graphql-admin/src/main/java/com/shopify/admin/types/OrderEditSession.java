package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An edit session for an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderEditSession implements com.shopify.admin.types.Node {
  /**
   * The unique ID of the order edit session.
   */
  private String id;

  public OrderEditSession() {
  }

  /**
   * The unique ID of the order edit session.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "OrderEditSession{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderEditSession that = (OrderEditSession) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique ID of the order edit session.
     */
    private String id;

    public OrderEditSession build() {
      OrderEditSession result = new OrderEditSession();
      result.id = this.id;
      return result;
    }

    /**
     * The unique ID of the order edit session.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
