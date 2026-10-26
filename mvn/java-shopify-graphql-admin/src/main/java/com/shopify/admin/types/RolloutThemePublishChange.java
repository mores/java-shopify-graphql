package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A rollout treatment change that publishes a theme for the buyers the treatment
 * serves, without changing the shop's globally published theme. Returned by [`RolloutTreatment.changes`](https://shopify.dev/docs/api/admin-graphql/latest/objects/RolloutTreatment#field-RolloutTreatment.fields.changes).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RolloutThemePublishChange implements com.shopify.admin.types.RolloutChange, com.shopify.admin.types.RolloutThemeChange {
  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  private String id;

  /**
   * The theme that the change applies to. Returns `null` when the theme has been deleted or the caller can't read it.
   */
  private OnlineStoreTheme theme;

  public RolloutThemePublishChange() {
  }

  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The theme that the change applies to. Returns `null` when the theme has been deleted or the caller can't read it.
   */
  public OnlineStoreTheme getTheme() {
    return theme;
  }

  public void setTheme(OnlineStoreTheme theme) {
    this.theme = theme;
  }

  @Override
  public String toString() {
    return "RolloutThemePublishChange{id='" + id + "', theme='" + theme + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RolloutThemePublishChange that = (RolloutThemePublishChange) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(theme, that.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, theme);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    private String id;

    /**
     * The theme that the change applies to. Returns `null` when the theme has been deleted or the caller can't read it.
     */
    private OnlineStoreTheme theme;

    public RolloutThemePublishChange build() {
      RolloutThemePublishChange result = new RolloutThemePublishChange();
      result.id = this.id;
      result.theme = this.theme;
      return result;
    }

    /**
     * A globally unique ID for this change, not the resource it affects.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The theme that the change applies to. Returns `null` when the theme has been deleted or the caller can't read it.
     */
    public Builder theme(OnlineStoreTheme theme) {
      this.theme = theme;
      return this;
    }
  }
}
