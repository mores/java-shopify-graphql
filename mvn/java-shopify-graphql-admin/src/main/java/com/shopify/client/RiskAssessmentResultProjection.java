package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RiskAssessmentResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RiskAssessmentResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RiskAssessmentResult"));
  }

  public RiskAssessmentResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
