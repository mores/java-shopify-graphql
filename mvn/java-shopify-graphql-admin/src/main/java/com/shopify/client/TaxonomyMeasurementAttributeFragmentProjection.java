package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class TaxonomyMeasurementAttributeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TaxonomyMeasurementAttributeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyMeasurementAttribute"));
  }

  public TaxonomyMeasurementAttributeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AttributeProjection<TaxonomyMeasurementAttributeFragmentProjection<PARENT, ROOT>, ROOT> options(
      ) {
     AttributeProjection<TaxonomyMeasurementAttributeFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("options", projection);
     return projection;
  }

  public TaxonomyMeasurementAttributeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TaxonomyMeasurementAttributeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TaxonomyMeasurementAttribute {");
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
