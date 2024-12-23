package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LineItemGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemGroup"));
  }

  public LineItemGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<LineItemGroupProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<LineItemGroupProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public LineItemGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LineItemGroupProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public LineItemGroupProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LineItemGroupProjection<PARENT, ROOT> variantId() {
    getFields().put("variantId", null);
    return this;
  }

  public LineItemGroupProjection<PARENT, ROOT> variantSku() {
    getFields().put("variantSku", null);
    return this;
  }
}
