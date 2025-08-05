package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ExchangeLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ExchangeLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeLineItem"));
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<ExchangeLineItemFragmentProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<ExchangeLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public LineItemProjection<ExchangeLineItemFragmentProjection<PARENT, ROOT>, ROOT> lineItems() {
     LineItemProjection<ExchangeLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> processableQuantity() {
    getFields().put("processableQuantity", null);
    return this;
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> processedQuantity() {
    getFields().put("processedQuantity", null);
    return this;
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> unprocessedQuantity() {
    getFields().put("unprocessedQuantity", null);
    return this;
  }

  public ExchangeLineItemFragmentProjection<PARENT, ROOT> variantId() {
    getFields().put("variantId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ExchangeLineItem {");
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
