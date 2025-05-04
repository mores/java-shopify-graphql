package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderStagedChangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderStagedChangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChange"));
  }

  public OrderStagedChangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderStagedChangeAddCustomItemFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeAddCustomItem(
      ) {
    OrderStagedChangeAddCustomItemFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeAddCustomItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderStagedChangeAddLineItemDiscountFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeAddLineItemDiscount(
      ) {
    OrderStagedChangeAddLineItemDiscountFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeAddLineItemDiscountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderStagedChangeAddShippingLineFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeAddShippingLine(
      ) {
    OrderStagedChangeAddShippingLineFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeAddShippingLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderStagedChangeAddVariantFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeAddVariant(
      ) {
    OrderStagedChangeAddVariantFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeAddVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderStagedChangeDecrementItemFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeDecrementItem(
      ) {
    OrderStagedChangeDecrementItemFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeDecrementItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderStagedChangeIncrementItemFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeIncrementItem(
      ) {
    OrderStagedChangeIncrementItemFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeIncrementItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderStagedChangeRemoveShippingLineFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> onOrderStagedChangeRemoveShippingLine(
      ) {
    OrderStagedChangeRemoveShippingLineFragmentProjection<OrderStagedChangeProjection<PARENT, ROOT>, ROOT> fragment = new OrderStagedChangeRemoveShippingLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
