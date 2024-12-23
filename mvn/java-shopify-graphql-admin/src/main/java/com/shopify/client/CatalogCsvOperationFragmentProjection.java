package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CatalogCsvOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CatalogCsvOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CatalogCsvOperation"));
  }

  public CatalogCsvOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RowCountProjection<CatalogCsvOperationFragmentProjection<PARENT, ROOT>, ROOT> rowCount() {
     RowCountProjection<CatalogCsvOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new RowCountProjection<>(this, getRoot());
     getFields().put("rowCount", projection);
     return projection;
  }

  public ResourceOperationStatusProjection<CatalogCsvOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ResourceOperationStatusProjection<CatalogCsvOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public CatalogCsvOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CatalogCsvOperationFragmentProjection<PARENT, ROOT> processedRowCount() {
    getFields().put("processedRowCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CatalogCsvOperation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
