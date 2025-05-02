package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayInstallmentsFinancingPlanTermProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayInstallmentsFinancingPlanTermProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsFinancingPlanTerm"));
  }

  public ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayInstallmentsFinancingPlanFrequencyProjection<ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT>, ROOT> frequency(
      ) {
     ShopPayInstallmentsFinancingPlanFrequencyProjection<ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsFinancingPlanFrequencyProjection<>(this, getRoot());
     getFields().put("frequency", projection);
     return projection;
  }

  public CountProjection<ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT>, ROOT> installmentsCount(
      ) {
     CountProjection<ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("installmentsCount", projection);
     return projection;
  }

  public ShopPayInstallmentsLoanProjection<ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT>, ROOT> loanType(
      ) {
     ShopPayInstallmentsLoanProjection<ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsLoanProjection<>(this, getRoot());
     getFields().put("loanType", projection);
     return projection;
  }

  public ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT> apr() {
    getFields().put("apr", null);
    return this;
  }

  public ShopPayInstallmentsFinancingPlanTermProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
