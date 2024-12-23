package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EditablePropertyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EditablePropertyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("EditableProperty"));
  }

  public EditablePropertyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EditablePropertyProjection<PARENT, ROOT> locked() {
    getFields().put("locked", null);
    return this;
  }

  public EditablePropertyProjection<PARENT, ROOT> reason() {
    getFields().put("reason", null);
    return this;
  }
}
