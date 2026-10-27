package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An app together with the shareable collection sources it publishes for the shop.
 */
public class CollectionConditionsSourcesByApp {
  /**
   * The app that publishes the collection sources.
   */
  private App app;

  /**
   * The shareable collection sources owned by this app.
   */
  private CollectionConditionsSourceConnection sources;

  public CollectionConditionsSourcesByApp() {
  }

  /**
   * The app that publishes the collection sources.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The shareable collection sources owned by this app.
   */
  public CollectionConditionsSourceConnection getSources() {
    return sources;
  }

  public void setSources(CollectionConditionsSourceConnection sources) {
    this.sources = sources;
  }

  @Override
  public String toString() {
    return "CollectionConditionsSourcesByApp{app='" + app + "', sources='" + sources + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionConditionsSourcesByApp that = (CollectionConditionsSourcesByApp) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(sources, that.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, sources);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app that publishes the collection sources.
     */
    private App app;

    /**
     * The shareable collection sources owned by this app.
     */
    private CollectionConditionsSourceConnection sources;

    public CollectionConditionsSourcesByApp build() {
      CollectionConditionsSourcesByApp result = new CollectionConditionsSourcesByApp();
      result.app = this.app;
      result.sources = this.sources;
      return result;
    }

    /**
     * The app that publishes the collection sources.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The shareable collection sources owned by this app.
     */
    public Builder sources(CollectionConditionsSourceConnection sources) {
      this.sources = sources;
      return this;
    }
  }
}
