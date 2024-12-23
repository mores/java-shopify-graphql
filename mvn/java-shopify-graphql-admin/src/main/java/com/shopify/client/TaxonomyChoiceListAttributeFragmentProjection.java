package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class TaxonomyChoiceListAttributeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TaxonomyChoiceListAttributeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TaxonomyChoiceListAttribute"));
  }

  public TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TaxonomyValueConnectionProjection<TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT>, ROOT> values(
      ) {
     TaxonomyValueConnectionProjection<TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyValueConnectionProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public TaxonomyValueConnectionProjection<TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT>, ROOT> values(
      Integer first, String after, Integer last, String before) {
    TaxonomyValueConnectionProjection<TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyValueConnectionProjection<>(this, getRoot());    
    getFields().put("values", projection);
    getInputArguments().computeIfAbsent("values", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("values").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("values").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("values").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("values").add(beforeArg);
    return projection;
  }

  public TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TaxonomyChoiceListAttributeFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TaxonomyChoiceListAttribute {");
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
