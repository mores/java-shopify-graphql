package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CatalogOperationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CatalogOperationsProjectionRoot() {
    super(null, null, java.util.Optional.of("ResourceOperation"));
  }

  public CatalogOperationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RowCountProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> rowCount(
      ) {
    RowCountProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> projection = new RowCountProjection<>(this, this);    
    getFields().put("rowCount", projection);
    return projection;
  }

  public ResourceOperationStatusProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> status(
      ) {
    ResourceOperationStatusProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> projection = new ResourceOperationStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public CatalogOperationsProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CatalogOperationsProjectionRoot<PARENT, ROOT> processedRowCount() {
    getFields().put("processedRowCount", null);
    return this;
  }

  public AddAllProductsOperationFragmentProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> onAddAllProductsOperation(
      ) {
    AddAllProductsOperationFragmentProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> fragment = new AddAllProductsOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CatalogCsvOperationFragmentProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> onCatalogCsvOperation(
      ) {
    CatalogCsvOperationFragmentProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> fragment = new CatalogCsvOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationResourceOperationFragmentProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> onPublicationResourceOperation(
      ) {
    PublicationResourceOperationFragmentProjection<CatalogOperationsProjectionRoot<PARENT, ROOT>, CatalogOperationsProjectionRoot<PARENT, ROOT>> fragment = new PublicationResourceOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
