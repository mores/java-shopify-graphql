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
    @JsonSubTypes.Type(value = RestockingFee.class, name = "RestockingFee"),
    @JsonSubTypes.Type(value = ReturnShippingFee.class, name = "ReturnShippingFee")
})
public interface Fee {
  
  String getId();
}
