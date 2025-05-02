package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.HasMetafieldsIdentifier;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CompanyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Company"));
  }

  public CompanyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public CompanyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> externalId() {
    getFields().put("externalId", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Company {");
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
