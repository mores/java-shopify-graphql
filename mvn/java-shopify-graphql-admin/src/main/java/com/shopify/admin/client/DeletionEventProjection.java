package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeletionEventProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeletionEventProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeletionEvent"));
  }

  public DeletionEventProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeletionEventSubjectTypeProjection<DeletionEventProjection<PARENT, ROOT>, ROOT> subjectType(
      ) {
     DeletionEventSubjectTypeProjection<DeletionEventProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventSubjectTypeProjection<>(this, getRoot());
     getFields().put("subjectType", projection);
     return projection;
  }

  public DeletionEventProjection<PARENT, ROOT> occurredAt() {
    getFields().put("occurredAt", null);
    return this;
  }

  public DeletionEventProjection<PARENT, ROOT> subjectId() {
    getFields().put("subjectId", null);
    return this;
  }
}
