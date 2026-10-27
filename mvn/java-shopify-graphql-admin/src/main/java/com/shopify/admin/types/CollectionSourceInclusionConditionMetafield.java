package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A condition that determines which products should be included in a collection.
 *
 * This is an interface implemented by a concrete type per condition kind (for example,
 * `CollectionSourceInclusionConditionProductTag` or `CollectionSourceInclusionConditionVariantTitle`).
 * Fields such as `relation` are defined on each concrete type and return a type-specific enum (for example,
 * `CollectionSourceInclusionConditionProductTagRelation` versus
 * `CollectionSourceInclusionConditionVariantTitleRelation`). Conditions are mutually exclusive concrete
 * types, but may contain overlapping field names such as `relation`. If your GraphQL tooling flags these
 * as ambiguous, give each field a distinct alias (for example, `tagRelation: relation` and
 * `variantTitleRelation: relation`) or use inline fragments.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldBoolean.class, name = "CollectionSourceInclusionConditionMetafieldBoolean"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldDecimal.class, name = "CollectionSourceInclusionConditionMetafieldDecimal"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldInt.class, name = "CollectionSourceInclusionConditionMetafieldInt"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldInteger.class, name = "CollectionSourceInclusionConditionMetafieldInteger"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldMetaobject.class, name = "CollectionSourceInclusionConditionMetafieldMetaobject"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldMetaobjectList.class, name = "CollectionSourceInclusionConditionMetafieldMetaobjectList"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldString.class, name = "CollectionSourceInclusionConditionMetafieldString"),
    @JsonSubTypes.Type(value = CollectionSourceInclusionConditionMetafieldStringList.class, name = "CollectionSourceInclusionConditionMetafieldStringList")
})
public interface CollectionSourceInclusionConditionMetafield {
  /**
   * The metafield definition to use for the condition.
   */
  MetafieldDefinition getDefinition();

  /**
   * The unique identifier for this condition.
   */
  String getId();
}
