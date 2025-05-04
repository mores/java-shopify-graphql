package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class AppCatalogFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppCatalogFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppCatalog"));
  }

  public AppCatalogFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppConnectionProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> apps() {
     AppConnectionProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppConnectionProjection<>(this, getRoot());
     getFields().put("apps", projection);
     return projection;
  }

  public AppConnectionProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> apps(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AppConnectionProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppConnectionProjection<>(this, getRoot());    
    getFields().put("apps", projection);
    getInputArguments().computeIfAbsent("apps", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("apps").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("apps").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("apps").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("apps").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("apps").add(reverseArg);
    return projection;
  }

  public ResourceOperationProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> operations(
      ) {
     ResourceOperationProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("operations", projection);
     return projection;
  }

  public PriceListProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PublicationProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public CatalogStatusProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> status() {
     CatalogStatusProjection<AppCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CatalogStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public AppCatalogFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppCatalogFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AppCatalog {");
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
