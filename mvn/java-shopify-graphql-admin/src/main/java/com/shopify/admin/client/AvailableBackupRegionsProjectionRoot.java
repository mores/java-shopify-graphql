package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AvailableBackupRegionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AvailableBackupRegionsProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRegion"));
  }

  public AvailableBackupRegionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AvailableBackupRegionsProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AvailableBackupRegionsProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketRegionCountryFragmentProjection<AvailableBackupRegionsProjectionRoot<PARENT, ROOT>, AvailableBackupRegionsProjectionRoot<PARENT, ROOT>> onMarketRegionCountry(
      ) {
    MarketRegionCountryFragmentProjection<AvailableBackupRegionsProjectionRoot<PARENT, ROOT>, AvailableBackupRegionsProjectionRoot<PARENT, ROOT>> fragment = new MarketRegionCountryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
