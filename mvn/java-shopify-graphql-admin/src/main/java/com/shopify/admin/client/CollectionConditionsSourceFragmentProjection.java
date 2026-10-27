package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CollectionConditionsSourceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CollectionConditionsSourceFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSource"));
  }

  public CollectionConditionsSourceFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CollectionSourceExclusionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> exclusion(
      ) {
     CollectionSourceExclusionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionProjection<>(this, getRoot());
     getFields().put("exclusion", projection);
     return projection;
  }

  public CollectionSourceInclusionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> inclusion(
      ) {
     CollectionSourceInclusionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceInclusionProjection<>(this, getRoot());
     getFields().put("inclusion", projection);
     return projection;
  }

  public ProductConnectionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> products(
      ) {
     ProductConnectionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductConnectionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductConnectionProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("products").add(reverseArg);
    return projection;
  }

  public CollectionSourceTargetTypeProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     CollectionSourceTargetTypeProjection<CollectionConditionsSourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public CollectionConditionsSourceFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public CollectionConditionsSourceFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CollectionConditionsSourceFragmentProjection<PARENT, ROOT> shareable() {
    getFields().put("shareable", null);
    return this;
  }

  public CollectionConditionsSourceFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CollectionConditionsSource {");
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
