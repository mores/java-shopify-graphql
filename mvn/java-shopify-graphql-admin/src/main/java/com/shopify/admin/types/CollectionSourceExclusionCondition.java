package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A condition that determines which products should be excluded from a collection.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CollectionSourceExclusionConditionCollection.class, name = "CollectionSourceExclusionConditionCollection"),
    @JsonSubTypes.Type(value = CollectionSourceExclusionConditionProductCategory.class, name = "CollectionSourceExclusionConditionProductCategory"),
    @JsonSubTypes.Type(value = CollectionSourceExclusionConditionProductTag.class, name = "CollectionSourceExclusionConditionProductTag"),
    @JsonSubTypes.Type(value = CollectionSourceExclusionConditionProductType.class, name = "CollectionSourceExclusionConditionProductType"),
    @JsonSubTypes.Type(value = CollectionSourceExclusionConditionProductVendor.class, name = "CollectionSourceExclusionConditionProductVendor"),
    @JsonSubTypes.Type(value = CollectionSourceExclusionConditionUnknown.class, name = "CollectionSourceExclusionConditionUnknown")
})
public interface CollectionSourceExclusionCondition {
  /**
   * The unique identifier for this exclusion condition.
   */
  String getId();
}
