package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CompanyLocationSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CompanyLocationCatalogFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyLocationCatalogFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationCatalog"));
  }

  public CompanyLocationCatalogFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationConnectionProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> companyLocations(
      ) {
     CompanyLocationConnectionProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());
     getFields().put("companyLocations", projection);
     return projection;
  }

  public CompanyLocationConnectionProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> companyLocations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationSortKeys sortKey, String query) {
    CompanyLocationConnectionProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());    
    getFields().put("companyLocations", projection);
    getInputArguments().computeIfAbsent("companyLocations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("companyLocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("companyLocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("companyLocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("companyLocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("companyLocations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("companyLocations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("companyLocations").add(queryArg);
    return projection;
  }

  public CountProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> companyLocationsCount(
      ) {
     CountProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("companyLocationsCount", projection);
     return projection;
  }

  public ResourceOperationProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> operations(
      ) {
     ResourceOperationProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("operations", projection);
     return projection;
  }

  public PriceListProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> priceList(
      ) {
     PriceListProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PublicationProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> publication(
      ) {
     PublicationProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public CatalogStatusProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     CatalogStatusProjection<CompanyLocationCatalogFragmentProjection<PARENT, ROOT>, ROOT> projection = new CatalogStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public CompanyLocationCatalogFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyLocationCatalogFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CompanyLocationCatalog {");
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
