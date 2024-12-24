package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;


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
  
  String getLocalizedName();

  
  boolean getMultiValue();

  
  String getQueryName();
}
