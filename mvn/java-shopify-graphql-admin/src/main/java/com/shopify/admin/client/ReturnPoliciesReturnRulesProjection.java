package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPoliciesReturnRulesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPoliciesReturnRulesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPoliciesReturnRules"));
  }

  public ReturnPoliciesReturnRulesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPoliciesReturnWindowStartingFromProjection<ReturnPoliciesReturnRulesProjection<PARENT, ROOT>, ROOT> returnWindowStartingFrom(
      ) {
     ReturnPoliciesReturnWindowStartingFromProjection<ReturnPoliciesReturnRulesProjection<PARENT, ROOT>, ROOT> projection = new ReturnPoliciesReturnWindowStartingFromProjection<>(this, getRoot());
     getFields().put("returnWindowStartingFrom", projection);
     return projection;
  }

  public ReturnPoliciesReturnRulesProjection<PARENT, ROOT> canAcceptReturns() {
    getFields().put("canAcceptReturns", null);
    return this;
  }

  public ReturnPoliciesReturnRulesProjection<PARENT, ROOT> extendWindowToBusinessDay() {
    getFields().put("extendWindowToBusinessDay", null);
    return this;
  }

  public ReturnPoliciesReturnRulesProjection<PARENT, ROOT> returnWindowDays() {
    getFields().put("returnWindowDays", null);
    return this;
  }
}
