package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A rollout treatment change that applies to a catalog. The concrete type
 * identifies the operation applied to the buyers the treatment serves.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = RolloutCatalogActivateChange.class, name = "RolloutCatalogActivateChange"),
    @JsonSubTypes.Type(value = RolloutCatalogDraftChange.class, name = "RolloutCatalogDraftChange")
})
public interface RolloutCatalogChange {
  /**
   * A globally unique ID for this change, not the resource it affects.
   */
  String getId();
}
