package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BackupRegionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BackupRegionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("BackupRegionUpdatePayload"));
  }

  public BackupRegionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketRegionProjection<BackupRegionUpdateProjectionRoot<PARENT, ROOT>, BackupRegionUpdateProjectionRoot<PARENT, ROOT>> backupRegion(
      ) {
    MarketRegionProjection<BackupRegionUpdateProjectionRoot<PARENT, ROOT>, BackupRegionUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketRegionProjection<>(this, this);    
    getFields().put("backupRegion", projection);
    return projection;
  }

  public MarketUserErrorProjection<BackupRegionUpdateProjectionRoot<PARENT, ROOT>, BackupRegionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketUserErrorProjection<BackupRegionUpdateProjectionRoot<PARENT, ROOT>, BackupRegionUpdateProjectionRoot<PARENT, ROOT>> projection = new MarketUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
