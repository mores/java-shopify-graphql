package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerStatisticsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerStatisticsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerStatistics"));
  }

  public CustomerStatisticsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPredictedSpendTierProjection<CustomerStatisticsProjection<PARENT, ROOT>, ROOT> predictedSpendTier(
      ) {
     CustomerPredictedSpendTierProjection<CustomerStatisticsProjection<PARENT, ROOT>, ROOT> projection = new CustomerPredictedSpendTierProjection<>(this, getRoot());
     getFields().put("predictedSpendTier", projection);
     return projection;
  }

  public CustomerRfmGroupProjection<CustomerStatisticsProjection<PARENT, ROOT>, ROOT> rfmGroup() {
     CustomerRfmGroupProjection<CustomerStatisticsProjection<PARENT, ROOT>, ROOT> projection = new CustomerRfmGroupProjection<>(this, getRoot());
     getFields().put("rfmGroup", projection);
     return projection;
  }
}
