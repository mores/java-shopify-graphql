package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketConditionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketConditionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketConditions"));
  }

  public MarketConditionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationsConditionProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> companyLocationsCondition(
      ) {
     CompanyLocationsConditionProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationsConditionProjection<>(this, getRoot());
     getFields().put("companyLocationsCondition", projection);
     return projection;
  }

  public MarketConditionTypeProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> conditionTypes(
      ) {
     MarketConditionTypeProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> projection = new MarketConditionTypeProjection<>(this, getRoot());
     getFields().put("conditionTypes", projection);
     return projection;
  }

  public LocationsConditionProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> locationsCondition(
      ) {
     LocationsConditionProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> projection = new LocationsConditionProjection<>(this, getRoot());
     getFields().put("locationsCondition", projection);
     return projection;
  }

  public RegionsConditionProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> regionsCondition(
      ) {
     RegionsConditionProjection<MarketConditionsProjection<PARENT, ROOT>, ROOT> projection = new RegionsConditionProjection<>(this, getRoot());
     getFields().put("regionsCondition", projection);
     return projection;
  }
}
