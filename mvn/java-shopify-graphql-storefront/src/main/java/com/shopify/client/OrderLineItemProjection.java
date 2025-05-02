package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderLineItem"));
  }

  public OrderLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<OrderLineItemProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<OrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationProjection<OrderLineItemProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<OrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<OrderLineItemProjection<PARENT, ROOT>, ROOT> discountedTotalPrice() {
     MoneyV2Projection<OrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedTotalPrice", projection);
     return projection;
  }

  public MoneyV2Projection<OrderLineItemProjection<PARENT, ROOT>, ROOT> originalTotalPrice() {
     MoneyV2Projection<OrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotalPrice", projection);
     return projection;
  }

  public ProductVariantProjection<OrderLineItemProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<OrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public OrderLineItemProjection<PARENT, ROOT> currentQuantity() {
    getFields().put("currentQuantity", null);
    return this;
  }

  public OrderLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public OrderLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
