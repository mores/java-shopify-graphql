package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogProjectionRoot() {
    super(null, null, java.util.Optional.of("Catalog"));
  }

  public CatalogProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceOperationProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> operations(
      ) {
    ResourceOperationProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> projection = new ResourceOperationProjection<>(this, this);    
    getFields().put("operations", projection);
    return projection;
  }

  public PriceListProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public PublicationProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> publication(
      ) {
    PublicationProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("publication", projection);
    return projection;
  }

  public CatalogStatusProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> status(
      ) {
    CatalogStatusProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> projection = new CatalogStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public CatalogProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CatalogProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppCatalogFragmentProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> onAppCatalog(
      ) {
    AppCatalogFragmentProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> fragment = new AppCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationCatalogFragmentProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> onCompanyLocationCatalog(
      ) {
    CompanyLocationCatalogFragmentProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketCatalogFragmentProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> onMarketCatalog(
      ) {
    MarketCatalogFragmentProjection<CatalogProjectionRoot<PARENT, ROOT>, CatalogProjectionRoot<PARENT, ROOT>> fragment = new MarketCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
