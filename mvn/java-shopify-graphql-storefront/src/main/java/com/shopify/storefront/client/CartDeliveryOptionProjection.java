package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryOption"));
  }

  public CartDeliveryOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodTypeProjection<CartDeliveryOptionProjection<PARENT, ROOT>, ROOT> deliveryMethodType(
      ) {
     DeliveryMethodTypeProjection<CartDeliveryOptionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodTypeProjection<>(this, getRoot());
     getFields().put("deliveryMethodType", projection);
     return projection;
  }

  public MoneyV2Projection<CartDeliveryOptionProjection<PARENT, ROOT>, ROOT> estimatedCost() {
     MoneyV2Projection<CartDeliveryOptionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("estimatedCost", projection);
     return projection;
  }

  public CartDeliveryOptionProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public CartDeliveryOptionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CartDeliveryOptionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public CartDeliveryOptionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
