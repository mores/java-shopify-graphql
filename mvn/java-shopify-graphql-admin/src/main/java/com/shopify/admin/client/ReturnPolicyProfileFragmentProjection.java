package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ReturnPolicyProfileFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReturnPolicyProfileFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPolicyProfile"));
  }

  public ReturnPolicyProfileFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPoliciesEditRulesProjection<ReturnPolicyProfileFragmentProjection<PARENT, ROOT>, ROOT> editRules(
      ) {
     ReturnPoliciesEditRulesProjection<ReturnPolicyProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnPoliciesEditRulesProjection<>(this, getRoot());
     getFields().put("editRules", projection);
     return projection;
  }

  public MarketProjection<ReturnPolicyProfileFragmentProjection<PARENT, ROOT>, ROOT> markets() {
     MarketProjection<ReturnPolicyProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public ReturnPoliciesReturnRulesProjection<ReturnPolicyProfileFragmentProjection<PARENT, ROOT>, ROOT> returnRules(
      ) {
     ReturnPoliciesReturnRulesProjection<ReturnPolicyProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnPoliciesReturnRulesProjection<>(this, getRoot());
     getFields().put("returnRules", projection);
     return projection;
  }

  public ReturnPolicyProfileFragmentProjection<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public ReturnPolicyProfileFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnPolicyProfileFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnPolicyProfileFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReturnPolicyProfile {");
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
