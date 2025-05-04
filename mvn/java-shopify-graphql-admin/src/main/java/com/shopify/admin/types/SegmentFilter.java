package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * The filters used in segment queries associated with a shop.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SegmentAssociationFilter.class, name = "SegmentAssociationFilter"),
    @JsonSubTypes.Type(value = SegmentBooleanFilter.class, name = "SegmentBooleanFilter"),
    @JsonSubTypes.Type(value = SegmentDateFilter.class, name = "SegmentDateFilter"),
    @JsonSubTypes.Type(value = SegmentEnumFilter.class, name = "SegmentEnumFilter"),
    @JsonSubTypes.Type(value = SegmentEventFilter.class, name = "SegmentEventFilter"),
    @JsonSubTypes.Type(value = SegmentFloatFilter.class, name = "SegmentFloatFilter"),
    @JsonSubTypes.Type(value = SegmentIntegerFilter.class, name = "SegmentIntegerFilter"),
    @JsonSubTypes.Type(value = SegmentStringFilter.class, name = "SegmentStringFilter")
})
public interface SegmentFilter {
  /**
   * The localized name of the filter.
   */
  String getLocalizedName();

  /**
   * Whether a file can have multiple values for a single customer.
   */
  boolean getMultiValue();

  /**
   * The query name of the filter.
   */
  String getQueryName();
}
