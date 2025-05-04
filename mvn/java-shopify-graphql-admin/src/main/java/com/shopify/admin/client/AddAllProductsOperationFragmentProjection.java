package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AddAllProductsOperationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AddAllProductsOperationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AddAllProductsOperation"));
  }

  public AddAllProductsOperationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RowCountProjection<AddAllProductsOperationFragmentProjection<PARENT, ROOT>, ROOT> rowCount(
      ) {
     RowCountProjection<AddAllProductsOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new RowCountProjection<>(this, getRoot());
     getFields().put("rowCount", projection);
     return projection;
  }

  public ResourceOperationStatusProjection<AddAllProductsOperationFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ResourceOperationStatusProjection<AddAllProductsOperationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public AddAllProductsOperationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AddAllProductsOperationFragmentProjection<PARENT, ROOT> processedRowCount() {
    getFields().put("processedRowCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AddAllProductsOperation {");
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
