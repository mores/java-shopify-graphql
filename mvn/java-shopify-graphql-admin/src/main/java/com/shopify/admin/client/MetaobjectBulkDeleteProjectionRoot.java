package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectBulkDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectBulkDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectBulkDeletePayload"));
  }

  public MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>, MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>, MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>, MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>, MetaobjectBulkDeleteProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
