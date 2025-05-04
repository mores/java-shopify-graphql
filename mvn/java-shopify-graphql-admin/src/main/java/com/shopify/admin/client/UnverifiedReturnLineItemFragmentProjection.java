package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class UnverifiedReturnLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public UnverifiedReturnLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UnverifiedReturnLineItem"));
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnReasonProjection<UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> returnReason(
      ) {
     ReturnReasonProjection<UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnReasonProjection<>(this, getRoot());
     getFields().put("returnReason", projection);
     return projection;
  }

  public MoneyV2Projection<UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> unitPrice(
      ) {
     MoneyV2Projection<UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitPrice", projection);
     return projection;
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> customerNote() {
    getFields().put("customerNote", null);
    return this;
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> refundedQuantity() {
    getFields().put("refundedQuantity", null);
    return this;
  }

  public UnverifiedReturnLineItemFragmentProjection<PARENT, ROOT> returnReasonNote() {
    getFields().put("returnReasonNote", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on UnverifiedReturnLineItem {");
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
