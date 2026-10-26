package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A rollout treatment change that applies to a theme. The concrete type identifies
 * the operation applied to the buyers the treatment serves.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = RolloutThemePublishChange.class, name = "RolloutThemePublishChange"))
public interface RolloutThemeChange {
  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  String getId();

  /**
   * The theme that the change applies to. Returns `null` when the theme has been deleted or the caller can't read it.
   */
  OnlineStoreTheme getTheme();
}
