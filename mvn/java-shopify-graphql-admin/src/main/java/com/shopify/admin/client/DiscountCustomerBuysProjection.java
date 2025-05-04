package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCustomerBuysProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCustomerBuysProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCustomerBuys"));
  }

  public DiscountCustomerBuysProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountItemsProjection<DiscountCustomerBuysProjection<PARENT, ROOT>, ROOT> items() {
     DiscountItemsProjection<DiscountCustomerBuysProjection<PARENT, ROOT>, ROOT> projection = new DiscountItemsProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public DiscountCustomerBuysValueProjection<DiscountCustomerBuysProjection<PARENT, ROOT>, ROOT> value(
      ) {
     DiscountCustomerBuysValueProjection<DiscountCustomerBuysProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerBuysValueProjection<>(this, getRoot());
     getFields().put("value", projection);
     return projection;
  }

  public DiscountCustomerBuysProjection<PARENT, ROOT> isOneTimePurchase() {
    getFields().put("isOneTimePurchase", null);
    return this;
  }

  public DiscountCustomerBuysProjection<PARENT, ROOT> isSubscription() {
    getFields().put("isSubscription", null);
    return this;
  }
}
