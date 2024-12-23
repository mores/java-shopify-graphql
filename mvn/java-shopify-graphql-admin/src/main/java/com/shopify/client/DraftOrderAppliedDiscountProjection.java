package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderAppliedDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderAppliedDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderAppliedDiscount"));
  }

  public DraftOrderAppliedDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<DraftOrderAppliedDiscountProjection<PARENT, ROOT>, ROOT> amountSet() {
     MoneyBagProjection<DraftOrderAppliedDiscountProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amountSet", projection);
     return projection;
  }

  public MoneyV2Projection<DraftOrderAppliedDiscountProjection<PARENT, ROOT>, ROOT> amountV2() {
     MoneyV2Projection<DraftOrderAppliedDiscountProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountV2", projection);
     return projection;
  }

  public DraftOrderAppliedDiscountTypeProjection<DraftOrderAppliedDiscountProjection<PARENT, ROOT>, ROOT> valueType(
      ) {
     DraftOrderAppliedDiscountTypeProjection<DraftOrderAppliedDiscountProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountTypeProjection<>(this, getRoot());
     getFields().put("valueType", projection);
     return projection;
  }

  public DraftOrderAppliedDiscountProjection<PARENT, ROOT> amount() {
    getFields().put("amount", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
