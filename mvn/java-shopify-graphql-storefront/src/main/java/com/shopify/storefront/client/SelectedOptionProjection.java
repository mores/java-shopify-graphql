package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SelectedOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SelectedOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SelectedOption"));
  }

  public SelectedOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SelectedOptionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public SelectedOptionProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
