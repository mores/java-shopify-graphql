package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class LineItemGroupFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public LineItemGroupFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemGroup"));
  }

  public LineItemGroupFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<LineItemGroupFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<LineItemGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public LineItemGroupFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LineItemGroupFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public LineItemGroupFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LineItemGroupFragmentProjection<PARENT, ROOT> variantId() {
    getFields().put("variantId", null);
    return this;
  }

  public LineItemGroupFragmentProjection<PARENT, ROOT> variantSku() {
    getFields().put("variantSku", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on LineItemGroup {");
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
