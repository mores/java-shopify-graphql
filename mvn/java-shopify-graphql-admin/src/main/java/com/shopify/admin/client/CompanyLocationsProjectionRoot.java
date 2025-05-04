package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationsProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationConnection"));
  }

  public CompanyLocationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationEdgeProjection<CompanyLocationsProjectionRoot<PARENT, ROOT>, CompanyLocationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CompanyLocationEdgeProjection<CompanyLocationsProjectionRoot<PARENT, ROOT>, CompanyLocationsProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CompanyLocationProjection<CompanyLocationsProjectionRoot<PARENT, ROOT>, CompanyLocationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CompanyLocationProjection<CompanyLocationsProjectionRoot<PARENT, ROOT>, CompanyLocationsProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CompanyLocationsProjectionRoot<PARENT, ROOT>, CompanyLocationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CompanyLocationsProjectionRoot<PARENT, ROOT>, CompanyLocationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
