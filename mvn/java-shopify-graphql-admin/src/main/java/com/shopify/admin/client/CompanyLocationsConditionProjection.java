package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CompanyLocationsConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationsConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationsCondition"));
  }

  public CompanyLocationsConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketConditionApplicationTypeProjection<CompanyLocationsConditionProjection<PARENT, ROOT>, ROOT> applicationLevel(
      ) {
     MarketConditionApplicationTypeProjection<CompanyLocationsConditionProjection<PARENT, ROOT>, ROOT> projection = new MarketConditionApplicationTypeProjection<>(this, getRoot());
     getFields().put("applicationLevel", projection);
     return projection;
  }

  public CompanyLocationConnectionProjection<CompanyLocationsConditionProjection<PARENT, ROOT>, ROOT> companyLocations(
      ) {
     CompanyLocationConnectionProjection<CompanyLocationsConditionProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());
     getFields().put("companyLocations", projection);
     return projection;
  }

  public CompanyLocationConnectionProjection<CompanyLocationsConditionProjection<PARENT, ROOT>, ROOT> companyLocations(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CompanyLocationConnectionProjection<CompanyLocationsConditionProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());    
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
    return projection;
  }
}
