package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilterOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilterOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FilterOption"));
  }

  public FilterOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FilterOptionProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }

  public FilterOptionProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
