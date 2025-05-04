package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Catalog"));
  }

  public CatalogProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceOperationProjection<CatalogProjection<PARENT, ROOT>, ROOT> operations() {
     ResourceOperationProjection<CatalogProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("operations", projection);
     return projection;
  }

  public PriceListProjection<CatalogProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<CatalogProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PublicationProjection<CatalogProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<CatalogProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public CatalogStatusProjection<CatalogProjection<PARENT, ROOT>, ROOT> status() {
     CatalogStatusProjection<CatalogProjection<PARENT, ROOT>, ROOT> projection = new CatalogStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public CatalogProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CatalogProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppCatalogFragmentProjection<CatalogProjection<PARENT, ROOT>, ROOT> onAppCatalog() {
    AppCatalogFragmentProjection<CatalogProjection<PARENT, ROOT>, ROOT> fragment = new AppCatalogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationCatalogFragmentProjection<CatalogProjection<PARENT, ROOT>, ROOT> onCompanyLocationCatalog(
      ) {
    CompanyLocationCatalogFragmentProjection<CatalogProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationCatalogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketCatalogFragmentProjection<CatalogProjection<PARENT, ROOT>, ROOT> onMarketCatalog() {
    MarketCatalogFragmentProjection<CatalogProjection<PARENT, ROOT>, ROOT> fragment = new MarketCatalogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
