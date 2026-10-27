package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPoliciesEditRulesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPoliciesEditRulesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPoliciesEditRules"));
  }

  public ReturnPoliciesEditRulesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPoliciesEditRulesProjection<PARENT, ROOT> canAcceptEdits() {
    getFields().put("canAcceptEdits", null);
    return this;
  }

  public ReturnPoliciesEditRulesProjection<PARENT, ROOT> editWindowMinutes() {
    getFields().put("editWindowMinutes", null);
    return this;
  }
}
