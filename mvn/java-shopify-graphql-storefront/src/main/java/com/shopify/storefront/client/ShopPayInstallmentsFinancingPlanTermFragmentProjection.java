package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopPayInstallmentsFinancingPlanTermFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayInstallmentsFinancingPlanTerm"));
  }

  public ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayInstallmentsFinancingPlanFrequencyProjection<ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT>, ROOT> frequency(
      ) {
     ShopPayInstallmentsFinancingPlanFrequencyProjection<ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsFinancingPlanFrequencyProjection<>(this, getRoot());
     getFields().put("frequency", projection);
     return projection;
  }

  public CountProjection<ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT>, ROOT> installmentsCount(
      ) {
     CountProjection<ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("installmentsCount", projection);
     return projection;
  }

  public ShopPayInstallmentsLoanProjection<ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT>, ROOT> loanType(
      ) {
     ShopPayInstallmentsLoanProjection<ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsLoanProjection<>(this, getRoot());
     getFields().put("loanType", projection);
     return projection;
  }

  public ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT> apr() {
    getFields().put("apr", null);
    return this;
  }

  public ShopPayInstallmentsFinancingPlanTermFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopPayInstallmentsFinancingPlanTerm {");
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
