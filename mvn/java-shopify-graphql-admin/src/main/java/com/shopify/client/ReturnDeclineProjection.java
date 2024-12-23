package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnDeclineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnDeclineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnDecline"));
  }

  public ReturnDeclineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnDeclineReasonProjection<ReturnDeclineProjection<PARENT, ROOT>, ROOT> reason() {
     ReturnDeclineReasonProjection<ReturnDeclineProjection<PARENT, ROOT>, ROOT> projection = new ReturnDeclineReasonProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public ReturnDeclineProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
