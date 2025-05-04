package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DisputeEvidenceUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DisputeEvidenceUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DisputeEvidenceUpdateUserError"));
  }

  public DisputeEvidenceUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DisputeEvidenceUpdateUserErrorCodeProjection<DisputeEvidenceUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DisputeEvidenceUpdateUserErrorCodeProjection<DisputeEvidenceUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new DisputeEvidenceUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DisputeEvidenceUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DisputeEvidenceUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
