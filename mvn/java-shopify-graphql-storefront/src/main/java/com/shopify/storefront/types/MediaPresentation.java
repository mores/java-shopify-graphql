package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A media presentation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MediaPresentation implements com.shopify.storefront.types.Node {
  /**
   * A JSON object representing a presentation view.
   */
  private String asJson;

  /**
   * A globally-unique ID.
   */
  private String id;

  public MediaPresentation() {
  }

  /**
   * A JSON object representing a presentation view.
   */
  public String getAsJson() {
    return asJson;
  }

  public void setAsJson(String asJson) {
    this.asJson = asJson;
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

  @Override
  public String toString() {
    return "MediaPresentation{asJson='" + asJson + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaPresentation that = (MediaPresentation) o;
    return Objects.equals(asJson, that.asJson) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asJson, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A JSON object representing a presentation view.
     */
    private String asJson;

    /**
     * A globally-unique ID.
     */
    private String id;

    public MediaPresentation build() {
      MediaPresentation result = new MediaPresentation();
      result.asJson = this.asJson;
      result.id = this.id;
      return result;
    }

    /**
     * A JSON object representing a presentation view.
     */
    public Builder asJson(String asJson) {
      this.asJson = asJson;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
