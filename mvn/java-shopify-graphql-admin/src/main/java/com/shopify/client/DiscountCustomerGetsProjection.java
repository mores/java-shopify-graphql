package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCustomerGetsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCustomerGetsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCustomerGets"));
  }

  public DiscountCustomerGetsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountItemsProjection<DiscountCustomerGetsProjection<PARENT, ROOT>, ROOT> items() {
     DiscountItemsProjection<DiscountCustomerGetsProjection<PARENT, ROOT>, ROOT> projection = new DiscountItemsProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public DiscountCustomerGetsValueProjection<DiscountCustomerGetsProjection<PARENT, ROOT>, ROOT> value(
      ) {
     DiscountCustomerGetsValueProjection<DiscountCustomerGetsProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerGetsValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public DiscountCustomerGetsProjection<PARENT, ROOT> appliesOnOneTimePurchase() {
    getFields().put("appliesOnOneTimePurchase", null);
    return this;
  }

  public DiscountCustomerGetsProjection<PARENT, ROOT> appliesOnSubscription() {
    getFields().put("appliesOnSubscription", null);
    return this;
  }
}
