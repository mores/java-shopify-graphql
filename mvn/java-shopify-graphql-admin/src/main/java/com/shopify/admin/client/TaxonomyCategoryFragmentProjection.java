package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class TaxonomyCategoryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TaxonomyCategoryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyCategory"));
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryFragmentProjection<PARENT, ROOT>, ROOT> attributes(
      ) {
     TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeConnectionProjection<>(this, getRoot());
     getFields().put("attributes", projection);
     return projection;
  }

  public TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryFragmentProjection<PARENT, ROOT>, ROOT> attributes(
      Integer first, String after, Integer last, String before) {
    TaxonomyCategoryAttributeConnectionProjection<TaxonomyCategoryFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryAttributeConnectionProjection<>(this, getRoot());    
    getFields().put("attributes", projection);
    getInputArguments().computeIfAbsent("attributes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("attributes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("attributes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("attributes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("attributes").add(beforeArg);
    return projection;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> ancestorIds() {
    getFields().put("ancestorIds", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> childrenIds() {
    getFields().put("childrenIds", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> fullName() {
    getFields().put("fullName", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> isArchived() {
    getFields().put("isArchived", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> isLeaf() {
    getFields().put("isLeaf", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> isRoot() {
    getFields().put("isRoot", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> level() {
    getFields().put("level", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public TaxonomyCategoryFragmentProjection<PARENT, ROOT> parentId() {
    getFields().put("parentId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TaxonomyCategory {");
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
