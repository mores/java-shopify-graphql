package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BackupRegionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BackupRegionProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketRegion"));
  }

  public BackupRegionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BackupRegionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BackupRegionProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketRegionCountryFragmentProjection<BackupRegionProjectionRoot<PARENT, ROOT>, BackupRegionProjectionRoot<PARENT, ROOT>> onMarketRegionCountry(
      ) {
    MarketRegionCountryFragmentProjection<BackupRegionProjectionRoot<PARENT, ROOT>, BackupRegionProjectionRoot<PARENT, ROOT>> fragment = new MarketRegionCountryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
