package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItemType"));
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnReasonProjection<ReturnLineItemTypeProjection<PARENT, ROOT>, ROOT> returnReason() {
     ReturnReasonProjection<ReturnLineItemTypeProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonProjection<>(this, getRoot());
     getFields().put("returnReason", projection);
     return projection;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> customerNote() {
    getFields().put("customerNote", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> processableQuantity() {
    getFields().put("processableQuantity", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> processedQuantity() {
    getFields().put("processedQuantity", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> refundedQuantity() {
    getFields().put("refundedQuantity", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> returnReasonNote() {
    getFields().put("returnReasonNote", null);
    return this;
  }

  public ReturnLineItemTypeProjection<PARENT, ROOT> unprocessedQuantity() {
    getFields().put("unprocessedQuantity", null);
    return this;
  }

  public ReturnLineItemFragmentProjection<ReturnLineItemTypeProjection<PARENT, ROOT>, ROOT> onReturnLineItem(
      ) {
    ReturnLineItemFragmentProjection<ReturnLineItemTypeProjection<PARENT, ROOT>, ROOT> fragment = new ReturnLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public UnverifiedReturnLineItemFragmentProjection<ReturnLineItemTypeProjection<PARENT, ROOT>, ROOT> onUnverifiedReturnLineItem(
      ) {
    UnverifiedReturnLineItemFragmentProjection<ReturnLineItemTypeProjection<PARENT, ROOT>, ROOT> fragment = new UnverifiedReturnLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
