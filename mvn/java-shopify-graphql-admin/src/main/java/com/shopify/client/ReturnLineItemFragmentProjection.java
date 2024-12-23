package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ReturnLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReturnLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItem"));
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentLineItemProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItem(
      ) {
     FulfillmentLineItemProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItem", projection);
     return projection;
  }

  public RestockingFeeProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> restockingFee(
      ) {
     RestockingFeeProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new RestockingFeeProjection<>(this, getRoot());
     getFields().put("restockingFee", projection);
     return projection;
  }

  public ReturnReasonProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> returnReason(
      ) {
     ReturnReasonProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonProjection<>(this, getRoot());
     getFields().put("returnReason", projection);
     return projection;
  }

  public WeightProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> totalWeight() {
     WeightProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("totalWeight", projection);
     return projection;
  }

  public MoneyBagProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> withCodeDiscountedTotalPriceSet(
      ) {
     MoneyBagProjection<ReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("withCodeDiscountedTotalPriceSet", projection);
     return projection;
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> customerNote() {
    getFields().put("customerNote", null);
    return this;
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> refundedQuantity() {
    getFields().put("refundedQuantity", null);
    return this;
  }

  public ReturnLineItemFragmentProjection<PARENT, ROOT> returnReasonNote() {
    getFields().put("returnReasonNote", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReturnLineItem {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
