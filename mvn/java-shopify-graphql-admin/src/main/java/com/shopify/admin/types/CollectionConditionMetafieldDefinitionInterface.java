package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.util.List;

/**
 * Common fields exposed by every metafield definition usable as a collection condition.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CollectionConditionBasicMetafieldDefinition.class, name = "CollectionConditionBasicMetafieldDefinition"),
    @JsonSubTypes.Type(value = CollectionConditionMetaobjectMetafieldDefinition.class, name = "CollectionConditionMetaobjectMetafieldDefinition")
})
public interface CollectionConditionMetafieldDefinitionInterface {
  /**
   * The description of the metafield definition.
   */
  String getDescription();

  /**
   * The ID of the underlying metafield definition.
   */
  String getId();

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  String getKey();

  /**
   * The human-readable name of the metafield definition.
   */
  String getName();

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  String getNamespace();

  /**
   * The resource type that the metafield definition is attached to.
   */
  MetafieldOwnerType getOwnerType();

  /**
   * The data type of the metafield definition.
   */
  MetafieldDefinitionType getType();

  /**
   * A list of validation options for the metafields that belong to the metafield definition.
   */
  List<MetafieldDefinitionValidation> getValidations();
}
