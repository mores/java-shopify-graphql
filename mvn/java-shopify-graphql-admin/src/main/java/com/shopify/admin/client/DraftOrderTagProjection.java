package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderTagProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderTagProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderTag"));
  }

  public DraftOrderTagProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderTagProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public DraftOrderTagProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderTagProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
