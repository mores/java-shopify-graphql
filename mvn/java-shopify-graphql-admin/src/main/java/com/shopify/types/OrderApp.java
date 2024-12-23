package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The [application](https://shopify.dev/apps) that created the order.
 */
public class OrderApp {
  /**
   * The application icon.
   */
  private Image icon;

  /**
   * The application ID.
   */
  private String id;

  /**
   * The name of the application.
   */
  private String name;

  public OrderApp() {
  }

  /**
   * The application icon.
   */
  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }

  /**
   * The application ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the application.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "OrderApp{icon='" + icon + "', id='" + id + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderApp that = (OrderApp) o;
    return Objects.equals(icon, that.icon) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, id, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The application icon.
     */
    private Image icon;

    /**
     * The application ID.
     */
    private String id;

    /**
     * The name of the application.
     */
    private String name;

    public OrderApp build() {
      OrderApp result = new OrderApp();
      result.icon = this.icon;
      result.id = this.id;
      result.name = this.name;
      return result;
    }

    /**
     * The application icon.
     */
    public Builder icon(Image icon) {
      this.icon = icon;
      return this;
    }

    /**
     * The application ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the application.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
