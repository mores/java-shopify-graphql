package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductBundleOperation.class, name = "ProductBundleOperation"),
    @JsonSubTypes.Type(value = ProductDeleteOperation.class, name = "ProductDeleteOperation"),
    @JsonSubTypes.Type(value = ProductDuplicateOperation.class, name = "ProductDuplicateOperation"),
    @JsonSubTypes.Type(value = ProductSetOperation.class, name = "ProductSetOperation")
})
public interface ProductOperation {
  
  Product getProduct();

  
  ProductOperationStatus getStatus();
}
