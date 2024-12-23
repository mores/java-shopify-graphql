package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompaniesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompaniesProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyConnection"));
  }

  public CompaniesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyEdgeProjection<CompaniesProjectionRoot<PARENT, ROOT>, CompaniesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CompanyEdgeProjection<CompaniesProjectionRoot<PARENT, ROOT>, CompaniesProjectionRoot<PARENT, ROOT>> projection = new CompanyEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CompanyProjection<CompaniesProjectionRoot<PARENT, ROOT>, CompaniesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CompanyProjection<CompaniesProjectionRoot<PARENT, ROOT>, CompaniesProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CompaniesProjectionRoot<PARENT, ROOT>, CompaniesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CompaniesProjectionRoot<PARENT, ROOT>, CompaniesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
