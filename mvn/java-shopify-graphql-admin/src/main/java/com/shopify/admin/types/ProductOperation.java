package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An interface representing asynchronous operations on products. Tracks the status
 * and details of background product mutations like `productSet`, `productDelete`,
 * `productDuplicate`, and `productBundle` operations. Provides status field
 * (CREATED, ACTIVE, COMPLETE) and product field to monitor long-running product operations.
 */
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
  /**
   * The product on which the operation is being performed.
   */
  Product getProduct();

  /**
   * The status of this operation.
   */
  ProductOperationStatus getStatus();
}
